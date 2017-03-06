package Encapsulation;

public class Student {
private int rollNo;
private String studName;
private String studCourse;

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	// instance - rollNo
	// local - rollNo
	// instance variable hiding is taking place
	this.rollNo = rollNo;
	
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public String getStudCourse() {
	return studCourse;
}
public void setStudCourse(String studCourse) {
	this.studCourse = studCourse;
}
}
