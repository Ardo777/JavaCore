package Ardo777codes;

import java.util.Scanner;

public class HPTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPoints = 0;
        System.out.println("Բարև,այսօր մենք կստուգենք թէ դու ինչքան լավ գիտես Հայաստանի պատմությունը․\nգրիր անուն ազգանունտ՝");
        String ns = scan.nextLine();

        System.out.println("1)Ինչպե՞ս էին հնում հարևան ազգերն անվանում Հայաստանը." + "\n1)Փոքր Ասիա" + "\n2)Սոմխեթի\n3)Հայք");
        int answer = scan.nextInt();

        if (answer == 2) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("2)Ո՞ր լեռներից է սկիզբ առնում Արաքս գետը." + "\n1)Գեղամա" + "\n2)Բյուրակնյան" + "\n3)Գուգարաց");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("3)Սևանա լիճը նախկինում կոչվել է…"+"\n1)Ախուրյան"+"\n2)Քասախ"+"\n3)Գեղամա կամ Գեղարքունյաց ծով");
        answer = scan.nextInt();
        if (answer == 3) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("4)Ո՞ր արքայի օրոք է կառուցվել Գառնիի հեթանոսական տաճարը"+"\n1)Տրդատ 1-ինի"+"\n2)Արտաշես 1-ինի"+"\n3)Տիգրան Մեծի");
        answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("5)Հայաստանի հնագույն մայրաքաղաքներից է եղել…"+"\n1)Երևանը"+"\n2)Վաղարշապատը"+"\n3)Հրազդանը");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("6)Հնում հայկական ամենահայտնի բարձրագույն դպրոցներից է եղել…"+"\n1)Սյունյաց դպրոցը"+"\n2)Արգինայի վարդապետարանը"+"\n3)Գլաձորի վարդապետարանը");
        answer = scan.nextInt();
        if (answer == 3) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("7)Ո՞ր հայտնի եռահատոր գրքում է ներկայացված եղել հայ ժողովրդի պատմությունը"+"\n1)Մաղաքիա Օրմանյանի «Ազգի պատմություն» («Ազգապատում»)"+"\n2)Եղիշե «Վասն Վարդանայ և Հայոց պատերազմին» (Վարդանի և հայոց պատերազմի մասին)"+"\n3)Մովսես Խորենացու «Հայոց Պատմություն»");
        answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("8)Ո՞ր հայ երգահանն է հավաքել, ձայնագրել, ուսումնասիրել ու մաքրել ավելի քան 3000 ժողովրդական երգեր"+"\n1)Տիգրան Չուխաջյան"+"\n2)Կոմիտաս"+"\n3)Սայաթ-Նովա");
        answer = scan.nextInt();
        if (answer == 2) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("9)Երբ է տեղի ունեցել Ավարայրի ճակատամարտը"+"\n1)921 թ."+"\n2)371 թ."+"\n3)451 թ.");
        answer = scan.nextInt();
        if (answer == 3) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("10)Ո՞ր երկիրն առաջինը դատապարտեց հայոց ցեղասպանությունը."+"\n1)Չիլի"+"\n2)Պարագվայ "+"\n3)Ուրուգվայ");
        answer = scan.nextInt();
        if (answer == 3) {
            System.out.println("Ճիշտ է");
            totalPoints += 1;
        } else {
            System.out.println("Սխալ է");
        }
        System.out.println();
        System.out.println("Ապրես "+ns+" դու ավարտեցիր թեստը և հավաքեցիր "+totalPoints+" միավոր");


    }
}
