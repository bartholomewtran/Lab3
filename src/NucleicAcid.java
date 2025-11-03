/*
Bartholomew Tran
F25 CIS D035A 11Y, 62Z Java Programming
Assignment 3
Due Date: November 2, 2025
Date Submitted: November 2, 2025
 */

public class NucleicAcid {

    // Create variable base, molarMass and density
    private char base;
    private double molarMass;
    private double density;

    // Default constructor
    public NucleicAcid() {
    }

    // Overloaded constructor
    public NucleicAcid(char base) {
        this.base = base;
        switch (base) {

            case 'C':
                molarMass = 111.10;
                density = 1.55;
                break;

            case 'T':
                molarMass = 126.115;
                density = 1.223;
                break;

            case 'A':
                molarMass = 135.13;
                density = 1.6;
                break;

            case 'G':
                molarMass = 151.13;
                density = 2.200;
        }
    }

    // Getter and Setter
    public char getBase() {
        return base;
    }

    public void setBase(char base) {
        this.base = base;
    }

    public double getMolarMass() {
        return molarMass;
    }

    public void setMolarMass(double molarMass) {
        this.molarMass = molarMass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    // Print total Density of all nucleic acids
    public void totalDensity() {

        // Create variable for compute total
        double total = 0.0;

        // Compute total value in LtoRHelix array
    }

}
