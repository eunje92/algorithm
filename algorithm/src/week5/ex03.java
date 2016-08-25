package week5;

import java.util.Scanner;

public class ex03 {
	Scanner sc=new Scanner(System.in);
	int n, wine[], dp[][];
	
	void input(){
		n=sc.nextInt();
		wine=new int[n];
		dp=new int[n+1][3];
		
		for(int i=0; i<n; i++){
			wine[i]=sc.nextInt();
		}
		
		run();
	}
	
	void run(){
		for(int i=1; i<=n; i++){
			dp[i][0]=Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][1]=dp[i-1][0]+wine[i-1];
			dp[i][2]=dp[i-1][1]+wine[i-1];
		}
		
		System.out.println(Math.max(dp[n][0], Math.max(dp[n][1],dp[n][2])));
	}
	public static void main(String[] args) {
		new ex03().input();
	}
}
