package Homework.fileAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {
    public Map<String, Integer> wordMap(String path)  {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String lines = "";
            while ((lines = bufferedReader.readLine()) != null) {
                if (!map.containsKey(lines)) {
                    map.put(lines, 1);
                } else {
                    int i = map.get(lines);
                    map.replace(lines, ++i);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return map;
    }

    public int totalWordCount(String path)  {
        int totalWordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String lines = "";
            while ((lines = bufferedReader.readLine()) != null) {
                ++totalWordCount;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return totalWordCount;
    }

    public int uniqueWordCount(String path)  {
        Map<String, Integer> wordsMap = wordMap(path);
        int uniqueWords = 0;
        for (Integer value : wordsMap.values()) {
            if (value <= 1) {
                ++uniqueWords;
            }
        }
        return uniqueWords;
    }

    public Map<String, Integer> topFrequentWords(String path, int n)  {
        return sortList(wordMap(path), n);
    }

    public int countWordOccurrences(String path, String word)  {
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String lines = "";
            while ((lines = bufferedReader.readLine()) != null) {
                if (lines.contains(word)) {
                    ++wordCount;
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return wordCount;
    }


    private Map<String, Integer> sortList(Map<String, Integer> words, int n) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            hashMap.put(list.get(i).getKey(), list.get(i).getValue());
        }
        return hashMap;
    }

}


