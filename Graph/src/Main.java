import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<Stack<Integer>> arr = new ArrayList<>();
        for(int i = 1; i <= N+1; i++) {
            arr.add(new Stack<Integer>());
        }
        for(int i = 1; i <= N; i++) {
            String str = sc.nextLine();
            if(!str.isEmpty()) {
                String[] parts = str.split(" ");
                for (int j = 0; j < parts.length; j++) {
                   int c = Integer.parseInt(parts[j]);
                        arr.get(c).push(i);

                }
            }
        }
        System.out.println(N);
        for(int i = 1; i <= N; i++) {
            if(!arr.get(i).isEmpty()){
                for(int j=0;j<arr.get(i).size();j++) {
                    System.out.print(arr.get(i).get(j)+" ");
                }
                System.out.println();

            }else System.out.println();
        }
    }
}