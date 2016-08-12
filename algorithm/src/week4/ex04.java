package week4;

import java.util.Scanner;

public class ex04 {
	Scanner sc=new Scanner(System.in);
	int n;
	int tri[][];
	int dp[][];
	
	void main(){
		n=sc.nextInt();
		tri=new int[n][n];
		dp=new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<i+1; j++){
				tri[i][j]=sc.nextInt();
				dp[i][j]=-1;
			}
		}
		
		System.out.println();
	}
	
	int find(int row, int col){
		int ret=dp[row][col];
		
		if(ret!=-1){
			return ret;
		}
		
		
		return ret;
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
