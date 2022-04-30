/**
 * @author MARIIA
 * Implement method fourLetters which counts amount of fourLetter names from input string
 * example:
 * input: "Inili Dori Maordris"
 * output: 1
 */
public class Task1 {
    public static int fourLetters(String names) {
        String[] namesArray = names.split(" ");
        int counter = 0;
        for(String s: namesArray){
            if(s.length() == 4){
                counter++;
            }
        }
        return counter;
    }
}
