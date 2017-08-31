/*
Program 4: overlds 1-3 to check

overload: >>  <<  +  -  *  /  ==  !=

Main:
	Fraction a, b, sum, diff, prod, quo;

	cout << "Enter the Numerator and Denominator of the First Fraction ";
	cin >> a;
	cout << "Enter the Numerator and Denominator of the Second Fraction ";
	cin >> b;

	cout << "The first fraction is " << a << endl;
	cout << "The second fractions is " << b << endl << endl;

	sum = a + b;
0	diff = a - b;
	prod = a * b;
	quo = a / b;

	cout << "The sum is " << sum << endl;
	cout << "The difference is " << diff << endl;
	cout << "The product is " << prod << endl;
	cout << "The quotient is " << quo << endl << endl;

	cout << "Testing == " << endl;
	if (a == b)
		cout << "Equal" << endl << endl;
	else
		cout << "Not Equal" << endl<< endl;

	cout << "Testing != " << endl;
	if (a != b)
		cout << "Not Equal" << endl << endl;
	else
		cout << "Equal" << endl << endl;

	cout << "Preincrement: " << ++a << endl;
	cout << "Postincrement: " << a++ << endl;
	cout << "After the Postincrement: " << a << endl;

	system("PAUSE");
	return 0;
*/

#include<iostream>
using namespace std;

//* Do not need a destructor
// num = numerator, den = denominator, deceq = decimal equivalent

class Fractions{
	friend ostream &operator << ( ostream&, Fractions&);
	friend istream &operator >> ( istream&, Fractions&);
	friend Fractions operator+ (Fractions &a, Fractions &b);
	friend Fractions operator- (Fractions &a, Fractions &b);
	friend Fractions operator* (Fractions &a, Fractions &b);
	friend Fractions operator/ (Fractions &a, Fractions &b);
	
public:
	Fractions(int = 0, int = 1);
	int GCD(int, int);
	void calc();
	void print();
	void negative();
	void reduce(Fractions, Fractions);
	bool operator == (const Fractions &rhs) const
	{
		return num == rhs.num, den == rhs.den, deceq == rhs.deceq;
	}
	bool operator != (const Fractions &rhs) const
	{
		return num != rhs.num, den != rhs.den, deceq != rhs.deceq;
	}
	Fractions &operator++();		 // preincrement
	Fractions operator++(int);     // postincrement

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

	int g;  //to reduce
	g = GCD(num, den);
	num = num / g;
	den = den / g;
}

ostream &operator << (ostream &output, Fractions &one)
{
	one.reduce(one.num, one.den); one.negative();
	output << one.num << '/' << one.den << endl;
	one.deceq = one.num / (double) one.den;
	output << one.deceq << endl;
	one.calc();
	return output;
}

istream &operator >> (istream &input, Fractions &one)
{
	input >> one.num >> one.den;
	return input;
}
/*
Fractions::Fractions(int a, int b)
{
	num = a;
	if (b == 0)
		den = 1;
	else
		den = b;
	deceq = 0;

	int g;  //to reduce
	//g = GCD(num, den);

	if (a == 0)   
		g = b;
	else
		g = (b % a, a);

	num = a / g;
	den = b / g;
}
*/
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
	double whole, rem;
	whole = num / den;
	rem = num % den;

	if(whole == 0)
	{
		cout << num << '/' << den << endl << endl;
	}
	else
		if(rem < 0)
		{
			rem = -rem;
			cout << whole << ' ' << rem << '/' << den << endl << endl;
		}
		else
			if(rem != 0)
			{
				cout << whole << ' ' << rem << '/' << den << endl << endl;
			}
		else
		{
			cout << whole << endl << endl;
		}

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
/*
void Fractions::print()
{
	double whole = 0, rem;
	reduce(num, den); negative();
	cout << num << '/' << den << endl;
	calc();
	rem = num / (double) den;
	while(rem > 1 || rem < -1)
	{
	if(rem >= 1)
	{
		whole ++;
		//if(whole > 0)
		//	num = -num;
		num -= den;
		rem = num;
	}
	else
		if(rem <= -1)
		{
			whole --;
			if(whole < 0)
				num = -num;
			num -= den;
			num = -num;
			rem = num;
		}
	}
	cout << deceq << endl;
	cout << whole << ' ' << num << '/' << den << endl << endl;
}
*/
Fractions operator+(Fractions &a, Fractions &b)
{
	Fractions r; 
	r.num = (a.num * b.den) + (b.num * a.den); 
	r.den = a.den * b.den; 
	return r;
}

Fractions operator-(Fractions &a, Fractions &b)
{
	Fractions r; 
	r.num = (a.num * b.den) - (b.num * a.den); 
	r.den = a.den * b.den; 
	return r;
}

Fractions operator*(Fractions &a, Fractions &b)
{
	Fractions r; 
	r.num = a.num * b.num; 
	r.den = a.den * b.den; 
	return r;
}

Fractions operator/(Fractions &a, Fractions &b)
{
	int c;
	c = b.num;
	b.num = b.den;
	b.den = c;

	Fractions r; 
	r.num = a.num * b.num; 
	r.den = a.den * b.den; 
	return r;
}

/*
void Fractions::flip()
{
	int c;
	c = num;
	num = den;
	den = c;
}
*/

Fractions &Fractions::operator ++() 
{
	int c;
	c = num;
	num = den;
	den = c;
	return *this;
}

Fractions Fractions::operator ++(int)
{
	Fractions temp = *this;
	int c;
	c = num;
	num = den;
	den = c;
	return temp;
}


int main()
{
	
	Fractions a, b, sum, diff, prod, quo;

	cout << "Enter the Numerator and Denominator of the First Fraction ";
	cin >> a;
	cout << "Enter the Numerator and Denominator of the Second Fraction ";
	cin >> b;

	cout << endl << "The first fraction is " << a << endl;
	cout << "The second fractions is " << b << endl << endl;

	
	sum = a + b;
	diff = a - b;
	prod = a * b;
	quo = a / b;

	cout << "The sum is " << sum << endl;
	cout << "The difference is " << diff << endl;
	cout << "The product is " << prod << endl;
	cout << "The quotient is " << quo << endl;

	
	cout << "Testing == " << endl;
	if (a == b)
		cout << "Equal" << endl << endl;
	else
		cout << "Not Equal" << endl<< endl;

	cout << "Testing != " << endl;
	if (a != b)
		cout << "Not Equal" << endl << endl;
	else
		cout << "Equal" << endl << endl;
	

	cout << "Preincrement: " << ++a << endl;
	cout << "Postincrement: " << a++ << endl;
	cout << "After the Postincrement: " << a << endl;
	
	system("PAUSE");
	return 0;

	/*
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

	a.flip();			// The reciprocals are: 1/2 --> 2/1  2  2								// -1/3 --> -3/1 -3 -3
	cout << "The first reciprocal is ";
	a.print();

	b.flip();
	cout << "The second reciprocal is ";
	b.print();

	system("PAUSE");
	return 0;
	*/
}