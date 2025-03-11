package it.poliba.sisinflab.programmazioneB.adt;


public class Main {
    public static void main(String[] args){
        String valid = "{4 + [5 - (3 * 6) + (6 + 7)] - (5 +2) * [4 * (9 +1)] } * [12 - 4]";
        String invalid = "{4 + [5 - (3 * [ 6) + (6 + 7] )]";

        System.out.println(matchDelimiters(valid));
        System.out.println(matchDelimiters(invalid));
    }

    public static  boolean matchDelimiters(String expression){
        LinkedStack<Character> buffer = new LinkedStack<Character>();
        char test;
        for( char c : expression.toCharArray())
            switch (c){
                case '(':
                case '[':
                case '{':
                    buffer.push(c);
                break;
                case ')':
                case ']':
                case '}':
                    test = buffer.pop();
                    if ( (c == ')' && test != '(') || (c == ']' && test != '[') || (c == '}' && test != '{') )
                        return false;
            }
        return true;
    }
}
