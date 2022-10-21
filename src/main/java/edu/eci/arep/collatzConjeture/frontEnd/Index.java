package edu.eci.arep.collatzConjeture.frontEnd;

public class Index {

    public static final String HTML_INDEX = "" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\n" +
            "    <head>\n" +
            "        <title>ECI Services | Calculator</title>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    </head>\n" +
            "\n" +
            "    <body>\n" +
            "        <h1>Input a number to get Collatz Conjecture sequence:</h1>\n" +
            "        <form action=\"/\">\n" +
            "            <label for=\"name\">Number: </label><br>\n" +
            "            <input type=\"text\" id=\"name\" name=\"name\"><br><br>\n" +
            "            <input type=\"button\" value=\"Submit\" onclick=\"loadGetMsg()\">\n" +
            "        </form> \n" +
            "        <div id=\"getrespmsg\"></div>\n" +
            "\n" +
            "        <script>\n" +
            "            function loadGetMsg() {\n" +
            "                let nameVar = document.getElementById(\"name\").value;\n" +
            "                const xhttp = new XMLHttpRequest();\n" +
            "                xhttp.onload = function() {\n" +
            "                    document.getElementById(\"getrespmsg\").innerHTML =\n" +
            "                    this.responseText;\n" +
            "                }\n" +
            "                xhttp.open(\"GET\", \"/collatzsequence?value=\"+nameVar);\n" +
            "                xhttp.send();\n" +
            "            }\n" +
            "        </script>\n" +
            "    </body>\n" +
            "\n" +
            "</html>";
}
