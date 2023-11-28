package Homework.fileAnalyzer;


import java.util.Map;
import java.util.Scanner;

public class FileAnalyzerTest {
    //
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final FileAnalyzer fileAnalyzer = new FileAnalyzer();

    public static void main(String[] args) {
        boolean isrun = true;
        while (isrun) {
            switch (SCANNER.nextLine()) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    wordMap();
                    break;
                case "2":
                    System.out.println("please input path");
                    System.out.println(fileAnalyzer.totalWordCount(SCANNER.nextLine()));
                    break;
                case "3":
                    System.out.println("please input path ");
                    System.out.println( fileAnalyzer.uniqueWordCount(SCANNER.nextLine()));
                    break;
                case "4":
                    topFrequentWords();
                    break;
                case "5":
                    countWordOccurrences();
                    break;

            }
        }
    }



    private static void topFrequentWords() {
        System.out.println("please input path ");
        String path = SCANNER.nextLine();
        System.out.println("please input N (top-N)");
        String topN = SCANNER.nextLine();
        Map<String, Integer> map = fileAnalyzer.topFrequentWords(path, Integer.parseInt(topN));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    private static void wordMap() {
        System.out.println("please input path ");
        Map<String, Integer> map = fileAnalyzer.wordMap(SCANNER.nextLine());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    private static void countWordOccurrences() {
        System.out.println("please input path ");
        String path = SCANNER.nextLine();
        System.out.println("please input word");
        String word = SCANNER.nextLine();
        int countWordOccurrences= fileAnalyzer.countWordOccurrences(path,word);
        System.out.println("this word used "+ countWordOccurrences+" times");
    }
}
