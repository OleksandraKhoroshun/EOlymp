import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<long[]> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            long x = sc.nextInt();
            long min=0;
            long sum=0;
            for(int i=0;i<n;i++){
                x = ((a*x*x + b*x + c) / 100) % 1000000;
                if(x % 5 < 2) {
                    if(!stack.empty()) {
                        stack.pop();
                    }
                }
                else {
                    if(stack.empty()){
                        min=x;
                    }
                    else {
                        min = Math.min(x,stack.peek()[1]);
                    }
                    stack.push(new long[]{x, min});
                }
                if(!stack.empty()) sum+=stack.peek()[1];
            }
            System.out.println(sum);
        }
    }
}