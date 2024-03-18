package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetVoteCount {
    public static final String BASE_PATH = "https://jsonmock.hackerrank.com/api/food_outlets?city=%s&estimated_cost=%s";

    public static long getVoteCount(String cityName, int estimatedCost) {
        JSONArray results = callApi(String.format(BASE_PATH, cityName, estimatedCost));
        assert results != null;
        if (results.isEmpty()) {
            return -1;
        }

        long total = 0;
        for (Object result : results) {
            JSONObject jsonObj = (JSONObject) result;
            JSONObject userRating = (JSONObject) jsonObj.get("user_rating");
            total = total + (Long) userRating.get("votes");
        }
        return total;
    }

    public static JSONArray callApi(String path) {
        HttpURLConnection connection = null;
        OutputStreamWriter wr = null;
        BufferedReader rd  = null;
        StringBuilder sb = null;
        String line = null;

        URL serverAddress = null;

        try {
            serverAddress = new URL(path);
            //set up out communications stuff

            //Set up the initial connection
            connection = (HttpURLConnection)serverAddress.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setReadTimeout(10000);

            connection.connect();

            //read the result from the server
            rd  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            sb = new StringBuilder();

            while ((line = rd.readLine()) != null)
            {
                sb.append(line + '\n');
            }

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(sb.toString());
            return (JSONArray) jsonObj.get("data");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //close the connection, set all objects to null
            connection.disconnect();
            rd = null;
            sb = null;
            wr = null;
            connection = null;
        }
        return null;
    }
}
