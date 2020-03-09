
public class MyInsertionSort 
{

	void Insertionsort(int array[])
    {
        for (int i=1; i<array.length; ++i)
        {
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j] > temp)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
        }
    }
 
    //prints out our newly sorted array
    static void print(int array[])
    {
        for (int i=0; i<array.length; ++i)
        System.out.print(array[i] + " ");
        System.out.println();
    }
	    
	public static void main(String[] args) 
	{
		int[] new_Array ={2,5,1,8,4};
		MyInsertionSort I_sort = new MyInsertionSort();
		I_sort.Insertionsort(new_Array);
		I_sort.print(new_Array);
		

	}
	//array after insertion sort
	//1 2 4 5 8 

}
