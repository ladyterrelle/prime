package primeHW;

public class primePractice {

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i);

//				for (int i = 1900; i <= 2100; i++) {
//					if (isPrime(i) && isPrime(i - 4))
//						System.out.println(i);
//				}
			}

			
		}
	}
}