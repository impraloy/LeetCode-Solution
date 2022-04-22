class Solution {
    public String sortSentence(String s) {
        String [] splitStr = s.split(" ");
        String [] temp = new String [splitStr.length];
        String res = "";
        
        for(int i = 0; i< splitStr.length; i++){
            int index = splitStr[i].charAt(splitStr[i].length()-1)-'0';
            temp[index - 1] = splitStr[i].substring(0, splitStr[i].length()-1);
        }
        
        for(int i = 0; i< temp.length; i++){
            res += temp[i];
            res += " ";
        }
        
        return res.trim();
    }
}