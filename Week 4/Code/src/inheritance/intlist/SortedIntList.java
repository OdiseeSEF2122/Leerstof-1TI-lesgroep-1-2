package inheritance.intlist;

public class SortedIntList extends Intlist{

    @Override
    public void add(Integer element){
        int index;
        // zoek naar de index van het element dat groter is
        for(index = 0; index < list.size(); index++){
            if(list.get(index) > element){
                break;
            }
        }

        list.add(index, element);
    }

    @Override
    public Integer findMin(){
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
