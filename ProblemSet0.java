/**
*This program has many different methods 
*that do different things. The methods are
*accessed and ran by the Runner0 file
*@author Nate Hefner
*@version 1.0
*
*
*/
public class ProblemSet0
{
	/**
	*This method converts a decimal (base 10) number
	*to a binary (base 2) number using a while loop and
	*a specific algorithm. At first, the binary number is backwards, 
	*so a while loop is used to flip it
	*@param n the integer that is (base 10)
	*@return s the string of the binary version of the n decimal number
	*
	*/
	public static String toBinary(int n)
	{
		if(n < 0)
		{
			String error = new String("That is not a valid number because it is less than 0.");
			return error;
		}
		else if(n == 0)
			return "0";
		else
		{
			int remainder = 0;
			String str = "";
			while(n > 0)
			{
				remainder = n % 2;
				str += String.valueOf(remainder);
				n = n / 2;
			}
			
			int i = str.length()-1;
			String s = new String("");
			while(i >= 0)
			{
				s += str.charAt(i);
				i-=1;
			}
		return s;
		}
	}
	/**
	*This method takes in an int n and then returns 
	*the result of rolling a die with n sides; uses 
	*Math.random() function to choose a random number
	*between 1 and n, both inclusive
	*@param n the integer that decides how many sides the die has
	*@return rand the random integer on the die with n sides
	*
	*/
	public static int rollDie(int n)
	{
		if (n <= 0)
			return 0;
		else
		{
			int rand = (int)(Math.random()* n + 1);
			return rand;
		}	
	}
	
