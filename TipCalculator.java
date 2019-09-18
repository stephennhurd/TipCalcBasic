import java.util.Scanner;
public class TipCalculator
{

    public static void main(String[] args)
    {
        double foodSubtotal = 64.0;
        double foodTax = foodSubtotal * 0.06;
        double greatTip = foodSubtotal * 0.20;
        double fairTip = foodSubtotal * 0.12;
        double maxTotal = foodSubtotal + foodTax + greatTip;
        double minTotal = foodSubtotal + foodTax + fairTip;

        System.out.print("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hi, " + name + "!");
        System.out.println("Amount spent on food: $" + foodSubtotal);
        System.out.println("Tax amount: $" + foodTax);
        System.out.println("Tip range is: $" + fairTip + " to $" + greatTip);
        System.out.println("Total cost is: $" + minTotal + " to $" + maxTotal);
    }
}
