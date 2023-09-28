package Homework.BraceChecker;

import java.util.Stack;

public class BraceCheckerMethod {
    String text;
    boolean iscorect = true;
    int tmp;
    int size;


    StackMethod stck = new StackMethod();

    public BraceCheckerMethod(String text) {
        this.text = text;
    }

    public void check() {
        for (size = 0; size < text.length(); size++) {
            switch (text.charAt(size)) {
                case '{':
                case '[':
                case '(':
                    stck.push(text.charAt(size));
                    break;
                case '}':
                    if (stck.getSize() < 0) {
                        System.err.println("Error: closed " + text.charAt(size) + "but don't opened " + (size + 1));
                        iscorect = false;
                    } else if (tmp != '{') {
                        tmp = stck.pop();
                        System.err.println("Error: opened " + (char) tmp + "but closed" + text.charAt(size) + " " + (size + 1));
                        iscorect = false;
                    }
                    break;
                case ']':
                    if (stck.getSize() < 0) {
                        System.err.println("Error: closed " + text.charAt(size) + " but don't opened " + (size + 1));
                        iscorect = false;
                    } else if (tmp != '[') {
                        tmp = stck.pop();
                        System.err.println("Error: opened " + (char) tmp + " " + "but closed" + text.charAt(size) + " " + (size + 1));
                        iscorect = false;
                    }

                    break;
                case ')':
                    if (stck.getSize() < 0) {
                        System.err.println("Error: closed " + text.charAt(size) + " but don't opened " + (size + 1));
                        iscorect = false;
                    } else if (tmp != '(') {
                        tmp = stck.pop();
                        System.err.println("Error: opened " + (char) tmp + " but closed" + text.charAt(size) + " " + (size + 1));
                        iscorect = false;
                    }

                    break;


            }
        }

        int size = stck.getSize();
        for (int i = size; i >= 0; i--) {
            tmp = stck.pop();
            System.err.println("Error: " + (char) tmp + " " + "opened but dont closed");
            iscorect = false;

        }

        if (iscorect) {
            System.out.println("Text Iscorect");
        }

    }


}

