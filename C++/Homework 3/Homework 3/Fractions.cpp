#include<iostream>
using namespace std;

//* Do not need a destructor
// num = numerator, den = denominator, deceq = decimal equivalent

/*
	GCD(a, b) where a < b
	{
		if (a == 0)   
			GCD = b;
		else
			GCD = GCD (b mod a, a);
	}
*/

class Fractions{
public:
	Fractions(int = 0, int = 1);
	int GCD(int, int);
	//void get(double, double);
	void print();
	void reduce(Fractions);
	void likeT(Fractions,Fractions);
	void add(Fractions);
	void sub(int, int);
	void mult(Fractions,Fractions);
	void div(int, int);
private:
	int num, den;	// no negative denominators
	double deceq; // decimal equivelant 
};

Fractions::Fractions(int a, int b)
{
	num = a;
	if (b == 0)
		den = 1;
	else
		den = b;
	deceq = num / (double) den;
	int g;
	g = GCD(num, den);
	num = num / g;
	den = den / g;
}

int Fractions::GCD(int a , int b)
	
	{
		
		if (a == 0)   
		return b;
		else
		return GCD (b % a, a);
	}

void Fractions::reduce(Fractions a)
{
	int g;
	g = GCD(num, den);
	num = num / g;
	den = den / g;
}

void Fractions::likeT(Fractions a, Fractions b)
{
	int cden; //common denominator
	 cden = a.den * b.den;
	a.num= b.den * a.num;
	b.num= a.den * b.num;
	 a.den = cden;
	 b.den = cden;

}
void Fractions::print()
{
	cout << num << endl; //'  ' << den << '  ' << deceq << endl;
	cout << den << endl;
	cout << deceq << endl << endl;
}
/*
void Fractions::add(Fractions a) 
{
	likeT( a.den,b.den);
	num = a.num + b.num;
	reduce(a);
	
	
}
*/
/*
void Fractions::sub(int a, int b)
{
	int diff;
	diff = a-b;
	int g;
	g = GCD(num, den);
	num = num / g;
	den = den / g;

}
*/
void Fractions::mult(Fractions a,Fractions b)
{
	num = a * b;
	den = a * b;
	reduce(a,b);

}
/*
void Fractions::div(int a, int b)
{
	num = a.num * b.den;
	den = a.den * b.num;
	reduce();
	
}
*/
int main()
{
	Fractions prod;//
	Fractions a(4, 8), b(-3, 9); //, sum, diff, prod, quo;
	//cout << a.GCD(18, 30)<< endl;
	a.print();			// 1/2  0.5  1/2
	b.print();			//-1/3  -.333  -1/3

		
	//a.add(b);
	//sum.print();		// The sum is 1/6  .167  1/6

	//diff.subtract(a,b);
	//diff.print();		// The difference is 5/6  .833  5/6

	prod.mult(a, b);
	prod.print();		// The product is -1/6  -.167  -1/6
/*
	quo.divide(a, b);
	quo.print();		// The quotient is -3/2  -1.5  -1 1/2

	a.flip();			// The reciprocals are: 1/2 --> 2/1  2  2
	b.flip();								// -1/3 --> -3/1 -3 -3
	a.print();
	b.print();
*/
	system("PAUSE");
	return 0;
}

/*
	HWK 4:
	Main
		sum = a + b;
		diff = a - b;
		prod = a * b;
		quo = a / b;
	
	- can do
		cout << "Enter Fraction";
		cin >> a;
		cout << a;
*/