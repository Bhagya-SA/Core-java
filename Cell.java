class Cell {

    int id;
    String cellName;
    String cellType;
    boolean prokaryotic;
    boolean eukaryotic;
    boolean plantCell;
    boolean animalCell;
    double size; // in micrometers
    int chromosomeCount;
    String organelles;
    boolean nucleusPresent;
    String membraneType;
    boolean cellWallPresent;
    String cytoplasmComposition;
    boolean mitochondriaPresent;
    boolean chloroplastPresent;
    String ribosomeType;
    String function;
    String organism;
    String status;

    
    public Cell(int id, String cellName, String cellType, boolean prokaryotic, boolean eukaryotic,boolean plantCell, boolean animalCell, double size, int chromosomeCount, String organelles,boolean nucleusPresent, String membraneType, boolean cellWallPresent, String cytoplasmComposition,boolean mitochondriaPresent, boolean chloroplastPresent, String ribosomeType, String function,String organism, String status) {

        this.id = id;
        this.cellName = cellName;
        this.cellType = cellType;
        this.prokaryotic = prokaryotic;
        this.eukaryotic = eukaryotic;
        this.plantCell = plantCell;
        this.animalCell = animalCell;
        this.size = size;
        this.chromosomeCount = chromosomeCount;
        this.organelles = organelles;
        this.nucleusPresent = nucleusPresent;
        this.membraneType = membraneType;
        this.cellWallPresent = cellWallPresent;
        this.cytoplasmComposition = cytoplasmComposition;
        this.mitochondriaPresent = mitochondriaPresent;
        this.chloroplastPresent = chloroplastPresent;
        this.ribosomeType = ribosomeType;
        this.function = function;
        this.organism = organism;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Cell Name: " + cellName);
        System.out.println("Cell Type: " + cellType);
        System.out.println("Prokaryotic: " + prokaryotic);
        System.out.println("Eukaryotic: " + eukaryotic);
        System.out.println("Plant Cell: " + plantCell);
        System.out.println("Animal Cell: " + animalCell);
        System.out.println("Size: " + size + " µm");
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Organelles: " + organelles);
        System.out.println("Nucleus Present: " + nucleusPresent);
        System.out.println("Membrane Type: " + membraneType);
        System.out.println("Cell Wall Present: " + cellWallPresent);
        System.out.println("Cytoplasm Composition: " + cytoplasmComposition);
        System.out.println("Mitochondria Present: " + mitochondriaPresent);
        System.out.println("Chloroplast Present: " + chloroplastPresent);
        System.out.println("Ribosome Type: " + ribosomeType);
        System.out.println("Function: " + function);
        System.out.println("Organism: " + organism);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}