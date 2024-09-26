package oopsExamples;
interface Movies  /*InterFace only*/
{
	public void displayListOfMovies(); /*1st INTERFACE*/

	public void selectMovie(); /*2nd INTERFACE*/
}
class Genere implements Movies /*Implement or use all methods That are declared in INTERFACE*/
{
	public void selectGenre()
	{
		System.out.println("Horror,Thriller,Action,Adventure,Comedy");
		System.out.println();
	}
	public void displayListOfMovies() /*Implementing 1st INTERFACE*/
	{
		System.out.println("Devara,Pushpa-2,GameChanger,Vikram-2,HIT-case:3");
		System.out.println();
	}
	@Override
	public void selectMovie()  /*Implementing 2nd INTERFACE*/
	{		
		System.out.print("Devara Selected." );
		System.out.println();
	}
}
class TopRated implements Movies /*Implement or use all methods That declared in INTERFACE*/
{
	public void selectGenre()
	{
		System.out.println();
		System.out.println("TopRated Movies");
		System.out.println();
		System.out.println("Horror,Thriller,Action,Adventure,Comedy");
		System.out.println();
	}
	public void displayListOfMovies() /*Implementing 1st INTERFACE*/
	{
		System.out.println("Devara,Pushpa-2,GameChanger,Vikram-2,HIT-case:3");
		System.out.println();
	}
	@Override
	public void selectMovie() /*Implementing 2nd INTERFACE*/
	{		
		System.out.print("Devara Selected." );
		System.out.println();
	}
}
public class InterfacePractise 
{
	public static void main(String[] args) 
	{
		/*For every different class there is diff object is created*/
		/*1st object for 1st class*/
		Genere movieObj = new Genere();
		movieObj.selectGenre();
		movieObj.displayListOfMovies();
		movieObj.selectMovie();
		
		/*2nd object for 2nd class*/
		TopRated movieObj1 = new TopRated();
		movieObj1.selectGenre();
		movieObj1.displayListOfMovies();
		movieObj1.selectMovie();
	}
}
