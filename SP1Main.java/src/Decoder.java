import java.util.Scanner;

public class Decoder {

    Scanner scan = new Scanner(System.in);
    int numb = scan.nextInt();

    public static int intToNumeral(int numb) {
        this.numb = numb;
        if (numb ==<0){
            System.out.println("That aint a number chief");

        }
        String [] rTH = ("", "M","MM", "MMM");
        String[] rHO= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] rTE = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] rUN = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        int romanNumb = rTH[numb/1000] + rHO[(numb%1000)/100] + rTE[(numb%100)/10] + rUN[numb % 10];
        return romanNumb;

    }




}
