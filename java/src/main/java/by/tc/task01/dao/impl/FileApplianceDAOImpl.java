package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class FileApplianceDAOImpl implements ApplianceDAO {
	
	
	
	private final String text = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws ExceptionDAO {

		  Map<String, Object> storageCriteria = criteria.getCriteria();
		  Set<String> storageAppliance = new HashSet();
		   String value;

		  ClassLoader loader = FileApplianceDAOImpl.class.getClassLoader();
		  File dataFile = new File(loader.getResource(text).getFile());
	
		  String dataLine;

	try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
			dataLine = reader.readLine();

	 while (dataLine != null) {
				
		if (dataLine.contains(criteria.getGroupSearchName())) {
			
			for (Map.Entry<String, Object> temp : storageCriteria.entrySet()) {
				value = temp.getKey() + "=" + temp.getValue();
				
					if (dataLine.contains(value)) {
							storageAppliance.add(dataLine);
			       }
			}
		}
		
		
				dataLine = reader.readLine();
	}

		} catch (FileNotFoundException w) {
			throw new ExceptionDAO(w);
		} catch (IOException w) {
			throw new ExceptionDAO(w);
		}

		return findNew(storageAppliance);
	}

	private List<Appliance> findNew(Set<String> storageAppliance) {

		List<Appliance> criteriaAppliance = new ArrayList<Appliance>();
		
		FileLogicDAO logic = FileLogicDAO.getInstance();

		String[] splitLine;

		for (String temp : storageAppliance) {

			splitLine = logic.splitLineCriteria(temp);
			
			String nameObject = splitLine[0].trim();
			
		if (nameObject.equals(Laptop.class.getSimpleName())) {
				criteriaAppliance.add(logic.criteriaLaptop(splitLine));
				
			} else if (nameObject.equals(Oven.class.getSimpleName())) {
				criteriaAppliance.add(logic.criteriaOven(splitLine));
				
			} else if (nameObject.equals(Refrigerator.class.getSimpleName())) {
				criteriaAppliance.add(logic.criteriaRefrigerator(splitLine));
				
			} else if (nameObject.equals(Speakers.class.getSimpleName())) {
				criteriaAppliance.add(logic.criteriaSpeakers(splitLine));
				
			} else if (nameObject.equals(TabletPC.class.getSimpleName())) {
				criteriaAppliance.add(logic.criteriaTabletPC(splitLine));
				
			} else if (nameObject.equals(VacuumCleaner.class.getSimpleName())) {
				criteriaAppliance.add(logic.criteriaVacuumCl(splitLine));
				
			}
		}

		return criteriaAppliance;
	}

}
