package newProjects;
import java.util.Scanner;
/*Topics: 1.Exception , 2.abstraction ,3.Strings*/
/*======================1.Custom Exception======================*/
class BankingProfileUserNameException extends Exception
{
	BankingProfileUserNameException(String message)
	{
		super(message);
	}
}
/*======================2.Custom Exception======================*/
class BankingProfilePassWordException extends Exception
{
	BankingProfilePassWordException(String message)
	{
		super(message);
	}
}
/*===========================Abstract class===========================*/
abstract class Profile //Abstract class With methods and no body of abstract methods| using abstract keyword
{
	abstract void display();  //abstract Methods withOut implementation | using abstract keyword
	abstract void input();    //abstract Methods withOut implementation | using abstract keyword
	/*===========================Constructor===========================*/
	Profile()
	{
		System.out.println("Welcome to SBA Online Portal.");
	}
}
/*===========================Class Details Extending Abstract Profile class===========================*/
class Details extends Profile
{	
	Scanner sc= new Scanner(System.in);/*===========================Constructor===========================*/
	String loginWish, userName, passWord, profile, balance;

	Details()
	{
		System.out.print("Press 'any Key' to login into Your Banking Profile:");
		loginWish=sc.nextLine().toLowerCase();
	}
	void input() 
	{
		/*================== User Name Verification ==================*/
		while (true) 
		{
			try 
			{
				System.out.print("Enter User Name: ");
				userName = sc.nextLine();
				boolean isValidUserName = false; /*initially assume false*/
				// Check each character in the user name using index
				for (int index = 0; index < userName.length(); index++) 
				{
					char ch = userName.charAt(index);
					if (((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) /*While checking pattern separate search is essential
																				as java supports only a-z or 0-9 or A-Z like this.*/
					{
						isValidUserName = true; // Invalid character found
						break; /*If userName Valid & is true loop breaks here and continue to next*/
					}
				}
				// Throw exception if user name is invalid
				if (!isValidUserName) 
				{
					throw new BankingProfileUserNameException("Invalid user name entered. Usernames can only contain lowercase letters (a-z) and digits (0-9).");
				} 
				else 
				{
					System.out.println("Entered user name is valid.");
					break; // Exit loop on valid username
				}
			} 
			catch (BankingProfileUserNameException obj) /*If try throws Exception then catch implements prints error*/
			{
				System.err.println(obj);
			}
		}

		/*================== Password Verification ==================*/
		while (true) 
		{
			try {
				System.out.print("Enter Pass Word: ");
				passWord = sc.nextLine();
				boolean isValidPassWord =false; /*initially assume false*/
				// Initialize false for password requirements
				boolean hasUpperCase = false; // Initialize Variable as false As assuming false Initially
				boolean hasLowerCase = false; // Initialize false As assuming false Initially
				boolean hasDigits = false; // Initialize false As assuming false Initially
				boolean hasSpecialChars = false; // Initialize false As assuming false Initially
				boolean hasLength = passWord.length() >= 6; // Checking length directly

				// Check password requirements
				for (int index = 0; index < passWord.length(); index++) 
				{
					char ch = passWord.charAt(index);
					if (ch >= 'a' && ch <= 'z') //Checking isAlpha and isLowerCase() Without direct method;
					{
						hasLowerCase = true;
					} 
					else if (Character.isDigit(ch)) //Checking With direct method;
					{
						hasDigits = true;
					} 
					else if (ch >= 'A' && ch <= 'Z') //Checking isAlpha and isUpperCase() Without direct method;
					{
						hasUpperCase = true;
					} 
					else if (ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '&' || ch == '*') 
					{
						hasSpecialChars = true;
					}
				}

				// Validate the password
				if (hasUpperCase && hasLowerCase && hasDigits && hasSpecialChars && hasLength) 
				{
					isValidPassWord =true; /*If true print valid pass*/
					System.out.println("Entered Pass Word is Valid.");
					break; // Exit loop on valid password
				}
				else if(!isValidPassWord) //if not throw exception and ask to re enter password
				{
					throw new BankingProfilePassWordException("Enter valid pass word.");
				}
				else 
				{
					System.out.println("Enter a valid password that contains at least one uppercase letter, one lowercase letter, one digit, and one special character. Minimum length is 6 characters.");
				}
			}
			catch(BankingProfilePassWordException obj2)
			{
				System.out.println(obj2);
			}
		}
	}
	/*--------------------Profile and balance Display Method--------------------*/
	void display()//Needs to update...........
	{
		boolean isValid1 = false; //Boolean variables as false  Initially and make it true in execution
		boolean isvalid2 = false; //variables as false  Initially
		/*--------------------Profile-------------------- */
		while(true)
		{
			System.out.print("Press YES/NO to Enter Profile Section: "); //Display message for user
			profile =sc.nextLine().toLowerCase(); /*Takes Input from the user and directly converting if user entered in caps then to Lower Case*/
			if(profile.equalsIgnoreCase("yes")) //Checks condition YES/NO
			{
				isValid1 = true; //return true;
				System.out.println("FullName = xxxxxx,Bankbranch = oxxxxxxo,Address = oxxxxxxo ,DOB = dd/mm/yyyy ,Account type = Savings/Current");
				break;//If true wont execute while while starting of while loop
			}
			else
			{
				System.out.println("Select valid Option please.");
			}
		}
		/*--------------------Balance-------------------- */
		while(true)
		{
			System.out.print("Enter YES/NO for checking balance: "); //Display message for user
			balance = sc.nextLine().toLowerCase();/*Takes Input from the user and directly converting if user entered in caps then to Lower Case*/

			if(balance.equalsIgnoreCase("yes")) //If condition YES/NO
			{
				isvalid2 = true;
				System.out.println("Your balance: 1xxxxx.00 ");
				break; //Breaks the loop if yes here itself
			}
			else if(balance.equalsIgnoreCase("no"))
			{
				System.out.println("User Choosed NO");
				break;//If response is no loop exit here.
			}
			else
			{
				System.out.println("Select valid Option please."); //Display message to choose valid option
			}
		}// Final session termination message
		System.out.println("Session Terminated. Rate our service, Thank you for visiting SBA online :) ");
	}
}
	public class OnlineBankingInterFace /*--------------------Main Class--------------------*/
	{
		public static void main(String[] args) /*--------------------Main Method--------------------*/
		{
			Details profileObj = new Details();/*--------------------Object for Derived Abstract class--------------------*/
			profileObj.input();/*--------------------Calling Method--------------------*/
			profileObj.display();/*--------------------Calling Method--------------------*/
		}
	}