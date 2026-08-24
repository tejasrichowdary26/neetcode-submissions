class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>anagrams=new HashMap<>();
        
        for(String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortedstr = new String(charArray);
            if(!anagrams.containsKey(sortedstr)){
                anagrams.put(sortedstr,new ArrayList<>());
                
            }
             anagrams.get(sortedstr).add(s);
        }
       return new ArrayList<>(anagrams.values());
    }
}
