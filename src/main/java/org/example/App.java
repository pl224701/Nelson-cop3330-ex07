/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String str1 = sc.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String str2 = sc.nextLine();
        double c_factor = 0.09290304;
        int length = Integer.parseInt(str1);
        int width = Integer.parseInt(str2);
        int area1 = length*width;
        DecimalFormat df=new DecimalFormat("#.000");
        double area2 = area1*c_factor;
        String area2r = df.format(area2);
        System.out.printf("The area is\n%d square feet\n%s square meters",area1,area2r);
    }
}
