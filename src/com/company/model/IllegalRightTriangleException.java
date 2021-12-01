package com.company.model;

public class IllegalRightTriangleException extends Exception{

    String errorMessage;
    public IllegalRightTriangleException(String inErrorMessage) {
        errorMessage = inErrorMessage;
    }

    public String getString(){
        System.out.println(errorMessage);
        return errorMessage;
    }


}
