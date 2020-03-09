
public class LinearSearch {
	
public static int LinearSearch(int[] array, int key) {
	// for loop to iterate through the length of array
	for(int i=0;i<array.length;i++) {
		// checks if array element is the same to our search parameter "key"
		if(array[i]==key) {
			return i; // if key is found returns matched element	
	}
	}// if not found the default will return -1
	return -1;	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] NewArray = {1,5,2,7,20,3}; // creating a new array to test Linear Search function
		int Nkey = 7; // creating a new key to test search 
		System.out.println(Nkey+" is at index: "+ LinearSearch(NewArray,Nkey));
	}

}
// Test Values

//50 is at index: -1 good 
//50 is not in the array

//7 is at index: 3 good 
//3 is in the array

