class PantalladeInicio implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladeInicio(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
void forma_y_funcionamiento() {
    switch(forma_y_funcionamiento) {
    
      case 0:
      
      //Forma
pushMatrix();
image(pantalla_de_inicio, 0, 0, 1360, 700);
popMatrix();

//Funcionamiento
keyPressed();
  if (key == 'i' || key == 'I') {
      musica_los_increibles.trigger();
    pantalla = 1;
  }
  
      break;
    }
  }
}
