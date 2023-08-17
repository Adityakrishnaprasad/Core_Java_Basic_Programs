package LogicalPrograms;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=num;i++) {//1<5T,2<5T
			int p = num*i;//5*1=5,5*2=10,...5*5=25
			System.out.println(num+"*"+i+"="+p);
		}

	}

}
