#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<string>
#include<iomanip>
using namespace std;

class User // You the Player
{
public:
	User(const char *);
	~User();
	virtual float bonus() = 0;
	virtual float total() const = 0 ;
	virtual void print() const;
	virtual void game() = 0;

private:
	char *fullname;
};

User::User(const char *f)
{
	fullname = new char [strlen(f) + 1];
	strcpy(fullname, f);
}

void User::print() const
{
	cout << fullname;
}

User::~User()
{
	delete[] fullname;
}

class Roulette: public User
{
public:
	Roulette(const char *, int = 0);
	virtual float bonus();
	virtual float total() const;
	virtual void print() const;
	void game();

private:
	int tries, number,random;
	double bet, wp;
	double wpool;  //wpool = winnings pool
	char gametype;
	char eo; //even/odd
};

Roulette::Roulette(const char *f, int t)
	: User(f)
{
	tries = t;
	number = 0;
	bet = 0;
	wp = 0;
	wpool = 0;
}

void Roulette::game()
{
	int i;
	for(i = 1; i <= tries; i++)
	{
		cout << "Roulette Game " << i << endl;
		cout << "How much would you like to bet? ";
		cin >> bet;
		cout << "Would you like to bet on a specific number (n) or on odd/even (o)/(e)? ";
		cin >> gametype;
		if(gametype == 'n') // selects to pick a number
		{
			cout << "What number would you like to bet on? ";
			cin >> number;
			if(number == 00)
				number = 37;

			random = rand()%38; // to pick a random number in a range, use the following formula:
								// num = random() % (high - low + 1) + low;
			cout << "The ball landed on " << random << endl;
			if(number != random) // lose
			{
				cout << "You lost $" << bet << endl;
				bet = 0;
				wpool += bet;
			}
			else // win
			{
				cout << "You won $" << 35*bet << endl;
				wpool += bet;
			}
		}
		if(gametype == 'o' || gametype == 'e') // selects even or odd
		{
			cout << "Would you like to bet on even (e) or odd (o)? ";
			cin >> eo; //even/odd

			random = rand()%38;
			cout << "The ball landed on " << random << endl;

			if(eo == 'e') // if player bets even
			{
				if(2*(random/2) == random) // even win
				{
					cout << "You won $" << bet << endl;
					wpool += bet;
				}
				else // even lose
				{
					cout << "You lost $" << bet << endl;
					bet = 0;
					wpool += bet;
				}
			}
			if(eo == 'o') // if player bets odd
			{
				if(2*(random/2) == random) // odd lose
				{
					cout << "You lost $" << bet << endl;
					bet = 0;
					wpool += bet;
				}
				else // odd win
				{
					cout << "You won $" << bet << endl;
					wpool += bet;
				}
			}
		}
		cout << endl;
	}
}

float Roulette::bonus() // bonus the casino gives you after a win
{
	if(wpool <= 0)
		wp = 0;
	if(wpool > 0 && wpool <= 10)
		wp = 1.2;
	if(wpool > 10 && wpool <= 100)
		wp = 1.6;
	if(wpool > 100 && wpool <= 500)
		wp = 2.1;
	if(wpool > 500)
		wp = 3.5;
	return wpool*wp / 100;
}

float Roulette::total() const
{
	float cbonus;
	cbonus = wpool*wp / 100;
	return wpool + cbonus;
}

void Roulette::print() const
{
	cout << endl << "Final Results for ";
	User::print();
	cout << " after " << tries << " games of Roulette:" << endl;
	cout << "You won a total of $" << wpool << endl;
	cout << "The casino will add a bonus of " << wp << "% to your winnings." << endl;
}

class CAL: public User //Chuck - A - Luck
{
public:
	CAL(const char *, int = 0);
	virtual float bonus();
	virtual float total() const;
	virtual void print() const;
	void game(); 

private:
	int tries;
	double bet, wp;
	double wpool;  //wpool = winnings pool
};

CAL::CAL(const char *f, int t)
	: User(f)
{
	tries = t;
	bet = 0;
	wp = 0;
	wpool = 0;
}

