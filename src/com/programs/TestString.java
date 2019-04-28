package com.programs;
import java.io.IOException;
import java.util.Scanner;

public class TestString {

	

	
	    static String timeConversion(String s) {
	     
	         String tmp = s.substring(0, s.length() -2);

	         String amPm = s.substring(s.length()-2, s.length());

	         String[] splits = tmp.split(":"); 

	         String timeconverted = null;
	         
	         int abcd = Integer.parseInt(splits[0]);
	         

	         if(s.equalsIgnoreCase("12:00:00PM")){
	             timeconverted = "12:00:00";
	         } else if(splits[0].equals("12") && amPm.equals("AM")){
	             timeconverted = "00:" + splits[1] + ":" + splits[2];
	         } else if(Integer.parseInt(splits[0]) < 12 && amPm.equals("AM")){
	             timeconverted =  tmp;
	         } else if(splits[0].equals("12") && amPm.equals("PM")){
	             timeconverted = "12:" + splits[1] + ":" + splits[2];
	         }else if(abcd < 12 && amPm.equals("PM")){
	        	 int abc = Integer.parseInt(splits[0]);
	        	 int def = abc +12;
	             timeconverted = def + ":"+ splits[1] + ":" + splits[2];
	         } 

	         return timeconverted;

	    }


	    public static void main(String[] args) throws IOException {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();

	        String result = timeConversion(s);

	        System.out.println(result);
	    }
	


}
