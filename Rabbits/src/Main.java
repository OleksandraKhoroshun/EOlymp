import java.util.Scanner;

//this program solves the rabbits problem

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int count = 1;
            for(int i=1;i<=n;i++){
                if(count>k) count -=k;
                count*=2;
            }
            System.out.println(count);
        }

    }

}
