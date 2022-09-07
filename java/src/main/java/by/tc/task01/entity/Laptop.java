package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
	
	
	private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;
    
    
    public Laptop() {
    	
    	super();
    	 
     }
    
    public Laptop (String title, double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs) {
    	
    	super(title);
    	 this.batteryCapacity = batteryCapacity;
    	 this.os = os;
    	 this.memoryRom = memoryRom;
    	 this.systemMemory = systemMemory;
    	 this.cpu = cpu;
    	 this.displayInchs = displayInchs;
    	
    }

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, cpu, displayInchs, memoryRom, os, systemMemory);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Double.doubleToLongBits(cpu) == Double.doubleToLongBits(other.cpu)
				&& displayInchs == other.displayInchs && memoryRom == other.memoryRom && Objects.equals(os, other.os)
				&& systemMemory == other.systemMemory;
	}
    
    
	
}
