package week3;

import java.util.Scanner;
import java.util.Vector;
 
public class ex01 {
     
    Scanner sc=new Scanner(System.in);
    int n;
     
    void input(){
        n=sc.nextInt();
        boolean []chk=new boolean[n+1];
        Vector<Integer> list = new Vector<>();
        run(n, chk, list);
    }
     
    void run(int topick, boolean []chk, Vector<Integer> list){
        if(topick==0){
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");  
            }
            System.out.println();
            return;
        }
         
        for (int i = 1; i <= n; i++) {
            if(chk[i]){
                continue;
            }
                list.add(i);
                chk[i] = true;
                run(topick - 1, chk, list);
                list.remove(list.size()-1);
                chk[i] = false;
        }
    }
     
    public static void main(String[] args) {
        new ex01().input();
    }
}