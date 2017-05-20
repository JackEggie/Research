package name.jacktang.matchingalgorithms.impl;

import name.jacktang.matchingalgorithms.StringSearch;

/**
 * @author Jack.Z.Tang
 * @date 2017/05/17
 */
public class KMPSearch implements StringSearch {

    private int[] calculateNext(String pattern) {
        int[] next = new int[pattern.length()];

        int j = 0;
        for (int i = 0; i < next.length; i++) {
            if (i < 2) {
                next[i] = i - 1;
                continue;
            }

            if (pattern.charAt(j) == pattern.charAt(i - 1)) {
                next[i] = j + 1;
                j++;
            } else {
                j = 0;
                next[i] = j;
            }
        }

        return next;
    }

    @Override
    public int match(String source, String pattern) {
        if (source == null || source.isEmpty() || pattern == null || pattern.isEmpty()) {
            return -1;
        }
        int[] next = calculateNext(pattern);

        int i = 0;
        int j = 0;
        while (i < source.length() && j < pattern.length()) {
            if (source.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
                if (j < 0) {
                    i++;
                    j++;
                }
            }
        }

        if (j == pattern.length()) {
            return i - pattern.length();
        } else {
            return -1;
        }
    }
}
