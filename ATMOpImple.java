import java.util.*;
public class ATMOpImple implements ATMOpInterface {
     ATM atm=new ATM();
     ArrayList<String> l=new ArrayList<>();
      @Override
      public void viewBalance(){
            System.out.println("Available balance is :"+atm.getBalance());
      } 
      @Override
      public void withDrawAmount(double withDrawAmount){
        if(withDrawAmount%500==0){
         if(atm.getBalance()-withDrawAmount<0){
            l.add("Insufficient balance error for Rs."+withDrawAmount);
            System.out.println("Insufficient Balance...You have only Rs."+" "+atm.getBalance());
         }
         else if(atm.getBalance()-withDrawAmount>=0){
            l.add("Rs."+withDrawAmount+" "+"Amount withdrawn");
           System.out.println("Rs."+ withDrawAmount +" "+" withdrawed sucessfully ... Collect the cash!");
           atm.setBalance(atm.getBalance()-withDrawAmount);
           viewBalance();
         }
        }
        else{
            l.add("Withdrawn amount error in terms of 500 only for Rs."+ withDrawAmount);
            System.out.println("You can withdraw amount in terms of 500 only!....");
        }
      }
      @Override
      public void depositAmount(double depositAmount){
          l.add("Rs."+depositAmount+" "+ "Amount Deposited");
          System.out.println("Rs." +depositAmount + "  " +"Deposited SucessFully!");
          atm.setBalance(atm.getBalance()+depositAmount);
          viewBalance();
      }
      @Override
      public void viewMiniStatement(){
         for(int i=0;i<l.size();i++){
             System.out.println(l.get(i));
         }
         System.out.println("Now Available balance is"+" "+ atm.getBalance());
      }
}
