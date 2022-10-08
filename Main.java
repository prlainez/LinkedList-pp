// you may use this file to wrote and run code to test your MyArrayList class

public class Main {
   public static void main(String[] args) {
      MyLinkedList ml = new MyLinkedList();

      ml.append(11);
      ml.append(22);
      ml.append(33);
      ml.removeAt(1);
      System.out.println(ml.getAt(1));
   }
}