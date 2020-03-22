package leetcode;

public class Reverse {

    public static void main(String[] args) {

        Reverse reverse = new Reverse();
        System.out.println(reverse.inplaceReverse("Aseem"));
        System.out.println(reverse.reverse(-12345));
        System.out.println(reverse.reverse(1534236469));

    }

    public int reverse(int x) {
        StringBuilder sb;
        int len = 0;
        int result;
        if (x < 0) {
            sb = new StringBuilder(String.valueOf(x));
            sb.deleteCharAt(0);
            len = sb.length();
            loop(sb, len);
            try {
                result = Integer.valueOf("-" + sb.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        else {
            sb = new StringBuilder(String.valueOf(x));
            len = sb.length();
            loop(sb, len);
            try {
                result = Integer.valueOf(sb.toString());
            } catch (NumberFormatException e) {
                return 0;
            }

        }
        return result;
    }

    private void loop(StringBuilder sb, int len) {
        for (int i = 0; i < len / 2; i++) {
            char current = sb.charAt(i);
            int otherEnd = len - i - 1;
            sb.setCharAt(i, sb.charAt(otherEnd));
            sb.setCharAt(otherEnd, current);
        }
    }

    private String inplaceReverse(final String input) {
        StringBuilder sb = new StringBuilder(input);
        int len = input.length();
        loop(sb, len);
        return  sb.toString();
    }

}
