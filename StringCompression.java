class StringCompression {


    /* Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).
    Hints: #92, # 110


    TODO:
    - Get input from terminal - done
    - Make all lower case and then put into char array
    - Iterate through char array, count results and put them into a hashmap
    - Create a stringbuilder, iterate through hashmap and output the results of the hashmap into the stringbuilder.

    */


    import java.util.Scanner;
    import java.lang.StringBuilder;

    public static String getInput(){
        Scanner reader = new Scanner(System.in);
        String result;
        result = reader.nextLine();
        return result;
    }




    public static void main(String args[]){

    }

}