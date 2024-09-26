package oopsExamples;
/*Write a program to create an interface with name 
 *ThreeDFigure having three methods to calculate curvedSurface area, total surface area ,volume.
  Implement the interface on Cylinder class*/
interface  ThreeDfigure /*InterFace Interface is also used to overcome multiple inheritance 
coz u can use multiples classes with single interface class
Means many multiple derived classes inherits properties from single interface class*/
{ //Interfaces just show what it is(BluePrint) But not show complete implementation...
	void calCurvedSurfaceArea(); //Initiating 3 methods
	void caltotalSurfaceArea();
	void calculateVolume();
}
class Cylinder implements ThreeDfigure //Implementation starts from Here...
{
	double radius,height,volume; //Declaring variables
	Cylinder(double radius, double height) //Parameterised Constructor for cal given radius & height for 3Methods below
	{
		this.radius = radius;
		this.height = height;
		System.out.println("Radius: " + radius);
		System.out.println("Height: " + height);
	}
	@Override
	public void caltotalSurfaceArea() //Method
	{
		double  totalSurfaceArea = 2 * 3.1415 * radius * (radius + height); // Store result in an instance variable
		System.out.println("Total Surface Area: " + totalSurfaceArea);
	}
	@Override
	public void calculateVolume() //Method
	{
		double volume = 3.1415 * radius * radius * height; // Store result in an instance variable
		System.out.println("Volume: " + volume);
	}
	@Override
	public void calCurvedSurfaceArea() //Method
	{
		double curvedSurfaceArea = 2 * 3.1415 * radius * height; // Stores the result in an instance variable
		System.out.println("Curved Surface Area: " + curvedSurfaceArea);
	}
}
public class InterFaceExample 
{
	public static void main(String[] args) 
	{
		Cylinder calobj = new Cylinder(5,10);
		calobj.calCurvedSurfaceArea();
		calobj.caltotalSurfaceArea();
		calobj.calculateVolume();
	}
}
