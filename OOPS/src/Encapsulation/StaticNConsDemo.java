package Encapsulation;

public class StaticNConsDemo {
public static void main(String[] args) {
	StaticNConstructorDemo sncDemo = new StaticNConstructorDemo();
	System.out.println(sncDemo.getName());
	System.out.println(StaticNConstructorDemo.id);
	StaticNConstructorDemo.id +=25;
	System.out.println("After change: "+ StaticNConstructorDemo.id);
	
	StaticNConstructorDemo sncDemo2 = new StaticNConstructorDemo();
	System.out.println("After change 2: "+ StaticNConstructorDemo.id);
	
	StaticNConstructorDemo sncDemo3 = new StaticNConstructorDemo();
	System.out.println("After change 3: "+ StaticNConstructorDemo.id);
	
}
}
