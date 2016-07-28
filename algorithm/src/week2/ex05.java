package week2;

import java.util.Scanner;

public class ex05 {
	Scanner sc=new Scanner(System.in);
	
	void run(){
		int t=sc.nextInt();
		
		for(int s=0; s<t; s++){
			int n=sc.nextInt();
			int flag=0;
			int num=1;
			
			while(true){
				if(num*(num+1)>2*n){
					break;
				}
				num++;
			}
			
			gogo:
				
			for(int i=1; i<num; i++){
				for(int j=1; j<num; j++){
					for(int k=1; k<num; k++){
						if(i*(i+1)+j*(j+1)+k*(k+1)==n*2){
							flag++;
							break gogo;
						}else if(i*(i+1)+j*(j+1)+k*(k+1)>n*2){
							break;
						}
					}
				}
			}
			
			System.out.println(flag);
		}
	}
	public static void main(String[] args) {
		new ex05().run();
	}
}
