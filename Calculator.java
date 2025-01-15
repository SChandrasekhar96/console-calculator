import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("For Addition Press '+'");
        System.out.println("For Substraction Press '-'");
        System.out.println("For Multiplication Press '*' ");
        System.out.println("For Division Press '/' ");
        System.out.println("To Exit Enter 'E'");
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Enter the Operation");
                char o = sc.next().charAt(0);
                if(o=='E'){
                    System.out.println("Exiting the Calculator.Thank You!");
                    break;
                }
                System.out.println("Enter the First Number :");
                double n1 = sc.nextDouble();
                System.out.println("Enter the Second Number :");
                double n2 = sc.nextDouble();
                switch(o){
                    case '+':
                        System.out.println("Result : "+ (n1+n2));
                        break;
                    case '-':
                        System.out.println("Result : "+ (n1-n2));
                        break;
                    case '*':
                        System.out.println("Result : "+ (n1*n2));
                        break;
                    case '/':
                        if(n2!=0){
                            System.out.println("Result : "+ (n1/n2));
                        }else{
                            System.out.println("Division not Allowed");
                        }            
                        break;
                    default:
                        System.out.println("Invalid Operation!");
                } 
            }catch(InputMismatchException e){
                System.out.println("Invalid Input.Please Enter valid Input");
                sc.nextLine();
            }  
        }
        sc.close();
    }
}
