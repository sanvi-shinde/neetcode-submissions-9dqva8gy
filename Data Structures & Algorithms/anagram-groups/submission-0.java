class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>anagrams = new HashMap<>();
        for(String s : strs){
            int[]count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int cnt : count){
                sb.append('#');
                sb.append(cnt);
            }
            String key = String.valueOf(sb);
            anagrams.putIfAbsent(key , new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
