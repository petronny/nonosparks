package main.java.nonosparks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

public class Board {
    public int width, height;
    public String name;
    private int[][] solution;
    public Cell[][] cells;
    public RowOrColumn[] rows;
    public RowOrColumn[] columns;

    public static enum ERRORS {
        NO_ERROR, NO_NAME, NO_HEIGHT, NO_WIDTH, NO_SOLUTION
    };

    public ERRORS error = ERRORS.NO_ERROR;

    public void ParseJson(String jsonString) throws Exception {

        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray jsonArray = jsonObject.getJSONArray("solution");
        if (!jsonObject.has("name")) {
            error = ERRORS.NO_NAME;
            return;
        }
        if (!jsonObject.has("width")) {
            error = ERRORS.NO_WIDTH;
            return;
        }
        if (!jsonObject.has("height")) {
            error = ERRORS.NO_HEIGHT;
            return;
        }
        if (!jsonObject.has("solution")) {
            error = ERRORS.NO_SOLUTION;
            return;
        }
        name = jsonObject.getString("name");
        width = jsonObject.getInt("width");
        height = jsonObject.getInt("height");
        solution = new int[width][height];
        cells = new Cell[width][height];
        rows = new RowOrColumn[height];
        columns = new RowOrColumn[width];
        for (int i = 0; i < height; i++)
            rows[i] = new RowOrColumn();
        for (int i = 0; i < width; i++)
            columns[i] = new RowOrColumn();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cells[j][i] = new Cell();
                rows[i].AddCell(cells[j][i]);
                columns[j].AddCell(cells[j][i]);
            }
        }
        for (int i = 0; i < height; i++) {
            JSONArray jsonArray2 = jsonArray.getJSONArray(i);
            for (int j = 0; j < width; j++) {
                solution[j][i] = jsonArray2.getInt(j);
            }
        }
        for (int i = 0; i < height; i++) {
            int[] binaires = new int[width];
            for (int j = 0; j < width; j++)
                binaires[j] = solution[j][i];
            rows[i].SetHints(binaires);
        }

        for (int i = 0; i < width; i++) {

            columns[i].SetHints(solution[i]);
        }

    }

    public boolean CheckFinished() {
        int i, j = 0;

        for (i = 0; i < height; i++)
            if (!rows[i].CheckFinished())
                return false;

        for (j = 0; j < width; j++)
            if (!columns[j].CheckFinished())
                return false;

        return true;

    }

    public String ReadExternalJson(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        String laststr = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                laststr = laststr + tempString;
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

    public String ReadPackagedJson(String path) throws Exception {

        InputStream is = this.getClass().getResourceAsStream(path);
        BufferedReader br;
        StringBuilder strBlder = new StringBuilder("");
        br = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while (null != (line = br.readLine())) {
            strBlder.append(line + "\n");
        }
        br.close();
        return strBlder.toString();
    }

    public Board(int stage) throws Exception {
        ParseJson(ReadPackagedJson(String.format("/stages/%02d.json", stage)));
    };

    public Board(String path) throws Exception {
        ParseJson(ReadExternalJson(path));
    }

    public static void test() throws Exception {
        Board board = new Board(20);
        for (int i = 0; i < board.height; i++) {
            for (int j = 0; j < board.width; j++) {
                System.out.print(board.solution[j][i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < board.height; i++) {
            Tools.PrintList(board.rows[i].hints);
            Tools.PrintList(board.rows[i].CheckHints());
        }

        for (int i = 0; i < board.width; i++) {
            Tools.PrintList(board.columns[i].hints);
            Tools.PrintList(board.columns[i].CheckHints());
        }
        board = new Board("20.json");
    }

}
