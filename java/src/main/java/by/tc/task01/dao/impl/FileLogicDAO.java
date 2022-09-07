package by.tc.task01.dao.impl;

import by.tc.task01.entity.*;

public class FileLogicDAO {

	private static final FileLogicDAO instanc = new FileLogicDAO();

	private FileLogicDAO() {
	}

	public static FileLogicDAO getInstance() {
		return instanc;
	}

	

	public String[] splitLineCriteria(String lineCriteria) {
		
		lineCriteria = lineCriteria.replace(":", ",");
		String[] criteria = lineCriteria.split(",");
		return criteria;
	}

	

	public Appliance criteriaOven(String[] criteria) {
		Oven oven = new Oven();

		String stringCriteriaValue;
		
		int intCriteriaValue;
		double doubleCriteriaValue;
		
		String[] tempValue;

		stringCriteriaValue = criteria[0];
		 oven.setName(stringCriteriaValue);

		stringCriteriaValue = criteria[1];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		oven.setPowerConsumption(intCriteriaValue);

		stringCriteriaValue = criteria[2];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		oven.setWeight(intCriteriaValue);

		stringCriteriaValue = criteria[3];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		oven.setCapacity(intCriteriaValue);

		stringCriteriaValue = criteria[4];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Integer.parseInt(stringCriteriaValue);
		oven.setDepth(intCriteriaValue);

		stringCriteriaValue = criteria[5];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		oven.setHeight(doubleCriteriaValue);

		stringCriteriaValue = criteria[6];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		oven.setWidth(doubleCriteriaValue);

		return oven;
	}
	
	
	

	public Appliance criteriaLaptop(String[] criteria) {
		Laptop laptop = new Laptop();

		String stringCriteriaValue;
		
		int intCriteriaValue;
		double doubleCriteriaValue;
		
		String[] tempValue;

		stringCriteriaValue = criteria[0];
		 laptop.setName(stringCriteriaValue);

		stringCriteriaValue = criteria[1];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		laptop.setBatteryCapacity(doubleCriteriaValue);

		stringCriteriaValue = criteria[2];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 laptop.setOs(stringCriteriaValue);

		stringCriteriaValue = criteria[3];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		laptop.setMemoryRom(intCriteriaValue);

		stringCriteriaValue = criteria[4];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		laptop.setSystemMemory(intCriteriaValue);

		stringCriteriaValue = criteria[5];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		laptop.setCpu(doubleCriteriaValue);

		stringCriteriaValue = criteria[6];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		laptop.setDisplayInchs(intCriteriaValue);

		return laptop;
	}
	
	
	
	public Appliance criteriaRefrigerator(String[] criteria) {
		Refrigerator refrigerator = new Refrigerator();

		String stringCriteriaValue;
		
		int intCriteriaValue;
		double doubleCriteriaValue;
		
		String[] tempValue;

		stringCriteriaValue = criteria[0];
		 refrigerator.setName(stringCriteriaValue);

		stringCriteriaValue = criteria[1];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		refrigerator.setPowerConsumtion(intCriteriaValue);

		stringCriteriaValue = criteria[2];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		refrigerator.setWeight(intCriteriaValue);

		stringCriteriaValue = criteria[3];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		refrigerator.setFreezerCapacity(intCriteriaValue);

		stringCriteriaValue = criteria[4];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		refrigerator.setOverallCapacity(doubleCriteriaValue);

		stringCriteriaValue = criteria[5];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		refrigerator.setHeight(doubleCriteriaValue);

		stringCriteriaValue = criteria[6];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		refrigerator.setWidth(doubleCriteriaValue);

		return refrigerator;
	}

	
	
	
	public Appliance criteriaSpeakers(String[] criteria) {
		Speakers speakers = new Speakers();

		String stringCriteriaValue;
		
		int intCriteriaValue;
		String[] tempValue;

		stringCriteriaValue = criteria[0];
		 speakers.setName(stringCriteriaValue);

		stringCriteriaValue = criteria[1];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		speakers.setPowerConsumption(intCriteriaValue);

		stringCriteriaValue = criteria[2];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		speakers.setNumberOfSpeakers(intCriteriaValue);

		stringCriteriaValue = criteria[3];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 speakers.setFrequencyRange(stringCriteriaValue);

		stringCriteriaValue = criteria[4];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		speakers.setCordLength(intCriteriaValue);

		return speakers;
	}

	
	
	
	public Appliance criteriaTabletPC(String[] criteria) {
		TabletPC tabletPC = new TabletPC();

		String stringCriteriaValue;
		
		int intCriteriaValue;
		double doubleCriteriaValue;
		
		String[] tempValue;

		stringCriteriaValue = criteria[0];
		 tabletPC.setName(stringCriteriaValue);

		stringCriteriaValue = criteria[1];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 doubleCriteriaValue = Double.parseDouble(stringCriteriaValue);
		tabletPC.setBatteryCapacity(doubleCriteriaValue);

		stringCriteriaValue = criteria[2];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		tabletPC.setDisplayInches(intCriteriaValue);

		stringCriteriaValue = criteria[3];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		tabletPC.setMemoryRom(intCriteriaValue);

		stringCriteriaValue = criteria[4];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		tabletPC.setFlashMemoryCapacity(intCriteriaValue);

		stringCriteriaValue = criteria[5];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 tabletPC.setColor(stringCriteriaValue);

		return tabletPC;
	}

	
	
	
	public Appliance criteriaVacuumCl(String[] criteria) {
		VacuumCleaner vacuumCl = new VacuumCleaner();

		String stringCriteriaValue;
		
		int intCriteriaValue;
		double doubleCriteriaValue;
		
		String[] tempValue;

		stringCriteriaValue = criteria[0];
		 vacuumCl.setName(stringCriteriaValue);

		stringCriteriaValue = criteria[1];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		vacuumCl.setPowerConsumtion(intCriteriaValue);

		stringCriteriaValue = criteria[2];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 vacuumCl.setFilterType(stringCriteriaValue);

		stringCriteriaValue = criteria[3];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 vacuumCl.setBagType(stringCriteriaValue);

		stringCriteriaValue = criteria[4];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 vacuumCl.setWandType(stringCriteriaValue);

		stringCriteriaValue = criteria[5];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		vacuumCl.setMotorSpeedRegulation(intCriteriaValue);

		stringCriteriaValue = criteria[6];
		 tempValue = stringCriteriaValue.split("=");
		stringCriteriaValue = tempValue[1];
		 intCriteriaValue = Integer.parseInt(stringCriteriaValue);
		vacuumCl.setCleaningWidth(intCriteriaValue);

		return vacuumCl;
	}

}