package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchEngine {
    Map<String, ArrayList<GoggleResult>> resultsMap;

    public class GoggleResult {
        private String hyperlink;

        GoggleResult(String hyperlink) {
            this.hyperlink = hyperlink;
        }

        public String getHyperlink() {
            return this.hyperlink;
        }

    }

    SearchEngine() {
        this(new HashMap<>());
    }

    SearchEngine(Map<String, ArrayList<GoggleResult>> resultsMap) {
        this.resultsMap = resultsMap;
    }

    public void add(String keyword, String hyperlink) {
        if (this.resultsMap.containsKey(keyword)) {
            this.resultsMap.get(keyword).add(new GoggleResult(hyperlink));
            return;
        }

        this.resultsMap.put(keyword, new ArrayList<GoggleResult>(new GoggleResult(hyperlink)));
    }

    public ArrayList<GoggleResult> search(String keyword) {
        if (this.resultsMap.containsKey(keyword))
            return this.resultsMap.get(keyword);
    }
}
