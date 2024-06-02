package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    double rate = getRate(win, lose);
    public double getRate(int win, int lose) {
        return rate = (double)win / (win + lose);
    }
    
    // コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {  
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    
    public void report() {
        getRate(win, lose);
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + rate + "です。");
    }
}