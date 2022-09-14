package com.day2Practice;
import java.util.Scanner;
public class SwitchDay2{
public static void main(String args[]){
    char ch;//variable declaration
    boolean isVowel=false;//Declare a boolean variable
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
System.out.println("Enter the character  ");
ch=scan.next().charAt(0);;// store the input from the user
switch(ch){
    //check lower case vowel letters
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    
//check upper case vowel letters
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    isVowel=true;
}
    
    if(isVowel==true){
        System.out.println(ch+" is a vowel");
    }
    else{ if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
        System.out.println(ch+" is a consonant");
    }
    else{
        System.out.println(ch+" is not a Alphabets");
    }
}
    
}
    
}
  