package Homework.Bracechecker;

public class BraceChecker {
    String text;
    private boolean inncorrect = true;
    private char tmp;
    private int size;


    Stack stck = new Stack();

    public BraceChecker(String text) {
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
                case ']':
                case ')':
                    if (stck.getSize() == -1) {
                        System.err.println("Error: closed " + text.charAt(size) + " but don't opened " + (size + 1));
                        inncorrect = false;
                    } else {
                        tmp = (char) stck.pop();
                        if (tmp != '(' && text.charAt(size) == ')' || tmp != '[' && text.charAt(size) == ']' || tmp != '{' && text.charAt(size) == '}') {
                            System.err.println("Error: opened " + tmp + " but closed " + text.charAt(size) + " " + (size + 1));
                            inncorrect = false;
                        }
                    }

                    break;


            }
        }
        for (int i = stck.getSize(); i >= 0; i--) {
            System.err.println("Error: " + (char) stck.pop() + " " + "opened but dont closed");
            inncorrect = false;

        }

        if (inncorrect) {
            System.out.println("Text Inncorrect");
        }

    }


}

