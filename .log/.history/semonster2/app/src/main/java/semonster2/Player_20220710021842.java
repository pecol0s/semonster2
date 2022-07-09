package semonster2;

import java.util.ArrayList;
import java.util.Random;

public class Player {

  String name;
  ArrayList<Monster> monsterDeck = new ArrayList<>();

  Player(String playerName) {
    this.name = playerName;
  }

  public void drawMonsters() {
    Random rand = new Random();
    for (int i = 0; i < 5; i++) {
      Monster a = new Monster(rand.nextInt(5), rand.nextInt(5));
      // System.out.println(a.name);
      this.monsterDeck.add(a);
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m.name + ":レア度[" + m.rare + "]" + "\n");
    }
    return sb.toString();
  }
}
