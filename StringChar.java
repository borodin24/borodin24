public class StringChar {
    public static void main(String[] args) {
        //strings
        String k = "hello world";
        String m = "world";
        System.out.println(m.contains("w"));
        System.out.println(k.indexOf('l'));
        System.out.print(k.substring(0, 6));
        
        
        // a program that prints out the individual charcters astring :
        for (int i =0; i < m.length();i++ )
        {
        System.out.println(m.charAt(i)); }
        //Characters

        char tt = 'j';
        char u = 66;
        char x ='\u03A9';
        char y = '\b' ;
        System.out.println(y);
        System.out.println(tt);
        System.out.println(u);
        System.out.println(x);







    }
}
