/**
 * A conscell is an element in a linked list of INTs
 */



//if class is public, the file needs to have the same name
public class ConsCell {
    private int head;   // first item in the list
    private ConsCell tail;  // rest of the list or null
    

    /**
     * Construct a new ConsCell given its head and tail
     * @param h the int contents of this cell
     * @param t the next ConsCell in the list or null
     */
    public ConsCell(int h, ConsCell t){
        head = h;
        tail = t;
    }
    

    /**
     * accessor for the head of this conscell
     * @return the int contents of this cell
     */
    public int getHead(){
        return head;
    }
    
    public ConsCell getTail(){
        return tail;
    }
    
    public void setTail(ConsCell t){
        tail = t;
    }
    
    /**
     * Get the length of a list of ConsCells
     * @param a the first ConsCell in the list of null
     * @return the int length
     */
    public static int length(ConsCell a){
        int len = 0;
        while (a != null){
            len++;
            a = a.getTail();
        }
        return len;
    }
    /**
     * Retun the result of consing an int onto a list of ConsCells
     * @param a the int to cons onto the list
     * @param b the fist ConsCell in the list or null
     * @return the first ConsCell in the new list
     */
    public static ConsCell cons(int a, ConsCell b){
        return new ConsCell(a,b);
    }
    
    public static void main(String[] args) {
        System.out.println("print line");
    }
}




