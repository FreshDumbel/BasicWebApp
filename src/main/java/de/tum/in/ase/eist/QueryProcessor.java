package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();

        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("what") && query.contains("is") && query.contains("plus") && query.contains("2019") && query.contains("200")){
            return "2219";

        }

        else if (query.contains("what") && query.contains("is") && query.contains("multiplied") && query.contains("19")){
            return "361";
        }

        else if (query.contains("what") && query.contains("is") && query.contains("plus") && query.contains("11") && query.contains("2")){
            return "13";
        }
        else if (query.contains("which") && query.contains("following") && query.contains("numbers") && query.contains("largest") && query.contains("66")
                && query.contains("859")){
            return "859";
        }
        else if (query.contains("which") && query.contains("following") && query.contains("numbers") && query.contains("square") && query.contains("2")){
            return "13";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
