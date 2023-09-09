package classwork.chapter5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choise;
        do {
            System.out.println("Справка по оператору:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.println("Выберите нужный пункт:");
            choise = (char) System.in.read();


        } while (choise < '1' || choise > '5');
        System.out.println("\n");
        switch (choise){
            case '1':
                System.out.println("if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(виражение) {");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case'4':
                System.out.println("do-while:\n");
                System.out.println("do { ");
                System.out.println("   оператор;");
                System.out.println("} while (условие);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(инициализация;условие;итерация)");
                System.out.println(" оператор;");
                break;
        }

    }
}
