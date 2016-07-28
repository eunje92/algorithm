package week2;

import java.util.Scanner;

public class ex02 {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[46];
	
	void fibo(){
		int n=sc.nextInt();
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2; i<n+1; i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		System.out.println(arr[n]);
	}
	
	public static void main(String[] args) {
		new ex02().fibo();
	}

}
