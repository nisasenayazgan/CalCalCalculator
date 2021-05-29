public class CalCalCalculation extends CalCalBackend{ // We extend the interface
	protected double foodCal; // The amount of calories that the user enters 
	
	public CalCalCalculation(double age1,double height1,double weight1, String gender1,double foodCal1){
		super(age1,height1,weight1, gender1);
		foodCal = foodCal1;
		
	}
	 public double MetabolismCalMale(){
	     return (menMet + (menMetWeight * weight ) + (menMetHeight * height) - (menMetAge*age));
	}
	public double MetabolismCalFemale(){
		return (womenMet + (womenMetWeight * weight) + (womenMetHeight * height) -(womenMetAge*age));
	}
	
	public void print() {
		System.out.println("Height: "+ height);
		System.out.println("Age: "+ age);
		System.out.println("Weight: "+ weight);
		System.out.println("Gender: "+ gender);	
		System.out.println("Calories of Food: "+ foodCal);
	}
	
}
