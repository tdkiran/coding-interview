// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;


class StringDuplicateChar {
    public static void main(String[] args) {
        
        String input = "Kiran";
        String input2 = "Ashwini";

        
        System.out.println(input + " is Unique " + isUnique(input));
        System.out.println(input2 + " is Unique " + isUnique(input2));
    }
    
    static Boolean isUnique(String input) {
        
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
        
        Boolean output = true;
        
        for(var i = 0; i < input.length() ; i++) {
            
            if(dict.containsKey(input.charAt(i))) {
                output = false;
                break;
            } else {
                dict.put(input.charAt(i), 1);
            }
        }
        
        return output;
    }
    
}