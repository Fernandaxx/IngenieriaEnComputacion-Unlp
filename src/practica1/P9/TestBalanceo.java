package practica1.P9;

import java.util.Scanner;

public class TestBalanceo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un patron: ");
        String patron = in.next();

        Stack<Character> pila = new Stack<Character>();
        boolean valido = true;

        if (patron.length() % 2 == 0) {

            for (int i = 0; i < patron.length() && valido; i++) {
                char c = patron.charAt(i);

                if ((c == '(') || (c == '[') || (c == '{')) {
                    pila.push(c);
                }

                else if (c == ')') {
                    valido = !(pila.isEmpty()) && (pila.pop() == '(');
                }

                else if (c == ']') {
                    valido = !(pila.isEmpty()) && (pila.pop() == '[');
                }

                else if (c == '}') {
                    valido = !(pila.isEmpty()) && (pila.pop() == '{');
                }
            }
        } else {
            valido = false;
        }

        System.out.println(valido);

        in.close();
    }

}
