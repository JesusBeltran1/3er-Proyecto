class PantalladeFin implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladeFin(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
void forma_y_funcionamiento() {
    switch(forma_y_funcionamiento) {
    
      case 3:
      
      //Forma
if (danio_sujeto_1 >= 100) {
    
    pushMatrix();
    
    //Imagen
    image(pantalla_de_fin, 0, 0, 1360, 700);
    
    //Texto De Colores
    textSize(100);
    fill(random(255), random(255), random(255));
    noStroke();
    textFont(texto_de_danio);
    frameRate(15);
    text("Jugador 2", 600, 410);
    fill(random(255), random(255), random(255));
    frameRate(15);
    text("Presione  [I]  para volver a iniciar", 540, 610);
    
    popMatrix();
  }
  
  if (danio_sujeto_2 >= 100) {
    
    pushMatrix();
    
    //Imagen
    image(pantalla_de_fin, 0, 0, 1360, 700);
  
    //Texto De Colores
    textSize(100);
    fill(random(255), random(255), random(255));
    noStroke();
    textFont(texto_de_danio);
    frameRate(15);
    text("Jugador 1", 600, 410);
    fill(random(255), random(255), random(255));
    frameRate(15);
    text("Presione  [I]  para volver a iniciar", 540, 610);
    
    popMatrix();
  }

//Funcionamiento
keyPressed();
  if (key == 'i' || key == 'I') {
    pantalla = 1;
    sujeto_1 = false;
    sujeto_2 = false;
    turno = 0;
    danio_sujeto_1 = 0;
    danio_sujeto_2 = 0;
  }
  
      break;
    }
  }
}
