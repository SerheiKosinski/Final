package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;
import java.util.List;
import by.tc.task01.dao.ExceptionDAO;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.print.ServicePrintInfo;

public class Main {

	public static void main(String[] args) throws ServiceException, ExceptionDAO {

		List<Appliance> appliances = null;

		   ServiceFactory factory = ServiceFactory.getInstance();
		   ApplianceService service = factory.getApplianceService();

		 Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
		
		    criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS.toString(), 2);
		    criteriaSpeakers.add(Speakers.POWER_CONSUMPTION.toString(), 20);
		    criteriaSpeakers.add(Speakers.CORD_LENGTH.toString(), 4);

		 Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());

			criteriaLaptop.add(Laptop.SYSTEM_MEMORY.toString(), 8000);
			criteriaLaptop.add(Laptop.CPU.toString(), 2);
			criteriaLaptop.add(Laptop.BATTERY_CAPACITY.toString(), 3);
			
		 appliances = service.find(criteriaOven);
		    PrintApplianceInfo.print(appliances);
		 
		 appliances = service.find(criteriaLaptop);
			PrintApplianceInfo.print(appliances);


	}
}
