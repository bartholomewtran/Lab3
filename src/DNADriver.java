/*
Bartholomew Tran
F25 CIS D035A 11Y, 62Z Java Programming
Lab 3
Due Date: November 2, 2025
Date Submitted: November 2, 2025
 */

/*
    DESIGN

    Create a program where, given a DNA sequence, left-to-right helix and right-to-left helix are
    displayed along with their Molar Mass and Density. Program will also identify the highest molar mass.

    VARIABLES
        String[] array for DNA strand data

    PROCESSING
        Use strands inputted in the array. Then, in new DNA class, populate data.
        Get left-to-right and right-to-left after process
        Get the highest molar mass by using method highestMolarMass() from DNA class
        Get total density value by using method totalDensity() from DNA class

 */

public class DNADriver {

    public static void main(String[] args) {

        // Create string array for strands data
        String[] strands = {
                "AGAGAGAGTCTCTTTTA",
                "CTCTTTTAGAGAAAAGA",
                "AGGTTGTACCCAACCTA",
                "ACCTCTCTCAAATACTC",
                "AGGTTTCTCCCTCAACA"
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

/*
OUTPUT

===== Strand: AGAGAGAGTCTCTTTTA =====
Left to Right Helix
Index Base       MolarMass       Density
0     A          135.13          1.6
1     G          151.13          2.2
2     A          135.13          1.6
3     G          151.13          2.2
4     A          135.13          1.6
5     G          151.13          2.2
6     A          135.13          1.6
7     G          151.13          2.2
8     T          126.115         1.223
9     C          111.1           1.55
10    T          126.115         1.223
11    C          111.1           1.55
12    T          126.115         1.223
13    T          126.115         1.223
14    T          126.115         1.223
15    T          126.115         1.223
16    A          135.13          1.6

Right to Left Helix
Index Base       MolarMass       Density
0     T          126.115         1.223
1     C          111.1           1.55
2     T          126.115         1.223
3     C          111.1           1.55
4     T          126.115         1.223
5     C          111.1           1.55
6     T          126.115         1.223
7     C          111.1           1.55
8     A          135.13          1.6
9     G          151.13          2.2
10    A          135.13          1.6
11    G          151.13          2.2
12    A          135.13          1.6
13    A          135.13          1.6
14    A          135.13          1.6
15    A          135.13          1.6
16    T          126.115         1.223

Highest MolarMass is: 151.130 at index 1 in LtoRHelix
Total density of both strands: 53.553
===========================================

===== Strand: CTCTTTTAGAGAAAAGA =====
Left to Right Helix
Index Base       MolarMass       Density
0     C          111.1           1.55
1     T          126.115         1.223
2     C          111.1           1.55
3     T          126.115         1.223
4     T          126.115         1.223
5     T          126.115         1.223
6     T          126.115         1.223
7     A          135.13          1.6
8     G          151.13          2.2
9     A          135.13          1.6
10    G          151.13          2.2
11    A          135.13          1.6
12    A          135.13          1.6
13    A          135.13          1.6
14    A          135.13          1.6
15    G          151.13          2.2
16    A          135.13          1.6

Right to Left Helix
Index Base       MolarMass       Density
0     G          151.13          2.2
1     A          135.13          1.6
2     G          151.13          2.2
3     A          135.13          1.6
4     A          135.13          1.6
5     A          135.13          1.6
6     A          135.13          1.6
7     T          126.115         1.223
8     C          111.1           1.55
9     T          126.115         1.223
10    C          111.1           1.55
11    T          126.115         1.223
12    T          126.115         1.223
13    T          126.115         1.223
14    T          126.115         1.223
15    C          111.1           1.55
16    T          126.115         1.223

Highest MolarMass is: 151.130 at index 0 in RtoLHelix
Total density of both strands: 52.626
===========================================

===== Strand: AGGTTGTACCCAACCTA =====
Left to Right Helix
Index Base       MolarMass       Density
0     A          135.13          1.6
1     G          151.13          2.2
2     G          151.13          2.2
3     T          126.115         1.223
4     T          126.115         1.223
5     G          151.13          2.2
6     T          126.115         1.223
7     A          135.13          1.6
8     C          111.1           1.55
9     C          111.1           1.55
10    C          111.1           1.55
11    A          135.13          1.6
12    A          135.13          1.6
13    C          111.1           1.55
14    C          111.1           1.55
15    T          126.115         1.223
16    A          135.13          1.6

Right to Left Helix
Index Base       MolarMass       Density
0     T          126.115         1.223
1     C          111.1           1.55
2     C          111.1           1.55
3     A          135.13          1.6
4     A          135.13          1.6
5     C          111.1           1.55
6     A          135.13          1.6
7     T          126.115         1.223
8     G          151.13          2.2
9     G          151.13          2.2
10    G          151.13          2.2
11    T          126.115         1.223
12    T          126.115         1.223
13    G          151.13          2.2
14    G          151.13          2.2
15    A          135.13          1.6
16    T          126.115         1.223

Highest MolarMass is: 151.130 at index 1 in LtoRHelix
Total density of both strands: 55.407
===========================================

===== Strand: ACCTCTCTCAAATACTC =====
Left to Right Helix
Index Base       MolarMass       Density
0     A          135.13          1.6
1     C          111.1           1.55
2     C          111.1           1.55
3     T          126.115         1.223
4     C          111.1           1.55
5     T          126.115         1.223
6     C          111.1           1.55
7     T          126.115         1.223
8     C          111.1           1.55
9     A          135.13          1.6
10    A          135.13          1.6
11    A          135.13          1.6
12    T          126.115         1.223
13    A          135.13          1.6
14    C          111.1           1.55
15    T          126.115         1.223
16    C          111.1           1.55

Right to Left Helix
Index Base       MolarMass       Density
0     T          126.115         1.223
1     G          151.13          2.2
2     G          151.13          2.2
3     A          135.13          1.6
4     G          151.13          2.2
5     A          135.13          1.6
6     G          151.13          2.2
7     A          135.13          1.6
8     G          151.13          2.2
9     T          126.115         1.223
10    T          126.115         1.223
11    T          126.115         1.223
12    A          135.13          1.6
13    T          126.115         1.223
14    G          151.13          2.2
15    A          135.13          1.6
16    G          151.13          2.2

Highest MolarMass is: 151.130 at index 1 in RtoLHelix
Total density of both strands: 54.480
===========================================

===== Strand: AGGTTTCTCCCTCAACA =====
Left to Right Helix
Index Base       MolarMass       Density
0     A          135.13          1.6
1     G          151.13          2.2
2     G          151.13          2.2
3     T          126.115         1.223
4     T          126.115         1.223
5     T          126.115         1.223
6     C          111.1           1.55
7     T          126.115         1.223
8     C          111.1           1.55
9     C          111.1           1.55
10    C          111.1           1.55
11    T          126.115         1.223
12    C          111.1           1.55
13    A          135.13          1.6
14    A          135.13          1.6
15    C          111.1           1.55
16    A          135.13          1.6

Right to Left Helix
Index Base       MolarMass       Density
0     T          126.115         1.223
1     C          111.1           1.55
2     C          111.1           1.55
3     A          135.13          1.6
4     A          135.13          1.6
5     A          135.13          1.6
6     G          151.13          2.2
7     A          135.13          1.6
8     G          151.13          2.2
9     G          151.13          2.2
10    G          151.13          2.2
11    A          135.13          1.6
12    G          151.13          2.2
13    T          126.115         1.223
14    T          126.115         1.223
15    G          151.13          2.2
16    T          126.115         1.223

Highest MolarMass is: 151.130 at index 1 in LtoRHelix
Total density of both strands: 55.407
===========================================

 */