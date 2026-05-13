class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){
      return false;
     }
    char[] sSort = s.toCharArray();
    char[] tsort = t.toCharArray();
    Arrays.sort(sSort);
    Arrays.sort(tsort);
    return Arrays.equals(sSort,tsort);

}

}
