class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> val=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            val.put(ch,val.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch =t.charAt(i);
            if(!val.containsKey(ch)){
                return false;
            }
            val.put(ch,val.get(ch)-1);
            if(val.get(ch)==0){
                val.remove(ch);
            }
        }
        return val.isEmpty();
    }
}
