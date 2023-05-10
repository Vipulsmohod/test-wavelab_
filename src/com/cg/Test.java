package com.cg;


public class Test {
    public static void main(String[] args) {
        int n = 4;
        int[][] connections = {{0, 1}, {0, 2}, {1, 2}};

        Client solution = new Client();
        int minConnections = solution.makeConnected(n, connections);

        System.out.println("Minimum number of connections needed: " + minConnections);
    }
}