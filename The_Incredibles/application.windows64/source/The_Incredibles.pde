import ddf.minim.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
import ddf.minim.signals.*;
import ddf.minim.spi.*;
import ddf.minim.ugens.*;

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

void setup() {
  size(1360, 700);
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

void draw() {
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

void inicio() {
  inicio.forma_y_funcionamiento();
}

void seleccion() {
  seleccion.forma_y_funcionamiento();
 }

void pelea() {
  pelea.forma_y_funcionamiento();
}

void gameover() {
  fin.forma_y_funcionamiento();
}
