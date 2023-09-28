package insertionsorttaba;

/**
 *
 * @author Paolo Jr. Costarelli - 20235305
 */
public class TabaArrayList {

    public static void main(String[] args) {
        MyArrayList<Integer> myList;
        myList = new MyArrayList<Integer>();
        
        myList.add(23);
        myList.add(56);
        myList.add(89);
        myList.add(87);
        myList.add(1);
        myList.add(95);
        myList.add(120);
        myList.add(25);
        myList.add(32);
        myList.add(86);
        myList.add(98);
        myList.add(212);
        myList.add(185);
        
        MyArrayList<Integer> myList2;
        myList2 = new MyArrayList<Integer>();
        
        myList2.add(23);
        myList2.add(56);
        myList2.add(89);
        myList2.add(87);
        myList2.add(1);
        myList2.add(95);
        myList2.add(120);
        myList2.add(25);
        myList2.add(32);
        myList2.add(86);
        myList2.add(98);
        myList2.add(212);
        myList2.add(185);
        myList2.add(256);
        myList2.add(8);
        myList2.add(88);
        myList2.add(123);
        myList2.add(246);
        myList2.add(95);
        
        
        MyArrayList<Integer> myList3;
        myList3 = new MyArrayList<Integer>();
        
        myList3.add(23);
        myList3.add(56);
        myList3.add(89);
        myList3.add(87);
        myList3.add(1);
        myList3.add(95);
        myList3.add(120);
        myList3.add(25);
        myList3.add(32);
        myList3.add(86);
        myList3.add(98);
        myList3.add(212);
        myList3.add(185);
        myList3.add(25);
        myList3.add(12);
        myList3.add(65);
        myList3.add(265);
        myList3.add(8);
        myList3.add(88);
        myList3.add(123);
        myList3.add(246);
        myList3.add(200);
        myList3.add(86);
        myList3.add(186);
        myList3.add(187);
        myList3.add(183);
        
        
        
               
        

        System.out.println("The elements before sorting: " + myList.toString());
        myList.insertionSort();
        System.out.println("The elements after Insertion sort: " + myList.toString());
        System.out.println("********************************************************");
        
        System.out.println("The elements before sorting: " + myList2.toString());
        myList2.insertionSort();
        System.out.println("The elements after Insertion sort: " + myList2.toString());
        System.out.println("********************************************************");
        
        
        System.out.println("The elements before sorting: " + myList3.toString());
        myList3.insertionSort();
        System.out.println("The elements after Insertion sort: " + myList3.toString());
        System.out.println("********************************************************");
        
    }
}
