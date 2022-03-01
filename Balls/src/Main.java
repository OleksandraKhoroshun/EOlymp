import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] colors=new int[9];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            for(int i=0; i<N;i++) {
                int color = sc.nextInt();
                colors[color-1]++;
            }
            Arrays.sort(colors);
            int result = N-colors[colors.length-1];
            System.out.println(result);

        }
    }
}
