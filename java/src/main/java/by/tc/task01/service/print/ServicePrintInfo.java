package by.tc.task01.service.print;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class ServicePrintInfo {
	
	public static void printOutput(List<Appliance> appliances) {

		if (appliances == null) {
			
			
		 System.out.println("The entered criteria are not correct");
			
		} else {

			for (Appliance element : appliances) {
		 System.out.println(element.toString());
			}
		}
	}

}
