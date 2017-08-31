#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define SIZE 4



struct Employee
{
	char name[20]; 
	char department[20];
	float income;
	float newPayAmount;
	float raiseAmount;
	float raisePercentage;
	
}e;


void load(struct Employee s[], int n)
{
	for (int i=0;i<n;i++)
	{
		printf("\nEnter a name  ");
		gets(s[i].name);
		printf("\nenter department ");
		gets(s[i].department);
		printf("\nenter current yearly income ");
		scanf("%f", &s[i].income);
		fflush(stdin);
	}
}


void print(struct Employee s[], int n)
{
	printf("\n\n");
	for(int i=0;i<n;i++)
	{
	printf("%s    %s      ", s[i].name,s[i].department);
	printf("$%.2f    ", s[i].income);
	printf("%.1f%%\n", s[i].raisePercentage);
	printf("the raise amount is $%0.2f\n", s[i].raiseAmount);
	printf("the new pay amount is $%0.2f\n", s[i].newPayAmount);
	}
}
void printT( float totalOfYearIncome, float totalOfRaiseAmount, float totalOfNewPayAmount)
{
	printf("the total year income is $%0.2f\n",totalOfYearIncome);
	printf("the total raise amount is $%0.2f\n", totalOfRaiseAmount);
	printf("the total new pay amount is $%0.2f\n", totalOfNewPayAmount);	
	
}

void sort(struct Employee s[], int n)
// sort on average high to low (descending order)
{
	int i, j;
	Employee t;
	for(i=0;i<n-1;i++)
		for(j=0;j<n-1;j++)
			if(strcmp(s[j].name, s[j+1].name) > 0)
			{
				t=s[j];
				s[j] = s[j+1];
				s[j+1] = t;
			}
}

float findrp(float income)
{
	float raisePercentage;
	if (income <= 50000.00)
	{
		raisePercentage = 8.2;
	}
	else if( income >=50000.01 && income <= 60000.00)
	{ 
		raisePercentage = 7.8;
	}
	else if (income >= 60000.01 && income <= 66000.00)
	{ 
		raisePercentage = 7.2;
	}
	else if (income >= 66000.01 && income <= 75000.00)
	{
		raisePercentage = 6.7;
	}
	else // if it did not fit in the above four if/if else conditions it will fit the last condition 
	{
		raisePercentage = 6.2;
	}
	return raisePercentage;
}
void calcrp(struct Employee s[],float *totalOfYearIncome, float *totalOfRaiseAmount, float *totalOfNewPayAmount, int n)
{
	float avg1, avg2, avg3;
	int i;
	for(i=0;i<n;i++)
	{
		s[i].raisePercentage = findrp(s[i].income);
		s[i].raiseAmount = s[i].income * s[i].raisePercentage / 100;
		s[i].newPayAmount = s[i].income + s[i].raiseAmount;
		*totalOfYearIncome += s[i].income;
		*totalOfRaiseAmount += s[i].raiseAmount;
		*totalOfNewPayAmount += s[i].newPayAmount;
	}

	avg1 = *totalOfYearIncome / (float) n;
	avg2 = *totalOfRaiseAmount / (float) n;
	avg3 = *totalOfNewPayAmount / (float) n;
} 
void savetext(struct Employee s[], int n)
{
	int i;
	FILE *f;
	f = fopen("G:\\Final.txt", "w");
	for ( i = 0; i < n; i++)

	{
	fprintf(f, "%s\n", s[i].name);
	fprintf(f, "%s\n", s[i].department);
	fprintf(f, "%0.2f\n", s[i].income);
	fprintf(f, "%0.2f\n", s[i].raisePercentage);
	}
	fclose(f);
}
void retrievetext(struct Employee s[], int n)
{
	int i ;
	FILE *f;
	f = fopen("G:\\Final.txt", "r");
	for (i = 0; i < n; i++)
	{
	fprintf(f, "%s\n", s[i].name);
	fprintf(f, "%s\n", s[i].department);
	fprintf(f, "%0.2f\n", s[i].income);
	fprintf(f, "%0.2f\n", s[i].raisePercentage);
	}
	fclose(f);
}
		// the \n in the fscanf does the smae thing as fflush
void savebin(struct Employee s[], int n)
{
	FILE *f;
	f = fopen("G:\\Final.bin", "wb");
	fwrite(&s, sizeof(s[0]), n, f); // fwrite ( refrence to array,
									// size of each array element,
									// the number of array element,
									// file pointer)
	fclose(f);
}
void retrievebin(struct Employee s[], int n)
{
	FILE *f;
	f = fopen("G:\\Final.bin", "rb");
	fread(&s, sizeof(s[0]), n, f);								
	fclose(f);
}
void main() 
{
	float totalOfYearIncome = 0.0;
	float totalOfRaiseAmount = 0.0;
	float totalOfNewPayAmount = 0.0;
	Employee s[SIZE];
	load(s, SIZE);
	sort(s, SIZE);
	calcrp(s,&totalOfYearIncome,&totalOfRaiseAmount, &totalOfNewPayAmount,SIZE);
	print(s, SIZE);
	printT(totalOfYearIncome,totalOfRaiseAmount,totalOfNewPayAmount);
	savetext(s, SIZE);
	retrievetext(s, SIZE);
	printf("\nafter the text file is retrieved\n");
	print(s, SIZE);
	savebin(s, SIZE);
	retrievebin(s, SIZE);
	printf("\nafter the text file is retrieved\n");
	print(s, SIZE);

	system("PAUSE");
}

/*
Enter a name  James Carmelo

enter department Sales

enter current yearly income 85147.45

Enter a name  Bryan Dwight

enter department Design

enter current yearly income 91384.36

Enter a name  Anthony Pau

enter department Manufacturing

enter current yearly income 88335.56

Enter a name  Griffin Tim

enter department Management

enter current yearly income 55551.87


Anthony Pau    Manufacturing      $88335.56    6.2%
the raise amount is $5476.81
the new pay amount is $93812.37
Bryan Dwight    Design      $91384.36    6.2%
the raise amount is $5665.83
the new pay amount is $97050.19
Griffin Tim    Management      $55551.87    7.8%
the raise amount is $4333.05
the new pay amount is $59884.92
James Carmelo    Sales      $85147.45    6.2%
the raise amount is $5279.14
the new pay amount is $90426.59
the total year income is $320419.25
the total raise amount is $20754.82
the total new pay amount is $341174.06

after the text file is retrieved


Anthony Pau    Manufacturing      $88335.56    6.2%
the raise amount is $5476.81
the new pay amount is $93812.37
Bryan Dwight    Design      $91384.36    6.2%
the raise amount is $5665.83
the new pay amount is $97050.19
Griffin Tim    Management      $55551.87    7.8%
the raise amount is $4333.05
the new pay amount is $59884.92
James Carmelo    Sales      $85147.45    6.2%
the raise amount is $5279.14
the new pay amount is $90426.59

after the text file is retrieved


Anthony Pau    Manufacturing      $88335.56    6.2%
the raise amount is $5476.81
the new pay amount is $93812.37
Bryan Dwight    Design      $91384.36    6.2%
the raise amount is $5665.83
the new pay amount is $97050.19
Griffin Tim    Management      $55551.87    7.8%
the raise amount is $4333.05
the new pay amount is $59884.92
James Carmelo    Sales      $85147.45    6.2%
the raise amount is $5279.14
the new pay amount is $90426.59
Press any key to continue . . .
*/