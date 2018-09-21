package com.company;

public class Main {

    public static String evenodd(String str, int count){
        int c = count;
        String o= "";
        while (c < str.length()){
            o = o + str.substring(c, c+1);
            c = c+2;
        }
        return o;
    }
    public static void main(String[] args) {
	// odd
        System.out.println(evenodd("Hello World", 1));
        // even
        System.out.println(evenodd("Hello World", 0));
        //even + odd
        System.out.println(evenodd("Hello World", 0) + evenodd("Hello World", 1) );
    }
}
