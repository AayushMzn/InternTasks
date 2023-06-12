import java.util.Stack;

public class ExpVal {
    public static void main(String[] args) {
//        String exp1 = "{1+(1+2)}";
//        String exp1 = "{(1+1)+(1+1)}";
//        String exp1 = "[1+{1+(1+1)}]";
        String exp1 = "[3-{1*(1+1)}]";
        Stack<Character> stack = new Stack<>();

        int result = 0, x = 0, y = 0;
        char operator = 'a';
        for (int i = 0; i < exp1.length(); i++) {
//            System.out.println(exp1.charAt(i));
            stack.push(exp1.charAt(i));
            if (exp1.charAt(i) == '}' || exp1.charAt(i) == ']' || exp1.charAt(i) == ')') {
                stack.pop();


                x = Integer.parseInt(String.valueOf(stack.pop()));
//                System.out.println(a);
//                System.out.println(x);

                operator = stack.pop();
//                System.out.println(operator);


                y = Integer.parseInt(String.valueOf(stack.pop()));
//                System.out.println(b);
//                System.out.println(y);

                stack.pop();

                switch (operator) {
                    case '+':
//                        System.out.println("add");
                        result = x + y;
                        break;
                    case '-':
                        result = y - x;
                        break;
                    case '*':
                        result = x * y;
                        break;
                }

                stack.push(String.valueOf(result).charAt(0));
            }
        }
        System.out.println(result);
//        System.out.println(stack);
    }
}
