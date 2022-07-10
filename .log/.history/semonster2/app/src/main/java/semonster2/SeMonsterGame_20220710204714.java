package semonster2;

import java.util.Random;
import java.util.HashMap;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();

  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(playerName,50));
  }
}
