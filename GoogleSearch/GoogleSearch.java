class GoogleSearch {

    SearchResult searchResults[] = new SearchResult[5];
    int index;

    public boolean addSearchResult(SearchResult searchResult) {

        boolean isResultAdded = false;

        boolean isResultIdValid = false;
        boolean isQueryValid = false;
        boolean isResultsValid = false;
        boolean isTopSiteValid = false;
        boolean isPageValid = false;
        boolean isLanguageValid = false;
        boolean isTimeValid = false;

        int resultId = searchResult.getResultId();
        if (resultId > 0) {
            isResultIdValid = true;
        }

        String query = searchResult.getQuery();
        if (query != null && !query.isEmpty()) {
            isQueryValid = true;
        }

        int results = searchResult.getResults();
        if (results >= 0) {
            isResultsValid = true;
        }

        String topSite = searchResult.getTopSite();
        if (topSite != null && !topSite.isEmpty()) {
            isTopSiteValid = true;
        }

        int page = searchResult.getPage();
        if (page > 0) {
            isPageValid = true;
        }

        String language = searchResult.getLanguage();
        if (language != null && !language.isEmpty()) {
            isLanguageValid = true;
        }

        int time = searchResult.getTime();
        if (time >= 0) {
            isTimeValid = true;
        }

        if (isResultIdValid && isQueryValid && isResultsValid &&
            isTopSiteValid && isPageValid && isLanguageValid && isTimeValid) {

            isResultAdded = true;
            searchResults[index++] = searchResult;
        }

        return isResultAdded;
    }

    public void getSearchResultDetails() {

        System.out.println("The search result details are as follows :");

        for (SearchResult searchResult : searchResults) {

            if (searchResult != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Result Id is : " + searchResult.getResultId());
                System.out.println("Query is : " + searchResult.getQuery());
                System.out.println("Results count is : " + searchResult.getResults());
                System.out.println("Top site is : " + searchResult.getTopSite());
                System.out.println("Page number is : " + searchResult.getPage());
                System.out.println("Language is : " + searchResult.getLanguage());
                System.out.println("Search time is : " + searchResult.getTime());
                System.out.println("--------------------------------------------");
            }
        }
    }
}