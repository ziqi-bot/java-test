package javaCourse;

import java.util.ArrayList;
import java.util.Collections;

public class PokerTest {
    public static void main(String[] args) {
        //1.
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
        String[] color = {"Diamonds♦", "Clubs♣", "Hearts♥", "Spades♠"};

        ArrayList poker = new ArrayList();

        while (poker.size() < 52) {
            for (int j = 0; j < color.length; j++) {
                for (int i = 0; i < num.length; i++) {
                    poker.add(color[j] + " " + num[i]);

                }

            }
        }
        poker.add("Red Joker");
        poker.add("Black Joker");
//        System.out.println(poker);

        //2.
        Collections.shuffle(poker);
//        System.out.println(poker);
        //3.
        ArrayList Tom = new ArrayList<>();
        ArrayList Jerry = new ArrayList<>();
        ArrayList Me = new ArrayList<>();
        ArrayList lastCards = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i));
            } else if (i % 3 == 0) {
                Tom.add(poker.get(i));

            } else if (i % 3 == 1) {
                Jerry.add(poker.get(i));
            } else if (i % 3 == 2) {
                Me.add(poker.get(i));
            }

        }


        //4.
        System.out.println("Tom:"+Tom.size()+"\n"+Tom);
        System.out.println("Jerry:"+Jerry.size()+"\n"+Jerry);
        System.out.println("Me:"+Me.size()+"\n"+Me);
        System.out.println("Last Cards:"+lastCards.size()+"\n"+lastCards);

    }
}
