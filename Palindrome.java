package mylearnings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 343;

		int temp = num;
		int rno = 0;
		while (num != 0) {
			int remainder = num % 10;
			rno = (rno * 10) + remainder;
			num = num / 10;

			}

		if (temp == rno) {
			System.out.println("It is a Palindrome Number");
		} else {
			System.out.println("It is not a Palindrome Number");
		}

	}

}
