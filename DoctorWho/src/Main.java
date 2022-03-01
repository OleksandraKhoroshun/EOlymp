import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line);
            while(lineSc.hasNextInt()) {
                queue.add(lineSc.nextInt());
            }
            String happy = "ok";

            while (!queue.isEmpty())
            {
                int num = queue.poll();
                LinkedList<Integer> left = new LinkedList<Integer>();
                for(int i=0;i<num;i++){
                    if (queue.isEmpty()){
                        happy = "fail";
                        break;
                    }
                    if (queue.peek() != 1) {left.add(queue.peek() - 1);}
                    queue.poll();
                }
                while (!left.isEmpty() && !happy.equals("fail"))
                {
                    queue.add(left.poll());
                }
            }
            System.out.println(happy+"\n");


        }

    }
}
