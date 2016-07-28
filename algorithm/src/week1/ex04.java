package week1;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int memo[]=new int[1000001];
		
		memo[1]=0;
		for(int i=2; i<=n; i++){
			
			memo[i]=memo[i-1]+1;
			
			if(i%3==0 && memo[i/3]+1<memo[i]){
				memo[i]=memo[i/3]+1;
			}
			if(i%2==0 && memo[i/2]+1<memo[i]){
				memo[i]=memo[i/2]+1;
			}
		}
		
		System.out.println(memo[n]);
	}
}
