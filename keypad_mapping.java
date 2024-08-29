public class keypad_mapping {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  public static void printcom(String str, int idx,String combination){
    if(idx==str.length()){
        System.out.println(combination);
        return;
    }
    char currentChar=str.charAt(idx);
    String mapping=keypad[currentChar-'0'];

    for(int i=0; i<mapping.length();i++){
        printcom(str, idx+1, combination+mapping.charAt(i));
    }
  }
  public static void main(String args[]){
    String str="23";
    printcom(str, 0, "");
  }

    
}
