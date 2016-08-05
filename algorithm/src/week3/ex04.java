package week3;

import java.util.Scanner;

class ex04{
 
    int n,ret,dp[][];
    Scanner sc = new Scanner(System.in);
    void main(){
        n = sc.nextInt();
        dp = new int[n+1][10];
        for(int i=0;i<=n;i++) for(int j=0;j<10;j++) dp[i][j]=-1;
        for(int i=0;i<=9;i++){
            ret += increaseNum(1, i);
            ret %= 10007;
        }
        System.out.println(ret);
    }
    int increaseNum(int num,int last){
        if(num==n) return 1; //n개의 숫자를 모두 사용한 경우 1가지를 완성했다.
 
        int ret = dp[num][last];
        if(ret!=-1) return ret;
        ret=0; //ret은 num에서부터 시작해서 N개까지, 즉 N-num개를 추가해서 오르막 수를 만드는 모든 경우의수를 저장할 변수
 
        for(int nextLast=last;nextLast<=9;nextLast++){ //오르막 수여야 하므로 last보다 큰 수만 넣어야 겠죠,
            ret += increaseNum(num+1, nextLast);    //모든 경우의 수를 저장  
            ret %= 10007;
        }
 
        return dp[num][last] = ret;  //이 곳에서 ret에 담긴 변수에는 위에서 정의한 대로 N-num개를 추가해서 만들 수 있는 모든 오르막 수의 갯수가 담긴다.
    }
    public static void main(String[] args) {
        new ex04().main();
    }
}