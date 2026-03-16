class Brain {

    int id;
    String name;
    String hemisphere;
    double weight;
    double volume;
    String lobes;
    String functions;
    String neurotransmitters;
    boolean healthy;
    String neuronType;
    long neuronCount;
    String bloodSupply;
    String ageGroup;
    String species;
    String medicalCondition;
    String treatment;
    String researcher;
    String country;
    double iqScore;

   
    public Brain(int id, String name, String hemisphere, double weight, double volume,String lobes, String functions, String neurotransmitters, boolean healthy,String neuronType, long neuronCount, String bloodSupply, String ageGroup,String species, String medicalCondition, String treatment, String researcher,String country, double iqScore) {

        this.id = id;
        this.name = name;
        this.hemisphere = hemisphere;
        this.weight = weight;
        this.volume = volume;
        this.lobes = lobes;
        this.functions = functions;
        this.neurotransmitters = neurotransmitters;
        this.healthy = healthy;
        this.neuronType = neuronType;
        this.neuronCount = neuronCount;
        this.bloodSupply = bloodSupply;
        this.ageGroup = ageGroup;
        this.species = species;
        this.medicalCondition = medicalCondition;
        this.treatment = treatment;
        this.researcher = researcher;
        this.country = country;
        this.iqScore = iqScore;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hemisphere: " + hemisphere);
        System.out.println("Weight: " + weight);
        System.out.println("Volume: " + volume);
        System.out.println("Lobes: " + lobes);
        System.out.println("Functions: " + functions);
        System.out.println("Neurotransmitters: " + neurotransmitters);
        System.out.println("Healthy: " + healthy);
        System.out.println("Neuron Type: " + neuronType);
        System.out.println("Neuron Count: " + neuronCount);
        System.out.println("Blood Supply: " + bloodSupply);
        System.out.println("Age Group: " + ageGroup);
        System.out.println("Species: " + species);
        System.out.println("Medical Condition: " + medicalCondition);
        System.out.println("Treatment: " + treatment);
        System.out.println("Researcher: " + researcher);
        System.out.println("Country: " + country);
        System.out.println("IQ Score: " + iqScore);
        System.out.println("-----------------------------------");
    }
}