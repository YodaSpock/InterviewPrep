package ModerateProblems;

public class WordFrequencies16_2 {

    public static double WordFrequencies(String[] book, String word){
        //number of words found
        word = word.toLowerCase();
        int targets = 0;
        for (int i = 0; i < book.length ; i++) {
            if(book[i].toLowerCase().equals(word)){
                targets++;
            }
        }
        double test = (double) targets/ (double) book.length;
        return test;
    }

    public static void main(String[] args) {
        String[] book = {"This", "is", "a", "book", "of", "my", "this", "favorite", "words", "this", "is", "fun"};
        System.out.println(WordFrequencies(book, "this"));
    }
}
