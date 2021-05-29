public class CalCalBackend implements CalCal {// We implements the interface
	protected double age, height, weight; // Our data members
	protected String gender; 
	
	public CalCalBackend(double age1,double height1,double weight1, String gender1) { // Our constructor
		age = age1;
		height= height1;
		weight = weight1;
		gender = gender1;
	}
	
	public double MetabolismCalMale(){ // The method that returns the male's metabolism  
        return 0;
    }
    public double MetabolismCalFemale(){//The method that returns the female's metabolism 
        return 0;
    }
    public void setGender(String gender1){//we can't directly access the data members.So, we use set and get functions (encapsulation)
		gender = gender1;
    }
    public String getGender(){
        return gender;
    }
	
	public void print() { // The method that prints expected values
		System.out.println("Height: "+ height);
		System.out.println("Age: "+ age);
		System.out.println("Weight: "+ weight);
		System.out.println("Gender: "+ gender);
	}
	
}
