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
        if(num==n) return 1; //n���� ���ڸ� ��� ����� ��� 1������ �ϼ��ߴ�.
 
        int ret = dp[num][last];
        if(ret!=-1) return ret;
        ret=0; //ret�� num�������� �����ؼ� N������, �� N-num���� �߰��ؼ� ������ ���� ����� ��� ����Ǽ��� ������ ����
 
        for(int nextLast=last;nextLast<=9;nextLast++){ //������ ������ �ϹǷ� last���� ū ���� �־�� ����,
            ret += increaseNum(num+1, nextLast);    //��� ����� ���� ����  
            ret %= 10007;
        }
 
        return dp[num][last] = ret;  //�� ������ ret�� ��� �������� ������ ������ ��� N-num���� �߰��ؼ� ���� �� �ִ� ��� ������ ���� ������ ����.
    }
    public static void main(String[] args) {
        new ex04().main();
    }
}