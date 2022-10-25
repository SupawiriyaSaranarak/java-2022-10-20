package jp.co.nintendo.playerscore;
public class Player{
    String name;
    public Player (String name) {
        this.name = name;
    }
    public void showDetail() {
        System.out.println(this.name);
    }
}