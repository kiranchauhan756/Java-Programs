package com.javaprograms;
import java.util.*;
public class StringFunc {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        for(int i=start;i<=end-1;i++) {
	        	System.out.print(S.charAt(i));
	        }
	    	
	}

}