public class ExpBal {
    public static void main(String[] args) {
        String expression = "{1+(1+2)} ";
        boolean x = false;
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '{' || expression.charAt(i) == '('){
                x = false;
            } else if (expression.charAt(i) == '}' || expression.charAt(i) == ')') {
                x = true;
            }
        }
        System.out.println(x);
    }
}