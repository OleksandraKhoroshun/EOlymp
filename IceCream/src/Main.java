import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coor = new int[n];
        for(int i=0;i<n;i++){
            coor[i]=sc.nextInt();
        }

        int max = coor[n-1];

                int Left = 0;
        int Right = max;
        while (Left <= Right)
        {
            int Middle = (Left + Right) / 2;
            if (Check(Middle,n,k,coor)) Left = Middle + 1;
            else Right = Middle - 1;
        }
        System.out.println(Left-1);

    }

    private static boolean Check(int Value,int n,int k,int[] m)
    {
        int i, stall = 1, len = 0;
        for (i = 1; i < n; i++)
        {
            len += m[i] - m[i - 1];
            if (len >= Value) {len = 0; stall++;}
        }
        return stall >= k;
    }
}
