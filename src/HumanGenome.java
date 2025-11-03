
public class HumanGenome {
    private String genomeName;
    private String genomeNumber;
    private int chromosomeNumber;
    private String cellNumber;

    /*

    2. PROCESSING pt2

    This is where the data is processed. The data will be cached into the instance variables through the
    this.<variable> keyword. this.<variable> ensures that the specific instance variable is where the data
    will be cached. After reassigning, the method will be called again in HumanGenome class.

     */
//overloaded (to upload)
    public HumanGenome(String genome_name, String genome_number, int chromosome_number, String cell_number) {
        //watch out for order
        this.genomeName = genome_name;
        this.genomeNumber = genome_number;
        this.chromosomeNumber = chromosome_number;
        this.cellNumber = cell_number;
    }

    public HumanGenome() {
    }

    //getter - setter (if want to edit data)
    public String getName() {
        return genomeName;
    }

    public void setName(String name) {
        this.genomeName = name;
    }

    public String getNumber() {
        return genomeNumber;
    }

    public void setGenomeNumber(String genomeNumber) {
        this.genomeNumber = genomeNumber;
    }

    public int getChromosomeNumber() {
        return chromosomeNumber;
    }

    public void setChromosomeNumber(int chromosomeNumber) {
        this.chromosomeNumber = chromosomeNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
    /*

    5. PRINT

    The data is printed in this method. This method is called in the HumanGenome class. For each person,
    the printer will print the genomeName, genomeNumber, chromosomeNumber, and cellNumber that has been inputted.

     */
    public void print() {
        System.out.printf("---------------------------------------------\n" +
                "This is the data of the person you entered:\n\n");
        System.out.println("Genome name: " + genomeName);
        System.out.println("Genome number: " + genomeNumber);
        System.out.println("Number of chromosomes: " + chromosomeNumber);
        System.out.println("Number of cells in the body (in trillions): " + cellNumber);
        System.out.printf("----------------------------------------------\n\n");
    }
}
