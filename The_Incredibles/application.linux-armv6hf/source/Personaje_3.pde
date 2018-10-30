class CDash implements Carta{
  int ataque;
  int danio;
  int forma;
  CDash(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  void forma() {
    switch(forma) {
      case 2:
      
pushMatrix();
translate(575, 158);
image(dash, 0, 0, 214.39, 367.29);
popMatrix();

      break;
    }
  }
  
  void gamer_1() {
    switch(seleccion_personaje_1) {
      case 2:
      
pushMatrix();
translate(923, 155);
image(dash, 0, 0, 214.39, 367.29);
popMatrix();

      break;
    }
  }
  
  void gamer_2() {
    switch(seleccion_personaje_2) {
      case 2:
      
pushMatrix();
translate(308, 150);
image(dash, 0, 0, 214.39, 367.29);
popMatrix();

      break;
    }
  }
  
  int danio(){
    return danio;
  }
}
