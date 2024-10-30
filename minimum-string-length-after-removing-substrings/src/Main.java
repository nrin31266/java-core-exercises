import java.util.Stack;

public class Main {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        int countRest = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == 'B') {
                    if (stack.peek() == 'A') {
                        stack.removeLast();
                    } else {
                        stack.push(c);
                    }
                } else if (c == 'D') {
                    if (stack.peek() == 'C') {
                        stack.removeLast();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(new Main().minLength("CBADS"));
    }
}