package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Lead Author(s):
 * 
 * @author Kiernan Beresford
 * 
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * 
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a search engine
 *         - Adds a keyword and hyperlink to the search engine
 *         - Searches for a keyword and returns the hyperlinks
 */
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
