public class changeXY {
    static String changeXY(String str) {
        int startIndex = 0;
        int endIndex = str.length();
        int found=str.indexOf("x");
        System.out.println(found);
        //This extra check to see if the string is null . to simply return 0 , only if not null return the string at index 0

        if(found==-1) {
          return str;
        }
        if (found== endIndex-1) {
            str=str.substring(startIndex,found)+"y";
            return str;
        }
        if(found==0){
            str="y"+str.substring(found+1,endIndex);
            return changeXY(str);

        }
        else if(found<endIndex-1){
            str= str.substring(startIndex,found)+"y"+(str.substring(found+1,endIndex));
            System.out.println(str);

            return changeXY(str);
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(changeXY("h"));
    }
}
