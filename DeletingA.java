package com.epam.DemoTddJunit;

public class DeletingA {
		public String removingA(String inputString) {
			char ch='A';
			if(inputString.charAt(0)==ch) {
			    if(inputString.charAt(1)==ch) {
			        return inputString.substring(2);
			    }
			    else {
			       return inputString.substring(1);
			    }
			}
			else{
			    return inputString;
			}
			}
}