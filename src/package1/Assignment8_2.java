package package1;    //This java file is inside package named package1 inside src folder.

/*
 * This Assignment helped me to master the concepts of Threads and Runnable interface.
 */

//This class is checking that the number is prime or not and extending Thread class.
class PrimeByClass extends Thread
{
	int inputNumber;   //int variable to store the value of inputNumber.

	//Constructor.
	public PrimeByClass(int inputNumber) 
	{
		//Initializing instance variable by parameter passed in the constructor.
		this.inputNumber = inputNumber;
	}
	
	//run method which is overriden in this class.
	public void run()
	{
		int flag=0;
		try
		{
			//Using for loop, we are checking weather any number is deviding inputNumber or not.
			for(int i = 2 ; i <= inputNumber/2 ; i++)
			{
				//if number is deviding.
				if(inputNumber % i ==0 )
				{
					flag=1;    //change the flag value.
					break;     //break from the loop.
				}
			}
			
			//if value of flag is not changed then it is prime.
			if(flag == 0)
			{
				System.out.println(inputNumber+" is prime number -> Checking by Extending Thread Class");   //Printing Statement.
			}
			//if value of flag is changed then it is not prime.
			else
			{
				System.out.println(inputNumber+" is not prime number -> Checking by Extending Thread Class");   //Printing Statement.
			}
			
			Thread.sleep(1000);   //Calling Sleep to Thread.
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");   //Printing Statement.
		}
	}
	
}

//This class is checking that the number is prime or not and implementing Runnable interface.
class PrimeByInterface implements Runnable
{
	int inputNumber;   //int variable to store the value of inputNumber.

	//Constructor.
	public PrimeByInterface(int inputNumber) 
	{
		//Initializing instance variable by parameter passed in the constructor.
		this.inputNumber = inputNumber;
	}

	@Override
	//Overridden method run().
	public void run() 
	{
		int flag=0;
		try
		{
			//Using for loop, we are checking weather any number is deviding inputNumber or not.
			for(int i = 2 ; i <= inputNumber/2 ; i++)
			{
				//if number is deviding.
				if(inputNumber % i ==0 )
				{
					flag=1;    //change the flag value.
					break;     //break from the loop.
				}
			}
			
			//if value of flag is not changed then it is prime.
			if(flag == 0)
			{
				System.out.println(inputNumber+" is prime number -> Checking by implementing Runnable interface.");   //Printing Statement.
			}
			//if value of flag is changed then it is not prime.
			else
			{
				System.out.println(inputNumber+" is not prime number -> Checking by implementing Runnable interface.");   //Printing Statement.
			}
			
			Thread.sleep(1000);   //Calling Sleep to Thread.
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");   //Printing Statement.
		}
	}
	
}




public class Assignment8_2  
{
	                                        
	public static void main(String[] args) 
	{
		//Creating object of class PrimeByClass.
		PrimeByClass firstObject = new PrimeByClass(19);
		
		//creating object of class PrimeByInterface.
		PrimeByInterface tempObject = new PrimeByInterface(21);
		//We have to create Thread object and we have to pass above object in it.
		Thread secondObject = new Thread(tempObject);
		
		firstObject.start();    //Starting first Thread.
		secondObject.start();   //Starting second thread.
		
	}  //End of main function.

}    //End of class containing main function.