void CAL::game()
{
	int a, b, c, d, e; // computer generated random numbers
	int win = 0, number;

	for(int i = 1; i <= tries; i++)
	{
		cout << "Chuck-A-Luck " << i << endl;
		time_t t;
		srand((unsigned)time(&t));
		a = rand() %6 + 1;
		b = rand() %6 + 1;
		c = rand() %6 + 1;
		d = rand() %6 + 1;
		e = rand() %6 + 1;

		cout << "Enter how much you would like to bet ";
		cin >> bet;
		cout << "Pick one number to bet on from 1 to 6 ";
		cin >> number;

		cout << "The computer's 5 numbers are ";
		cout << a << ' ' << b << ' ' << c << ' ' << d << ' ' << e << endl;

		if (number == a)
			win++;
		if (number == b)
			win++;
		if (number == c)
			win++;
		if (number == d)
			win++;
		if (number == e)
			win++;

		if (win == 0)
		{
			cout << "You have no matching numbers, so you lost your bet." << endl;
			cout << "You lost $" << bet << endl;
			bet = 0;
			wpool += bet;
		}
		else
			if (win == 1)
			{
				cout << "You have 1 matching number, so you are even." << endl;
				bet;
				cout << "You won $" << bet << endl;
				wpool += bet;
			}
			else
				if (win == 2)
				{
					cout << "You have 2 matching numbers, so you win twice the amount of your bet." << endl;
					bet *= 2;
					cout << "You won $" << bet << endl;
					wpool += bet;
				}
				else
					if (win == 3)
					{
						cout << "You have 3 matching numbers, so you win three times the amount of your bet." << endl;
						bet *= 3;
						cout << "You won $" << bet << endl;
						wpool += bet;
					}
					else
						if (win == 4)
						{
							cout << "You have 4 matching numbers, so you win four times the amount of your bet." << endl;
							bet *= 4;
							cout << "You won $" << bet << endl;
							wpool += bet;
						}
						else
						{
							cout << "You have 5 matching numbers, so you win five times the amount of your bet." << endl;
							bet *= 5;
							cout << "You won $" << bet << endl;
							wpool += bet;
						}
			cout << endl;
			win = 0;
	}
}

float CAL::bonus() // bonus the casino gives you after a win
{
	if(wpool <= 0)
		wp = 0;
	if(wpool > 0 && wpool <= 10)
		wp = 1.2;
	if(wpool > 10 && wpool <= 100)
		wp = 1.6;
	if(wpool > 100 && wpool <= 500)
		wp = 2.1;
	if(wpool > 500)
		wp = 3.5;
	return wpool*wp / 100;
}

float CAL::total() const
{
	float cbonus;
	cbonus = wpool*wp / 100;
	return wpool + cbonus;
}

void CAL::print() const
{
	cout << endl << "Final Results for ";
	User::print();
	cout << " after " << tries << " games of Chuck-A-Luck:" << endl;
	cout << "You won a total of $" << wpool << endl;
	cout << "The casino will add a bonus of " << wp << "% to your winnings." << endl;
}

class P5: public User //Pick five
{
public:
	P5(const char *, int = 0);
	virtual float bonus();
	virtual float total() const;
	virtual void print() const;
	void game();

private:
	int tries, number;
	double bet, wp;
	double wpool;  //wpool = winnings pool
};

P5::P5(const char *f, int t)
	: User(f)
{
	tries = t;
	number = 0;
	bet = 0;
	wp = 0;
	wpool = 0;
}

