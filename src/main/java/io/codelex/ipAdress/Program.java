package io.codelex.ipAdress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        Scanner input = new Scanner(System.in);
        String ipAddress = input.nextLine();

        URL url = new URL("http://ip-api.com/json/" + ipAddress);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        //request setup
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000); // ja nav connection pec 5 sec tad ir timeout
        connection.setReadTimeout(5000);

        int status = connection.getResponseCode(); // pārbauda connection
        //System.out.println(status); - parbauda vai ir connection

        if (status > 299) { // not successful connection
            reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
        } else {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
        }
        System.out.println(responseContent);
    }
}
