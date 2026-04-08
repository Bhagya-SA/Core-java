class GoogleSearchRunner {

    public static void main(String[] search) {

        GoogleSearch googleSearch = new GoogleSearch();

        SearchResult resultOne = new SearchResult();
        resultOne.setResultId(1);
        resultOne.setQuery("Java Programming");
        resultOne.setResults(1200000);
        resultOne.setTopSite("www.javatpoint.com");
        resultOne.setPage(1);
        resultOne.setLanguage("English");
        resultOne.setTime(2);

        boolean isResultAdded = googleSearch.addSearchResult(resultOne);
        System.out.println(isResultAdded);

        SearchResult resultTwo = new SearchResult();
        resultTwo.setResultId(2);
        resultTwo.setQuery("Python Tutorial");
        resultTwo.setResults(1500000);
        resultTwo.setTopSite("www.w3schools.com");
        resultTwo.setPage(1);
        resultTwo.setLanguage("English");
        resultTwo.setTime(3);

        isResultAdded = googleSearch.addSearchResult(resultTwo);
        System.out.println(isResultAdded);

        SearchResult resultThree = new SearchResult();
        resultThree.setResultId(3);
        resultThree.setQuery("Web Development");
        resultThree.setResults(1000000);
        resultThree.setTopSite("www.geeksforgeeks.org");
        resultThree.setPage(1);
        resultThree.setLanguage("English");
        resultThree.setTime(4);

        isResultAdded = googleSearch.addSearchResult(resultThree);
        System.out.println(isResultAdded);

        SearchResult resultFour = new SearchResult();
        resultFour.setResultId(4);
        resultFour.setQuery("Machine Learning");
        resultFour.setResults(800000);
        resultFour.setTopSite("www.coursera.org");
        resultFour.setPage(1);
        resultFour.setLanguage("English");
        resultFour.setTime(5);

        isResultAdded = googleSearch.addSearchResult(resultFour);
        System.out.println(isResultAdded);

        SearchResult resultFive = new SearchResult();
        resultFive.setResultId(5);
        resultFive.setQuery("Cybersecurity Basics");
        resultFive.setResults(600000);
        resultFive.setTopSite("www.edx.org");
        resultFive.setPage(1);
        resultFive.setLanguage("English");
        resultFive.setTime(3);

        isResultAdded = googleSearch.addSearchResult(resultFive);
        System.out.println(isResultAdded);

        googleSearch.getSearchResultDetails();
    }
}