import java.util.ArrayList;
import java.util.List;

public class Disk implements Comparable<Disk> {
    private static final int DISK_CAPACITY = 1024; // 1GB in MB
    private List<File> files;
    
    public Disk() {
        this.files = new ArrayList<>();
    }
    
    public int getRemainingSpace() {
        int usedSpace = 0;
        for (File file : files) {
            usedSpace += file.getSize();
        }
        return DISK_CAPACITY - usedSpace;
    }
    
    public void addFile(File file) {
        if (getRemainingSpace() >= file.getSize()) {
            files.add(file);
        } else {
            System.out.println("Not enough space to add file: " + file.getName());
        }
    }
    
    @Override
    public int compareTo(Disk otherDisk) {
        // Compare disks based on remaining space
        return Integer.compare(this.getRemainingSpace(), otherDisk.getRemainingSpace());
    }
     
    // Inner class representing a file
    public static class File {
        private String name;
        private int size; // in MB
        
        public File(String name, int size) {
            this.name = name;
            this.size = size;
        }
        
        public String getName() {
            return name;
        }
        
        public int getSize() {
            return size;
        }
    }
}
