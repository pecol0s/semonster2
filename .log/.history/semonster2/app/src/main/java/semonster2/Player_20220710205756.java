package semonster2;

import java.util.ArrayList;

public class Player {

  String name;
  int hp;
  ArrayList<Monster> monsterDeck = new ArrayList<>();

  Player(String playerName, int hp) {
    this.name = playerName;
    this.hp = hp;
  }

  public void drawMonsters(int a[], int b[]) {

    for (int i = 0; i < 8; i++) {
      Monster m = new Monster(a[i], b[i]);
      // System.out.println(a.name);
      this.monsterDeck.add(m);
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    sb.append("Deck's HP:" + this.hp + "\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m.name + ":レア度[" + m.rare + "]" + "\n");
    }
    return sb.toString();
  }
}
