#include<iostream>
#include<math.h>

using namespace std;

int main()
{
	float base, height;
	float area;

	cout<< "Enter base of Triangle : ";
	cin>>base;

	cout<< "Enter the height of Triangle :"; 
	cin>>height;

	area = 0.5 * (base * height);
	cout<<"Area of Triangle : "<<area<<endl;

	system("PAUSE");
}