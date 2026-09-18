import java.util.Scanner;
public class MaximumNumberofWordsFoundinSentences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
            };
        
        int max = 0;

        for(int i = 0; i < sentences.length; i++){
            String[] words = sentences[i].split(" ");
            int count = words.length;

            if(count > max){
                max = count;
            }        
        }
        System.out.println("Maximum numbers of words: " + max);
    }
}