import java.util.ArrayList;
import java.util.List;

public class Disk implements Comparable<Disk> {
    private static final int DISK_CAPACITY = 1000000;
    private List<Integer> files;

    public Disk() {
        this.files = new ArrayList<>();
    }

    public int getRemainingSpace() {
        int usedSpace = 0;
        for (Integer file : files) {
            usedSpace += file;
        }
        return DISK_CAPACITY - usedSpace;
    }

    public void addFile(Integer file) {
        if (getRemainingSpace() >= file) {
            files.add(file);
        } else {
            System.out.println("Not enough space to add file.");
        }
    }

    @Override
    public int compareTo(Disk otherDisk) {
        return Integer.compare(this.getRemainingSpace(), otherDisk.getRemainingSpace());
    }

    private String toString(){

        for(Integer n: files){

            System.out.println(n);
        }

    }
}
