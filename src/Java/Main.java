import myLinkedList.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> myLinkedList = new DoubleLinkedList<>();
        myLinkedList.add("один",0);
        myLinkedList.add("два",1);
        myLinkedList.add("три",2);
        System.out.println("-------GET-------");
        System.out.println(myLinkedList.get(1));
        System.out.println("-------SIZE-------");
        System.out.println(myLinkedList.size());
        System.out.println("-----FOREACH------");
        myLinkedList.forEach(System.out::println);
        System.out.println("-------REMOVE-------");
        myLinkedList.remove(1);
        System.out.println(myLinkedList.size());
        System.out.println("-----FOREACH------");
        myLinkedList.forEach(System.out::println);
    }
}