package lc.seven;

/**
 * TODO description
 *
 * @author fanwenjie415
 * @date 2019-03-17
 * @since v1.0.0
 */
public class ToLowerCase  {
    public static void main(String[] args) {
        String[] case1J = new String[]{"Hello", "here", "LOVELY"};

        long st = System.currentTimeMillis();

        final Solution2 solution = new Solution2();
        for (int i = 0; i < 1; i++) {

            for (String data : case1J) {
                System.out.println("Output: " +solution.toLowerCase(data));
            }
        }
        long et = System.currentTimeMillis();
        System.out.println("cost : " + (et - st) + " ms");
    }
}

class Solution1 {
    public String toLowerCase(String str) {

        final char[] chars = str.toCharArray();
        String sb = "";
        for (int i = 0; i < chars.length; i++) {
            if (65 <= chars[i] && chars[i] < 91) {
                chars[i] += 32;
            }

            sb += chars[i];
        }

        return sb;
    }
}


class Solution2 {
    public String toLowerCase(String str) {

        final char[] chars = str.toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (65 <= chars[i] && chars[i] < 91) {
                chars[i] += 32;
            }

            sb.append(chars[i]);
        }

        return sb.toString();
    }
}

class Solution3 {
    public String toLowerCase(String str) {

        final char[] chars = str.toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (65 <= chars[i] && chars[i] < 91) {
                chars[i] += 32;
            }

            sb.append(chars[i]);
        }

        return new String(chars);
    }
}