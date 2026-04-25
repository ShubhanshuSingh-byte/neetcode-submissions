class MinStack {
    List<Integer> stac;
    List<Integer> min;

    public MinStack() {
       stac = new Stack<>(); 
       min = new Stack<>();
    }
    
    public void push(int val) {
        stac.add(val);
        if(min.isEmpty() || min.get(min.size()-1)>=val)
        {
            min.add(val);
        }
    }
    
    public void pop() {
        int l = stac.remove(stac.size()-1);
        if(l==min.get(min.size()-1))
        {
            min.remove(min.size()-1);
        }
    }
    
    public int top() {
        return stac.get(stac.size()-1);
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}
