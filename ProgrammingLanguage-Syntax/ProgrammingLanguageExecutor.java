class ProgrammingLanguageExecutor {

    public static void main(String[] args) {

        /*ProgrammingLanguage pl1 = new ProgrammingLanguage();
        pl1.languageId = 101;
        pl1.languageName = "Java";
        pl1.developer = "Sun Microsystems";
        Syntax s1 = new Syntax();
        s1.syntaxId = 201;
        s1.syntaxName = "Print Statement";
        s1.example = "System.out.println()";
        pl1.syntax = s1;
        pl1.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl2 = new ProgrammingLanguage();
        pl2.languageId = 102;
        pl2.languageName = "Python";
        pl2.developer = "Guido van Rossum";
        Syntax s2 = new Syntax();
        s2.syntaxId = 202;
        s2.syntaxName = "Print Statement";
        s2.example = "print()";
        pl2.syntax = s2;
        pl2.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl3 = new ProgrammingLanguage();
        pl3.languageId = 103;
        pl3.languageName = "C";
        pl3.developer = "Dennis Ritchie";
        Syntax s3 = new Syntax();
        s3.syntaxId = 203;
        s3.syntaxName = "Print Statement";
        s3.example = "printf()";
        pl3.syntax = s3;
        pl3.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl4 = new ProgrammingLanguage();
        pl4.languageId = 104;
        pl4.languageName = "C++";
        pl4.developer = "Bjarne Stroustrup";
        Syntax s4 = new Syntax();
        s4.syntaxId = 204;
        s4.syntaxName = "Output Statement";
        s4.example = "cout <<";
        pl4.syntax = s4;
        pl4.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl5 = new ProgrammingLanguage();
        pl5.languageId = 105;
        pl5.languageName = "JavaScript";
        pl5.developer = "Brendan Eich";
        Syntax s5 = new Syntax();
        s5.syntaxId = 205;
        s5.syntaxName = "Print Statement";
        s5.example = "console.log()";
        pl5.syntax = s5;
        pl5.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl6 = new ProgrammingLanguage();
        pl6.languageId = 106;
        pl6.languageName = "C#";
        pl6.developer = "Microsoft";
        Syntax s6 = new Syntax();
        s6.syntaxId = 206;
        s6.syntaxName = "Print Statement";
        s6.example = "Console.WriteLine()";
        pl6.syntax = s6;
        pl6.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl7 = new ProgrammingLanguage();
        pl7.languageId = 107;
        pl7.languageName = "Go";
        pl7.developer = "Google";
        Syntax s7 = new Syntax();
        s7.syntaxId = 207;
        s7.syntaxName = "Print Statement";
        s7.example = "fmt.Println()";
        pl7.syntax = s7;
        pl7.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl8 = new ProgrammingLanguage();
        pl8.languageId = 108;
        pl8.languageName = "Kotlin";
        pl8.developer = "JetBrains";
        Syntax s8 = new Syntax();
        s8.syntaxId = 208;
        s8.syntaxName = "Print Statement";
        s8.example = "println()";
        pl8.syntax = s8;
        pl8.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl9 = new ProgrammingLanguage();
        pl9.languageId = 109;
        pl9.languageName = "Swift";
        pl9.developer = "Apple";
        Syntax s9 = new Syntax();
        s9.syntaxId = 209;
        s9.syntaxName = "Print Statement";
        s9.example = "print()";
        pl9.syntax = s9;
        pl9.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl10 = new ProgrammingLanguage();
        pl10.languageId = 110;
        pl10.languageName = "Rust";
        pl10.developer = "Mozilla";
        Syntax s10 = new Syntax();
        s10.syntaxId = 210;
        s10.syntaxName = "Print Statement";
        s10.example = "println!()";
        pl10.syntax = s10;
        pl10.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl11 = new ProgrammingLanguage();
        pl11.languageId = 111;
        pl11.languageName = "PHP";
        pl11.developer = "Rasmus Lerdorf";
        Syntax s11 = new Syntax();
        s11.syntaxId = 211;
        s11.syntaxName = "Print Statement";
        s11.example = "echo";
        pl11.syntax = s11;
        pl11.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl12 = new ProgrammingLanguage();
        pl12.languageId = 112;
        pl12.languageName = "Ruby";
        pl12.developer = "Yukihiro Matsumoto";
        Syntax s12 = new Syntax();
        s12.syntaxId = 212;
        s12.syntaxName = "Print Statement";
        s12.example = "puts";
        pl12.syntax = s12;
        pl12.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl13 = new ProgrammingLanguage();
        pl13.languageId = 113;
        pl13.languageName = "Dart";
        pl13.developer = "Google";
        Syntax s13 = new Syntax();
        s13.syntaxId = 213;
        s13.syntaxName = "Print Statement";
        s13.example = "print()";
        pl13.syntax = s13;
        pl13.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl14 = new ProgrammingLanguage();
        pl14.languageId = 114;
        pl14.languageName = "TypeScript";
        pl14.developer = "Microsoft";
        Syntax s14 = new Syntax();
        s14.syntaxId = 214;
        s14.syntaxName = "Print Statement";
        s14.example = "console.log()";
        pl14.syntax = s14;
        pl14.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl15 = new ProgrammingLanguage();
        pl15.languageId = 115;
        pl15.languageName = "Scala";
        pl15.developer = "Martin Odersky";
        Syntax s15 = new Syntax();
        s15.syntaxId = 215;
        s15.syntaxName = "Print Statement";
        s15.example = "println()";
        pl15.syntax = s15;
        pl15.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl16 = new ProgrammingLanguage();
        pl16.languageId = 116;
        pl16.languageName = "Perl";
        pl16.developer = "Larry Wall";
        Syntax s16 = new Syntax();
        s16.syntaxId = 216;
        s16.syntaxName = "Print Statement";
        s16.example = "print";
        pl16.syntax = s16;
        pl16.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl17 = new ProgrammingLanguage();
        pl17.languageId = 117;
        pl17.languageName = "R";
        pl17.developer = "Ross Ihaka";
        Syntax s17 = new Syntax();
        s17.syntaxId = 217;
        s17.syntaxName = "Print Statement";
        s17.example = "print()";
        pl17.syntax = s17;
        pl17.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl18 = new ProgrammingLanguage();
        pl18.languageId = 118;
        pl18.languageName = "MATLAB";
        pl18.developer = "MathWorks";
        Syntax s18 = new Syntax();
        s18.syntaxId = 218;
        s18.syntaxName = "Print Statement";
        s18.example = "disp()";
        pl18.syntax = s18;
        pl18.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl19 = new ProgrammingLanguage();
        pl19.languageId = 119;
        pl19.languageName = "Shell";
        pl19.developer = "Unix";
        Syntax s19 = new Syntax();
        s19.syntaxId = 219;
        s19.syntaxName = "Print Statement";
        s19.example = "echo";
        pl19.syntax = s19;
        pl19.displayProgrammingLanguageInfo();

        ProgrammingLanguage pl20 = new ProgrammingLanguage();
        pl20.languageId = 120;
        pl20.languageName = "Julia";
        pl20.developer = "MIT";
        Syntax s20 = new Syntax();
        s20.syntaxId = 220;
        s20.syntaxName = "Print Statement";
        s20.example = "println()";
        pl20.syntax = s20;
        pl20.displayProgrammingLanguageInfo();*/

        

        
    }
}
