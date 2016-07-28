package week2;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
	int num[]=new int[3];
	Scanner sc=new Scanner(System.in);
	
	void run(){
		for(int i=0; i<num.length; i++){
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[1]);
	}
	
	public static void main(String[] args) {
		new ex01().run();
	}
}
