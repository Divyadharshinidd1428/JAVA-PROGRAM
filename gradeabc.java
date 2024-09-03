Package java_practice;
import java.util.Scanner;
public class gradeabc {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int m1=obj.nextInt();
		int m2=obj.nextInt();
		int m3=obj.nextInt();
		int total=m1+m2+m3;
		int Grade=total/3;
		if (Grade>=90 && Grade<=100)
		{
			System.out.print("Grade A");
		}
		else if(Grade>=75 && Grade<90 )
		{
			System.out.print("Grade B");
		}
		else if(Grade>=55 && Grade<75)
		{
			System.out.print("Grade C");
			
		}
		else
		{
			System.out.print("Fail");
		}
		
	}
	
	

}
