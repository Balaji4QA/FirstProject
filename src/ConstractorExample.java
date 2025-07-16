import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConstractorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
//int num=sc.nextInt();
for(int i=1;i<=1000;i++) {
	int num1=i;
	int temp,sum=0;
	while(num1!=0) {
		temp=num1%10;
		sum=sum+(temp*temp*temp);
		num1=num1/10;
	}
	if(i==sum) {
		System.out.println(sum);
	}
}
	}

}
