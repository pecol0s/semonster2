package semonster2;

import java.util.ArrayList;

public class Player {

  String name;
  ArrayList<Monster> monsterDeck = new ArrayList<>();

  Player(String playerName){
    this.name = playerName;
  }
}
