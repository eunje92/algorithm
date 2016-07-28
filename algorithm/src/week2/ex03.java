package week2;

import java.util.Scanner;

public class ex03 {
	Scanner sc=new Scanner(System.in);
	int gcd=1;
	int lcm;
	int a, b;
	
	int gcd(int max, int min){
		if(max % min==0){
			return min;
		}else{
			return gcd(Math.max(max%min,min), Math.min(max%min,min));
		}		
	}
	
	void run(){
		a=sc.nextInt();
		b=sc.nextInt();
		
		gcd=gcd(Math.max(a, b),Math.min(a, b));
		lcm=(a*b)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
	public static void main(String[] args) {
		new ex03().run();
	}

}
