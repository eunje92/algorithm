package week3;

import java.util.Scanner;
import java.util.Vector;

public class ex07 {
	Scanner sc=new Scanner(System.in);
	int n[]=new int[9];
	boolean flag=false;
	
	void main(){
		for(int i=0; i<9; i++){
			n[i]=sc.nextInt();
		}
		boolean chk[]=new boolean[9];
		Vector<Integer> list=new Vector<>();
		
		run(0, chk, list);
	}
	
	void run(int num, boolean chk[], Vector<Integer> list){	
		int sum=0;
		if(flag){
			return;
		}
	
		if(num==7){
			for(int i=0; i<list.size(); i++){
				sum+=list.get(i);
			}
			if(sum==100){
				for(int i=0; i<list.size(); i++){
					System.out.println(list.get(i));
				}
				flag=true;
				return;
			}
		}

		for(int i=0; i<n.length; i++){
			if(chk[i]) continue;
			list.add(n[i]);
			chk[i]=true;
			run(num+1, chk, list);
			list.remove(list.size()-1);
			chk[i]=false;
		}
		
	}
	public static void main(String[] args) {
		new ex07().main();
	}
}
