package TypeCasting;

public class NonprimitiveTypeCastingTest {

	public static void main(String[] args) {
		
		//upcasting
		
		//direct method
		Father f=new son();
		System.out.println(f.age+ " " + f.hname + " " + f.name);

		//indirect method
		son s = new son();
		
		Father f1 = s;
		System.out.println(f1.age+ " " + f1.hname + " " + f1.name);
		
		
		
		
		son s1 = (son)f;
		System.out.println(s1.age + " " + s1.name);
		System.out.println(s1.hname);

	}

}
