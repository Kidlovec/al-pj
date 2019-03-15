package lc.seven.seven;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. 宝石与石头
 *
 * @author kidlovec
 * @date 2019-03-15
 *
 * 三个方法
 * 其中方法二 一层循环最快
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        String[][] case1J = new String[][]{{"aA", "aAAbbbb"},{"z","ZZ"}};

        long st = System.currentTimeMillis();

        final Solution1 solution = new Solution1();
        for (int i = 0; i < 10_0000; i++) {

            for (String[] data : case1J) {
                System.out.println("Output: " +solution.numJewelsInStones(data[0], data[1]));
            }
        }
        long et = System.currentTimeMillis();
        System.out.println("cost : " + (et - st) + " ms");
    }
}

class Solution1 {
    public int numJewelsInStones(String J, String S) {

        if (!(J != null && J.length() != 0 &&
              S != null && S.length() != 0)) {
            return 0;
        }

        char [] jewels = J.toCharArray();
        char [] stones = S.toCharArray();

        int jewelCnt = 0;
        for (char stone : stones) {
            for (char jewel : jewels) {
                if (stone == jewel)
                    jewelCnt ++;
            }
        }

        return jewelCnt;
    }
}

class Solution2 {
    public int numJewelsInStones(String J, String S) {

        if (!(J != null && J.length() != 0 &&
                S != null && S.length() != 0)) {
            return 0;
        }

        char [] stones = S.toCharArray();

        int jewelCnt = 0;
        for (char stone : stones) {
            if (J.indexOf(stone) > -1)
                jewelCnt++;
        }

        return jewelCnt;
    }
}

class Solution3 {
    public int numJewelsInStones(String J, String S) {

        if (!(J != null && J.length() != 0 &&
                S != null && S.length() != 0)) {
            return 0;
        }

        char[] charArray = new char['z' - 'A' + 1];

        char [] jewels = J.toCharArray();
        char [] stones = S.toCharArray();

        int jewelCnt = 0;
        for (char stone : stones) {
            charArray[stone - 'A']++;
        }

        for (char jewel : jewels) {
            jewelCnt += charArray[jewel - 'A'];
        }

        return jewelCnt;
    }
}

class Solution4 {
    public int numJewelsInStones(String J, String S) {

        if (!(J != null && J.length() != 0 &&
              S != null && S.length() != 0)) {
            return 0;
        }

        Set<Character> dataSet = new HashSet<>();
        char [] stones = S.toCharArray();

        int jewelCnt = 0;
        for (char stone : stones) {
            if (J.indexOf(stone) > -1)
                jewelCnt++;
        }

        return jewelCnt;
    }
}