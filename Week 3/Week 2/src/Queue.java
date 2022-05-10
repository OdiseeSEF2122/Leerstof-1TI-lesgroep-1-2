import java.util.ArrayList;

public class Queue {

    private ArrayList<Integer> element = new ArrayList<>();
    private int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    public Queue() {
        this.maxSize = 5;
    }

    public void store(Integer element){
        if(this.element.size() == maxSize){
            return;
        }

        this.element.add(element);
    }

    public Integer release(){
        if(element.isEmpty()){
            return null;
        }
        Integer tmp = element.get(0);
        element.remove(0);
        return tmp;
    }

}
