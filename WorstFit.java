import java.io.*;
import java.util.*;

public class WorstFit {


    @SuppressWarnings("removal")
    public static void main(String args[]) throws FileNotFoundException{

        Scanner input = new Scanner(new File("input20.txt"));
        PriorityQueue<Integer> fileQueue = new PriorityQueue<Integer>();
        Double sumSize =0.0;
        while (input.hasNext()) {

            Integer num = Integer.parseInt(input.nextLine());
            sumSize+= new Double(num);
            fileQueue.offer(num);
        }
        System.out.println("Total size = "+sumSize/1000000+" GB");

        ArrayList<Disk> diskList = new ArrayList<Disk>();
        diskList.add(new Disk());

        int currentDisk  = 0;

        for(Integer n: fileQueue){

            if(diskList.get(currentDisk).getRemainingSpace()>= n) {
            
                diskList.get(currentDisk).addFile(n);

            } else {
                currentDisk++;
                diskList.add(new Disk());

                diskList.get(currentDisk).addFile(n);
            }
            
        }
        System.out.println("Disks req'd= "+ diskList.size());

        PriorityQueue<Disk> diskPriorityQueue = new PriorityQueue<>();

        for(Disk n: diskList){

            diskPriorityQueue.offer(n);
        }
        

        while(!diskPriorityQueue.isEmpty()){

            Disk curreDisk =diskPriorityQueue.poll();
            System.out.println(curreDisk.getRemainingSpace()+": ");
        }









        input.close();

    }
    



}
