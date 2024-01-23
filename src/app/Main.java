package app;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
    System.out.println("For converting from miles into kilometrs enter 1\n" +
            "For converting from kilometrs into miles enter 2");

Scanner sc = new Scanner(System.in);
try {
    int opcode = sc.nextInt();
    if(opcode == 1){
        System.out.println("Enter the value of miles: ");
        Double ml = sc.nextDouble();
        System.out.printf(String.valueOf(ml));
    }
    else if (opcode==2){
        System.out.println("Enter the value of kilometres: ");
        Double km = sc.nextDouble();
        System.out.printf(String.valueOf(km));



    }
    else {
        System.out.println("Invalid operation code has been entered!");
    }




}
catch (Exception e)
{
    System.out.println("Invalid value has been entered!");
}




    }
}