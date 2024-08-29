public class addingXatLast {
    public static void elementPusher(String s, int i, int count, String newString){
        if(i==s.length()-1){
            for(int j=0;j<count;j++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar=s.charAt(i);
        if(currentChar=='x'){
            count++;
            elementPusher(s, i+1, count+1, newString);
        }
        else{
            newString+=currentChar;
            elementPusher(s, i+1, count, newString);
        }
    }
    public static void main(String args[]){
        String s="axcvxxmdxc";
        elementPusher(s, 0, 0, " ");
    }
    
}
