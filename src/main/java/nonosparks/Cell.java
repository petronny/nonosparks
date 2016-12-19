package main.java.nonosparks;

public class Cell {
    private boolean filled,marked;
    
    public Cell(){
        filled=false;
        marked=false;
    }
    public void SetFilled(boolean filled)
    {
        this.filled=filled;
    };
    public void SetMarked(boolean marked)
    {
        this.marked=marked;
    };
    public boolean HasFilled()
    {
        return filled;
    };
    public boolean HasMarked()
    {
        return marked;
    };  
}
