/*
 
 Author: Julian Eljabali
 Date  : 01/29/13
 Program Name: Student.java
 Objective: This program creates the Student class
 
*/


public class Student 
{
   private String lastName;
   private String firstName;
   private double score1;
   private double score2;
   private double score3;
   
	
	
 //*Setting up the Student constructor method
   public Student(String firstName1, String lastName1, int test1, int test2, int test3) 
	{
	   this.firstName = firstName1;
	   this.lastName = lastName1;
	   this.score1 = test1;
	   this.score2 = test2;
	   this.score3 = test3;		
	}
	
	public String getFirstName()
	{
	   return this.firstName;
	}
	
	public String getLastName()
	{
	   return this.lastName;
	}	
	
//******************************averageScores()**********************************
   public double averageScore()
   {
      return((this.score1 + this.score2 + this.score3)/3);
   }
////******************************finalGrade()*************************************
   public char finalGrade()
   {
	 double avgScore = this.averageScore();
	 
     if (avgScore > 90)
        return ('A');
      else if (avgScore > 80)
         return ('B');
      else if (avgScore > 70)
         return ('C');
      else if (avgScore > 60)
         return ('D');
      else
         return ('F');
     }

}
