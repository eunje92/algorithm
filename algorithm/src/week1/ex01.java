package week1;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int x, y, w, h;
		int min=0;
		int[] arr=new int[4];
	
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		arr[0]=x;
		arr[1]=w-x;
		arr[2]=y;
		arr[3]=h-y;
		
		for(int i=1; i<arr.length; i++){
			if(arr[i-1]<=arr[i]){
				min=arr[i-1];
				arr[i]=min;
			}else{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
