package com.example.amenoimi.qrget;

public class Permission {
    public static String[] resizeArray(String[] arrayToResize, int size) {
        // create a new array twice the size
        String[] newArray = new String[size];

        System.arraycopy(arrayToResize, 0,
                newArray, 0, arrayToResize.length);
        return newArray;
    }
}
