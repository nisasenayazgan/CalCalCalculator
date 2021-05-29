
import java.util.*;
public class TestCalCal{
    public static void main(String[] args) {
    	CalCalCalculation user1 = createUser();
    	user1.print();
    	calculation4Gender(user1);
    }

    public static CalCalCalculation createUser(){
	    double age1;
	    double height1;
	    double weight1;
	    String gender1;
	    double foodCal1;
	
	    Scanner scan = new Scanner(System.in);  //System.in object is given to scan
	    System.out.print("Enter your age:"+"\n");
	    age1=scan.nextDouble();
	    System.out.print("Enter your height:"+"\n");
	    height1=scan.nextDouble();
	    System.out.print("Enter your weight:"+"\n");
	    weight1=scan.nextDouble();
	    System.out.print("Enter your gender(female/male):"+"\n");
	    gender1=scan.next();
	    System.out.print("Enter your Food Calories:"+"\n");
	    foodCal1=scan.nextDouble();
	    return new CalCalCalculation(age1,height1,weight1,gender1,foodCal1);
    }
    public static void calculation4Gender(CalCalCalculation user1){
        if(user1.getGender() == "female") {
        	user1.MetabolismCalFemale();
            if(user1.MetabolismCalFemale()>= user1.foodCal) {
            	System.out.println("Your daily calorie is "+(user1.MetabolismCalFemale()) + "\n" + "You have to take " + (user1.MetabolismCalFemale() - user1.foodCal) + " calories");            	
            }else {
            	System.out.println("Your daily calorie is "+(user1.MetabolismCalFemale()) + "\n" +"You take enough calories");
            }
        }
            
        else {
        	if(user1.MetabolismCalMale()>= user1.foodCal) {
            	System.out.println("Your daily calorie is "+(user1.MetabolismCalMale()) + "\n" +"You have to take "+ (user1.MetabolismCalMale() - user1.foodCal) + " calories");            	
            }else {
            	System.out.println("Your daily calorie is "+(user1.MetabolismCalMale()) + "\n" +"You take enough calories");
            }
        }
    }
 
}