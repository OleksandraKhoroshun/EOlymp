import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n+1];
        double[] y = new double[n+1];

        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int curr = 0;
        double[] dist = new double[(n*(n-1)/2)+1];
        boolean[] used = new boolean[n+1];

        dist[0]=0;
        used[0]=true;

        double inf =Double.POSITIVE_INFINITY;;
        Arrays.fill(dist,inf);

        double res=0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!used[j] && (distance(x, y, curr, j) < dist[j])) {
                    dist[j] = distance(x, y, curr, j);
                }
            }
            double min = inf;

            for (int j = 0; j < n; j++) {
                if (!used[j] && (dist[j] < min)) {
                    min = dist[j];
                    curr = j;
                }
            }
            used[curr] = true;
            //System.out.println(dist[curr]);
            res += sqrt(dist[curr]);
        }

        System.out.println(res);
    }

    public static double distance(double[] x, double[] y, int i, int j){
        return (x[j] - x[i])*(x[j] - x[i]) + (y[j] - y[i])*(y[j] - y[i]);
    }
}
