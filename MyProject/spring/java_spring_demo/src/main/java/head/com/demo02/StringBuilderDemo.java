package head.com.demo02;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("filter");
        System.out.println(sb);
        StringBuilder s2b = sb.append("op").append(34).append(false).append(1.2020);
        System.out.println(sb==s2b);
//        System.out.println(sb.toString());
        String s = sb.toString();
        System.out.println(s);
    }
}
