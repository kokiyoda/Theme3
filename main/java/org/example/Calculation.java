package org.example;

 public class Calculation {

     public static Integer doubleNum(String value){

         try{
             Integer number = Integer.parseInt(value);

             System.out.println("input char :" + number);

             return number * 2;

         } catch (NumberFormatException e) {
             System.out.println("no digits entered");
         } finally {
             System.out.println("finally");
         }
         return null;
     }
}