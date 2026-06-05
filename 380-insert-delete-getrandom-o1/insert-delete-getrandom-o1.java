class RandomizedSet {
    private HashSet<Integer> set;
    public RandomizedSet() {
       set=new HashSet<>(); 
    }
    
    public boolean insert(int val) {
        if(!(set.contains(val)))
        {
            set.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val))
        {
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int randomIndex=new Random().nextInt(set.size());
        Iterator<Integer> iterator=set.iterator();
        int currentIdx=0;
        while(iterator.hasNext())
        {
            Integer element =iterator.next();
            if(currentIdx==randomIndex)
            {
                return element;
            }
            currentIdx++;
        }
        return set.iterator().next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */