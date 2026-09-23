package com.mycompany.ooprproj1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class week5ass12 { 
    public static void main (String[] args) throws Exception { 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("ENTER THREE WORDS\n"); 
        
        System.out.print(" - Enter first word: "); 
        String word1 = reader.readLine(); 
        
        System.out.print(" - Enter second word: "); 
        String word2 = reader.readLine(); 
        
        System.out.print(" - Enter third word: "); 
        String word3 = reader.readLine(); 
        
        System.out.println(" "); 
        System.out.println(word1 + " " + word2 + " " + word3); 
        
        reader.close(); 
    } 
}
