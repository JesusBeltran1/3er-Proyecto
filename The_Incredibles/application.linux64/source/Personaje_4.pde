class CJackJack implements Carta{
  int ataque;
  int danio;
  int forma;
  CJackJack(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  void forma() {
    switch(forma) {
      case 3:
      
pushMatrix();
translate(820, 161);
image(jack_jack, 0, 0, 236.34, 340.23);
popMatrix();

      break;
    }
  }
  
  void gamer_1() {
    switch(seleccion_personaje_1) {
      case 3:
      
pushMatrix();
translate(820, 161);
image(jack_jack, 0, 0, 236.34, 340.23);
popMatrix();

      break;
    }
  }
  
  void gamer_2() {
    switch(seleccion_personaje_2) {
      case 3:
      
pushMatrix();
translate(343, 163);
image(jack_jack, 0, 0, 236.34, 340.23);
popMatrix();

      break;
    }
  }
  
  int danio(){
    return danio;
  }
}
