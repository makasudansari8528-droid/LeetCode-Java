class Solution {
    public int minSwaps(String s) {
        int open=0, close=0;
       // Stack<Character> stack= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='['){
                open++;
                //stack.push(ch);
            }else{
              //  if(stack.isEmpty() || stack.peek()==']'){
              if(open<=0){
                close++;
                   // stack.push(ch);
                }else{
                   open--;
                   // stack.pop();
                }
            }
        }
        //int totalBrackets=stack.size();
       // int closedBrackets=totalBrackets/2;
      // return (closedBrackets+1)/2; 
       return (close+1)/2; 
    }
}