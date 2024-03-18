package org.example;

import java.util.List;

public class GridSearch {

    public static String gridSearch(List<String> G, List<String> P) {
        String answer = "NO";
        int pInd = 0;
        for (int gInd = 0; gInd < G.size(); gInd++) {
            String gLine = G.get(gInd);
            int startInd = gLine.indexOf(P.get(0));
            while (startInd >= 0) {
                pInd = 1;
                while (pInd < P.size() && (gInd + pInd) < G.size()) {
                    String gNextLine = G.get(gInd + pInd);
                    if (!gNextLine.substring(startInd).startsWith(P.get(pInd))) {
                        break;
                    }
                    pInd++;
                }
                if (pInd == P.size()) {
                    answer = "YES";
                    break;
                }
                startInd = gLine.indexOf(P.get(0), startInd + 1);
            }
        }
        return answer;
    }
}
