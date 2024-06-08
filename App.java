import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       ATMOpInterface op=new ATMOpImple();
       Scanner scan=new Scanner(System.in);
       System.out.println("Welcome to ATM Machine!.....");
       System.out.println("Already have an account press 1 to continue OR to create new Account press 2");
       int i=scan.nextInt();
       ATM atm=new ATM();
       ArrayList<Integer> atmNum=atm.getATMnum();
       ArrayList<Integer> atmPin=atm.getATMpin();
    if(i==1){
       System.out.println("Enter ATM Number:");
       int atmInput=scan.nextInt();
       System.out.println("Enter ATM Pin Number");
       int pinInput=scan.nextInt();
       ValidationSuccess(atmInput, pinInput, atmNum, atmPin);
    }
    else if(i==2){
        System.out.println("Enter new ATM Number to create New Account");
        int num=scan.nextInt();
        System.out.println("Enter new ATM pin to create new Account");
        int pin=scan.nextInt();
        atm.setATMnum(num);
        atm.setATMpin(pin);
        System.out.println("Account Created SuccessFully!...");
        ValidationSuccess(num, pin, atmNum, atmPin);
      }     
    }
    public static void ValidationSuccess(int atmInput,int pinInput,ArrayList<Integer> atmNum,ArrayList<Integer> atmPin){
        ATMOpInterface op=new ATMOpImple();
        if(atmNum.contains(atmInput) && atmPin.contains(pinInput)){
            Scanner scan=new Scanner(System.in);  
            while(true) {
                System.out.println("1.View Available balance");
                System.out.println("2.With Draw the amount");
                System.out.println("3.Deposit Amount");
                System.out.println("4.View Mini Statement");
                System.out.println("5.Exit the Application");
                System.out.println("Enter Choice: ");
                int ch=scan.nextInt();
                if(ch==1){
                     op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter Amount to withdraw ");
                    double wd=scan.nextDouble();
                    op.withDrawAmount(wd);
                }
                else if(ch==3){
                     System.out.println("Enter Amount to Deposit");
                     double depAmo=scan.nextDouble(); //5000
                     op.depositAmount(depAmo);
                }
                else if(ch==4){
                    System.out.println("-----Your Mini Statement-----");
                     op.viewMiniStatement();
                }
                else if(ch==5){
                  System.out.println("Collect your ATM Card");
                  System.out.println("Thank you for using ATM Machine");
                  System.exit(0);
                }
                else{
                   System.out.println("Please enter valid choice");
                }
            }
         }
         else{
             System.out.println("Incorrect ATM Number and Pin...Enter Correct Number OR Create New One");  
         }
    }
}