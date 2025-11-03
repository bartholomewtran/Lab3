public class DNA {

    // Create variables LtoRHelix, RtoLHelix
    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;

    // Default constructor
    public DNA() {
    }

    // Overloaded constructor
    public DNA (String strand) {

        // Call LtoRHelixPopulate method with strand variable
        LtoRHelixPopulate(strand);

        // Call populateRtoLHelix method
        populateRtoLHelix();

    }

    // Parse each nucleic acid into LtoRHelix array
    protected void LtoRHelixPopulate(String strand) {

        // Create new NucleicAcid array as LtoRHelix as the same length
        LtoRHelix = new NucleicAcid[strand.length()];

        // Split the string
        for (int i = 0; i < strand.length(); i++) {

            // To take each character from the value
            char p = strand.charAt(i);

            // Store each character into LtoRHelix array
            LtoRHelix[i] = new NucleicAcid(p);

        }

    }

    // Parse each nucleic acid after find out the pair into RtoLHelix array
    protected void populateRtoLHelix() {

        // Create new NucleicAcid array as RtoLHelix as the same length
        RtoLHelix = new NucleicAcid[LtoRHelix.length];

        // Split the string
        for (int i = 0; i < LtoRHelix.length; i++) {

            // Identify letter by getting base from LtoRHelix array
            // Call getComplement method to finding the pair
            // Parse the base after find out into RtoLHelix array
            RtoLHelix[i] = new NucleicAcid(getComplement(LtoRHelix[i].getBase()));

        }

    }

    // Finding the pair, practicing using switch
    protected char getComplement(char base) {

        // Finding the pair by using criteria below :
        // 'A' -> 'T'
        // 'G' -> 'C'
        // If not found any, then return '?'
        return switch (base) {

            case 'A' -> 'T';
            case 'C' -> 'G';
            case 'T' -> 'A';
            case 'G' -> 'C';
            default -> '?';

        };

    }

    // Output information
    public void print() {

        // Print out value of LtoRHelix
        System.out.println("Left to Right Helix");

        // Print out header format
        System.out.printf("%-5s %-10s %-15s %-15s", "Index", "Base", "MolarMass", "Density");

        // Print need value out with format
        for (int i = 0; i < LtoRHelix.length; i++) {

            // Using toString override method to parse symbol
            System.out.printf("\n%-5s %-10s %-15s %-15s", i, LtoRHelix[i].getBase(), LtoRHelix[i].getMolarMass(), LtoRHelix[i].getDensity());

        }

        // Print out value of RtoLHelix
        System.out.println("\n\nRight to Left Helix");

        // Print out header format
        System.out.printf("%-5s %-10s %-15s %-15s", "Index", "Base", "MolarMass", "Density");

        // Print need value out with format
        for (int i = 0; i < RtoLHelix.length; i++) {

            // Using toString override method to parse symbol
            System.out.printf("\n%-5s %-10s %-15s %-15s", i, RtoLHelix[i].getBase(), RtoLHelix[i].getMolarMass(), RtoLHelix[i].getDensity());

        }

    }

    // Print index and value of highest Molar Mass in both helix
    public void highestMolarMass() {

        // Define maxMolarMassValue for parse the biggest value
        double maxMolarMassValue = Double.MIN_VALUE;

        // Define index for get [i] value number
        int index = 0;

        // Define isLeft to see the biggest value is from LtoRHelix or RtoLHelix
        boolean isLeft = true;

        // Finding biggest molarMass value in 2 array LtoRHelix and RtoLHelix
        for (int i = 0; i < LtoRHelix.length; i++) {

            // Compare molarMass in LtoRHelix array with maxMolarMassValue
            if (LtoRHelix[i].getMolarMass() > maxMolarMassValue) {

                // Get molarMass value
                maxMolarMassValue = LtoRHelix[i].getMolarMass();

                // Get index value
                index = i;

                // Set isLeft value is TRUE because it from LtoRHelix
                isLeft = true;

            }

            // Compare molarMass in RtoLHelix array with maxMolarMassValue
            if (RtoLHelix[i].getMolarMass() > maxMolarMassValue) {

                // Get molarMass value
                maxMolarMassValue = RtoLHelix[i].getMolarMass();

                // Get index value
                index = i;

                // FALSE because it from RtoLHelix
                isLeft = false;
            }

        }

        // Define helix for change true and false value from isLeft into "LtoRHelix"(as a TRUE) and "RtoLHelix"(as a FALSE)
        String helix = isLeft ? "LtoRHelix" : "RtoLHelix";

        // Print value out
        System.out.printf("\n\nHighest MolarMass is: %.3f at index %d in %s", maxMolarMassValue, index, helix);

    }

    // Print total Density of all nucleic acids
    public void totalDensity() {

        // Create variable for compute total
        double total = Double.MIN_VALUE;

        // Compute total value in LtoRHelix array
        for (NucleicAcid ltoRHelix : LtoRHelix) {

            // Compute total by getting density value in LtoRHelix array and plus with total
            total += ltoRHelix.getDensity();

        }

        // Compute total value in RtoLHelix array
        for (NucleicAcid RtoLHelix : RtoLHelix) {

            // Compute total by getting density value in RtoLHelix array and plus with total
            total += RtoLHelix.getDensity();

        }

        // Print value out
        System.out.printf("\nTotal density of both strands: %.3f\n", total);

    }

}