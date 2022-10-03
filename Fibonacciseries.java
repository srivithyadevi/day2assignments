package week1.day1.assginments;

public class Fibonacciseries {

	public static void main(String[] args) {
		int range=7,firstterm=0,secondterm=1;
		System.out.println("Fibonacci series of " +range+ " numbers:");
		for(int i=1;i<=range;++i)
		{
		System.out.print(firstterm+ " " );
		int sumOfPrevTwo= firstterm+secondterm;
		firstterm=secondterm;
		secondterm=sumOfPrevTwo;
	}
}
}
