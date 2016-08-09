package week4;

import java.util.Scanner;

public class ex01 {
	Scanner sc=new Scanner(System.in);
	int arr[];
	int count=0;
	int n;
	
	void main(){
		n=sc.nextInt();
		arr=new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		run(arr);
		System.out.println(count);
	}
	
	void run(int arr[]){
		for(int i=n-2; i>=0; i--){
			if(arr[i]>=arr[i+1]){
				count+=arr[i]-(arr[i+1]-1);
				arr[i]=arr[i+1]-1;
			}
		}
	}
	
	public static void main(String[] args) {
		new ex01().main();
	}
}
