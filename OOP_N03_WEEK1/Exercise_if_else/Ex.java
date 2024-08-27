package OOP_N03_WEEK1.Exercise_if_else;

public class Ex {
public static void main(String[] args) {
   /*Exercise 1
Print "Hello World" if x is greater than y.*/
  int x = 50;
  int y = 10;
  if(x>y) {
  System.out.println("Hello World");
  }
    /*Exercise 2
Print "Hello World" if x is equal to y.  */
  int a = 50;
  int b = 50;
  if (a==b) {
   System.out.println("Hello World");
 }
/*Exercise 3 if...else
Print "Yes" if x is equal to y, otherwise print "No".*/

  int c = 50;
  int d = 50;
  if(c==d) {                                         
  System.out.println("Yes");
} 
  else
 {
  System.out.println("No");
}  
/*Exercise 4 if...else
Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".*/

  int x1 = 50;
  int y1 = 50;
  if
 (x1==y1) {
  System.out.println("1");
} 
  else if
 (x1 > y1) {
  System.out.println("2");
} 
  else
 {
  System.out.println("3");
}  
/*Exercise 5 if...else

Insert the missing parts to complete the following "short hand if...else statement" (ternary operator):*/

int time = 20;
  String result = (time < 18) ?"Good day." :"Good evening.";
System.out.println(result);
}
}