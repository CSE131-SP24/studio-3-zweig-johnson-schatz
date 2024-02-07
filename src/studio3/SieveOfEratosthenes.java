package studio3;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		
		
		for (int num = 1; num < 40; num++) {
			
			int primeNumCheck = 0;
			
			for (int numCheck = 2; numCheck < num-1; numCheck++) {
				//can we divide num by each number that came before it?
				if (num % numCheck == 0) {
					primeNumCheck += 1; 
					}
			}
			
			if (primeNumCheck == 0) {
				System.out.println(num + " is a prime!");
			}
		}

	}

}

//use for loop
//a number is prime if it is divisible by itself and 1
// if %  0, not prime
