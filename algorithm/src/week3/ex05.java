package week3;

import java.util.Scanner;

public class ex05 {
	// 최대 증가 부분 수열(LIS)
	Scanner sc=new Scanner(System.in);
	int n;
	int kids[]=new int[200];
	
	void main(){
		n=sc.nextInt();
		kids=new int[n];
	
		for(int i=0; i<n; i++){
			kids[i]=sc.nextInt();
		}
		
		System.out.println(n-lis(0));
	}
	
	int lis(int start){
		int ret=kids[start];
		
		if(ret==-1) return ret;
		
		ret=1;
		for(int next=start+1; next<n; next++){
			if(kids[start]<kids[next]){
				ret = Math.max(ret, lis(next)+1);
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		new ex05().main();
	}
}
