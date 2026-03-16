class BrainExecutor {

    public static void main(String[] brain) {

        Brain b1 = new Brain(1,"Cerebrum","Left",1400,1200,"Frontal, Parietal, Temporal, Occipital","Cognition, Motor, Sensory","Dopamine, Serotonin",true,"Pyramidal",8600000,"Carotid","Adult","Human","None","N/A","Dr. Smith","USA",120);
        Brain b2 = new Brain(2,"Cerebellum","Right",150,110,"Anterior, Posterior","Balance, Coordination","GABA, Glutamate",true,"Purkinje",6900000,"Vertebral","Adult","Human","None","N/A","Dr. Jones","UK",115);
        Brain b3 = new Brain(3,"Brainstem","Midline",30,25,"Medulla, Pons, Midbrain","Autonomic Functions","Acetylcholine",true,"Multipolar",20000,"Basilar","Adult","Human","None","N/A","Dr. Lee","India",110);
        Brain b4 = new Brain(4,"Hippocampus","Left",4,3.5,"CA1, CA3","Memory, Learning","Glutamate, GABA",true,"Pyramidal",25000,"Basilar","Adult","Human","None","N/A","Dr. White","USA",130);
        Brain b5 = new Brain(5,"Amygdala","Right",3,2.8,"Basolateral, Central","Emotion, Fear","Dopamine, Serotonin",true,"Interneurons",120000,"Basilar","Adult","Human","None","N/A","Dr. Patel","India",125);
        Brain b6 = new Brain(6,"Cortex","Left",1200,1000,"Frontal, Parietal, Temporal, Occipital","Higher Functions","Dopamine, Serotonin",true,"Pyramidal",850000,"Carotid","Adult","Human","None","N/A","Dr. Kim","South Korea",118);
        Brain b7 = new Brain(7,"Cerebrum","Right",1450,1250,"Frontal, Parietal, Temporal, Occipital","Cognition, Motor, Sensory","Dopamine, Serotonin",true,"Pyramidal",860000,"Carotid","Adult","Human","None","N/A","Dr. Brown","UK",122);
        Brain b8 = new Brain(8,"Cerebellum","Left",155,115,"Anterior, Posterior","Balance, Coordination","GABA, Glutamate",true,"Purkinje",690000,"Vertebral","Adult","Human","None","N/A","Dr. Garcia","USA",117);
        Brain b9 = new Brain(9,"Brainstem","Midline",32,28,"Medulla, Pons, Midbrain","Autonomic Functions","Acetylcholine",true,"Multipolar",200000,"Basilar","Adult","Human","None","N/A","Dr. Singh","India",112);
        Brain b10 = new Brain(10,"Hippocampus","Right",4.5,4,"CA1, CA3","Memory, Learning","Glutamate, GABA",true,"Pyramidal",25000,"Basilar","Adult","Human","None","N/A","Dr. Chen","China",128);

        b1.toDisplayDetails();
        b2.toDisplayDetails();
        b3.toDisplayDetails();
        b4.toDisplayDetails();
        b5.toDisplayDetails();
        b6.toDisplayDetails();
        b7.toDisplayDetails();
        b8.toDisplayDetails();
        b9.toDisplayDetails();
        b10.toDisplayDetails();
    }
}