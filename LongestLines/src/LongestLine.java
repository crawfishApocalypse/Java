import java.io.*;
import java.util.*;


public class LongestLine 
{
	
   public static void main (String args[]) throws FileNotFoundException
   {
      File f = new File (args[0]);
      if (!f.exists())
      {
        System.err.println ("File does not exist.");
        System.exit(1);
      }
      if (!f.canRead())
      {
        System.err.println ("File cannot be read.");
        System.exit(1); 
      }
      Scanner sc = new Scanner (f);
      
      
      while (sc.hasNextLine())
      {
    	String line = sc.nextLine();
    	if (line.length() >= 66)
    	System.out.println (line);
      } 
   }
}
