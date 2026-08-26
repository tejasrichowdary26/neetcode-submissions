class Solution {

    public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
        for (String s : strs) {
        sb.append(s.length()).append('#').append(s);
        }
     return sb.toString();        

    }

    public List<String> decode(String str) {
     List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            
            // Find the delimiter
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Read length and shift past '#'
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            
            // Extract the word
            res.add(str.substring(i, i + length));
            
            // Move pointer to the start of the next item
            i += length;
        }
        
        return res;
    }
}
