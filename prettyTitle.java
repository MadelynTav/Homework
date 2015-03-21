package nyc.c4q.madelyntav;

public class prettyTitle {
    public static String loop( char c, int count, String title) {
    String result="";
        for (int i=0; i<count; i++){
            if ((title.charAt(i))==' ') {
                result += " ";
            }else result +=c;
            }
        return result;
    }
    public static void underlineTitle(String title, char underScore) {
        System.out.println(title);
        String underline = loop(underScore, title.length(), title);
        System.out.println(underline);
    }

    public static void printPrettyTitle(String title) {
        underlineTitle(title,'-');
    }
public static void main (String[] args){
    printPrettyTitle("I know where the sun rises");

}
}
