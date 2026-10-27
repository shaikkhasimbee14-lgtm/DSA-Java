class Solution {
    int[] parent;
    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        for (int[] e : edges)
            parent[find(e[0])] = find(e[1]);
        return find(source) == find(destination);
    }
}
