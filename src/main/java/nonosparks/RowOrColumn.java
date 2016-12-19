package main.java.nonosparks;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RowOrColumn {

    public ArrayList<Integer> hints;
    public ArrayList<JLabel> labels;
    private ArrayList<Cell> cells;

    public RowOrColumn() {
        hints = new ArrayList<Integer>();
        labels = new ArrayList<JLabel>();
        cells = new ArrayList<Cell>();
    };

    public void AddCell(Cell cell) {
        this.cells.add(cell);
    };

    public boolean CheckFinished() {

        int[] binaries = new int[cells.size()];
        for (int i = 0; i < cells.size(); i++)
            if (cells.get(i).HasFilled())
                binaries[i] = 1;
            else
                binaries[i] = 0;
        ArrayList<Integer> arrayList = BinariesToArrayList(binaries);
        if (hints.size() != arrayList.size())
            return false;
        for (int i = 0; i < hints.size(); i++)
            if (hints.get(i) != arrayList.get(i))
                return false;
        return true;
    }

    public boolean[] CheckHints() {
        boolean[] result = new boolean[hints.size()];
        int i = 0, j = -1;
        while (i < cells.size()
                && (cells.get(i).HasFilled() || cells.get(i).HasMarked())) {
            if (cells.get(i).HasMarked())
                j = i;
            if (i == cells.size() - 1)
                j = i;
            i++;
        }
        int[] binaries = new int[j + 1];
        for (i = 0; i <= j; i++)
            if (cells.get(i).HasFilled())
                binaries[i] = 1;
            else
                binaries[i] = 0;
        ArrayList<Integer> arrayList = BinariesToArrayList(binaries);
        i = 0;
        while (i < hints.size() && i < arrayList.size()
                && hints.get(i) == arrayList.get(i))
            i++;
        for (j = 0; j < i; j++)
            result[j] = true;
        i = 0;
        j = -1;
        while (i < cells.size()
                && (cells.get(cells.size() - 1 - i).HasFilled() || cells.get(
                        cells.size() - 1 - i).HasMarked())) {
            if (cells.get(cells.size() - 1 - i).HasMarked())
                j = i;
            if (i == cells.size() - 1)
                j = i;
            i++;
        }
        binaries = new int[j + 1];
        for (i = 0; i <= j; i++)
            if (cells.get(cells.size() - 1 - i).HasFilled())
                binaries[i] = 1;
            else
                binaries[i] = 0;
        arrayList = BinariesToArrayList(binaries);
        i = 0;
        while (i < hints.size() && i < arrayList.size()
                && hints.get(hints.size() - 1 - i) == arrayList.get(i))
            i++;
        for (j = 0; j < i; j++)
            result[result.length - 1 - j] = true;
        return result;
    };

    public void SetHints(int[] binaries) {
        hints = BinariesToArrayList(binaries);

        for (int i = 0; i < hints.size(); i++) {
            JLabel label = new JLabel();
            label.setText(hints.get(i).toString());
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            labels.add(label);
        }
    };

    public ArrayList<Integer> BinariesToArrayList(int[] binaries) {
        int i = 0, count = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (i < binaries.length && binaries[i] == 0)
            i++;
        while (i < binaries.length) {
            if (binaries[i] == 1) {
                count++;
                i++;
            } else {
                result.add(count);

                count = 0;
                while (i < binaries.length && binaries[i] == 0)
                    i++;
            }
        }
        if (count != 0)
            result.add(count);
        return result;
    };

    public static void test() {
        int binaries[] = { 0, 1, 0, 0, 1, 1, 0, 1 };
        RowOrColumn row = new RowOrColumn();
        row.SetHints(binaries);
        for (int i = 0; i < row.hints.size(); i++) {
            System.out.println(row.hints.get(i));
        }
        int binaries2[] = { 1, 0, 1, 1, 0, 0, 1, 0 };
        row = new RowOrColumn();
        row.SetHints(binaries2);
        for (int i = 0; i < row.hints.size(); i++) {
            System.out.println(row.hints.get(i));
        }
        for (int i = 0; i < binaries.length; i++)
            row.AddCell(new Cell());
        row.cells.get(0).SetFilled(true);
        row.cells.get(1).SetMarked(true);
        // row.cells.get(2).SetFilled(true);
        // row.cells.get(3).SetFilled(true);
        // row.cells.get(4).SetMarked(true);
        row.cells.get(5).SetMarked(true);
        row.cells.get(6).SetFilled(true);
        row.cells.get(7).SetMarked(true);
        boolean[] result = row.CheckHints();
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
