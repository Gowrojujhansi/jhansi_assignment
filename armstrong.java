package armstrong;

import java.util.Scanner;

public class armstrong {

	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
        System.out.println("enter the number");
		int m=scan.nextInt();
		int n1=m;
		int sum=0;
		int temp;
		while(m>0) {
			temp=m%10;
			m=m/10;
			temp=temp*temp*temp;
			sum=sum+temp;
		}
		if(n1==sum) {
			System.out.println("its a armstrong number");
		}
		else {
			System.out.println("its not a armstrong number");
		}
}
}