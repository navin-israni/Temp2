package Encapsulation;

public class StaticNConstructorDemo {
private String name;
static int id;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	public StaticNConstructorDemo() {
	name="default";
	//id=0; // this will reset the shared variable
	// every time an object is created
	}
	static
	{
		id=0;
	}
	public StaticNConstructorDemo(String name) {
		//System.out.println("B");
		this.name = name;
	}
	/*static
	{
		System.out.println("C");
	}
	static
	{
		System.out.println("D");
	}*/
	
	
	
}
