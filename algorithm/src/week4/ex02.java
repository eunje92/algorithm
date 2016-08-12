package week4;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
	Scanner sc=new Scanner(System.in);
	int memo[]=new int[1001];
	int num[];
	int n;
	
	void main(){
		n=sc.nextInt();
		
		num=new int[n+1];
		
		num[0]=-1;
		for(int i=1; i<n+1; i++){
			num[i]=sc.nextInt();
		}
		Arrays.fill(memo,-1);
		System.out.println(lis(0)-1);
	}
	
	int lis(int here){
		if(here==n+1){
			return 1;
		}
		int ret=memo[here];
		
		if(ret!=-1){
			return ret;
		}
		
		ret=1;
		for(int next=here+1; next<n+1; next++){
			if(num[here]<num[next]){
				ret=Math.max(ret, lis(next)+1);
			}
		}
		memo[here]=ret;
		return ret;
	}
	
	public static void main(String[] args) {
		new ex02().main();
	}
}
