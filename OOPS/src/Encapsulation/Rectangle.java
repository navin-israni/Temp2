package Encapsulation;

public class Rectangle {
private int length;
private int width;
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}


@Override
public String toString() {
	return "Rectangle [length=" + length + ", width=" + width + ", name=" + name + "]";
}

public boolean equals(Rectangle r)
{
	if (this.length == r.getLength() 
			&& this.width == r.getWidth())
			{
		return true;
			}
	else return false;
}
/*
 * public boolean equals (Object obj)
 * {
 * returns true if both objects have same state
 * returns false if both objects DO NOT
 *  have same state
 * }
 */
/* How to implement Encapsulation:
 * 
 * Make all fields private.
 * 
 * Every property has two types of
 * Methods associated with it:
 * 
 *  1) Getter / Accessor Method 
 *  To read the value from the object
 *  
 *  2) Setter / Mutator Method
 *  To write the value into the object
 */


}
