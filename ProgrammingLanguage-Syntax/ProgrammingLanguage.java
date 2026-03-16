class ProgrammingLanguage {

    int languageId;
    String languageName;
    String developer;
    Syntax syntax;

    public void displayProgrammingLanguageInfo() {
        System.out.println("Language Id : " + this.languageId);
        System.out.println("Language Name : " + this.languageName);
        System.out.println("Developer : " + this.developer);
        this.syntax.displaySyntaxInfo();
        System.out.println("--------------------------------------------------");
    }
}



