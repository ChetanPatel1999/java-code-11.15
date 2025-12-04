package StringExamples;

public class StringExampleTwo {

    public static void main(String[] args) {
//        String s1 = "red";
//        String s2 = "Rem";
//        boolean res = s1.equals(s2);
//        boolean res = s1.equalsIgnoreCase(s2);
//System.out.println(res);
//---------------------------------------------------------
//        String gmail = "abc123gmali.comm";
//        boolean res = gmail.endsWith(".com");
//        System.out.println(res);
//-----------------------------------------------------------
//        String gmail = "mr. india";
//        boolean res = gmail.startsWith("mr.");
//        System.out.println(res);
//------------------------------------------------------------
//        String s1 = "iNDORE";
//        s1 = s1.toLowerCase();
//        System.out.println(s1);
//---------------------------------------------------------------
//        String s1 = "indore";
//        for (int i = 0; i < s1.length(); i++) {
//            System.out.println(s1.charAt(i));
//        }
//        char[] s1Arr = s1.toCharArray();
//        for (char ch : s1Arr) {
//            System.out.println(ch);
//        }
//---------------------------------------------------------------
//        String s1 = "hello chetan";
////        s1=s1.substring(5);
//        s1 = s1.substring(6, 8);
//        System.out.println(s1);
//----------------------------------------------------------------
//        String s1 = "indore old city and ujjain also old city";
//        String s2 = "city";
////        s1 = s1.concat(" ").concat(s2);
////        s1 = s1.replace('o', 'm');
//        s1 = s1.replaceFirst("old", "new");
////        s1 = s1.replace("old", "new");
//        System.out.println(s1);
//-------------------------------------------------
//        String s1 = "hello indore";
//        System.out.println(s1.contains("indoy"));
//--------------------------------------------------
//        String s1 = "hello indore";
//        byte[] arr = s1.getBytes();
//        for (byte b : arr) {
//            System.out.println(b);
//        }
//-----------------------------------------
//        String s1 = "hello indore";
////        System.out.println(s1.indexOf('l'));
//        System.out.println(s1.indexOf("indore"));
//------------------------------------------------
        String s1 = "indore,ujjain,ratlam";
        String[] arr = s1.split("u");
        for(String s:arr)
        {
            System.out.println(s);
        }
    }

}
//String methods 
//str.length()  // return type is int
//str.equals(string)  //(case sensitive) compare two string and return boolean value true or false
//s1.equalsIgnoreCase(s2); // not case sensitive
//s1/endsWith(".com") // its return boolean value 
//gmail.startsWith("mr.");
//s1.toUpperCase(); 
//s1.toLowerCase();
//s1.charAt(2)  // its return a char according to passing index number
//s1.toCharArray(); // its conver string in array 
//s1.substring(5); // its return string index 5 to last charcter of string
//s1.substring(5,8);// its return string 5 is starting inde and 8 is ending index
