package home_work_5.search;

import home_work_5.search.ISearchEngine;

abstract class SearchEnginePunctuationNormalizerDecorator implements ISearchEngine {

    private final ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizerDecorator(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }
}
