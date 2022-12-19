package com.sky.zihao.stone;

import com.sky.zihao.effect.Effect;
import com.sky.zihao.equip.Equipment;
import com.sky.zihao.job.Job;

/**
 * Created: Zihao Liu
 * Created time: 2022-12-19
 **/
public interface ChessAction {

    void move();

    int attack();

    int ultAttack();

    void suffer(int damage);

    void evolve();

    void equip(Equipment equipment);

    void effect(Effect effect);

    void activeJob(Job job, int star);

    void reactiveJob(Job job, int star);

    void deactiveJob(Job job);
}
