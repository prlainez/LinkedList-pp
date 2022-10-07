// you may use this file to wrote and run code to test your MyArrayList class

public class Main {
   public static void main(String[] args) {
      MyLinkedList ml = new MyLinkedList();
      
      // Test append
      ml.append(100);
      ml.append(2000);
      ml.append(3000);
      ml.print();

      // Test inserAt
      ml.insertAt(1, 333);
      ml.append(4000);
      ml.print();

      ml.insertAt(3, 444);
      ml.print();
   }
}