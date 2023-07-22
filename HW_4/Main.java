package HW_4;

public class Main {
    public static void main(String[] args) {
        GBLinkedLists<Number> gbLinkedList = new GBLinkedList<>();
        gbLinkedList.addFirst(2);
        System.out.println(gbLinkedList);
        gbLinkedList.addFirst(5);
        System.out.println(gbLinkedList);
        gbLinkedList.addFirst(7);
        System.out.println(gbLinkedList);
        gbLinkedList.addLast(2);
        System.out.println(gbLinkedList);
        System.out.println(gbLinkedList.get(1));
        System.out.println(gbLinkedList.size());
    }
}
