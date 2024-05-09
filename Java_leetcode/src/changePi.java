public class changePi {
    public static String changePi(String str){
    int startIndex = 0;
    int endIndex = str.length();
    int found=str.indexOf("pi");
        System.out.println(found);
    //This extra check to see if the string is null . to simply return 0 , only if not null return the string at index 0

        if(found==-1) {
        return str;
    }
        if (found== endIndex-1) {
        str=str.substring(startIndex,found+1)+"3.14";
        return str;
    }
        if(found==0){
        str="3.14"+str.substring(found+2,endIndex);
        return changePi(str);

    }
        else if(found<endIndex-1){
        str= str.substring(startIndex,found)+"3.14"+(str.substring(found+2,endIndex));
        System.out.println(str);

        return changePi(str);
    }
        return str;
}


    public static void main(String[] args) {
        System.out.println(changePi("xppipx"));
    }
}



