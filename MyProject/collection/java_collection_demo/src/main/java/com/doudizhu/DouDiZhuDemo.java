package com.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*斗地主案例*/
public class DouDiZhuDemo {
    public static void main(String[] args) {
        /*组装牌*/
        String[]nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[]colors = {"♠","♥","♦","♣"};
        List <String>list = new ArrayList();
        for (String num : nums) {
            for (String color : colors) {
                list.add(num+color);
            }
        }
        list.add("大王");
        list.add("小王");
        /*洗牌*/
        Collections.shuffle(list);
        System.out.println("扑克牌："+list);
        /*发牌*/
        //三玩家
        List<String> play1 = new ArrayList();
        List<String> play2 = new ArrayList();
        List<String> play3 = new ArrayList();
        //底牌三张牌
        List<String> DiPai = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String p = list.get(i);
            if (i>=51){
                DiPai.add(p);
            }else if (i%3==0){
                play1.add(p);
            }else if (i%3==1){
                play2.add(p);
            }else if (i%3==2){
                play3.add(p);
            }
        }
        /*看牌*/
        System.out.println("一号玩家："+play1);
        System.out.println("二号玩家："+play2);
        System.out.println("三号玩家："+play3);
        System.out.println("底牌是："+DiPai);
    }
}
