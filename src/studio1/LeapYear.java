package studio1;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    System.out.println("Enter a four digit year");
    int year1 = in.nextInt();
Boolean isLeapYear = (year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0);
if(isLeapYear) {
    System.out.println(year1 + " is a leap year!");}
else {
    System.out.println(year1 + " is not a leap year!");}
}}
