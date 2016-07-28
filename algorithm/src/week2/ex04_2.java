package week2;

import java.util.Scanner;

public class ex04_2 {
	 static void max(char[] ch1, char[] ch2, String str1, String str2){
		for(int i=0; i<ch1.length; i++){
			if(ch1[i]=='5'){
				ch1[i]='6';
			}
			str1+=Character.toString(ch1[i]);
		}
		for(int i=0; i<ch2.length; i++){
			if(ch2[i]=='5'){
				ch2[i]='6';
			}
			str2+=Character.toString(ch2[i]);
		}
		
		int result=Integer.parseInt(str1)+Integer.parseInt(str2);
		System.out.print(result);
	}
	 
	 static void min(char[] ch1, char[] ch2, String str1, String str2){
			for(int i=0; i<ch1.length; i++){
				if(ch1[i]=='6'){
					ch1[i]='5';
				}
				str1+=Character.toString(ch1[i]);
			}
			for(int i=0; i<ch2.length; i++){
				if(ch2[i]=='6'){
					ch2[i]='5';
				}
				str2+=Character.toString(ch2[i]);
			}
			
			int result=Integer.parseInt(str1)+Integer.parseInt(str2);
			System.out.print(result+" ");
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.next();
		String str2=sc.next();
		
		char ch1[] =str1.toCharArray();
		char ch2[] =str2.toCharArray();
		
		str1="";
		str2="";
		
		min(ch1, ch2, str1, str2);
		max(ch1, ch2, str1, str2);
	}

}
