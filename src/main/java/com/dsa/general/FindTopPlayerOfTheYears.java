package com.dsa.general;

import java.util.Scanner;

public class FindTopPlayerOfTheYears {

    public static int playerOfTheYear(int[][] playerData) {
        int result = -404;

        int n = playerData.length;
        int m = playerData[0].length;
        int[] topCount = new int[n];

        for(int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            int topPlayer = -1;

            for(int i = 0; i < n; i++) {
                if(playerData[i][j] > max) {
                    max = playerData[i][j];
                    topPlayer = i;
                }
            }
            topCount[topPlayer]++;
        }
        int maxTop = 0;
        for(int i = 0; i < n; i++) {
            if(topCount[i] > maxTop) {
                maxTop = topCount[i];
                result = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] playerData = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                playerData[i][j] = sc.nextInt();
            }
        }
        int result = playerOfTheYear(playerData);
        System.out.println(result);
    }
}
