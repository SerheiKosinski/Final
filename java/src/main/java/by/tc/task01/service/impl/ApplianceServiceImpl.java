package by.tc.task01.service.impl;

import java.util.List;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.ExceptionDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.ControlCriteria;

public class ApplianceServiceImpl implements ApplianceService {

	 @Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		List<Appliance> appliances = null;
		
		boolean check = false;
		
		check = ControlCriteria.validatorOvenControl(criteria);
		 try {
			if (check == true) {
				appliances = applianceDAO.find(criteria);
			} else {
				appliances = null;
			}
		 } catch (ExceptionDAO w) {	 
			throw new ServiceException(w);
		}

		return appliances;

	}

}
