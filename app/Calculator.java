package main;

public class Calculator {
    
    public static void main(String[] args) throws Exception {

        int number1 =  Integer.parseInt(args[0]);
        int number2 =  Integer.parseInt(args[1]);
        String operator =  args[2];
        selectOperator(number1, number2, operator);
    }
    public static void selectOperator(int a, int b, String operator)throws Exception{
        switch (operator) {
            case "+" -> sum(a, b);
            case "-" -> subtraction(a, b);
            case "*" -> multiply(a, b);
            case "/" -> division(a, b);
            default -> throw new Exception("Operator no accept");
        }
    }


    public static void sum(int a, int b){
        long result = a + b;
        System.out.println("Result operation is: "+ result);
    }

    public static void subtraction(int a, int b){
        long result = a - b;
        System.out.println("Result operation is: "+ result);
    }

    public static void multiply(int a, int b){
        long result = a * b;
        System.out.println("Result operation is: "+ result);
    }

    public static void division(int a, int b){
        long result = a / b;
        System.out.println("Result operation is: "+ result);
    }
}