package week1;

import java.util.Scanner;

public class ex02 {
	
	static int count0, count1;
	
	public static int fibo(int n){
		if(n==0){
			count0++;
		}else if(n==1){
			count1++;
		}else{
			return fibo(n-1)+fibo(n-2);
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++){
			
			int num=sc.nextInt();
			fibo(num);
			
			System.out.println(count0+" "+count1);
			
			count0=0;count1=0;
			
		}
	}

}