	/**
	*This method takes in the number of rows as a parameter and 
	*prints a “Multiple Table.” This method's algorithm uses a nested for loop, 
	*i to start each new column, and j for the multiples in each row
	*@param n the integer that determines how many rows there are in the tabl
	*/
	public static void multiples(int n)
	{
		if(n == 0)
			System.out.println(0);
		else if(n < 0)
			System.out.println(n*n);
		for(int i = 1; i<=n; i++)
		{
			for(int j = i; j<= i*i; j+= i)
			{
				if(j/10 < 1)
					System.out.print(j+ "   ");
				else
					System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
	
	/**
	*This method that, given a positive integer n a parameter, 
	*computes and returns a new integer in which the units and 
	*tens digits have swapped places
	*@param n the original integer in which tens and units places are being swapped
	*@return number the new integer in which tens and units places are already swapped
	*
	*/
	public static int swap(int n)
	{
		int tens = (n%10)*10;
		int ones = (n/10)%10;
		int number = ((n/100)*100)+tens+ones;
		return number;
	}
	
	/**
	*This method just prints 3 different possibilities of the 
	*Boolean expression XOR that involves two boolean variables 
	*which is true if and only if exactly one of the two variables 
	*has the value true
	*/
	public static void xor()
	{
		System.out.println("a!=b");
		System.out.println("(!a&&b)||(a&&!b)");
		System.out.println("(a||b)&&(!a||!b)");
	}
	
	
	/**
	*This method prints n stars on one line
	*using a for loop, printing one star every time it loops
	*@param n the integer that determines how many stars there should be
	*/
	public static void printStars(int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	/**
	*This method takes in integer n and prints a triangle with 
	*one star in the first row, two stars in the second row, 
	*and so on, up to n stars in the last row. 
	*Uses printStars() method to execute function, which 
	*undergoes the printStars loop, inside the printTriangle loop, 
	*making it a nested loop
	*@param n the integer that determines the size of triangle
	*/
	public static void printTriangle(int n)
	{
		for(int x = 0; x < n; x++)
		{
			printStars(x);
		}
		printStars(n);
	}
	
	/**
	*This method prints a triangle made of stars, the first row has 1 star, the final row has n stars
	*Uses the recursiveHelper() function to decide how many stars are in each row, and
	*then printRecursive() decides how many rows are in the triangle
	*@param n the integer that decides how many rows are in the triangle
	*
	*/
	public static void printRecursive(int n)
	
	{
		if(n==1)
			recursiveHelper(n);
		else
		{
			printRecursive(n-1);
			recursiveHelper(n);
		}
	}
	
	/**
	*This method prints a triangle that has n stars in the first row and 1 star in the last row. 
	*Uses the recursiveHelper() function to decide how many stars should go in each row
	*then printRecursive2() decides how many rows are in the triangle
	*@param n the integer that decides how many rows are in the triangle and decides how many stars are in the first row
	*/
	
	public static void printRecursive2(int n)
	{
		if(n==1)
			recursiveHelper(n);
		else
		{
			recursiveHelper(n);
			printRecursive2(n-1);
		}
	}
	
	/**
	*This method is a helper function that aids the functions
	*printRecursive() and printRecursive2(), using recursion to 
	*take care of printing stars on each line, while the other functions 
	*take care of switching to a different row
	*@param n the integer that determines how many stars should be in a row
	*
	*/ 
	public static void recursiveHelper(int n)
	{	
		if(n == 1)
			System.out.println("*");
		else
		{
			System.out.print("*");
			recursiveHelper(n-1);
		}
			
	}
	
	/**
	*This function calculates and returns the sum of all the digits 
	*of a given non-negative integer using recursion. It takes leftover of
	*n divided by 10, then the remainder when that is divided by 10. 
	*Then it divides n by 10, and the sum is then the leftover plus the
	*new value of n put through the sumDigits method again. 
	*@param n the non-negative integer that its digits are being added
	*@return sum the sum of all the digits after recursion is finished
	*/
	public static int sumDigits(int n)
	{
		int sum = 0;
		int leftover = 0;
		if(n<10)
			return n;
		else
		{
			leftover = n - (n/10)*10;
			n /= 10;
			sum = leftover + sumDigits(n);
			
		}
		return sum;
	}
	
	/**
	*This method checks to see if an integer n
	*is divisible by 3 without using the modulo operator and 
	*uses the sumDigits method as well. It is a recursive boolean
	*method, that eventually checks to see continuing subtracting
	*3, if it eventually becomes 0, it returns true,
	*if the number is eventually less than 0 but never 0, returns false
	*@param n the integer that is being checked if it is divisible by 3
	*/
	public static boolean isDivisible(int n)
	{
		int i = sumDigits(n);
		if(i == 0)
			return true;
		else if(i < 0)
			return false;
		else
			return isDivisible(i-3);
	}
	
	/**
	*This method takes in an integer n
	*and prints stars in a rhombus format, 
	*corresponding to the integer n
	*@param n the integer that determines shape of stars
	*
	*/
	public static void printMoreStars(int n)
	{
		for(int i = 1; i < n*2; i += 2)
		{	
			//for loop for spaces -> difference of longest line and current line divided by 2
			
			int largest = n*2-1;
			for(int space = 0; space < largest - i; space++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		int counter = n*2-3;
		int bottomSpace = 2;
		for(int a = 0; a < n-1;a++)
 		{
 			for(int b = 0; b< bottomSpace; b++)
 			{
 				System.out.print(" ");
 			}
 			bottomSpace+=2;
 			for(int c = 0; c < counter; c++)
 			{
 				System.out.print("* ");
 			}
 			System.out.println();
 			counter -= 2;
		}
	}
	
	/**
	*This method takes in an int n which represents cents and outputs 
	*the combination of coins that will add up to cents, 
	*but using the fewest total number of coins possible. 
	*Uses two different arrays, with the first array
	*containing the values of the different coins, and 
	*the second array contains how many coins for each is needed
	*@param n the integer amt. of cents
	*/
	public static void leastCoins(int n)
	{
		String output = "";
		int q = n/25;
		output += "Quarters: "+q+"\n";
		n = n%25;
		int d = n/10;
		output += "Dimes: "+d+"\n";
		n = n%10;
		int k = n/10;
		output += "Nickels: "+k+"\n";
		n = n%5;
		int p = n;
		output += "Pennies: "+p;
		
		System.out.println(output);
	}
	
	/**
	*This method takes in an int n which represents cents
	*and outputs all possible combinations of coins, using 3 nested loops,
	*one for each coin, except for pennies, which are just the leftover
	*It then adds up all possible combinations and prints how many
	*combinations are possible.
	*@param n the integer that signifies how much cents should be distributed throughout all possibilities of coins. 
	*/
	public static void coins(int n)
	{
		int p = n;
		int combination = 0;
		for(int q = 0; q <= n; q += 25)
		{
			for(int d = 0; d <=n-q; d+= 10)
			{
				for(int k = 0; k<= n-q-d; k+= 5)
				{
					p = n-q-d-k;
					System.out.println("Quarters: "+ q + "\nDimes: " +d+"\nNickels: "+k+"\nPennies: "+p+"\n");
					combination++;
					
				}
			}
			
		}
		System.out.println("There are "+combination+" combinations of coins with the value of "+n+ " cents.\n");
	}
	
}