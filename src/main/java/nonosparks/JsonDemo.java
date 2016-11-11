package main.java.nonosparks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.text.ParseException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo {

    public static String ReadFile(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        String laststr = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                laststr = laststr + tempString;
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return laststr;
    }

    public void writeFile(String filePath, String sets) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(fw);
        out.write(sets);
        out.println();
        fw.close();
        out.close();
    }

    public static void ParseJson(String jsonString) throws JSONException,
            ParseException {

        JSONObject jo = new JSONObject(jsonString);
        JSONObject jo1 = new JSONObject(jo.getString("hints"));
        JSONArray ja1 = jo1.getJSONArray("horizontal");
        JSONArray ja2 = jo1.getJSONArray("vertical");

        System.out.println("\nJson Data£º");
        System.out.println("\nname: " + jo.getString("name"));
        System.out.println("\nwidth: " + jo.getInt("width"));
        System.out.println("\nheight: " + jo.getInt("height"));
        System.out.println("\nanswer: " + jo.getString("answer"));
        System.out.println("\nhorizontal: ");
        for (int i = 0; i < ja1.length(); i++) {
            System.out.println(ja1.getString(i));
        }
        ;
        System.out.println("\nvertical: ");
        for (int j = 0; j < ja2.length(); j++) {
            System.out.println(ja2.getString(j));
        }
        ;
        if (jo.has("tips")) {
            System.out.println("\ntips: " + jo.getString("tips"));
        }
    }

    public  String getResource(String path) throws IOException{  

        InputStream is = this.getClass().getResourceAsStream(path);
        BufferedReader br;
        StringBuilder strBlder = new StringBuilder("");
        try {
            br = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while (null != (line = br.readLine())) {
                strBlder.append(line + "\n");
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBlder.toString();
    }
                 
    public static void main(String[] args) throws JSONException,
            ParseException, IOException {
        JsonDemo Json = new JsonDemo();
        ParseJson(Json.getResource("/stages/10.json"));
    }
}
