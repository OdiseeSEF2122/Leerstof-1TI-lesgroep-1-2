package inheritance.intlist;

import java.util.ArrayList;

public class Intlist {

    protected ArrayList<Integer> list = new ArrayList<>();

    public void add(Integer element) {
        list.add(element);
    }

    public Integer remove(int i) {
        if(list.size()<= i){
            return null;
        }
        return list.remove(i);
    }

    public Integer findMin() {
        if(list.isEmpty()){
            return null;
        }

        Integer min = Integer.MAX_VALUE;
        for(Integer element : list){
            if(element<min){
                min = element;
            }
        }

        return min;
    }
}