void P5::game()
{
	for(int i = 1; i <= tries; i++)
	{
		int a, b, c, d, e;	// Computer generated numbers
		int num1, num2, num3, num4, num5;	// User input
		int win = 0;

		cout << "Pick five " << i << endl;
		cout << "Enter how much you would like to bet ";
		cin >> bet;
		cout << "Enter five numbers from 0 to 9 ";
		cin >> num1 >> num2 >> num3 >> num4 >> num5;

		time_t t;
		srand((unsigned)time(&t));
		a = rand() % 10+0;  // random from 0 to 9, 9-0+1=10
		b = rand() % 10+0;
		c = rand() % 10+0;
		d = rand() % 10+0;
		e = rand() % 10+0;

	cout << "Computer has chosen at random " << a << " " << b << " " << c << " " << d << " " << e << endl;

	if (num1 == a )
		win++;
	if (num2 == b)
		win++;
	if (num3 == c)
		win++;
	if (num4 == d)
		win++;
	if (num5 == e)
		win++;

	if (win == 0)
	{
		cout << "You have no matching numbers, so you lost your bet." << endl;
		cout << "You lost $" << bet << endl;
		bet = 0; wpool += bet;
	}
	else
		if (win == 1)
		{
			cout << "You have 1 matching number, so you lost your bet." << endl;
			cout << "You lost $" << bet << endl;
			bet = 0; wpool += bet;
		}
		else
			if (win == 2)
			{
				cout << "You have 2 matching numbers, so you evened out." << endl;
				cout << "You won $" << bet << endl;
				wpool += bet;
			}
			else
				if (win == 3)
				{
					cout << "You have 3 matching numbers, so you win twice the amount of your bet." << endl;
					bet *= 2;
					cout << "You won $" << bet << endl;
					wpool += bet;
				}
				else
					if (win == 4)
					{
						cout << "You have 4 matching numbers, so you win four times the amount of your bet." << endl;
						bet *= 4;
						cout << "You won $" << bet << endl;
						wpool += bet;
					}
					else
					{
						cout << "You have 5 matching numbers, so you win 10 times the amount of your bet." << endl;
						bet *= 10;
						cout << "You won $" << bet << endl;
						wpool += bet;
					}
	}
}

float P5::bonus() // bonus the casino gives you after a win
{
	if(wpool <= 0)
		wp = 0;
	if(wpool > 0 && wpool <= 10)
		wp = 1.2;
	if(wpool > 10 && wpool <= 100)
		wp = 1.6;
	if(wpool > 100 && wpool <= 500)
		wp = 2.1;
	if(wpool > 500)
		wp = 3.5;
	return wpool*wp / 100;
}

float P5::total() const
{
	float cbonus;
	cbonus = wpool*wp / 100;
	return wpool + cbonus;
}

void P5::print() const
{
	cout << endl << "Final Results for ";
	User::print();
	cout << " after " << tries << " games of Pick 5:" << endl;
	cout << "You won a total of $" << wpool << endl;
	cout << "The casino will add a bonus of " << wp << "% to your winnings." << endl;
}

class RPS: public User //Rock - Paper - Scissors
{
public:
	RPS(const char *, int = 0);
	virtual float bonus();
	virtual float total() const;
	virtual void print() const;
	void game(); void regame();

private:
	int tries;
	double bet, wp;
	double wpool;  //wpool = winnings pool
};

RPS::RPS(const char *f, int t)
	: User(f)
{
	tries = t;
	bet = 0;
	wp = 0;
	wpool = 0;
}

