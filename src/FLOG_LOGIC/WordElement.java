package FLOG_LOGIC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DINUKA
 * Used to calculate the word points.
 */
class WordElement extends FlogElement {
    /** Letter of the words. */    
    private String letters[];
    /** The word. */
    private String word;

    WordElement(String word){
       this.word = word;
       this.letters = word.split("");
    }
    
    public String getWord(){
        return word;
    }
    
    public int getWordLength(){
        return letters.length;
    }
    
    public String[] getLetters(){
        return letters;
    }
    
    public String getLetter(int index){
        return letters[index];
    }
}


