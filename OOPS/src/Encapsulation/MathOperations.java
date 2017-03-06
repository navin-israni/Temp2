package Encapsulation;
public class MathOperations {
	private int id;
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public static int add(int a, int b)
{
	return (a+b);
}
public static int subtract(int a, int b)
{
	return (a-b);
}
public static int multiply(int a, int b)
{
	return (a*b);
}
public static int divide(int a, int b)
{
	return (a/b);
}
}
