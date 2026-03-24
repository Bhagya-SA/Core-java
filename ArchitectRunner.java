class ArchitectRunner {

    public static void main(String[] intDesign) {
    
        Architect architect = new Architect();
        
        architect.addInteriorDesignName("Modern");
        architect.addInteriorDesignName("Contemporary");
        architect.addInteriorDesignName("Minimalist");
        architect.addInteriorDesignName("Industrial");
        architect.addInteriorDesignName("Scandinavian");
        architect.addInteriorDesignName("Traditional");
        architect.addInteriorDesignName("Bohemian");
        architect.addInteriorDesignName("Rustic");
        architect.addInteriorDesignName("Art Deco");
        architect.addInteriorDesignName("Mid-Century Modern");
        architect.addInteriorDesignName("Vintage");
        
        architect.getInteriorDesignNames();
        
    }
}