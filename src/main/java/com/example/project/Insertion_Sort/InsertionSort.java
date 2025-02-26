package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int current = elements[i];
            int j = i - 1;

            while (j >= 0 && elements[j] > current) {
                elements[j + 1] = elements[j];
                j--;
            }

            elements[j + 1] = current;
        }
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String current = words.get(i);
            int j = i - 1;

            while (j >= 0 && words.get(j).compareTo(current) > 0) {
                words.set(j + 1, words.get(j));
                j--; 
            }

            words.set(j + 1, current);
        }
        return words;
    }

    // Helper method to load words from a file
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
