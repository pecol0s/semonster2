package semonster2;
import java.util.Random;

public class Monster{
  String name;
  int rare;

  public String toStoring(){
    return this.name + ":レア度["+this.rare+"]";
  }

  String summonMonster(int number){


    String monster[] = {"スライム","サハギン","ドラゴン","デュラハン","シーサーペント"};
    return monster[number];
  }

  String evoMonster(String name){

    return "キング"+name;
  }

  Monster(){
    
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
    if(this.rare>=3){
      this.name=this.evoMonster(this.name);
    }
  }
}
