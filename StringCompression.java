import java.util.*;
import java.lang.StringBuilder;

class StringCompression {


    /* Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).
    Hints: #92, # 110


    TODO:
    - Get input from terminal - done
    - Make all lower case and then put into char array
    - Iterate through char array, count results and put them into a hashmap
    - Create a stringbuilder, iterate through hashmap and output the results of the hashmap into the stringbuilder.

    */



    public static String getInput(){
        Scanner reader = new Scanner(System.in);
        String result;
        result = reader.nextLine();
        return result;
    }

    public static void createHashMap(String s){
        java.util.HashMap<Character, Integer> mapOfChars = new java.util.HashMap<Character,Integer>();

        for (Character c: s.toLowerCase().toCharArray()){
            if (mapOfChars.get(c) == null){
                mapOfChars.put(c, 1);
            } else {
                mapOfChars.put(c, mapOfChars.get(c) + 1);
            }
        }

        printCharacters(mapOfChars);

    }

    public static void printCharacters(HashMap<Character,Integer> mapOfChars){
        StringBuilder mutableString = new StringBuilder();

        for (Map.Entry<Character, Integer> x: mapOfChars.entrySet()){
            mutableString.append(x.getKey() + x.getValue());
        }

        System.out.println(mutableString.toString());



    }



    public static void main(String args[]){
        String input = getInput();
        createHashMap(input);


    }

}