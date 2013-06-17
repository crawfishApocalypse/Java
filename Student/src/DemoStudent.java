/*
 
 Author: Julian Eljabali
 Date  : 01/29/13
 Program Name: Student.java
 Objective: This program shows you how to use the Student class.
 
*/



public class DemoStudent 
{
   public static void main(String args[])
   {
	   Student s1 = new Student("Julian","Eljabali",90,89,100);
	   System.out.println("First name: "+s1.getFirstName());
	   System.out.println("Last name: "+s1.getLastName());
	   System.out.println("Average score: "+ Math.round(s1.averageScore()));
	   System.out.println("Letter grade: "+s1.finalGrade());
   
	   System.out.println("");
	   
	   Student s2 = new Student("David","Letterman",65,70,45);
	   System.out.println("First name: "+s2.getFirstName());
	   System.out.println("Last name: "+s2.getLastName());
	   System.out.println("Average score: "+ Math.round(s2.averageScore()));
	   System.out.println("Letter grade: "+s2.finalGrade());
	   
	   System.out.println("");
	   
	   Student s3 = new Student("Grandma","Eljabali",89,81,77);
	   System.out.println("First name: "+s3.getFirstName());
	   System.out.println("Last name: "+s3.getLastName());
	   System.out.println("Average score: "+ Math.round(s3.averageScore()));
	   System.out.println("Letter grade: "+s3.finalGrade());
   }
}
