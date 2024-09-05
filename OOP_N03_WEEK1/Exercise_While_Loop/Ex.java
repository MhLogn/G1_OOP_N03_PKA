package OOP_N03_WEEK1.Exercise_While_Loop;

public class Ex {
    public static void main(String[] args) {
    //Print i as long as i is less than 6.
    int i4 = 1;
    while(i4 < 6) {
    System.out.println(i4);
    i4++;}
    System.out.println("------------------");
    //Use the do/while loop to print i as long as i is less than 6.
    int i5 = 1;
    do{
     System.out.println(i5);
    i5++;
    }
    while(i5 < 6);
    System.out.println("------------------");

    //Use a for loop to print "Yes" 5 times:
    for(int i = 0; i < 5; i++) {
      System.out.println("Yes");
    }
    System.out.println("------------------");

    //Loop through the items in the cars array.
    String[] cars={"Volvo","BMW","Ford"};
    for (String i1: cars){
        System.out.println(i1);
    }
    System.out.println("------------------");

    //Stop the loop if i2 is 5
    for(int i2=0;i2<10;i2++){
        if (i2==5){
            break;
        }
    System.out.println(i2);
    }
    System.out.println("------------------");

    //In the loop, when the value is "4", jumo directly to the next value
    for (int i3 = 0; i3 < 10; i3++) {
        if (i3==4){
            continue;
        }
        System.out.println(i3);
    }
    //Create an array of type String called cars1
    String[] cars1 ={"Honda","Tesla","Vinfast"};
    System.out.println("------------------");
    //Print the second item in car1 array.
    System.out.println(cars1[1]);
    System.out.println("------------------");
    //Exchang the value from "Honda"to"Opel" in array.
    cars1[0]="Opel";
    System.out.println(cars1[0]);
    System.out.println("------------------");
    //Find ou how many elements the cars1 array have.
    System.err.println(cars1.length);
    System.out.println("------------------");
    //Loop through the item in cars1 array
    
}
}
