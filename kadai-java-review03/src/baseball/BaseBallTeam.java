package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    // 宣言
    private double rate; 
    
    public double getRate() {
        return rate = (double)win / (win + lose);
    }
    
    public void report() {
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + rate + "です。");
    }
    
    public void setBaseBallTeam(String name, int win, int lose, int draw) {   
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
}
