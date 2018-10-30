class CElastigirl implements Carta{
  int ataque;
  int danio;
  int forma;
  CElastigirl(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  void forma() {
    switch(forma) {
      case 1:

pushMatrix();
translate(343, 153);
image(elastigirl, 0, 0, 161.03, 351.41);
popMatrix();

      break;
    }
  }
  
  void gamer_1() {
    switch(seleccion_personaje_1) {
      case 1:
      
pushMatrix();
translate(953, 155);
image(elastigirl, 0, 0, 161.03, 351.41);
popMatrix();

      break;
    }
  }
  
  void gamer_2() {
    switch(seleccion_personaje_2) {
      case 1:
      
pushMatrix();
translate(308, 170);
image(elastigirl, 0, 0, 161.03, 351.41);
popMatrix();

      break;
    }
  }
  
  int danio(){
    return danio;
  }
}
