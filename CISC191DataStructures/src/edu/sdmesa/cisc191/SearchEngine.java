package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.Hashtable;

public class SearchEngine {
    // has-a hashtable of many strings
    Hashtable<String, ArrayList<String>> resultsMap;

    /**
     * 
     */
    SearchEngine() {
        this(new Hashtable<String, ArrayList<String>>());
    }

    /**
     * 
     * @param resultsMap
     */
    SearchEngine(Hashtable<String, ArrayList<String>> resultsMap) {
        this.resultsMap = resultsMap;
    }

    /**
     * 
     * @param keyword
     * @param hyperlink
     */
    public void add(String keyword, String hyperlink) {

        if (this.resultsMap.containsKey(keyword)) {
            this.resultsMap.get(keyword).add(hyperlink);
            return;
        }
        ArrayList<String> list = new ArrayList<String>();
        list.add(hyperlink);
        this.resultsMap.put(keyword, list);
    }

    /**
     * 
     * @param keyword
     * @return
     */
    public ArrayList<String> search(String keyword) {
        if (this.resultsMap.containsKey(keyword)) {
            ArrayList<String> list = new ArrayList<String>();

            for (String result : this.resultsMap.get(keyword))
                list.add(result);

            return list;
        }

        return new ArrayList<String>();
    }
}
