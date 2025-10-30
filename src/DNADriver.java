public class DNADriver {

    public static void main() {

        // Create string array for strands data
        String[] strands = {
                "AGCCTAGGATCAG",
                "AGCCTAGGATCTAGGATCAG",
                "AGCCTATAGGATCAG",
                "AAAGCCTAGGATAGGATCAG",
                "AAAGCCTCTGAGGATAGGATCAG"
        };

        // For loop to get each strands
        for (String strand : strands) {

            // Define new DNA class
            DNA dna = new DNA(strand);

            // Print format out
            System.out.println("===== Strand: " + strand + " =====");

            // Get LtoRHelix and RtoLHelix after process by using method print() from DNA class
            dna.print();

            // Get the highest molarmass by using method highestMolarMass() from DNA class
            dna.highestMolarMass();

            // Get total density value by using method totalDensity() from DNA class
            dna.totalDensity();
            System.out.println("===========================================\n");

        }
    }
}