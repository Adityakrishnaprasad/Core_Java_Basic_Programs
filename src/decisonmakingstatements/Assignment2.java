package decisonmakingstatements;

public class Assignment2 {

	public static void main(String[] args) {
		double s = 23;
		double pie = 3.14;
		double r = 85;
		double l = 76;
		double b = 97;
		double h = 82;
		char c = 'c';
		
		switch(c) {
		
		case 'c' :  double CubeVolume = s*s*s;
		               System.out.println("the volume of the cube is  : " +CubeVolume);
		               break;
		case 'p' :  double SphereVolume = 4/3*pie*r*r*r ;
		              System.out.println("the volume of the sphere is  :" +SphereVolume);
		              break;
		case 'b' :  double CuboidVolume = l*b*h;
		              System.out.println("the volume of the cuboid is : " +CuboidVolume);
		              break;
		default :  System.out.println("please choose correct data");
		
		}

	}

}
