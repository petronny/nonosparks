package main.java.nonosparks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

    public static String ReadFile(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        String laststr = "";
        try {
            // System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
            while ((tempString = reader.readLine()) != null) {
                // ��ʾ�к�
                // System.out.println("line"+ line + ": " + tempString);
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

    public static void ParseJson(String jsonString) throws JSONException,ParseException {

        JSONObject jo = new JSONObject(jsonString);
        JSONObject jo1 = new JSONObject(jo.getString("hints"));

        System.out.println("\n��Json���ݽ���Ϊ��");
        System.out.println("\nname: " + jo.getString("name"));
        System.out.println("\nwidth: " + jo.getInt("width"));
        System.out.println("\nheight: " + jo.getInt("height"));
        System.out.println("\nanswer: " + jo.getString("answer"));
        System.out.println("\nhorizontal: " + jo1.getString("horizontal"));
        System.out.println("\nvertical: " + jo1.getString("vertical"));
        if (jo.has("tips")) {
            System.out.println("\ntips: " + jo.getString("tips"));
        }
    }

    public static void main(String[] args) throws JSONException, ParseException {

        ParseJson(ReadFile("D:/Downloads/nonosparks/stages/10.json"));
    }
}
