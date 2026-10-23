class Solution {
    public int minAddToMakeValid(String s) {
        int open=0, close=0;
       // Stack<Character> stack = new Stack<>();
      for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(ch=='('){
            open++;
           // stack.push(ch);
        }else{
           // if(stack.isEmpty() || stack.peek()==')'){
           if(open<=0){
            close++;
               // stack.push(ch);
            }else{
               // stack.pop();
               open--;
            }
        }
      } 
      return (open+close);
     // return stack.size(); 
    }
}