package com.company;

import com.company.model.IllegalRightTriangleException;

import java.util.Scanner;

public class Main {
//    class IllegalRightTriangleException extends Exception {
//        String errorMessage;
//        public IllegalRightTriangleException(String inErrorMessage) {
//            errorMessage = inErrorMessage;
//        }
//
//        public String getString(){
//            return errorMessage;
//        }
//    }
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter number: ");
            int number = scanner.nextInt();
            if(number<0){
                try {
                    throw new IllegalRightTriangleException("Nhap vao loi roi");
                } catch (IllegalRightTriangleException e) {
                        e.getString();
//                    System.out.println("Nhap loi");
                }
            }


    }
}
