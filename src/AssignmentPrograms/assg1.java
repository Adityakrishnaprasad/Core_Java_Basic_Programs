package AssignmentPrograms;

public class assg1 {

	public static void main(String[] args) {
		int years = 1;
		int depriciation =10;
		int value = 23000;
		int choice = 1;
		int total = 0;
		switch(choice) {
		
		    case 1 :		
		    	if(years==1&&depriciation==10)
		    	{
		    	depriciation=value/100*depriciation;
		    	value=value-depriciation;
		    	total=depriciation+value;
		    	System.out.println("value of the car is : " +value);
		    	System.out.println("depriciated value of the car is : " +depriciation);
		    	System.out.println("total cost is : " +total);
		    	break;
		       }
		    	
		    case 2 :
		    	if(years==2&&depriciation==20)
		    	{
		    	depriciation=value/100*depriciation;
		    	value=value-depriciation;
		    	total=depriciation+value;
		    	System.out.println("value of the car is : " +value);
		    	System.out.println("depriciated value of the car is : " +depriciation);
		    	System.out.println("total cost is : " +total);
		    	break;
		       }
		    	
		    case 3 :
		    	if(years==3&&depriciation==30)
		    	{
		    	depriciation=value/100*depriciation;
		    	value=value-depriciation;
		    	total=depriciation+value;
		    	System.out.println("value of the car is : " +value);
		    	System.out.println("depriciated value of the car is : " +depriciation);
		    	System.out.println("total cost is : " +total);
		    	break;
		       }
		    	
		    case 4 :
		    	if(years==4&&depriciation==50)
		    	{
		    	depriciation=value/100*depriciation;
		    	value=value-depriciation;
		    	total=depriciation+value;
		    	System.out.println("value of the car is : " +value);
		    	System.out.println("depriciated value of the car is : " +depriciation);
		    	System.out.println("total cost is : " +total);
		    	break;
		       }
		    	
		    case 5 :
		    	if(years>4&&depriciation==60)
		    	{
		    	depriciation=value/100*depriciation;
		    	value=value-depriciation;
		    	total=depriciation+value;
		    	System.out.println("value of the car is : " +value);
		    	System.out.println("depriciated value of the car is : " +depriciation);
		    	System.out.println("total cost is : " +total);
		    	break;
		       }
		    default :  System.out.println("please enter valid credientials..........");
		    	
		}
		
	}

}
