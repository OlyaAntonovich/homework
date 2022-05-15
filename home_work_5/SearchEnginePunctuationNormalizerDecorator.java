package home_work_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class SearchEnginePunctuationNormalizerDecorator implements ISearchEngine {

    private final ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizerDecorator(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }
}
