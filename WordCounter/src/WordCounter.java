import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
/*
 Author: Julian Eljabali
 Date  : 02/19/13
 Program Name: WordCounter.java
 Objective: This is a program that counts the number
 of lines, words, and characters in a file.
*/

public class WordCounter 
{
   public static void main (String args[]) throws FileNotFoundException
   {
	    PrintWriter pw = new PrintWriter(new FileOutputStream("myfile.txt",true));
	    pw.println("But it can get really annoying");
   }
}