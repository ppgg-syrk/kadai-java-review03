package baseball;

public class BaseBallTeam {
    protected String name;
    protected int win;
    protected int lose;
    protected int draw;

    public BaseBallTeam(){
    }
 
    public BaseBallTeam(String name,int win, int lose, int draw) {
    this.name = name;
    this.win = win;
    this.lose =lose;
    this.draw = draw;
    }
    
    public double getRate() {
        double rate = (double)win/(win + lose);
        return rate;
    }
    
    public void report() {
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWin() {
        return win;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    
    public int getLose() {
        return lose;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    
    public int getDraw() {
        return draw;
    }
    
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
}
