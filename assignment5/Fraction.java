package edu.wvu.cs111.assignment5;

public class Fraction implements Comparable<Fraction> {
	// BODY of the class
	// The things declared here are called
	// CLASS members

	// Class data members-- SHARED BY ALL INSTANCES
	// These are STATIC -- data members
	final static int DEFAULTDENOMINATOR = 1;
	final static int DEFAULTNUMERATOR = 0;

	// Instance data members -- Each and every instance
	// has their own COPY..
	// THESE CAN ONLY BE CHANGED/ACCESSED BY INSTANCE METHODS

	private int numerator;
	private int denominator;

	// Constructors go next---CONSTRUCTORS BUILD OBJECTS AND
	// INITIALIZES -- DATA MEMBERS. Constructors are Special
	// the don't have return types.

	// THIS IS A NON-DEFAULT constructor.. It has arguments for
	// SOME or ALL of the instance data members.
	public Fraction(int theNumerator, int theDenominator) {
		/**
		 * Stores the value theNumerator as the Numerator of the fraction And
		 * stores the value theDenominator as the Denominator of the fraction
		 * /** Parameters: theNumerator: numerator of the new fraction,
		 * theDenominator: denominator of the new fraction.
		 **/
		/** Precondition: denominator != 0 **/
		/** Postconditions: None **/
		/** Exceptions: throws arithmetic exception if theDenominator = 0 **/

		this.numerator = theNumerator;
		this.setDenominator(theDenominator);
		this.reduce();
	}

	// The DEFAULT constructor has NO parameters..
	// IT sets the instance data members to their default value.

	public Fraction() {
		numerator = DEFAULTNUMERATOR;
		denominator = DEFAULTDENOMINATOR;
	}
	
	public Fraction(Fraction objectToCopy) {
		this(objectToCopy.numerator, objectToCopy.denominator);
	}

	public int getNumerator() {
		return this.numerator;
	}

	public void setNumerator(int newValue) {
		this.numerator = newValue;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setDenominator(int newValue) {
		if (newValue == 0)
			throw new FractionException("The denominator of a fraction cannot be zero.");
		if ( newValue < 0){
			this.numerator = -this.numerator;
			this.denominator = -newValue;
		} else{
			this.denominator = newValue;
		}
	}

	public String toString() {
		return String.format("%s/%s", this.numerator, this.denominator);
	}

	public int compareTo(Fraction otherFraction) {
		Double me = (double) this.numerator / (double) this.denominator;
		Double it = (double) otherFraction.numerator / otherFraction.denominator;
		return me.compareTo(it);
	}

	public Fraction reduce() {
		int divisor = gcd(this.numerator, this.denominator);
		this.numerator = this.numerator / divisor;
		this.denominator = this.denominator / divisor;
		return this;
	}

	public Fraction add(Fraction otherFraction) {
		int numerator = (this.numerator * otherFraction.denominator + this.denominator * otherFraction.numerator);
		int denominator = this.denominator * otherFraction.denominator;
		return new Fraction(numerator, denominator);
	}

	public static Fraction add(Fraction x, Fraction y) {
		return x.add(y);
	}

	public Fraction subtract(Fraction otherFraction) {
		Fraction negatedFraction = new Fraction(otherFraction);
		negatedFraction.setNumerator(-otherFraction.getNumerator());
		return this.add(negatedFraction);
	}

	public Fraction multiply(Fraction otherFraction) {
		int numerator = (this.numerator * otherFraction.numerator);
		int denominator = this.denominator * otherFraction.denominator;
		return new Fraction(numerator, denominator);
	}

	public Fraction divide(Fraction otherFraction) {
		return this.multiply(otherFraction.invert());
	}
	
	private Fraction invert(){
		return new Fraction(this.denominator, this.numerator);
	}

	private static int gcd(int a, int b) {
		int temp;

		while (b != 0) {
			temp = b;
			b = Math.floorMod(a, b);
			a = temp;
		}

		return a;
	}
}
