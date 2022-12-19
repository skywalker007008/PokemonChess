package com.sky.zihao.stone;

import com.sky.zihao.equip.Equipment;
import com.sky.zihao.job.Job;

import java.util.ArrayList;

/**
 * Created: Zihao Liu
 * Created time: 2022-12-19
 **/

public abstract class Chess implements ChessAction{

    /* */
    protected long id;
    /* */
    protected long uniqueId;

    /* */
    protected int star;
    /* */
    protected ArrayList<Job> jobs = new ArrayList<>();

    /* */
    protected int physicalDamage;
    /* */
    protected int magicalDamage;
    /* */
    protected int physicalDefense;
    /* */
    protected int magicalDefense;
    /* */
    protected int health;
    /* */
    protected int mana;
    /* */
    protected int nowMana;
    /* */
    protected int attackRange;
    /* */
    protected double attackDuration;
    /* */
    protected double attackSpeed;
    /* */
    protected double criticalChance;
    /* */
    protected double dodgeChance;
    /* */

    /* */
    protected ArrayList<Equipment> equips = new ArrayList<>();

    public Chess() {
        this.star = 1;
    }

    public Chess(int star) {
        this.star = star;
    }

    protected void loadValues(int star, String json) {

    }
}
