class CVioletaAlterna implements Carta{
  int ataque;
  int danio;
  int forma;
  CVioletaAlterna(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  void forma() {
    switch(forma) {
      case 4:
      
pushMatrix();
translate(1113, 156);
image(violeta_alterna, 0, 0, 161.03, 355.87);
popMatrix();

      break;
    }
  }
  
  void gamer_1() {
    switch(seleccion_personaje_1) {
      case 4:
      
pushMatrix();
translate(820, 161);
image(violeta_alterna, 0, 0, 161.03, 355.87);
popMatrix();

      break;
    }
  }
  
  void gamer_2() {
    switch(seleccion_personaje_2) {
      case 4:
      
pushMatrix();
translate(343, 153);
image(violeta_alterna, 0, 0, 161.03, 355.87);
popMatrix();

      break;
    }
  }
  
  int danio(){
    return danio;
  }
}
