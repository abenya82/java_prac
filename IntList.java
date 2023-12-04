public class IntList {
    private ConsCell start; // first in the list or null

    public IntList(ConsCell s){
        start = s;
    }

    public IntList cons(int h){
        return new IntList(new ConsCell(h, start));
    }

    public ConsCell getStart(){
        return start;
    }

    public int length(){
        int len = 0;
        ConsCell current = start;
        while (current != null){
            len++;
            current = current.getTail();
        }
        return len;
    }
    public void print(){
        System.out.print("[");
        ConsCell a = start;
        while (a != null) {
            System.out.print(a.getHead());
            a = a.getTail();
            if (a != null) System.out.print(",");

        }
        System.out.println("]");
    }



}
