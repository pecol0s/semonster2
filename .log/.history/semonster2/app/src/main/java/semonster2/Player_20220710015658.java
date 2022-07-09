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
      this.monsterDeck.add(new Monster(rand.nextInt(5), rand.nextInt(5)));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck" + this.monsterDeck + "\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m);
    }
    return sb.toString();
  }
}
