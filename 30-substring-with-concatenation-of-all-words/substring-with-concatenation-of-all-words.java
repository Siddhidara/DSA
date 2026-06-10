class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int size=words[0].length();
        int array_size=words.length;
        int total_size=array_size*size;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<String,Integer> wordmap=new HashMap<>();
        for(String word:words)
        {
            wordmap.put(word,wordmap.getOrDefault(word,0)+1);
        }
        
        int i=0;
        while(i<=s.length()-total_size)
        {
        HashMap<String,Integer> map=new HashMap<>();
        for(int j=1;j<=array_size;j++)
        {
            String newstr=s.substring(i+(j-1)*size,i+j*size);
            map.put(newstr,map.getOrDefault(newstr,0)+1);
        }
        if(map.equals(wordmap))
        {
            list.add(i);
        }
        i++;
        }
        return list;
    }
}