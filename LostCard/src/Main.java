import java.util.Scanner;

//this program solves the lost card problem
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int result=n;

            for(int i=1;i<n;i++){
                result+=i;
            }
            for(int i=0;i<n-1;i++){
                int c = sc.nextInt();
                result=result-c;
            }
           System.out.println(result);
        }

    }

}
