class PantalladeSeleccion implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladeSeleccion(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
void forma_y_funcionamiento() {
    switch(forma_y_funcionamiento) {
    
      case 1:
      
      //Forma
pushMatrix();
image(pantalla_de_seleccion, 0, 0, 1360, 700);
personaje1j1.forma();
personaje2j1.forma();
personaje3j1.forma();
personaje4j1.forma();
personaje5j1.forma();
popMatrix();

//Funcionamiento
if (sujeto_1 && sujeto_2) {
    pantalla = 2;
    turno += 0;
  }
  
  if (keyPressed) {
    switch(key) {
      case 'a':
      jugador1 = personaje1j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'A':
      jugador1 = personaje1j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'b':
      jugador1 = personaje2j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'B':
      jugador1 = personaje2j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'c':
      jugador1 = personaje3j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'C':
      jugador1 = personaje3j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'd':
      jugador1 = personaje4j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'D':
      jugador1 = personaje4j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'e':
      jugador1 = personaje5j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'E':
      jugador1 = personaje5j1;
      danio_sujeto_1 = jugador1.danio();
      sujeto_1 = true;
      break;
      
      case 'f':
      jugador2 = personaje1j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'F':
      jugador2 = personaje1j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'g':
      jugador2 = personaje2j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'G':
      jugador2 = personaje2j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'h':
      jugador2 = personaje3j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'H':
      jugador2 = personaje3j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'i':
      jugador2 = personaje4j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'I':
      jugador2 = personaje4j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'j':
      jugador2 = personaje5j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
      
      case 'J':
      jugador2 = personaje5j2;
      danio_sujeto_2 = jugador2.danio();
      sujeto_2 = true;
      break;
    }
  }
  
      break;
    }
  }
}
