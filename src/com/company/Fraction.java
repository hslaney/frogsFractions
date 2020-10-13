package com.company;
public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    //TODO default constructor (no arguments)
    public Fraction(){
        numerator = 0;
        denominator = 1;

    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    // TODO  subtract()
    public Fraction subtract(Fraction other)
    {
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;

    }

    // TODO multiply()
    public Fraction multiply(Fraction other)
    {
        int n = this.numerator*other.numerator;
        int d = this.denominator*other.getDenom();

        Fraction result = new Fraction (n,d);
        return result;
    }

    // TODO toString()
    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }

    // TODO reciprocal()
    public Fraction reciprocal(){
        int n = denominator;
        int d  = numerator;
        Fraction result = new Fraction (n,d);
        return result;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);	// print the answer


		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		//Add code to multiply f1 and f2 here
        Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);


//		Add code to call reciprocal here
        System.out.println("The reciprocal of " + f5 + " is " + f5.reciprocal());

//		create 2 new fractions and add them here.
        Fraction f6 = new Fraction(1,10);
        Fraction f7 = new Fraction(1,5);

        Fraction f8 = f7.add(f6);
        System.out.println(f6 + " + " + f7 + " = " + f8);






    }

}
/*
output:

3/4 + 4/5 = 31/20
3/4 - 4/5 = -1/20
3/4 * 4/5 = 12/20
The reciprocal of 12/20 is 20/12
1/10 + 1/5 = 15/50

 */