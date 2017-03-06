package Polymorphism;

public class SimpleAdditionDemo {
public static void main(String[] args) {
	SimpleAddition sa = new SimpleAddition();
	sa.add(25, 35); // add(int,int)
	sa.add(25, 35, 45); // add(int,int, int)
	sa.add(25, 35,45,65); //// add(int,int, int, int)
	sa.add(25.6, 75.6); // add(double,double)
	sa.add("Hello", "World"); // // add(String,String)
	System.out.println();
	/* METHOD OVERLOADING
	 * 
	 * When two or more methods have same name
	 * but different arguments, it is called
	 * method overloading
	 * 
	 * Since the mapping of call to method
	 * definition happens at compile-time,
	 * it is called Compile-time Polymorphism 
	 */
}
}
