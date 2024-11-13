import java.util.stack;
public class validParanthesis {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        char [][] pair= {{'(',')'},{'{','}'},{'[',']'}};

        for(char c: s.toCharArray()){
            if(c== '(' || c=='{' || c=='['){
                Stack.push(C);
            }
            else{
                if(Stack.isEmpty()){
                    return false;
                }
                char openingBracket= Stack.pop();
                boolean match= false;
                for(char[] pair:pairs){
                    if(c==pair[0] && openingBracket== pair[1]){
                        match= true;
                        break;
                    }
                }
            }
            if(!match){
                return false;
            }

        }


    }

    return Stack.isEmpty();

public static void main(String[] args){
    validParanthesis solution= new validParanthesis();

    System.out.println(solution.isValid("()"));
    System.out.println(solution.isValid("()[]{}"));
    System.out.println(solution.isValid("(]"));
}
}

