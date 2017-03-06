package Aggregation;

public class Employee {
private int id;
private String name;
private double salary;
private Address addr;

public Employee(int id, String name, double salary, Address addr) {
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.addr = addr;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
}

}
