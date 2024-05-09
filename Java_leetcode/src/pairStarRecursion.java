public class pairStarRecursion {

    public static String pairStarRecursion(String str){
        // here the base condition is that if the string is NULL ,Or if string has only one element left , then it should return back the loop
        if(str.length()==0||str.length()==1){
            return str;
        }
        //Every time recursive call is made , the startIndex begins itself from the index 0 .Here we are comparing index at hand woth next index
        int startIndex=0;
        int nextIndex=startIndex+1;

        // checking for the condition , if there are two similar consecutive characters
        if(str.charAt(startIndex)==str.charAt(nextIndex)){
            //This is a corner case , where the end of string characters are similar . We want to exit without checking the next character after it
            if(str.length()==2){
                return str.charAt(startIndex) + "*" + pairStarRecursion(str.substring(nextIndex, str.length()));
            }
            //This is a case where three or four or infinite consecutive cahracters are similar , in that case , we dont want to skip through the next index, instead iteratitively add a star to it
            if(str.charAt(nextIndex)==str.charAt(nextIndex+1)) {
                    //return str.charAt(startIndex) + "*" + str.charAt(nextIndex) + pairStarRecursion(str.substring(nextIndex, str.length()));
                return str.charAt(startIndex) + "*" + pairStarRecursion(str.substring(nextIndex, str.length()));
            }
            //This is a case where only two characters are similar nothing more that that , so simply insert a * and skip to teh next call recursively
            else{
                return str.charAt(startIndex) + "*" + str.charAt(nextIndex) + pairStarRecursion(str.substring(nextIndex+1, str.length()));
            }
            }
        //This is a case , where we dont have any characters that are similar , so just iterate through the loop
        return str.charAt(startIndex)+ pairStarRecursion(str.substring(nextIndex,str.length()));

    }

    public static void main (String[]args){
        System.out.print(pairStarRecursion("helllo "));
    }
}

// will need to rewrite the program by copying teh format of WCtrial2 program , because string needs to be carefully thought out for beginning , middle , end indices .
// problem : how do you backtrack a in a string that is already being starred in previous iteration