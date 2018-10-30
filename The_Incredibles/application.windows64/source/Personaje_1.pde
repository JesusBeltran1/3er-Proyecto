class CMrIncreible implements Carta{
  int ataque;
  int danio;
  int forma;
  CMrIncreible(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
void forma() {
    switch(forma) {
    case 0:
      
pushMatrix();
translate(58, 165);
image(mr_increible, 0, 0, 214.39, 341.8);
popMatrix();

      break;
    }
  }
  
  void gamer_1() {
    switch(seleccion_personaje_1) {
    case 0:
      
pushMatrix();
translate(848, 185);
image(mr_increible, 0, 0, 214.39, 341.8);
popMatrix();

      break;
    }
  }

  void gamer_2() {
    switch(seleccion_personaje_2) {
    case 0:
      
pushMatrix();
translate(308, 170);
image(mr_increible, 0, 0, 214.39, 341.8);
popMatrix();

      break;
    }
  }
  
  int danio(){
    return danio;
  }
}
