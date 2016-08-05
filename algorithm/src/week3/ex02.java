package week3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
 
public class ex02 {
    Scanner sc=new Scanner(System.in);
    int l, c;
    String[] password;
    int cons, vowel;
     
    void main(){
        l=sc.nextInt();
        c=sc.nextInt();
         
        password=new String[c];
         
        for(int i=0; i<c; i++){
            password[i]=sc.next();
        }
         
        Arrays.sort(password);
         
        boolean[] chk=new boolean[c];
        Vector<String> list=new Vector<>();
        Vector<Integer> key=new Vector<>();
         
        run(l, chk, list, key);
    }
    void run(int topick, boolean[] chk, Vector<String> list, Vector<Integer> key){
        if(topick==0){
            for(int i=0; i<list.size(); i++){
                if(list.get(i).equals("a")||list.get(i).equals("i")||list.get(i).equals("o")||
                        list.get(i).equals("e")||list.get(i).equals("u")){
                    vowel++;
                }else{
                    cons++;
                }
            }
            if(vowel>=1&&cons>=2){
                for(int i=0; i<list.size(); i++){
                    System.out.print(list.get(i));
                }
                System.out.println();
            }
            vowel=0;cons=0;
            return;
        }
         
        for(int i=0; i<c; i++){
            if(chk[i]){
                continue;
            }
            if(list.size()>=1){
                if(key.get(list.size()-1)>i){
                    continue;
                }
            }
            list.add(password[i]);
            key.add(i);
            chk[i]=true;
            run(topick-1, chk, list, key);
            list.remove(list.size()-1);
            key.remove(key.size()-1);
            chk[i]=false;
        }
    }
     
    public static void main(String[] args) {
        new ex02().main();
    }
}