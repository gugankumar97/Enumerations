package Enumerations;

public enum Month {

	/**
	 * Inside this are all values we are assigning values inside the values
	 * here JANUARY is a value and we are assigning 31 to JANUARY (for this we need constructors)
	 * Enum file name and constructor file name should be same
	 */

	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
	AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

	/**
	 * This is  Global variable (it should be either private or public)
	 * private meaans we cannot access this outside 
	 * The above mentioned values are stored in the variable
	 */

	private int noOfDays;   

	/**
	 * This is constructors.
	 * The above mentioned values are set to this constructors via variable
	 * noOfDays is a global variable and we are taking the same name to store the value so only we are 
	 * putting (this.variablename)
	 * if we are putting differnt local variable name in constructors we dont want to put (this) 
	 * This will not return any value it will just set the values from variables we are mentioning
	 * we can pass parameter(int noOfDays) like this or we dont want to pass parameter as well
	 */

	private Month(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	/**
	 * We are creating a  method to return the values that is stored in constructors.
	 * By calling its method name we assess it from other class for this the access specifier should be public only
	 */

	public int getNoOfDays() {
		return this.noOfDays; //Month.MARCH.getNoOfDays();
    }
	
}