package name.jacktang.matchingalgorithms.test;

import name.jacktang.matchingalgorithms.BruteForce;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jack.Z.Tang
 * @date 2017/05/17
 */
public class TestMatching {
    private final static String source = "BBC ABCDABABCDABCDABDE";
    private final static String pattern = "ABCDABD";

    @Test
    public void testBruteForce() {
        BruteForce bruteForce = new BruteForce();
        Assert.assertTrue(bruteForce.match(source, pattern) == 14);
    }
}
