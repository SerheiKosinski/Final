package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

	private int powerConsumtion;
	private int weight;
	private int freezerCapacity;
	private double overallCapacity;
	private double height;
	private double width;

	 public Refrigerator() {
		
		super();
		 
	 }

	public Refrigerator(String title, int powerConsumtion, int weight, int freezerCapacity, double overallCapacity,
			double height, double width) {
		
		super(title);
		 this.powerConsumtion = powerConsumtion;
		 this.weight = weight;
		 this.freezerCapacity = freezerCapacity;
		 this.overallCapacity = overallCapacity;
		 this.height = height;
		 this.width = width;
	}

	public int getPowerConsumtion() {
		return powerConsumtion;
	}

	public void setPowerConsumtion(int powerConsumtion) {
		this.powerConsumtion = powerConsumtion;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public boolean add() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(freezerCapacity, height, overallCapacity, powerConsumtion, weight, width);
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
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(overallCapacity) == Double.doubleToLongBits(other.overallCapacity)
				&& powerConsumtion == other.powerConsumtion && weight == other.weight
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumtion=" + powerConsumtion + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

}
