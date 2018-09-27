package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("erica")) {
            return "Erica is working in DB " +
                    "She is a beautiful developer hahhah" +
                    "using Clojure language in GRETL team.";
        }

        if (query.toLowerCase().contains("name")) {
            return "TeamNameNotDefined";
        }

        if (query.toLowerCase().contains("plus")) {
            return "addDe";
        }
        return "";
    }
}
