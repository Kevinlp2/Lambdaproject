public class demo4_8 {
    public static void main(String[] args) {
        String str = "asdxsdfas";
        String str2="";

        while (str.length()>0){
            str2=str.substring( 0,1 );
            System.out.println(str2+"字符的个数为："+(str.length()-str.replace( str2,"" ).length()));
            str=str.replace( str2,"" );
        }
    }
}
