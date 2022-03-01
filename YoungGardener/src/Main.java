import java.util.Scanner;

//this program solves the young gardener problem
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int count = 0;
            int sum=0;
            for(int i=1;i<=n;i++){
                count+=2;
                sum+=count;
            }
            sum++;
            System.out.println(sum);
        }

    }

}