public class countXRecursion {
    static int countX(String str) {
        int startIndex = 0;
        int endIndex = str.length();
        //This extra check to see if the string is null . to simply return 0 , only if not null return the string at index 0
        char sub=' ';
        if(str!="") {
            sub = str.charAt(startIndex);
        }
        if (sub== 'x'&& startIndex == endIndex-1) {
            return 1;
        }
        if(sub=='x'&& startIndex<endIndex-1){
            return 1+countX(str.substring(startIndex+1,endIndex));
        }
        else if(sub!='x'&&startIndex<endIndex-1){
            return countX(str.substring(startIndex+1,endIndex));
        }

        return 0;






    }


    public static void main(String[] args) {

        System.out.println(countX("axxeafxxxx"));

    }
}
