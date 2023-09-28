package insertionsorttaba;

import java.util.*;

/**
 *
 * @author Paolo Jr. Costarelli - 20235305
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    public void insertionSort() {
        int iCount;
        int iPosition;
        int iComparisons = 0;
        ElementType keyElement;
        for (iCount = 1; iCount < size(); iCount++) {
            keyElement = get(iCount);
            iPosition = iCount;  
            
            // As we can we have given iCount the same value as iPosition, index 1.
            // In that case at index of our array we have the number 56, which corresponds to iPosition.
            // Which will then be compared to (iPosition - 1) which corresponds to the number 23.
            // This index will increase according to the number of iterations of the loop above. (line16)
            
            while (iPosition > 0 && ((Comparable) get(iPosition - 1)).compareTo(keyElement) < 0) {
                iComparisons ++;
                ElementType keyElementPositionMinusOne = get(iPosition - 1);
                System.out.println("Comparison between: " + keyElement + " and "+ keyElementPositionMinusOne);
                set(iPosition, keyElementPositionMinusOne);
                iPosition = iPosition - 1;
            }

            set(iPosition, keyElement); //insert the key element in the correct position
        }
        System.out.println("The number of comparisons are: " + iComparisons);
    }
}
