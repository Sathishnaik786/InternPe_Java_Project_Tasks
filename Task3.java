//Create a named loop
public class Task3 {
public static void main(String[] args)
{
// Outer loop.	
 outer: for(int i = 1; i < 5; i++)
 {
  System.out.println(i);	 
// Inner loop. 
 for(int j = 1; j < 3; j++)
 {
  System.out.println(j);
  if(i == j)
    continue outer;  
  }
 }
}}
