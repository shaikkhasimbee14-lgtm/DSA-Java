class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            int[] freq=new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
           StringBuilder key=new StringBuilder();
           for(int count:freq){
                key.append(count).append('#');
           }
           map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}