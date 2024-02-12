public class Disk implements Comparable<Disk> {

    private int remainingStorageSpace;

    public Disk(){

        remainingStorageSpace = 1000000;

    }

    @Override
    public int compareTo(Disk o) {
        
        if (this.weight> other.getWeight()){
            return 1; 
        } 
        else if (this.weight< other.getWeight()){
            return -1;
        }
        return 0;
       
    }

}