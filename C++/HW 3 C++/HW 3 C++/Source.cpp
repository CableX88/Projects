/*
homework talk! create a class that works with functions

class Frac
{
	public:
			.
			.
			.
	private:     //only 3 data members are needed
			int num,den;    //numerator, denominator (no negative denominators!)	eg. num: 3    den: 8    deceq: .375
			double deceq;	//decimal equivilant
}



MAIN:

Frac a(4,8), b(-3,9), sum, diff, prod, quo;
a.print();			//the fraction has to come out reduced at print so a should be printed out as 1/2  .5	1/2
b.print();			//should print out as    -1/3	-.333	-1/3        so the reduced value, decimal, then mixed fraction
sum.add(a,b);
sum.print();	//put a message in there... as "The sum is"  1/6	.167	1/6
diff.subtract(a,b);	
diff.print();	//	"the difference is"  5/6	.833	5/6
prod.mult(a,b);	
prod.print();	// product is   -1/6	-.167	-1/6
quo.divide(a,b);	
quo.print();	//quotient is  -3/2		-1.5	-1 1/2
a.recip();    //reciprocal
b.recip();
a.print();	//reciprocals are 2/1	2	2
b.print();	// reciprocals are	-3/1	-3	-3



4/8	       -3/9
a is numerator
b is denominator
c is decimal equ.


addition fractions:
b  = a.den * b.den;
a = (a.num * b.den) + (b.num * a.den);

c = a/b;

subtraction fractions:
b  = a.den * b.den;
a = (a.num * b.den) - (b.num * a.den);

c = a/b;

muliplication fractions:
b = a.den * b.den;
a = a.num * b.num;

c = a/b;




eg we get input 8/20
to reduce we need to find the greatest common divisor  GCD  which in this case is 4
divide both values by that GCD
results to 2/5

 //find the mod
GCD(8,20) = GCD(4,8) = GCD(0,4) = 4
20%8 = 4
8%4 = 0   b mod a 
4 = a

or

GCD(a,b) where a<b
if a = 0     GCD = b
else
	GCD=GCD(b mod a, a)


for default arguments
-try setting num to 0 and den to 1... never den to 0
-no neg values for den  (have user change it or alter the number!)

constructor must call a method that reduces the fraction

method add two fractions, subtract 2 fractions, multiply 2 functions
- reduces the fraction 

in the print method
-mixed fractions  

if there is a negative.. keep it in the numerator!

no overloaded operators! for the next assignment













later!
sidenote: homework4
in the main:

sum = a+b;
diff = a-b;
prod = a*b;
quo = a/b;

cout<<"Enter a fraction";
cin>>a;
cout<<a;   //should automatically print out fraction, decimal, and mix
*/

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
	void calc();
	void print();
	void negative();
	void reduce(Fractions, Fractions);
	void add(Fractions, Fractions);
	void sub(Fractions, Fractions);
	void mult(Fractions,Fractions);
	void div(Fractions, Fractions);
	void flip();

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
	deceq = 0;
}

void Fractions::negative()
{
	if(den < 0)
	{
		den = -den;
		num = -num;
	}
}

void Fractions::calc()
{
	deceq = num / (double) den;
	/*
	int whole = 0;
	double rem = num;
	while(rem >= den)
	{
		rem -= den;
		whole++;
	}
	*/

	/* int whole = 0;
	if(deceq > 1)
	{
		num /= den;
	}
	else
		if(deceq < -1)
		{
			num /= den;
		}
		*/
}

int Fractions::GCD(int a , int b)
{
	if (a == 0)   
		return b;
	else
		return GCD (b % a, a);
}

void Fractions::reduce(Fractions a, Fractions b)
{
	int g;
	g = GCD(num, den);
	num = num / g;
	den = den / g;
}

void Fractions::print()
{
	double whole = 0, rem;
	reduce(num, den); negative();
	cout << num << '/' << den << endl;
	calc();
	rem = num / (double) den;

	whole = num / den;
	rem = num % den;

	cout << deceq << endl;
	if(rem != 0)
	{
		cout << whole << ' ' << rem << '/' << den << endl << endl;
	}
	else
	{
		cout << whole << endl;
	}
}


void Fractions::add(Fractions a, Fractions b) 
{
	den = a.den * b.den;
	a.num *= b.den;
	b.num *= a.den;
	a.den = den;
	b.den = den;
	
	num = a.num + b.num;
}


void Fractions::sub(Fractions a, Fractions b)
{
	den = a.den * b.den;
	a.num *= b.den;
	b.num *= a.den;
	a.den = den;
	b.den = den;

	num = a.num - b.num;
}


void Fractions::mult(Fractions a, Fractions b)
{
	num = a.num * b.num;
	den = a.den * b.den;
}


void Fractions::div(Fractions a, Fractions b)
{
	int c;
	c = b.num;
	b.num = b.den;
	b.den = c;

	num = a.num * b.num;
	den = a.den * b.den;
}

void Fractions::flip()
{
	int c;
	c = num;
	num = den;
	den = c;
}

int main()
{
	Fractions sum, diff, prod, quo;
	Fractions a(4, 8), b(-3, 9);
	a.print();			// 1/2  0.5  1/2
	b.print();			//-1/3  -.333  -1/3

		
	sum.add(a,b);
	cout << "The sum is ";
	sum.print();		// The sum is 1/6  .167  1/6

	diff.sub(a,b);
	cout << "The difference is ";
	diff.print();		// The difference is 5/6  .833  5/6

	prod.mult(a, b);
	cout << "The product is ";
	prod.print();		// The product is -1/6  -.167  -1/6

	quo.div(a, b);
	cout << "The quotient is ";
	quo.print();		// The quotient is -3/2  -1.5  -1 1/2

	a.flip();			// The reciprocals are: 1/2 --> 2/1  2  2
	b.flip();								// -1/3 --> -3/1 -3 -3
	cout << "The first reciprocal is ";
	a.print();
	cout << "The second reciprocal is ";
	b.print();

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