void RPS::game()
{
	char a;
	char choice;
	int b;
	for(int i = 1; i <= tries; i++)
	{
		cout << "Rock-Paper-Scissors " << i << endl;
		time_t t;
		srand((unsigned)time(&t));
		b = rand() %3 + 1;
	
		if(b == 1)
			a = 'r';
		else
			if(b == 2)
				a = 'p';
			else
				if(b == 3)
					a = 's';

		cout << "Enter how much you would like to bet ";
		cin >> bet;
		cout << "Would you like to choose rock (r), paper (p), or scissors (s)?";
		cin >> choice;

		if(choice == 'r')
		{
			cout << "You chose rock." << endl;
			if(a == 'r')
			{
				cout << "The computer chose rock. Match is a draw. Try again." << endl;
				regame();
			}
			else
				if(a == 'p')
				{
					cout << "The computer chose paper. You lose $" << bet << endl;
					bet = 0; wpool += bet;
				}
				else
					if(a == 's')
					{
						cout << "The computer chose scissors. Congratulations! You won $" << bet << endl;
						wpool += bet;
					}
		}

		if(choice == 'p')
		{
			cout << "You chose paper." << endl;
			if(a == 'r')
			{
				cout << "The computer chose rock. Congratulations! You won $" << bet << endl;
				wpool += bet;
			}
			else
				if(a == 'p')
				{
					cout << "The computer chose paper. Match is a draw. Try again." << endl;
					regame();
				}
				else
					if(a == 's')
					{
						cout << "The computer chose scissors. You lose $" << bet << endl;
						bet = 0; wpool += bet;
					}
		}

		if(choice == 's')
		{
			cout << "You chose scissors." << endl;
			if(a == 'r')
			{
				cout << "The computer chose rock. You lose $" << bet << endl;
				bet = 0; wpool += bet;
			}
			else
				if(a == 'p')
				{
					cout << "The computer chose paper. Congratulations! You won $" << bet << endl;
					wpool += bet;
				}
				else
					if(a == 's')
					{
						cout << "The computer chose scissors. Match is a draw. Try again." << endl;
						regame();
					}
		}
		cout << endl;
	}
}

void RPS::regame()
{
	char a, choice;
	int b;

	time_t t;
	srand((unsigned)time(&t));
	b = rand() %3 + 1;
	
	if(b == 1)
		a = 'r';
	else
		if(b == 2)
			a = 'p';
		else
			if(b == 3)
				a = 's';

	cout << "Would you like to choose rock (r), paper (p), or scissors (s)?";
	cin >> choice;

	if(choice == 'r')
	{
		cout << "You chose rock." << endl;
		if(a == 'r')
		{
			cout << "The computer chose rock. Match is a draw. Try again." << endl;
			regame();
		}
		else
			if(a == 'p')
			{
				cout << "The computer chose paper. You lose $" << bet << endl;
				bet = 0; wpool += bet;
			}
			else
				if(a == 's')
				{
					cout << "The computer chose scissors. Congratulations! You won $" << bet << endl;
					wpool += bet;
				}
	}

	if(choice == 'p')
	{
		cout << "You chose paper." << endl;
		if(a == 'r')
		{
			cout << "The computer chose rock. Congratulations! You won $" << bet << endl;
			wpool += bet;
		}
		else
			if(a == 'p')
			{
				cout << "The computer chose paper. Match is a draw. Try again." << endl;
				regame();
			}
			else
				if(a == 's')
				{
					cout << "The computer chose scissors. You lose $" << bet << endl;
					bet = 0; wpool += bet;
				}
	}

	if(choice == 's')
	{
		cout << "You chose scissors." << endl;
		if(a == 'r')
		{
			cout << "The computer chose rock. You lose $" << bet << endl;
			bet = 0; wpool += bet;
		}
		else
			if(a == 'p')
			{
				cout << "The computer chose paper. Congratulations! You won $" << bet << endl;
				wpool += bet;
			}
			else
				if(a == 's')
				{
					cout << "The computer chose scissors. Match is a draw. Try again." << endl;
					regame();
				}
	}
}

float RPS::bonus() // bonus the casino gives you after a win
{
	if(wpool <= 0)
		wp = 0;
	if(wpool > 0 && wpool <= 10)
		wp = 1.2;
	if(wpool > 10 && wpool <= 100)
		wp = 1.6;
	if(wpool > 100 && wpool <= 500)
		wp = 2.1;
	if(wpool > 500)
		wp = 3.5;
	return wpool*wp / 100;
}

float RPS::total() const
{
	float cbonus;
	cbonus = wpool*wp / 100;
	return wpool + cbonus;
}

void RPS::print() const
{
	cout << endl << "Final Results for ";
	User::print();
	cout << " after " << tries << " games of Rock-Paper-Scissors:" << endl;
	cout << "You won a total of $" << wpool << endl;
	cout << "The casino will add a bonus of " << wp << "% to your winnings." << endl;
}

