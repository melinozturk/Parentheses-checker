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


        if (parantheses.equals("(){}[]"));{
        System.out.println("valid");
        }

        if (parantheses.equals("(([]){})"));{
        System.out.println("valid");
        }

        if (parantheses.equals("([{({})}])")); {
        System.out.println("valid");
        }
        

        if (parantheses.equals("(]"));{
            System.out.println("invalid");
        }
        
        if (parantheses.equals("{}[())()(]"));{
        System.out.println("invalid");
        }

        if (parantheses.equals("(){}{"));{
        System.out.println("invalid");
        }
        
    }
}


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