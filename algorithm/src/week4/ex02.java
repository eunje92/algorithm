package week4;

import java.util.Scanner;

public class ex02 {
	Scanner sc=new Scanner(System.in);
	int memo[]=new int[1001];
	int num[];
	int n;
	
	void main(){
		n=sc.nextInt();
		
		num=new int[n+1];
		
		num[0]=0;
		for(int i=1; i<n+1; i++){
			num[i]=sc.nextInt();
		}
		
		System.out.println(lis(0)-1);
	}
	
	int lis(int here){
		int ret=memo[here];
		
		if(ret==-1) return ret;
		
		ret=1;
		for(int next=here+1; next<num.length; next++){
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
