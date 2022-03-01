import java.util.Scanner;

public class Main {
    private static int min=100500;
    private static int K;
    private static int N;
    private static int a[];
    private static int t[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //missions
        int k = sc.nextInt(); //points

        N=n;
        K=k;

         a = new int[n]; //points
         t = new int[n]; //time

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
         findMinTime(0,0,0);
        if(min!=100500)
        System.out.println(min);
        else  System.out.println(-1);

    }

    private static void findMinTime(int time, int score, int mission_num) {

        if (mission_num >= N){

        if (score >= K && min >time)
            min = time;

            return;
        }

        findMinTime(time, score, mission_num + 1);

        int nextTime = time + t[mission_num];

        if (nextTime >= min)
        return;
        int nextScore = score + a[mission_num];

        findMinTime(nextTime, nextScore, mission_num + 1);
    }

}
