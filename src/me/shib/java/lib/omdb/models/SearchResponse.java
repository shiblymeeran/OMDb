package me.shib.java.lib.omdb.models;

public final class SearchResponse {

    private SearchResult[] search;

    public SearchResponse(SearchResult[] search) {
        this.search = search;
    }

    public SearchResult[] getSearchResults() {
        return search;
    }

}
