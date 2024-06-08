import java.util.*;
public class ATM {
     private double balance;
     private double depositAmount;
     private double withDrawAmount;
     private ArrayList<Integer> atmNum=new ArrayList<>();
     private ArrayList<Integer> atmPin=new ArrayList<>();
     //default construtor
     public ATM(){

     }
     //getter and setter Methods
     public void setATMnum(int atmN){
          atmNum.add(atmN);
     }
     public void setATMpin(int atmP){
        atmPin.add(atmP);
     }
     public ArrayList<Integer> getATMnum(){
        return atmNum;
     }
     public ArrayList<Integer> getATMpin(){
        return atmPin;
     }
     public double getBalance(){
        return balance;
     }
     public void setBalance(double balance){
         this.balance=balance;
     }
     public double getDepositAmount(){
        return depositAmount;
     }
     public void setDepositAmount(double depositAmount){
         this.depositAmount=depositAmount;
     }
     public double getWithDrawAmount(){
        return withDrawAmount;
     }
     public void setWithDrawAmount(double withDrawAmount){
         this.withDrawAmount=withDrawAmount;
     }
}
