import java.util.ArrayList;
import java.util.Scanner;

public class Implement_MyStack_Using_Inheritance {
    private ArrayList<String> list;

    public Implement_MyStack_Using_Inheritance() {
        list = new ArrayList<String>();
    }

    public int getSize() {
        return list.size();
    }

    public String peek() {
        return list.get(getSize() - 1);
    }

    public String pop() {
        String str = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return str;
    }

    public void push(String str) {
        list.add(str);
    }

    public static void main(String[] args) {
        Implement_MyStack_Using_Inheritance stack = new Implement_MyStack_Using_Inheritance();
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter five strings: ");
			for (int i = 0; i < 5; i++) {
			    String str = input.next();
			    stack.push(str);
			}
		}

        System.out.print("The strings in reverse order are:");
        while (stack.getSize() > 0) {
            System.out.print(" " + stack.pop());
        }
    }
}
