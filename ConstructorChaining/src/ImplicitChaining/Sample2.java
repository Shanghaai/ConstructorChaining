package ImplicitChaining;

public class Sample2 extends Sample1
{
	
	Sample2()  //this sub-class constructor will call its super class constructor cz constructor can not be inherit
	{
		int d=40;
		System.out.println("runnning sub-class constructor");
		
	
	}
	
	public static void main(String[] args) {
		Sample2 e1= new Sample2();
		//constructor always executed at the time of object creation
	}
}
