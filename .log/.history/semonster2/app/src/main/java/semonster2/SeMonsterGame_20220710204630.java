package semonster2;

import
import java.util.HashMap;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  ArrayList<Monster> randomNumberList = new ArrayList<>();

  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(playerName,50));
  }
}
