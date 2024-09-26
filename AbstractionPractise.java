package oopsExamples;
/*SYNTAX*/
abstract class Watsapp /*Hides unnecessary data only shows mandatory data*/
{
 abstract void message(); /* Here Contract method with no implementation of body,
                            it will implement after in 
                            another class of another method with same name*/ 
 void deliveryMessage() /*In abstraction it should declare with abstract(KeyWord) in 
                        both class name and method,in method its your wish 
                        but one should be mandatory*/
 {
	 System.out.println("Type the message to Deliver");
 }
}
class Deliver extends Watsapp
{
	public void message()  /*Here Implementing Abstract contract method from
	 						abstract class in derived class*/
	{
		System.out.println("hello How R U?");
	}
	public void status()
	{
		System.out.print("Message delivered Succesfully.");
	}
}
public class AbstractionPractise 
{	
	public static void main(String[] args) 
	{
		Deliver watsappObj = new Deliver(); /*New object*/
		watsappObj.deliveryMessage();       /*Calling All methods*/
		watsappObj.message(); /* This are 2 times declared actually*/
		watsappObj.status();
	}
}
