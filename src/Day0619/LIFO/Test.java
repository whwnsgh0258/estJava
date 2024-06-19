package Day0619.LIFO;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<>();
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(10));
        stack.push(new Coin(5));
        while (!stack.isEmpty()) {
            Coin coin = stack.pop();
            System.out.println(coin.getValue());
        }
    }
}
