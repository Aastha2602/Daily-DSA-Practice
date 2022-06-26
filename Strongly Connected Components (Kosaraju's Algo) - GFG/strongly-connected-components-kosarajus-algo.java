// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        
        // fill stack in post order of dfs
        Stack<Integer> st = new Stack<>();
        boolean[] vis1 = new boolean[V];
        for(int v=0;v<V;v++){
            if(!vis1[v]){
                dfs1(v, adj, vis1, st);
            }
        }
        
        // transpose
        ArrayList<ArrayList<Integer>> tsp = new ArrayList<>();
        for(int v=0;v<V;v++){
            tsp.add(new ArrayList<>());
        }
        
        for(int v=0;v<V;v++){
            for(int n:adj.get(v)){
                tsp.get(n).add(v);
            }
        }
        
        // scc (pop from stack and use dfs on them to count scc)
        int count = 0;
        boolean[] vis2 = new boolean[V];
        while(st.size() > 0){
            int v = st.pop();
            if(!vis2[v]){
                dfs2(v, tsp, vis2);
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs2(int v, ArrayList<ArrayList<Integer>> tsp, boolean[] vis ){
        vis[v] = true;
        for(int n:tsp.get(v)){
            if(!vis[n]){
                dfs2(n, tsp, vis);
            }
        }
    }
    
    public void dfs1(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> st ){
        vis[v] = true;
        for(int n:adj.get(v)){
            if(!vis[n]){
                dfs1(n, adj, vis, st);
            }
        }
        
        st.push(v);
    }
}
