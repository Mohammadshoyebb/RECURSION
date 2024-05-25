public class TowerOfHanoi {
    
    // Recursive function to solve Tower of Hanoi problem
    public static void towerOfHan(int n, String src, String helper, String dest) {
        //********************BASE CASE***************************
        // If there is only one disk, move it from the source to the destination
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " From " + src + " To " + dest);
            return; // End the recursion here
        }

        //********************RECURSIVE CASE***************************
        // Step 1: Move the top n-1 disks from source to helper, using destination as auxiliary
        towerOfHan(n - 1, src, dest, helper);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Transfer Disk " + n + " From " + src + " To " + dest);

        // Step 3: Move the n-1 disks from helper to destination, using source as auxiliary
        towerOfHan(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int numberOfDisks = 4; // Number of disks
        // Calling the towerOfHan method with the initial parameters
        towerOfHan(numberOfDisks, "A", "B", "C"); // "A", "B", and "C" are the names of the pegs
    }
}
