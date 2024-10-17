import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for inputting values from the keyboard

        int ans = 0;
        while(true ){
            //taking the operator as a input..
            System.out.print("Enter The Operator : ");
            char op = input.next().trim().charAt(0);
            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                //inputting two numbers
                System.out.print("Enter Your First Number : ");
                int num1 = input.nextInt();
                System.out.print("Enter Your Second Number : ");
                int num2 = input.nextInt();

                if (op == '+'){
                    ans = num1+num2;
                    
                }
                if (op == '-'){
                    ans = num1-num2;
                    
                }
                if (op == '*'){
                    ans = num1*num2;
                    
                }
                if (op == '/'){
                    ans = num1/num2;
                    
                }
                if (op == '%'){
                    ans = num1%num2;
                    
        
                 }
                 }
                    System.out.println("The Answer is : " + ans);
                }
            }

            
        }

    

