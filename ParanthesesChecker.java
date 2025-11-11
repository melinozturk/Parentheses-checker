// Melin Ozturk
// 11/7/2025
// This program will determine if the input string is valid based on criteria on strings. 

import java.util.*;

public class ParanthesesChecker {
//  Pre-condition: User can only input  '(', ')', '{', '}', '[' and ']'. 
//  Post-condition: Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order. Every close bracket has a corresponding open bracket of the same type.
    
/**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String parantheses;

        // Enter parantheses and press Enter
        System.out.println("Input parantheses");
        parantheses = scanner.nextLine();{

        System.out.println(); }
        
    }

    public static boolean isValid(String s){   //loop through the string
       String parantheses;
       for (int s = 0; s < parantheses.length(); s++) {
       char character = parantheses.charAt(s);
    System.out.println(character);

     
        // find the last opening symbol either { ( [

        

    }
}
}


// one other approach : find the last either opening parantheses ( { [  ////  "()" 0,1 lenght
//then look at the symbol directly to its right. 
//If they match, remove both and repeat. 
//If your string is empty it's valid. 


//System.out.println(isValid("(){}[]")); //true.
//System.out.println(isValid("(]")); //false.
//System.out.println(isValid("([{({})}])")); //true .
//System.out.println(isValid("(([]){})")); //true .
//System.out.println(isValid("{}[())()(]")); //false .
//System.out.println(isValid("(){}{")); //false  .
//---------------------------------
//Tricky!:
//System.out.println(isValid("([)]")); //false
//System.out.println(isValid("([{}([)])]")); //false