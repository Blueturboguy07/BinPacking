import java.io.*;
import java.util.*;
public class WorstFit {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input1000.txt"));
        PriorityQueue<Integer> fileQueue = new PriorityQueue<>(Collections.reverseOrder());

        double sumSize = 0.0;
        while (input.hasNext()) {
            int num = Integer.parseInt(input.nextLine());
            sumSize += num;
            fileQueue.offer(num);
        }
        System.out.println("Total size = " + sumSize / 1000000 + " GB");

        List<Disk> diskList = new ArrayList<>();
        diskList.add(new Disk());

        while (!fileQueue.isEmpty()) {
            int currentFile = fileQueue.poll();
            boolean filePlaced = false;

            for (Disk disk : diskList) {
                if (disk.getRemainingSpace() >= currentFile) {
                    disk.addFile(currentFile);
                    filePlaced = true;
                    break;
                }
            }

            if (!filePlaced) {
                Disk newDisk = new Disk();
                newDisk.addFile(currentFile);
                diskList.add(newDisk);
            }
        }

        System.out.println("Disks required: " + diskList.size());

        PriorityQueue<Disk> diskPriorityQueue = new PriorityQueue<>(diskList);

        while (!diskPriorityQueue.isEmpty()) {
            Disk currentDisk = diskPriorityQueue.poll();
            System.out.println(currentDisk.getRemainingSpace() + ": " + currentDisk);
        }

        input.close();
    }
}