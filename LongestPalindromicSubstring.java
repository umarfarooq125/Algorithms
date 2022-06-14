class Solution {
    public String longestPalindrome(String s) {
        
        String result = "";
        
        for(int i=0; i<s.length(); i++) {
            
            for(int j=i; j<s.length(); j++) {
                
                String subString = s.substring(i, j + 1);
                
                if(isPalindrome(s, i, j)){
                    
                    if(result.length() < subString.length()){
                        result = subString;
                    }
                }
            }   
        }
                
        return result;
    }
    
    public boolean isPalindrome(String s, int start, int end) {
        
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--; 
        }
        
        return true;
    }

}
