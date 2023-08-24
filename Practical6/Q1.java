public class Q1 {
  public static void main(String[] args) {
    //1. Linked List Example!
    LinkedList ll = new LinkedList();
    //2. Linked list data: 11 22 33 44
    ll.listIterator().add(11);
    ll.listIterator().next();
    ll.listIterator().add(22);
    ll.listIterator().next();
    ll.listIterator().add(33);
    ll.listIterator().next();
    ll.listIterator().add(44);
    //3. Add 55 to the beginning of the Linked List
    ll.addFirst(55);
    //4. Now the list contains: 55 11 22 33 44
    System.out.println(ll);
    //5. Add 66 to the end of the Linked List
    ll.listIterator().next();
    ll.listIterator().add(66);
    //6. Now the list contain: 55 11 22 33 44 66
    System.out.println(ll);
    //7. Add 99 at the 3rd location in the List
    //8. Now the list contain: 55 11 99 22 33 44 66
    //9. Display the first element on the list (55)
    //10. Display the final element on the list (66)
    //11. Display the element at the 4th position on the list (22)
    //12. Remove the element at the beginning of the list: 55
    //13. Now the list contains: 11 99 22 33 44 66
    //14. Remove the element at the end of the list: 66
    //15. Now the list contain: 11 99 22 33 44
    //16. Remove the element at the 2nd position on the list: 99
    //17. Now the list contain: 11 22 33 44 

  }
}