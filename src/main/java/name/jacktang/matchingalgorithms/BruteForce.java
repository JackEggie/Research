package name.jacktang.matchingalgorithms;

/**
 * @author Jack.Z.Tang
 * @date 2017/05/17
 * @company Newegg Tech (China) Co, Ltd
 */
public class BruteForce {

    public int match(String source, String pattern) {
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
