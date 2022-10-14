package com.company;

public class GameCharacter {
    private final String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.lifePoint = 100; //full health 100
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getName() {
        return name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    // method attack hit dan attack kick
    //parameter dari objek
    public void hit(GameCharacter character) {
        //berkurang nya lifepoint ketika kena damage attackhitpoint
        character.lifePoint -= this.attackHitPoint;
    }
    public void kick(GameCharacter character){
        character.lifePoint -= this.attackKickPoint;
    }
}
