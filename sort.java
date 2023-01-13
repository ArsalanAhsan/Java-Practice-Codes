public class sort {
    public static void main(String args[]) {
        int unsortedArray[] = { 2, 3, 1, 5, 6, 7 };
        int len = unsortedArray.length;
        // for (i = 0; i < len - 1; i++) {
        //     if (unsortedArray[i] > unsortedArray[i + 1]) {
        //         int tmp = unsortedArray[i];
        //         unsortedArray[i] = unsortedArray[i + 1];
        //         unsortedArray[i + 1] = tmp;
        //         i = -1;

        //     }

        // }
        for(int i = 0, j=i+1; i < len && j<len;)
    {       
        if(unsortedArray[i] > unsortedArray[j])
        {
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[j];
            unsortedArray[j] = temp;              
            i=0;
            j=i+1;
        } 
        else
        {
            i++;
            j++;
        }
    }
    for(int i=0;i)
        System.out.print(unsortedArray);
    }
}
