package name.jacktang.matchingalgorithms.test;

import name.jacktang.matchingalgorithms.StringSearch;
import name.jacktang.matchingalgorithms.impl.BruteForce;
import name.jacktang.matchingalgorithms.impl.KMPSearch;
import org.junit.Assert;
import org.junit.Test;

/**
 * http://blog.csdn.net/chndata/article/details/43792363
 * @author Jack.Z.Tang
 * @date 2017/05/17
 */
public class TestMatching {
    private final static String[] source = {"ABAC"
            , "BBC ABCDABABCDABCDABDE"
            , "AAAAAAAAAAAAAAAAAAAAAAAAAAAAE"
            , "AAAAAAAAAAAAAAAAAAAAAAAAAAAAE"
            , "WHICH-FINALLY-HATS.--AT-THAT-POINT..."};
    private final static String[] pattern = {"BAC"
            , "ABCDABD"
            , "AAAE"
            , "CCCE"
            , "AT-THAT"};
    private final static int[] result = {1
            , 14
            , 25
            , -1
            , 21};

    @Test
    public void testBruteForce() {
        StringSearch stringSearch = new BruteForce();
        for (int i = 0; i < source.length; i++) {
            Assert.assertTrue(stringSearch.match(source[i], pattern[i]) == result[i]);
        }
    }

    @Test
    public void testKMP() {
        StringSearch stringSearch = new KMPSearch();
        for (int i = 0; i < source.length; i++) {
            Assert.assertTrue(stringSearch.match(source[i], pattern[i]) == result[i]);
        }
    }
}
