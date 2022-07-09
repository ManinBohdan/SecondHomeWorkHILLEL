public class Main {
    public static void main(String[] args) {
        var LinkedList = new CustomLinkedList<String>();
        LinkedList.addLast("Bohdan");
        LinkedList.addFirst("Liza");
        LinkedList.addLast("Mihael");

        
        System.out.println(LinkedList.get(0));
        System.out.println(LinkedList.get(1));
        System.out.println(LinkedList.get(2));
    }
}
