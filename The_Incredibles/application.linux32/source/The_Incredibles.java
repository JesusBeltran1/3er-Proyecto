import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import ddf.minim.analysis.*; 
import ddf.minim.effects.*; 
import ddf.minim.signals.*; 
import ddf.minim.spi.*; 
import ddf.minim.ugens.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class The_Incredibles extends PApplet {








PFont titulo_y_seleccion, texto_de_danio;
int pantalla = 0;
boolean sujeto_1 = false;
boolean sujeto_2 = false;
int turno = 0;
int danio_sujeto_1, danio_sujeto_2, seleccion_personaje_1, seleccion_personaje_2;
PImage pantalla_de_inicio, pantalla_de_seleccion, mr_increible, elastigirl, dash, jack_jack, violeta_alterna, pantalla_de_pelea, pantalla_de_fin;

Minim musica;
AudioSample musica_los_increibles;

Carta personaje1j1;
Carta personaje2j1;
Carta personaje3j1;
Carta personaje4j1;
Carta personaje5j1;

Carta personaje1j2;
Carta personaje2j2;
Carta personaje3j2;
Carta personaje4j2;
Carta personaje5j2;

Carta jugador1;
Carta jugador2;

Pantalla inicio;
Pantalla seleccion;
Pantalla pelea;
Pantalla fin;

public void setup() {
  
  musica = new Minim(this);
  musica_los_increibles = musica.loadSample("incredibles theme song.mp3", 1024);
  titulo_y_seleccion = loadFont("Impact-48.vlw");
  texto_de_danio = loadFont("Calibri-LightItalic-48.vlw");
  pantalla_de_inicio = loadImage("Pantalla de Inicio.png");
  pantalla_de_seleccion = loadImage("Pantalla de Selección.png");
  mr_increible = loadImage("Mr. Increible.png");
  elastigirl = loadImage("Elastigirl.png");
  dash = loadImage("Dash.png");
  jack_jack = loadImage("Jack Jack.png");
  violeta_alterna = loadImage("Violeta Alterna.png");
  pantalla_de_pelea = loadImage("Pantalla de Pelea.png");
  pantalla_de_fin = loadImage("Pantalla de Fin.png");
  
  personaje1j1 = new CMrIncreible(20, 1, 0);
  personaje2j1 = new CElastigirl(15, 1, 1);
  personaje3j1 = new CDash(20, 1, 2);
  personaje4j1 = new CJackJack(15, 1, 3);
  personaje5j1 = new CVioletaAlterna(20, 1, 4);

  personaje1j2 = new CMrIncreible(20, 1, 0);
  personaje2j2 = new CElastigirl(15, 1, 1);
  personaje3j2 = new CDash(20, 1, 2);
  personaje4j2 = new CJackJack(15, 1, 3);
  personaje5j2 = new CVioletaAlterna(20, 1, 4);
  
  inicio = new PantalladeInicio(0);
  seleccion = new PantalladeSeleccion(1);
  pelea = new PantalladePelea(2);
  fin = new PantalladeFin(3);
}

public void draw() {
  switch(pantalla) {
    case 0:
     inicio();
    break;
    
    case 1:
     seleccion();
    break;
    
    case 2:
     pelea();
    break;
    
    case 3:
     gameover();
    break;
  } 
}

public void inicio() {
  inicio.forma_y_funcionamiento();
}

public void seleccion() {
  seleccion.forma_y_funcionamiento();
 }

public void pelea() {
  pelea.forma_y_funcionamiento();
}

public void gameover() {
  fin.forma_y_funcionamiento();
}
interface Carta {
  public void forma();
  public void gamer_1();
  public void gamer_2();
  public int danio();  
}
interface Pantalla {
  public void forma_y_funcionamiento();  
}
class PantalladeFin implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladeFin(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
public void forma_y_funcionamiento() {
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
class PantalladeInicio implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladeInicio(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
public void forma_y_funcionamiento() {
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
class PantalladePelea implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladePelea(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
public void forma_y_funcionamiento() {
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
  fill(0xffEAE700);
  rect(40, 200, (danio_sujeto_1*1), 30);
  popMatrix();
  
  if (danio_sujeto_1 >= 100 || danio_sujeto_2 >= 100) {
    pantalla = 3;
  }

  //Barra de Daño del J2
  pushMatrix();
  fill(0xff7200AD);
  rect(1120, 200, (danio_sujeto_2*1), 30);
  popMatrix();
  
  if (danio_sujeto_1 >= 100 || danio_sujeto_2 >= 100) {
    pantalla = 3;
  }
  
      break;
    }
  }
}
class PantalladeSeleccion implements Pantalla{
  int forma_y_funcionamiento;
  
  PantalladeSeleccion(int forma_y_funcionamiento_) {
    forma_y_funcionamiento = forma_y_funcionamiento_;
  }
  
public void forma_y_funcionamiento() {
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
class CMrIncreible implements Carta{
  int ataque;
  int danio;
  int forma;
  CMrIncreible(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
public void forma() {
    switch(forma) {
    case 0:
      
pushMatrix();
translate(58, 165);
image(mr_increible, 0, 0, 214.39f, 341.8f);
popMatrix();

      break;
    }
  }
  
  public void gamer_1() {
    switch(seleccion_personaje_1) {
    case 0:
      
pushMatrix();
translate(848, 185);
image(mr_increible, 0, 0, 214.39f, 341.8f);
popMatrix();

      break;
    }
  }

  public void gamer_2() {
    switch(seleccion_personaje_2) {
    case 0:
      
pushMatrix();
translate(308, 170);
image(mr_increible, 0, 0, 214.39f, 341.8f);
popMatrix();

      break;
    }
  }
  
  public int danio(){
    return danio;
  }
}
class CElastigirl implements Carta{
  int ataque;
  int danio;
  int forma;
  CElastigirl(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  public void forma() {
    switch(forma) {
      case 1:

pushMatrix();
translate(343, 153);
image(elastigirl, 0, 0, 161.03f, 351.41f);
popMatrix();

      break;
    }
  }
  
  public void gamer_1() {
    switch(seleccion_personaje_1) {
      case 1:
      
pushMatrix();
translate(953, 155);
image(elastigirl, 0, 0, 161.03f, 351.41f);
popMatrix();

      break;
    }
  }
  
  public void gamer_2() {
    switch(seleccion_personaje_2) {
      case 1:
      
pushMatrix();
translate(308, 170);
image(elastigirl, 0, 0, 161.03f, 351.41f);
popMatrix();

      break;
    }
  }
  
  public int danio(){
    return danio;
  }
}
class CDash implements Carta{
  int ataque;
  int danio;
  int forma;
  CDash(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  public void forma() {
    switch(forma) {
      case 2:
      
pushMatrix();
translate(575, 158);
image(dash, 0, 0, 214.39f, 367.29f);
popMatrix();

      break;
    }
  }
  
  public void gamer_1() {
    switch(seleccion_personaje_1) {
      case 2:
      
pushMatrix();
translate(923, 155);
image(dash, 0, 0, 214.39f, 367.29f);
popMatrix();

      break;
    }
  }
  
  public void gamer_2() {
    switch(seleccion_personaje_2) {
      case 2:
      
pushMatrix();
translate(308, 150);
image(dash, 0, 0, 214.39f, 367.29f);
popMatrix();

      break;
    }
  }
  
  public int danio(){
    return danio;
  }
}
class CJackJack implements Carta{
  int ataque;
  int danio;
  int forma;
  CJackJack(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  public void forma() {
    switch(forma) {
      case 3:
      
pushMatrix();
translate(820, 161);
image(jack_jack, 0, 0, 236.34f, 340.23f);
popMatrix();

      break;
    }
  }
  
  public void gamer_1() {
    switch(seleccion_personaje_1) {
      case 3:
      
pushMatrix();
translate(820, 161);
image(jack_jack, 0, 0, 236.34f, 340.23f);
popMatrix();

      break;
    }
  }
  
  public void gamer_2() {
    switch(seleccion_personaje_2) {
      case 3:
      
pushMatrix();
translate(343, 163);
image(jack_jack, 0, 0, 236.34f, 340.23f);
popMatrix();

      break;
    }
  }
  
  public int danio(){
    return danio;
  }
}
class CVioletaAlterna implements Carta{
  int ataque;
  int danio;
  int forma;
  CVioletaAlterna(int ataque_, int danio_, int forma_) {
    ataque = ataque_;
    danio = danio_;
    forma = forma_;
  }
  
  public void forma() {
    switch(forma) {
      case 4:
      
pushMatrix();
translate(1113, 156);
image(violeta_alterna, 0, 0, 161.03f, 355.87f);
popMatrix();

      break;
    }
  }
  
  public void gamer_1() {
    switch(seleccion_personaje_1) {
      case 4:
      
pushMatrix();
translate(820, 161);
image(violeta_alterna, 0, 0, 161.03f, 355.87f);
popMatrix();

      break;
    }
  }
  
  public void gamer_2() {
    switch(seleccion_personaje_2) {
      case 4:
      
pushMatrix();
translate(343, 153);
image(violeta_alterna, 0, 0, 161.03f, 355.87f);
popMatrix();

      break;
    }
  }
  
  public int danio(){
    return danio;
  }
}
  public void settings() {  size(1360, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "The_Incredibles" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
