class Syntax {

    int syntaxId;
    String syntaxName;
    String example;

    public Syntax(int syntaxId, String syntaxName, String example) {
        this.syntaxId = syntaxId;
        this.syntaxName = syntaxName;
        this.example = example;
    }

    public void displaySyntaxInfo() {
        System.out.println("Syntax Id : " + this.syntaxId);
        System.out.println("Syntax Name : " + this.syntaxName);
        System.out.println("Example : " + this.example);
    }
}
