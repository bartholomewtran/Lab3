public class NucleicAcid {

    /*

Create a class called NucleicAcid with following properties
- Name - String
- ChemicalFormula - String
- Molarmass - float (and units can be added as a String (within printf())
- Density - float (and units can be added as a String (within printf())

     */

    private String nucleicName;
    private String chemicalFormula;
    private float molarMass;
    private float density;

    /*

    2. PROCESSING pt2

    This is where the data is processed. The data will be cached into the instance variables through the
    this.<variable> keyword. this.<variable> ensures that the specific instance variable is where the data
    will be cached. After reassigning, the method will be called again in GenoNucleicAcid class.

*/
    public NucleicAcid(String nucleic_name, String chemical_formula, float molar_mass, float density) {
        //watch out for order
        this.nucleicName = nucleic_name;
        this.chemicalFormula = chemical_formula;
        this.molarMass = molar_mass;
        this.density = density;
    }


    //getter - setter

    public String getNucleicName() {
        return nucleicName;
    }

    public void setNucleicName(String nucleicName) {
        this.nucleicName = nucleicName;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public float getMolarMass() {
        return molarMass;
    }

    public void setMolarMass(float molarMass) {
        this.molarMass = molarMass;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    /*

        5. PRINT

        The data is printed in this method. This method is called in the GenoNucleicAcid class. For each person,
        the printer will print the nucleicName, chemicalFormula, molarMass, and density values that have been inputted.

         */
    public void print () {
        System.out.printf("---------------------------------------------\n" +
                "This is the data of the nucleic ID you entered:\n\n");
        System.out.println("Nucleic name: " + nucleicName);
        System.out.println("Chemical formula: " + chemicalFormula);
        System.out.println("Molar mass: " + molarMass);
        System.out.println("Density: " + density);
        System.out.printf("----------------------------------------------\n\n");
    }

}

