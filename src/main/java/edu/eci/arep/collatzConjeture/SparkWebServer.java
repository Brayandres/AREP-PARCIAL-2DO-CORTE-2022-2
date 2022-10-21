package edu.eci.arep.collatzConjeture;

import edu.eci.arep.collatzConjeture.frontEnd.Index;
import edu.eci.arep.collatzConjeture.model.Calculator;
import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        get("/hello", (req, res) -> "Hello, Docker!");
        get("/collatzsequence", SparkWebServer::calculateCollatzConjecture);
        get("/", SparkWebServer::getIndexPage);
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String calculateCollatzConjecture(Request request, Response response) {
        response.type("application/json");
        int value = Integer.parseInt(request.queryParams("value"));
        String operation = "collatzsequence";
        String answer = Calculator.calculateCollatzConjecture(value);
        return "" +
                "{\n" +
                    "\t\"operation\": \"" + operation + "\",\n" +
                    "\t\"input\": " + value + ",\n"+
                    "\t\"output\": \"" + answer + "\"\n" +
                "}";
    }

    private static String getIndexPage(Request request, Response response) {
        response.type("text/html");
        return Index.HTML_INDEX;
    }
}