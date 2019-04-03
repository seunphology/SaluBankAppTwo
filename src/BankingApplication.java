
import java.util.Scanner;

public class BankingApplication {


    public static void main(String[] args) {

        BankAccount Salu = new BankAccount("Salu Oluwaseun", "3121486");
        Salu.showMenu();


    }
}

class BankAccount {
        double balance;
        double previousTransactions;
        String customerName;
        String customerId;

        BankAccount(String cname, String cid){ // constructor

            customerName = cname;
            customerId = cid;

        }



        void deposit(double amount){
            if(amount !=0){
                balance = balance + amount;
                previousTransactions = amount;
            }
        }

        void withdraw(double amount){

            if(amount !=0){
                balance=balance-amount;
                previousTransactions= -amount;
            }
        }

        void getprevioustransactions( ){
            if (previousTransactions > 0){
                System.out.println("Deposited : " + previousTransactions);
            }
            else if (previousTransactions < 0){

                System.out.println("Withdrawn : " + Math.abs(previousTransactions));

            }
            else{
                System.out.println("No transaction occurred");
            }
        }

        void showMenu(){
          char option = '\0';

          Scanner scanner = new Scanner(System.in);

          System.out.println("Welcome : " + customerName);
          System.out.println("Your ID is : " + customerId);
          System.out.println('\n');
          System.out.println("A : CHECK BALANCE");
          System.out.println("B : DEPOSIT");
          System.out.println("C: WITHDRAW");
          System.out.println("D : PREVIOUS TRANSACTIONS");
          System.out.println("E : EXIT");

          do {
              System.out.println("........................................");
              System.out.println("BALANCE :" + balance);
              System.out.println("........................................");
              option = scanner.next().charAt(0);
              System.out.println('\n');

              switch (option){

                  case 'A':
                      System.out.println("........................................");
                      System.out.println("BALANCE :" + balance);
                      System.out.println("........................................");
                      System.out.println('\n');
                      break;

                  case 'B':
                      System.out.println("........................................");
                      System.out.println("ENTER AN AMOUNT YOU WISH TO DEPOSIT ");
                      System.out.println("........................................");
                      double amount = scanner.nextDouble();
                      deposit(amount);
                      System.out.println('\n');
                      break;

                  case 'C':
                      System.out.println("........................................");
                      System.out.println("ENTER AN AMOUNT YOU WISH TO WITHDRAW ");
                      System.out.println("........................................");
                      double amount2 = scanner.nextDouble();
                      withdraw(amount2);
                      System.out.println('\n');
                      break;

                  case 'D':
                      System.out.println("........................................");
                      getprevioustransactions();
                      System.out.println("........................................");
                      System.out.println('\n');
                      break;
                  case 'E':
                      System.out.println("******************************************");
                      break;

                      default:
                          System.out.println("INVALID OPERATION,PLEASE TRY AGAIN.");

              }

          }while (option !='E');

          System.out.println("Thank you for using Salu Oluwaseun's portable banking app.");




        }




}





