import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Edge[]edges = new Edge[m+1];
        for(int i =0;i<m;i++){

            edges[i] = new Edge (sc.nextInt(),sc.nextInt(),sc.nextInt());

        }
        System.out.println(mstKruskal(edges,n));
    }
    static int mstKruskal(Edge[] edges, int vNum) {
        DSF dsf = new DSF(vNum); // СНМ
        Arrays.sort(edges); // Сортируем ребра
        int ret = 0; // результат
        for (Edge e : edges) // перебираем ребра в порядке возрастания
            if (dsf.union(e.u, e.v)) // если ребра принадлежат разным компонентам
                ret += e.w; // добавляем вес ребра к стоимости MST
        return ret;
    }

    // Класс ребра
    static class Edge implements Comparable<Edge> {
        int u;
        int v;
        int w;

        // Конструктор
        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Edge edge) {
            if (w != edge.w) return w < edge.w ? -1 : 1;
            return 0;
        }
    }

    // Класс СНМ
    static class DSF {
        int[] set; // номер множества
        int[] rnk; // ранг

        DSF(int size) {
            set = new int[size];
            rnk = new int[size];
            for (int i = 0; i < size; i++)
                set[i] = i;
        }

        // Возвращает множество, которому принадлежит x
        int set(int x) {
            return x == set[x] ? x : (set[x] = set(set[x]));
        }

        // Если u и v лежат в разных множествах, то сливаем их и возвращаем true
        boolean union(int u, int v) {
            if ((u = set(u)) == (v = set(v)))
                return false;
            if (rnk[u] < rnk[v]) {
                set[u] = v;
            } else {
                set[v] = u;
                if (rnk[u] == rnk[v])
                    rnk[u]++;
            }
            return true;
        }
    }
}
