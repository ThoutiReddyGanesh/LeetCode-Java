class MyHashMap {
   int arr[]=new int[1000001];
   boolean flag[]=new boolean[1000001];

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
       arr[key]=value;
       flag[key]=true;
    }
    
    public int get(int key) {
     if(flag[key]==false) return -1;
     return arr[key];
        
    }
    
    public void remove(int key) {
        flag[key]=false;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */