package week5;

import java.util.Scanner;

public class ex01 {
	Scanner sc=new Scanner(System.in);
	int graph[][];
	int n;
	
	void main(){
		n=sc.nextInt();
		graph=new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				graph[i][j]=sc.nextInt();
			}
		}
		run();
	}
	
	void run(){
		for(int k=0; k<n; k++){
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(graph[i][k]==1 && graph[k][j]==1){
						graph[i][j]=1;
					}
				}
			}
		}
		print();
	}
	
	void print(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new ex01().main();
	}
}
