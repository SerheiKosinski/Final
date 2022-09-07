package by.tc.task01.service.validation;

import java.util.Map;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ControlCriteria {

	public static boolean criteriaValidator(Criteria criteria, String appliance) {
		  boolean sign = false;
		  
		if (!appliance.equals("")) {

		 if (appliance.equalsIgnoreCase(criteria.getGroupSearchName()) == true) {
				sign = true;
				
				return sign;
		 }
		}

		return sign;
	}

	public static boolean validatorSpeakersNew(Criteria criteria) { 
		
		boolean sign = false;

		for (Map.Entry<String, Object> speakersCriteria : criteria.getCriteria().entrySet()) {

			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
				
			  if (speakersCriteria.getValue().getClass() != String.class) {
					sign = true;
			  }
			}

			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
				
			  if (speakersCriteria.getValue().getClass() != String.class) {
					sign = true;

			  }

			}
			
			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
				
			  if (speakersCriteria.getValue().getClass() != String.class) {
					sign = true;
			  }

			}
			
			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
				
			  if (speakersCriteria.getValue().getClass() != String.class) {
				  sign = true;
			  }

			}
			
			
			}

		
		return sign;
	}






	public static boolean validatorSpeakersControl(Criteria criteria) {
		
		boolean sign = false;

		for (Map.Entry<String, Object> speakersCriteria : criteria.getCriteria().entrySet()) {

			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
				
			  if (speakersCriteria.getValue().getClass() == Integer.class) {
				
				  sign = true;
				
			    if (sign == true) {
				
				   int intValue = Integer.parseInt(speakersCriteria.getValue().toString());
						
			      if ((intValue > 0) && (intValue < 4)) {
				
				     sign = false;

		          }

		        }

		      }
			}
			
			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {

				
		      if (speakersCriteria.getValue().getClass() == Integer.class) {
				
				sign = true;
				
			    if (sign == true) {
						int intValue = Integer.parseInt(speakersCriteria.getValue().toString());
						
			      if ((intValue > 0) && (intValue < 20)) {
							sign = true;
						} else {
							sign = false;
						}
			      }
			   }
			}

			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) { 
				
			 if (speakersCriteria.getValue().getClass() == Integer.class) {
					sign = true;
					
			  if (sign == true) {
				    int intValue = Integer.parseInt(speakersCriteria.getValue().toString());
				    
			   if ((intValue > 0) && (intValue < 4)) {
				  sign = true;
				  
				  } else {
				    sign = false;
				  
				  }
			   }
			  }
			}

			if (speakersCriteria.getKey().toString().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
				
			  if (speakersCriteria.getValue().getClass() == Integer.class) {
					sign = true;
					
				if (sign == true) {
					int intValue = Integer.parseInt(speakersCriteria.getValue().toString());
					
				  if ((intValue > 2) && (intValue < 4)) {
						sign = true;
						
						} else {
							sign = false;
						}
				  }
			   }
			}

			
		
		return sign;
		}

	}///////////
	
public static boolean validatorLaptopsNew(Criteria criteria) { 
		
		boolean sign = false;

		for (Map.Entry<String, Object> laptopCriteria : criteria.getCriteria().entrySet()) {

			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
				
			  if (laptopCriteria.getValue().getClass() != String.class) {
					sign = true;
			  }
			}

			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.CPU.toString())) {
				
			  if (laptopCriteria.getValue().getClass() != String.class) {
					sign = true;

			  }

			}
			
			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
				
			  if (laptopCriteria.getValue().getClass() != String.class) {
					sign = true;
			  }

			}
			
			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
				
			  if (laptopCriteria.getValue().getClass() != String.class) {
				  sign = true;
			  }

			}
			
			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
				
			  if (laptopCriteria.getValue().getClass() != String.class) {
					sign = true;
			  }

			}
			
			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.OS.toString())) {
				
			  if (laptopCriteria.getValue().getClass() != String.class) {
					sign = true;
			  }

			}

		}
		return sign;
	}






	public static boolean validatorSpeakersControl(Criteria criteria) {
		
		boolean sign = false;

		for (Map.Entry<String, Object> laptopCriteria : criteria.getCriteria().entrySet()) {

			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
				
			  if (laptopCriteria.getValue().getClass() == Integer.class) {
				
				  sign = true;
				
			    if (sign == true) {
				
				   int intValue = Integer.parseInt(laptopCriteria.getValue().toString());
						
			      if ((intValue >1000) && (intValue < 1500)) {
				
				     sign = false;

		          }

		        }

		      }
			}
			
			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.CPU.toString())) {

				
		      if (laptopCriteria.getValue().getClass() == Integer.class) {
				
				sign = true;
				
			    if (sign == true) {
						int intValue = Integer.parseInt(laptopCriteria.getValue().toString());
						
			      if ((intValue > 1.2) && (intValue < 3.2)) {
							sign = true;
						} else {
							sign = false;
						}
			      }
			   }
			}

			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) { 
				
			 if (laptopCriteria.getValue().getClass() == Integer.class) {
					sign = true;
					
			  if (sign == true) {
				    int intValue = Integer.parseInt(laptopCriteria.getValue().toString());
				    
			   if ((intValue > 1 ) && (intValue < 4)) {
				  sign = true;
				  
				  } else {
				    sign = false;
				  
				  }
			   }
			  }
			}

			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
				
			  if (laptopCriteria.getValue().getClass() == Integer.class) {
					sign = true;
					
				if (sign == true) {
					int intValue = Integer.parseInt(laptopCriteria.getValue().toString());
					
				  if ((intValue > 4000) && (intValue < 8000)) {
						sign = true;
						
						} else {
							sign = false;
						}
				  }
			   }
			}

			if (laptopCriteria.getKey().toString().equals(SearchCriteria.Laptop.DISPLAY_INCHS.toString())) {
				
			  if (laptopCriteria.getValue().getClass() == Double.class) {
					sign = true;
					
				if (sign == true) {
						double doubleValue = Double.parseDouble(laptopCriteria.getValue().toString());
						
					if ((doubleValue > 18.0) && (doubleValue < 22.0)) {
							sign = true;
							
						} else {
							
							sign = false;
						}
				}
			  }
			}

			

		}
		
		return sign;

	}

}