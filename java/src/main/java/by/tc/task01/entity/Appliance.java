package by.tc.task01.entity;

import java.util.Objects;

public class Appliance {
	private String title;

	public Appliance() {
		title = "";
	}

	public Appliance(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Appliance [title=" + title + "]";
	}

}
