import Java.util.Random;

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

  Monster(){
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
  }
}
