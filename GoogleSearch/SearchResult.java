public class SearchResult {

    private int resultId;
    private String query;
    private int results;
    private String topSite;
    private int page;
    private String language;
    private int time;

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getResultId() {
        return resultId;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public int getResults() {
        return results;
    }

    public void setTopSite(String topSite) {
        this.topSite = topSite;
    }

    public String getTopSite() {
        return topSite;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}