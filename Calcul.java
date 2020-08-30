import java.util.Scanner;

public class Calcul {

    public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Введи первое число:");
            float num1 = getNum();

            System.out.println("Введи операцию:");
            char operation = getOper();

            System.out.println("Введи второе число:");
            float num2 = getNum();

            float res = calc(num1, num2, operation);
            System.out.println("Вот что получается:"+ res);
        }
            public static float getNum(){

                float num;
                if(scanner.hasNextFloat()){
                num = scanner.nextFloat();
                } else {
                    System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                    scanner.next();
                    num = getNum();
                }
                return num;
            }

            public static char getOper() {
                char oper;
                char operation;
                oper = scanner.next().charAt(0);
                if(oper == '+'){
                    operation = oper;
                }
                else if (oper == '-'){
                    operation = oper;
                }
                else if (oper == '/'){
                    operation = oper;
                }
                else if (oper == '*'){
                    operation = oper;
                }
                else {
                    System.out.println("Я не понимаю этой операции, введите +, -, / или *");
                    scanner.next();
                    operation = getOper();
                }
                return operation;
            }



            public static float calc(float num1, float num2, char operation) {
                float res;
                switch (operation) {
                    case '+' -> res = num1 + num2;
                    case '-' -> res = num1 - num2;
                    case '/' -> res = num1 / num2;
                    case '*' -> res = num1 * num2;
                    default -> {
                        System.out.println("Похоже, я чего-то не понимаю... Давайте повторим!");
                        res = calc(num1, num2, operation);
                    }
                }
                return res;
            }

}



