package com.app;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> left = new HashSet<>();
        for (int pos = 1; pos <= X; pos++) {
            left.add(pos);
        }

        for (int i = 0; i < A.length; i++) {
            left.remove(A[i]);
            if (left.isEmpty()) {
                return i;
            }
        }

        // expected worst-case time complexity is O(N);
        return -1;
    }
}