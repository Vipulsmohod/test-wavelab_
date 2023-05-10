package com.cg;

import java.util.Arrays;

public class Client {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        int[] p = new int[n];
        Arrays.fill(p, -1);

        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];
            union(p, a, b);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] == -1) {
                count++;
            }
        }

        if (count == 1) {
            return 0;
        } else {
            return count - 1;
        }
    }

    private int find(int[] p, int i) {
        if (p[i] == -1) {
            return i;
        }
        p[i] = find(p, p[i]); 
        return p[i];
    }

    private void union(int[] p, int i, int j) {
        int pI = find(p, i);
        int pJ = find(p, j);
        if (pI != pJ) {
            p[pI] = pJ;
        }
    }
}