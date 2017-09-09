#include <iostream>
#include <fstream>
using namespace std;

//function template to print an array
//works for multiple data types

template<class T>
void loadarray(T *a, const int n)  // input the data (GOOD)
{
	
	cout << "Input Your Data ";
	for (int i = 0; i < n; i++)
		cin >> a[i];
}

template <class T>
void printsmalls (T *a, const int n)  // print the smallest and 2nd smallest values without sorting (GOOD)
{
	T smallest = a[0];
	T secsmallest = a[1];

	for (int i = 0; i < n; i++)
	{		
		if(a[i] < smallest)
		{
			secsmallest = smallest;
			smallest = a[i];
		}

		if(a[i] < secsmallest && a[i] > smallest)
			secsmallest = a[i];
	}
	cout << "The smallest value is " << smallest << " and the second smallest value is " << secsmallest << endl;
}
		
template <class T>
void sortarray(T *a, const int n) // Sort arrays
{
	T t;
	for (int i = 0; i < n - 1; i++)
		for (int j = 0; j < n - 1; j++)
			if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
}

template <class T>
void printarray(T *a, const int n)  // prints the entered data "as is" (GOOD)
{
	for (int i = 0; i < n; i++)
		cout << a[i] << "  ";
	cout << endl;
}

template <class T>
void savearray(T *a, const int n, char *arrays) // saves to a text file (GOOD)
{
	ofstream outfile(arrays, ios::out);
	for (int i = 0; i < n; i++)
		outfile << a[i] << endl;
	outfile.close();
}

template <class T>
void retrievearray(T *a, const int n, char *arrays) // retrieves the text file (INCOMPLETE)
{
	ifstream infile(arrays, ios::in);
	for(int i = 0; i < n; i++)
		infile >> a[i];
		// infile.ignore(20, '\n');
	infile.close();
}


int main()
{
	const int n1 = 5, n2 = 7, n3 = 5;
	int a[n1];
	float b[n2];
	char c[n3];
	//int x[5] = {1,3,2,4,5};
	//float y[7] = {1.1 ,3.3 ,2.2 ,4.4 ,5.5 ,6.6 ,7.7};
	//char z[6] ={H ,E ,L ,L ,O};
	//int num;
	//float flo;
	//char ch;
	
	loadarray(a, n1); // works for ints
	loadarray(b, n2); // works for floats
	loadarray(c, n3); // works for chars
	cout << endl;
	
	printsmalls(a,n1);
	printsmalls(b,n2);
	printsmalls(c,n3);
	cout << endl;
		
	sortarray(a, n1);
	sortarray(b, n2);
	sortarray(c ,n3);

	cout <<"The Integer array (before saving)" << endl;
	printarray(a, n1);
	cout <<"The Float array (before saving)" << endl;
	printarray(b, n2);
	cout <<"The String array (before saving)" << endl;
	printarray(c, n3);


	savearray(a, n1, "e:\\ints.txt");
	savearray(b, n2, "e:\\floats.txt");
	savearray(c, n3, "e:\\chars.txt");

	retrievearray(a, n1, "e:\\ints.txt");
	retrievearray(b, n2, "e:\\floats.txt");
	retrievearray(c, n3, "e:\\chars.txt");
	cout << endl;

	cout <<"The Integer array (after saving)" << endl;
	printarray(a, n1);
	cout <<"The Float array (after saving)" << endl;
	printarray(b, n2);
	cout <<"The String array (after saving)" << endl;
	printarray(c, n3);

	system("PAUSE");
	return 0;
}



/*
the integer array
2  4  6  8  10
the float array
1.1  2.2  3.3  4.4  5.5  6.6  7.7
the string is
H  E  L  L  O
*/

