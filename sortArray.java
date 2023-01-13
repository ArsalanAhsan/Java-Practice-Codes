public class sortArray {
    public static void main(String args[]) {
        int tmp=0;
        int i;
        int j;
        int unsortedArray[] = { 2, 3, 1, 5, 6, 7 };
        int len = unsortedArray.length;
        for (i = 0; i < len-1; i++) {
                if (unsortedArray[i] > unsortedArray[i+1]) {
                    tmp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = tmp;
                    i =-1;
    
                }

            }
            System.out.println(unsortedArray[i]);
        }
    }
