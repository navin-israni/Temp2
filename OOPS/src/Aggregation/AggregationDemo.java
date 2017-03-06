package Aggregation;

public class AggregationDemo {
public static void main(String[] args) {
	Address a1 = new Address("10, Janpath", "New Delhi", 400001);
	Employee e1 = new Employee(101, "Navin", 50000.0, a1);
	System.out.println(e1);
}
}
