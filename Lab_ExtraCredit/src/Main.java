//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Problem 01
        An anagram is a word or phrase formed by rearranging the letters
        of a different word or phrase, typically using all the original letters exactly once.
        Given an array of strings, you need to develop a function that sorts the anagrams
        and display them next to each other.
        */
        String [] words = {"cat", "art", "tac", "rat", "tar", "act"};
        System.out.print("Original array: ");
        for(String word: words){
            System.out.print(word + " ");
        }
        System.out.print("\nArray sorted by anagram: ");
        Anagram.findAnagram(words);
        /* Problem 02
        You are given two sorted arrays A and B where A has a large enough buffer
        at the end to hold B. Write a function to merge B into A in sorted order.
        */
        Random random = new Random();

        int [] A = new int [10];
        for (int i = 0; i < 5; i++) {
            int randNum = random.nextInt(20);
            A[i] = randNum;
        }
        System.out.print("\n\nArray A: ");
        for(int num: A) {
            System.out.print(num + " ");
        }
        int [] B = new int[4];
        for (int i = 0; i < 4; i++) {
            int randNum = random.nextInt(20);
            B[i] = randNum;
        }
        System.out.print("\nArray B: ");
        for(int num: B) {
            System.out.print(num + " ");
        }
        System.out.print("\nA & B Sorted Merge: ");
        Merge.srtMerge(A,B);
        /*Problem 03
        Find the number of entries which are not divisible by 7
        in the first one billion (109) rows of Pascal's triangle.
        */
        btNode pascalTree = new btNode(1);
        int result = BinarySearchTree.nodeNotDivBySev(pascalTree);
        System.out.println("\n\nNumber of entries which are not divisble by 7: " + result);
    }
}
