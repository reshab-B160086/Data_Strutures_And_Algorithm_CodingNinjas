/*Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :*/


public class solution {

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
      if (disks == 1){
          String s = source + " " + destination;
          System.out.println(s);
          return;
      }
        else if (disks == 0){
            return;
        }
        
        towerOfHanoi(disks-1, source,destination,auxiliary);
        System.out.println(source +" " + destination);
        towerOfHanoi(disks-1, auxiliary,source,destination);
    }
}
