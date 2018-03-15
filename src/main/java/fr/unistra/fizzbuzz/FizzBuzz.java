package fr.unistra.fizzbuzz;

public class FizzBuzz implements Int2String {

	public String convert(int number) {
		if(number % 3 == 0)
		{
		  
		  if(number % 5 == 0)
		  {
		    return "FizzBuzz";
		  }
		  else
		  {
		    return "Fizz";
		  }
		}
		if(number % 5 == 0)
		{
		  return "Buzz";
		}
		else
		{
		  return ""+number;
		}
	}
}
