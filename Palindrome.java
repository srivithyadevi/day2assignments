package week1.day1.assginments;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343, reversedNum=0, remainder;
		int GivenNum=num;
		while(num!=0)
		{
			remainder=num%10;
			reversedNum=reversedNum*10+remainder;
			num/=10;
		}
			if(GivenNum==reversedNum) {
				System.out.println(GivenNum+ " palindrome");
			}
			else
			{
				System.out.println(GivenNum+ " not a palindrome");
			}
		}
	}
