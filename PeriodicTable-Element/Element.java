class Element {
    int elementId;
    String elementName;
    String elementSymbol;

     public Element(int elementId, String elementName, String elementSymbol) {
        this.elementId = elementId;
        this.elementName = elementName;
        this.elementSymbol = elementSymbol;
    }

    public void displayElementInfo() {
        System.out.println("Element Id : " + this.elementId);
        System.out.println("Element Name : " + this.elementName);
        System.out.println("Element Symbol : " + this.elementSymbol);
    }
}
