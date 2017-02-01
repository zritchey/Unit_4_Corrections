package com.company;



/**
 * Created by zachary on 1/31/2017.
 */
public class hexHandler {
    public hexHandler(){

    }
    public static String hexFind (String triple){
        String[]rgb=triple.split(",");
        int r=Integer.parseInt(rgb[0]);
        int g=Integer.parseInt(rgb[1]);
        int b=Integer.parseInt(rgb[2]);
        return Integer.toHexString(r)+Integer.toHexString(g)+Integer.toHexString(b);
    }
}
