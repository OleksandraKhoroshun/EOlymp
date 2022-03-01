import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for(int i =0;i<m;i++){

            Edge e = new Edge (sc.nextInt(),sc.nextInt(),sc.nextInt());
            edges.add(e);

        }

        DSF dsf = new DSF(n+1);
        edges.sort(Edge::compareTo);
        int res = 0;
        for (Edge e : edges) {
            if (dsf.union(e.u, e.v)) {
                res += e.w;
            }
        }
        System.out.println(res);
    }

    public static class Edge implements Comparable<Edge> {
        private int u;
        private int v;
        private int w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Edge edge) {
            if(w!=edge.w){
                if(w<edge.w)return -1;
                else return 1;
            }
            return 0;
        }
    }

    public static class DSF {
        int[] set;
        int[] rank;

        DSF(int size) {
            set = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                set[i] = i;
            }
        }

        int set(int x) {
            if(x==set[x]) return x;
            else return set[x] = set(set[x]);
        }

        boolean union(int u, int v) {
            u=set(u);
            v=set(v);
            if (u == v) return false;
            if (rank[u] < rank[v]) set[u] = v;
            else {
                set[v] = u;
                if (rank[u] == rank[v]) rank[u]++;
            }
            return true;
        }
    }
}