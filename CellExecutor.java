class CellExecutor {

    public static void main(String[] cell) {

        Cell c1 = new Cell(1,"E. coli","Bacterial",true,false,false,false,2.0,1,"Ribosome",false,"Phospholipid",false,"Cytosol",false,false,"70S","Digestion of nutrients","Bacteria","Active");
        Cell c2 = new Cell(2,"Neuron","Animal",false,true,false,true,100,46,"Nucleus, Mitochondria",true,"Phospholipid",false,"Cytoplasm",true,false,"80S","Transmit signals","Human","Active");
        Cell c3 = new Cell(3,"Paramecium","Protist",false,true,true,false,200,2,"Nucleus, Cilia",true,"Phospholipid",false,"Cytoplasm",true,false,"80S","Locomotion and feeding","Protist","Active");
        Cell c4 = new Cell(4,"Plant Leaf Cell","Plant",false,true,true,false,50,20,"Chloroplast, Nucleus",true,"Phospholipid",true,"Cytoplasm",true,true,"80S","Photosynthesis","Plant","Active");
        Cell c5 = new Cell(5,"Red Blood Cell","Animal",false,true,false,true,7,0,"Hemoglobin",false,"Phospholipid",false,"Cytoplasm",false,false,"80S","Transport oxygen","Human","Active");
        Cell c6 = new Cell(6,"Muscle Cell","Animal",false,true,false,true,100,46,"Nucleus, Mitochondria",true,"Phospholipid",false,"Cytoplasm",true,false,"80S","Contraction","Human","Active");
        Cell c7 = new Cell(7,"Stem Cell","Animal",false,true,false,true,15,46,"Nucleus",true,"Phospholipid",false,"Cytoplasm",true,false,"80S","Differentiation","Human","Active");
        Cell c8 = new Cell(8,"Guard Cell","Plant",false,true,true,false,25,20,"Chloroplast, Nucleus",true,"Phospholipid",true,"Cytoplasm",true,true,"80S","Regulate stomata","Plant","Active");
        Cell c9 = new Cell(9,"Amoeba","Protist",false,true,true,false,50,2,"Nucleus, Pseudopodia",true,"Phospholipid",false,"Cytoplasm",true,false,"80S","Movement and feeding","Protist","Active");
        Cell c10 = new Cell(10,"White Blood Cell","Animal",false,true,false,true,12,46,"Nucleus, Lysosome",true,"Phospholipid",false,"Cytoplasm",true,false,"80S","Immune defense","Human","Active");

        c1.toDisplayDetails();
        c2.toDisplayDetails();
        c3.toDisplayDetails();
        c4.toDisplayDetails();
        c5.toDisplayDetails();
        c6.toDisplayDetails();
        c7.toDisplayDetails();
        c8.toDisplayDetails();
        c9.toDisplayDetails();
        c10.toDisplayDetails();
    }
}