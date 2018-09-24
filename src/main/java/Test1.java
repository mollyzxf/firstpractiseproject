/**
 * @author
 * @date 2018/09/23
 */
public class Test1 {

    public static void main(String[] args) {


    String str1 = "china";
    String str2 = new String("china");
    String s1 = "chinn";
    String s2 = "a1";
    String s3 = s1 + s2;
    System.out.println(str1== str2);
    System.out.println(str1==str2.intern());

    System.out.println(s1==s3);
    System.out.println(s1==s3.intern());
}
}
