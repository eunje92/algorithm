package week2;

import java.util.Scanner;

public class ex06 {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[11];
	
	void run(){
		int n=sc.nextInt();
		
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		
		for(int i=3; i<arr.length; i++){
			arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
		}
		
		result(n);
	}
	
	void result(int n){
		for(int i=0; i<n; i++){
			int k=sc.nextInt();
			System.out.println(arr[k]);
		}
	}
	
	public static void main(String[] args) {
		new ex06().run();
	}

}
