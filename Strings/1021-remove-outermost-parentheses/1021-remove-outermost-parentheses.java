class Solution {
    public String removeOuterParentheses(String s) {
       int depth=0;
       StringBuilder result=new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
         if(ch == '('){
            if(depth>0){
                result.append(ch);
            }
            depth++;
         }else{
               depth--;
               if(depth>0){
                  result.append(ch);
                }
            }
       }
       return result.toString();
    }
}
