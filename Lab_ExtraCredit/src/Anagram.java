import java.util.Arrays;
public class Anagram {
    private static LinkedList words = new LinkedList();
    private static void newLinkedList(String [] strArr){
        for(String word : strArr){
            Node newNode = new Node(word);
            words.append(newNode);
        }
    }
    public static void findAnagram(String [] strArr){

        for (int i = 0; i < strArr.length; i++) {
            if(sortString(strArr[0]).equals(sortString(strArr[i]))){
                Node newNodePre = new Node(strArr[i]);
                words.prepend(newNodePre);
            }
            else{
                Node newNodeApp = new Node(strArr[i]);
                words.append(newNodeApp);
            }
        }
        words.printList();
    }

    private static String sortString(String orgStr){
        char [] strChars = orgStr.toCharArray();
        Arrays.sort(strChars);
        String srtStr = String.valueOf(strChars);
        return srtStr;
    }
}
