class PantalladePelea implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladePelea(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
void forma_y_funcionamiento() {
    switch(forma_y_funcionamiento) {
    
      case 2:
      
      //Forma
pushMatrix();
image(pantalla_de_pelea, 0, 0, 1360, 700);
popMatrix();

//Funcionamiento
if (jugador1 == personaje1j1) {
    seleccion_personaje_1 = 0;
    personaje1j1.gamer_1();
  }
  
  if (jugador1 == personaje2j1) {
    seleccion_personaje_1 = 1;
    personaje2j1.gamer_1();
  }
  
  if (jugador1 == personaje3j1) {
    seleccion_personaje_1 = 2;
    personaje3j1.gamer_1();
  }
  
  if (jugador1 == personaje4j1) {
    seleccion_personaje_1 = 3;
    personaje4j1.gamer_1();
  }
  
  if (jugador1 == personaje5j1) {
    seleccion_personaje_1 = 4;
    personaje5j1.gamer_1();
  }
  
  //Jugador 2
  if (jugador2 == personaje1j2) {
    seleccion_personaje_2 = 0;
    personaje1j1.gamer_2();
  }
  
  if (jugador2 == personaje2j2) {
    seleccion_personaje_2 = 1;
    personaje2j1.gamer_2();
  }
  
  if (jugador2 == personaje3j2) {
    seleccion_personaje_2 = 2;
    personaje3j1.gamer_2();
  }
  
  if (jugador2 == personaje4j2) {
    seleccion_personaje_2 = 3;
    personaje4j1.gamer_2();
  }
  
  if (jugador2 == personaje5j2) {
    seleccion_personaje_2 = 4;
    personaje5j1.gamer_2();
  }

  switch (turno) {
    case 0:
    
    keyPressed();
    if ((key == 'k' || key == 'K') && turno == 0) {
      danio_sujeto_2 += 10;
      turno = 1;
    }
    
    break;
    
    case 1:
    
    keyPressed();
    if ((key=='l') || (key == 'L') && turno == 1) {
      danio_sujeto_1 += 10;
      turno = 0;
    }
    
    break;
  }

  //Barra de Daño del J1
  pushMatrix();
  fill(#EAE700);
  rect(40, 200, (danio_sujeto_1*1), 30);
  popMatrix();
  
  if (danio_sujeto_1 >= 100 || danio_sujeto_2 >= 100) {
    pantalla = 3;
  }

  //Barra de Daño del J2
  pushMatrix();
  fill(#7200AD);
  rect(1120, 200, (danio_sujeto_2*1), 30);
  popMatrix();
  
  if (danio_sujeto_1 >= 100 || danio_sujeto_2 >= 100) {
    pantalla = 3;
  }
  
      break;
    }
  }
}
