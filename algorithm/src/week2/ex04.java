package week2;

import java.util.Scanner;

public class ex04 {
	Scanner sc=new Scanner(System.in);
	
	void run(){
		int arr[]=new int[5];
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=arr[0]+arr[1];
		arr[3]=arr[0]+arr[1];
		arr[4]=1;
		int flag=0;
		
		
		while(true){
			if(arr[flag] % 10==5){
				arr[2]+=arr[4];
			}else if(arr[flag] % 10==6){
				arr[3]-=arr[4];
			}
			
			arr[4]*=10;
			arr[flag]=arr[flag]/10;
			
			if(arr[flag]<1){
				arr[4]=1;
				if(flag==1){
					break;
				}
				flag++;
			}	
		}
		System.out.println(arr[2]+" "+arr[3]);
	}
	
	public static void main(String[] args) {
		new ex04().run();
	}

}
