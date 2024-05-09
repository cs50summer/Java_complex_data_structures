public class strPls {
    public static String strPls(String str, String word) {
        String res = "";
        int slen = str.length();
        int wlen = word.length();

        for (int i = 0; i < slen - 1; i++) {
            if (str.charAt(i) == word.charAt(0)) {
                int j=word.length();
                String sub=str.substring(i,i+j);
                res=res+sub;
                i=i+j-1;
                 }
           else if(i<slen-1) {
                res = res + "+";
            }
        }
        return res;
    }

        public static void main (String[]args){

            System.out.println(strPls("12xy34xyabcxy", "x"));
        }

    }

    // come back and solve with a better logic next time