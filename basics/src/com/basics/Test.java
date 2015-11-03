package com.basics;

/**
 * Created by Falcon on 11/2/15.
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello for git");
        System.out.println("Second commit");
        System.out.println("update");

//        String of characters
        char[] chars = {'a','B','c'};
        String s = new String(chars);

//      String constructor
        String s1 = new String(chars, 0, 3); //(var, int startindex, int numOfCharacters)
        System.out.println(s1);
        String s2 = new String(s1);
        System.out.println(s2 = s2.toLowerCase());
        System.out.println(s2); // changes
        System.out.println(s1); //this does not


//        generating strings using ascii
        byte ascii[] = {65,66,67,68};
        String asc = new String(ascii);
        System.out.println(asc);

//      String concatenation
        String longStr = "This is " +
                "new String" +
                "That is automatically concatenated by " +
                "intelliJ IDEA" + 2 + 2;
        System.out.println(longStr);

        Box box = new Box(10, 20, 30);
        String boxStr = "Box is : " + box; //using toString method in the box class to make it usable here
        System.out.println(boxStr);

//        getChars
        String demo = "This is a demo of getChars";
        int start = 10;
        int end = 14;
        String s4 = "";
        char[] chr = new char[end-start];
        demo.getChars(start,end,chr,0); //chr is a buffer
        System.out.println(chr);

        String s5 = "Hello";
        String s6 = "Hello";
        String str2 = new String(s6);
        System.out.println(s5 == s6); // true...
        System.out.println(str2 == s6); // false
        System.out.println(s5.equals(s6)); //obvious true

//        Program to demonstrate the usage of substring

        String org = "This is a test. This is, too";
        String search = "is";
        String sub = "was";
        String result = "";

        int i;
        do {
//          getting the index of the first occurance
            System.out.println(result);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }

        }while(i != -1);


    }
}

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    @Override
    public String toString() {
        return "Dimensions are " + width + " by " + depth + " by " + height;
    }
}