public class countHiRecursion {
    public static int countHiRecursion(String str) {
        int startIndex = 0;
        int endIndex = 0;

        if(str.length()==0){
            return 0;
        }

        if ((startIndex + 2) <= str.length()) {
            endIndex = startIndex + 2;
        }
        else {
            endIndex = str.length();
        }
        String sub = str.substring(startIndex, endIndex);
        if (sub.equals("hi")) {
            return 1 + countHiRecursion(str.substring(endIndex, str.length()));
        }
        else{
            return countHiRecursion(str.substring(startIndex+1,str.length()));
        }
    }

    public static void main(String[] args){
        System.out.println(countHiRecursion("hihellohihi"));
    }
}
