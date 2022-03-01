import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ans = "YES";
        int n = sc.nextInt();

        int [][] arr = new int [n][n];
         for(int i =0;i<n;i++)
             for(int j=0;j<n;j++)
                 arr[i][j]=sc.nextInt();

         outerloop:
         for(int i =0;i<n;i++)
             for(int j=0;j<n;j++){
                 if((arr[i][j]!=arr[j][i]) || (i==j && arr[i][j]!=0)){
                     ans = "NO";
                     break outerloop;
                 }

             }
         System.out.println(ans);

     }
}
