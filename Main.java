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

      // Test getAt
      assert (int) ml.getAt(0) == 100;
      assert (int) ml.getAt(5) == 4000;

      // Test remove At
      ml.removeAt(0);
      ml.print();
      ml.removeAt(2);
      ml.print();
   }
}