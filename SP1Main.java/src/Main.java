import java.util.Scanner;

public class Main {
  private static boolean valid;
  Scanner scan = new Scanner(System.in);
  int numb = scan.nextInt();

  public static void main(String []args){
    System.out.println("Please input a number");

    boolean valid = false;                    //using a boolean to loop
    while(!valid) {
      System.out.println(intToNumeral());
    }

  }

  public static String intToNumeral() {
    Scanner scan = new Scanner(System.in);
    int numb;

    try {
      numb = scan.nextInt();
    }                              //catches the guess if it is not a number
    catch (Exception e) {
      return ("Please input a number instead");
    }
                                  //makes sure  the number is within the max and min
      if(numb>3999){
        return ("That number is too big");
      }
        else if (numb<=0) {
        return ("That number is too small");
      }

                                   //arraylist for combination of symbols
      String[] rTH = {"", "M", "MM", "MMM"};
      String[] rHO = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String[] rTE = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String[] rUN = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


                                   //gets the corresponding letter from the array, to the amounts the unit is used
                                   //fx, gets "M" from the rTH arraylist if the amount of thousands in the guess = 1
      String result = (rTH[numb / 1000] + rHO[(numb % 1000) / 100] + rTE[(numb % 100) / 10] + rUN[numb % 10]);
      return(numb + " = " + result);

    }
  }




