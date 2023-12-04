public class Main {
    public static void main(String[] args) {
        
        

        ConsCell a = null;
        ConsCell b = ConsCell.cons(2,a);
        ConsCell c = ConsCell.cons(1,b);
        int x = ConsCell.length(a) + ConsCell.length(b)+ConsCell.length(c);
        System.out.println("Length of list: " + x); // Output: 3




        
        IntList myList = new IntList(null);
        myList = myList.cons(10);
        myList = myList.cons(20);

        ConsCell start = myList.getStart();
        while (start != null) {
            System.out.println(start.getHead());
            start = start.getTail();
        }

        System.out.println("Length of the list: " + myList.length());




        
        /**
         * 
        SAMPLE MAIN:
        // Create instances of ConsCell
        ConsCell cell1 = new ConsCell(10, null);
        ConsCell cell2 = new ConsCell(20, null);
        ConsCell cell3 = new ConsCell(30, null);
        
        // Link the cells together to form a list
        cell1.setTail(cell2);
        cell2.setTail(cell3);
        
        // Accessing values
        System.out.println("Head of cell1: " + cell1.getHead()); // Output: 10
        System.out.println("Tail of cell1: " + cell1.getTail().getHead()); // Output: 20
        System.out.println("Length of list: " + ConsCell.length(cell1)); // Output: 3
        
        // Cons a new cell onto the list
        ConsCell newCell = ConsCell.cons(5, cell1);
        System.out.println("New head after cons: " + newCell.getHead()); // Output: 5
        System.out.println("Length after cons: " + ConsCell.length(newCell)); // Output: 4
    
         */
        
        
        
        
        
        
        
        
        
        
        
        }
}
