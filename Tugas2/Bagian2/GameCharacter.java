package com.company;

public class GameCharacter {
    private String nama;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter(String nama, int attackHitPoint, int attackKickPoint){
        this.nama = nama;
        this.lifePoint = 100;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public int getLifePoint(){
        return this.lifePoint;
    }

    public String getNama(){
        return this.nama;
    }

    public void hit(GameCharacter character){
        character.lifePoint -= this.attackHitPoint;
    }

    public void kick(GameCharacter character){
        character.lifePoint -=this.attackKickPoint;
    }
}
