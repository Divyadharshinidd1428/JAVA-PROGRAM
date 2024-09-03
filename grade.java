package java_practice;
import java.util.Scanner;
public class grade {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter The score:");
		int score=obj.nextInt();
		if (score>=90)
			System.out.print("Grade A");
		else if(score>=80 && score<90)
			System.out.print("Grade B");
		else if(score>=70 && score<80)
			System.out.print("Grade C");
		else if(score>=60 && score<70)
			System.out.print("Grade D");
		else
			System.out.print("Fail");
	}

}
