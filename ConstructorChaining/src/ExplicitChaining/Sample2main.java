package ExplicitChaining;

public class Sample2main extends Sample1 
{
	Sample2main()
	{
		super(76);
		System.out.println("running sub-class constructor with explicit call");
	}
public static void main(String[] args) 
{
	Sample2main e1 = new Sample2main();
	
	
}
}
