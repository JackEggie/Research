package name.jacktang.matchingalgorithms.impl;

import name.jacktang.matchingalgorithms.StringSearch;

/**
 * @author Jack.Z.Tang
 * @date 2017/05/17
 */
public class BruteForce implements StringSearch {

    @Override
    public int match(String source, String pattern) {
        if (source == null || source.isEmpty() || pattern == null || pattern.isEmpty()) {
            return -1;
        }

        boolean match = false;
        int index = -1;
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (source.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
                if (j == pattern.length() - 1) {
                    match = true;
                    index = i;
                }
            }
            if (match) {
                break;
            }
        }
        return index;
    }
}
