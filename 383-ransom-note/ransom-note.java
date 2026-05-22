class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
        {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> required=new HashMap<>();
        for(char i:magazine.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char j:ransomNote.toCharArray())
        {
            required.put(j,required.getOrDefault(j,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:required.entrySet())
        {
            if(map.getOrDefault(entry.getKey(),0)<entry.getValue())
            {
                return false;
            }
        }
        return true;
    }
}