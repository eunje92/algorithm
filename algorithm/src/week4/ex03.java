package week4;

import java.util.Scanner;

public class ex03 {
	Scanner sc=new Scanner(System.in);
	int n;
	int step[];
	int memo[][]=new int[310][2];
	
	void main(){
		n=sc.nextInt();
		step=new int[n];
		
		for(int i=0; i<step.length; i++){
			step[i]=sc.nextInt();
		}
		
		for(int i=0; i<310; i++){
			for(int j=0; j<2; j++){
				memo[i][j]=-1;
			}
		}
		
		System.out.println(Math.max(step(0,0), step(1,0)));
	}
	
	int step(int here, int num){
		if(here>=n){
			return -111111;
		}
		
		if(here==n-1){
			return step[here];
		}
		
		int ret=memo[here][num];
		if(ret!=-1){
			return ret;
		}
		ret=0;
		
		if(num==0){
			ret=Math.max(step(here+1, num+1), step(here+2, num))+step[here];
		}
		if(num==1){
			ret=step(here+2, num-1)+step[here];
		}
		
		return memo[here][num]=ret;
	}
	
	public static void main(String[] args) {
		new ex03().main();
	}
}
