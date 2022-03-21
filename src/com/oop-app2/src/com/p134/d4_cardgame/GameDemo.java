package com.p134.d4_cardgame;

import java.util.*;

/**
 目标：斗地主游戏的案例开发。

 业务需求分析:
 斗地主的做牌, 洗牌, 发牌, 排序（拓展知识）, 看牌。
 业务: 总共有54张牌。
 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
 花色: "♠", "♥", "♣", "♦"
 大小王: "👲" , "🃏"
 点数分别要组合4种花色，大小王各一张。
 斗地主：发出51张牌，剩下3张作为底牌。

 功能：
 1.做牌。
 2.洗牌。
 3.定义3个玩家
 4.发牌。
 5.排序（拓展，了解，作业）
 6.看牌
 */
public class GameDemo {

    public static List<Card> allCards=new ArrayList<>();
    

    static {
        String [] sizes ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String [] colors={"♠", "♥", "♣", "♦"};
        int index=0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c= new Card (size,color,index);
                allCards.add(c);
            }
        }
        Card c1= new Card ("","🃏" ,++index);
        Card c2= new Card ("","👲",++index);
        Collections.addAll(allCards ,c1,c2);
        System.out.println("============");
        System.out.println("show all card "+allCards);
//        System.out.println("get card .."+allCards.get(1));
//            Card test =new Card();
//            test =allCards.get(1);
//            test.setColor("color test");
//        System.out.println("============");
//        System.out.println(test);
//
//        Collections.shuffle(allCards);
//        System.out.println(allCards);

    }
    
    
    public static void main(String[] args) {

               Collections.shuffle(allCards);
                System.out.println("wich card"+allCards);

               List<Card> Linhichong= new ArrayList<>();
               List<Card> jiumozhi= new ArrayList<>();
               List<Card> renyingying= new ArrayList<>();

//               /[J♦, 6♦, K♦, 10♣, J♥, 9♦, 7♣, 7♥, 3♦,
            for (int i = 0; i <allCards.size()-3; i++) {
               Card c =allCards.get(i);
               if(i%3==0){
                   Linhichong.add(c);
               }else if (i%3==1){
                   jiumozhi.add(c);
               }else if(i%3==2){
                   renyingying.add(c);
               }

            }
            List <Card> lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
////            renyingying.add(lastThreeCards);
//
//        Collections.sort(Linhichong);
//        Collections.sort(jiumozhi);
//        Collections.sort(renyingying);
//
        sortCards(Linhichong);
        sortCards(jiumozhi);
        sortCards(renyingying);

        System.out.println("Linhichong  "+Linhichong);
        System.out.println("jiumozhi  "+jiumozhi);
        System.out.println("renyingying  "+renyingying);
        System.out.println("lastThreeCards is "+lastThreeCards);

//        System.out.println("wich card"+allCards);


    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            //[A♣, 4♥, 9♦, 5♣, 10♣, 7♣, 6♦, 9♣, 3♣, 10♦, 👲, 4♣, J♠, J♥, 8♣, 2♠, 4♠]
            @Override
            public int compare(Card o1, Card o2) {
                //o1 A♣
                //o2 4♥,
                return o1.getIndex()-o2.getIndex();
            }
        });
        // Collections.sort(cards,( o1,  o2)->  o1.getIndex() -o2.getIndex() );

    }

}