int main()
{
	char fullname[60];
	int tries;

	cout << fixed << showpoint << setprecision(2);
	srand((unsigned)time(NULL)); 

	cout << "What is your username? ";
	cin.getline(fullname,60);
	cout << endl;


	// Roulette
	cout << "Rules for Roulette: " << endl << endl;
	cout << "- You have a wheel ranging from 1 to 35." << endl;
	cout << "- You may decide whether to bet on a specific number or on even or odd." << endl;
	cout << "- If you choose a specific number and you win, you win 35 times your bet amount.";
	cout << "- If you choose to bet on odd or even and you win, you win your bet amount." << endl;
	cout << "- Otherwise, in either case you lose your bet amount." << endl;
	cout << "    * Note: Please use lowercase letters n, o, or e for your choices. All other choices are void." << endl << endl;

	cout << "How many times would you like to play Roulette? ";
	cin >> tries;
	cout << endl;
	
	User* ptr;
	ptr = new Roulette(fullname, tries);
	ptr->game();
	ptr->bonus();
	ptr->print();
	cout << "The casino bonus is $" << ptr->bonus() << endl;
	cout << "Your total winnings are $" << ptr->total() << endl << endl << endl;


	// Chuck-A-Luck
	cout << "Rules for Chuck-A-Luck:" << endl << endl;
	cout << "- You pick a number from 1 to 6." << endl;
	cout << "- The computer rolls 5 dice." << endl;
	cout << "- If none of the numbers match, you lose your bet." << endl;
	cout << "- Otherwise, you win the number of times your number shows up." << endl;
	cout << "    * Note: picking a number not from 1 to 6 makes you lose your bet!" << endl << endl;

	cout << "How many times would you like to play Chuck-A-Luck? ";
	cin >> tries;
	cout << endl;

	ptr = new CAL(fullname, tries);
	ptr->game();
	ptr->bonus();
	ptr->print();
	cout << "The casino bonus is $" << ptr->bonus() << endl;
	cout << "Your total winnings are $" << ptr->total() << endl << endl << endl;


	// Pick Five(5)
	cout << "Rules for Pick Five(5):" << endl << endl;
	cout << "- You pick 5 numbers from 0 to 9." << endl;
	cout << "- The computer picks 5 numbers from 0 to 9 aswell." << endl;
	cout << "- If you get less than 2 matching numbers, you lose your bet." << endl;
	cout << "- If you get 2 matching numbers, you win your bet amount." << endl;
	cout << "- If you get 3 matching numbers, you win double your bet amount." << endl;
	cout << "- If you get 4 matching numbers, you win four times your bet amount." << endl;
	cout << "- If you get 5 matching numbers, you win ten times your bet amount." << endl;
	cout << "    * Note: picking a number not from 0 to 9 makes you lose your bet!" << endl << endl;

	cout << "How many times would you like to play Pick 5? ";
	cin >> tries;
	cout << endl;

	ptr = new P5(fullname, tries);
	ptr->game();
	ptr->bonus();
	ptr->print();
	cout << "The casino bonus is $" << ptr->bonus() << endl;
	cout << "Your total winnings are $" << ptr->total() << endl << endl << endl;


	// Rock-Paper-Scissors
	cout << "Rules for Rock-Paper-Scissors:" << endl << endl;
	cout << "- You choose whether to pick Rock, Paper, or Scissors." << endl;
	cout << "- Rock beats Scissors, Scissors beats Paper, and Paper beats Rock." << endl;
	cout << "- If you lose, you lose your bet amount." << endl;
	cout << "- If match is a draw, you get to try again until you either lose or win." << endl;
	cout << "- If you win, you win your bet amount." << endl;
	cout << "    * Note: Please use lowercase r, p, or s for your choices. All other choices are void." << endl << endl;

	cout << "How many times would you like to play Rock-Paper-Scissors? ";
	cin >> tries;
	cout << endl;

	ptr = new RPS(fullname, tries);
	ptr->game();
	ptr->bonus();
	ptr->print();
	cout << "The casino bonus is $" << ptr->bonus() << endl;
	cout << "Your total winnings are $" << ptr->total() << endl << endl << endl;

	system("PAUSE");

	return 0;
}