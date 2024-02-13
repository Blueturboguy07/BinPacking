import java.io.*;
import java.util.*;

public class WorstFit {


    public static void main(String args[]) throws FileNotFoundException{

        Scanner input = new Scanner(new File("input100000.txt"));
        PriorityQueue<Disk.File> fileQueue = new PriorityQueue<Disk.File>();

        while (input.hasNext()) {
            fileQueue.offer(new Disk.File(Integer.parseInt(input.nextLine())));
        }

        Disk[] diskList = new Disk[fileQueue.size()];

        int currentDisk  = 0;

        for(Disk.File n: fileQueue){

            if(diskList[currentDisk].getRemainingSpace()>= n.getSize()){

                diskList[currentDisk].addFile(n);
            } else {
                currentDisk++;

                diskList[currentDisk].addFile(n);
            }
            
        }



        input.close();

    }
    



}
