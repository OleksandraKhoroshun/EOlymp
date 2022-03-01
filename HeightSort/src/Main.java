import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//this program solves the height sort problem
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        String Nstr=reader.readLine();
        while(Nstr!= null)
        {
            int n = Integer.parseInt(Nstr);

            Stack<Integer> s = new Stack<Integer>();
            String line = reader.readLine();
            String[] strs = line.split(" ");
            for(int i = 0; i < strs.length; i++)
            {
                s.push(Integer.parseInt(strs[i]));
            }
            String line1 = reader.readLine();
            String[] strs1 = line1.split(" ");
            int a = Integer.parseInt(strs1[0]);
            int b = Integer.parseInt(strs1[1]);
            int count=0;
            for(int i=0;i<n;i++){
                int j = s.pop();
                if (j>=a && j<=b) count++;
            }
            System.out.println(count);
            Nstr=reader.readLine();
        }

    }

}
