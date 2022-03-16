package rnd.ds.array;


import java.util.Arrays;

public class RemoveDuplicatesExample {
        public static void main(String[] args) throws CloneNotSupportedException {
            // Array with duplicate elements
            Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1 };

            // This array has duplicate elements
            System.out.println(Arrays.toString(origArray));


            Integer[] tempArray = removeDuplicates(origArray);

            // Verify the array content
            System.out.println(Arrays.toString(tempArray));
        }

        private static Integer[] removeDuplicates(Integer[] origArray) {

            for (int i = 0; i< origArray.length - 1; i++) {
                for (int j = i + 1; j < origArray.length ; j++) {
                    if (origArray[i] == origArray[j]) {
                        origArray[j] = null;
                    }
                }
            }
            return origArray;
        }
    }
