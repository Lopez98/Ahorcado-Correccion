/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Estudiantes
 */
public class Tablero {
    char palabra[];
    String stringPalabra;
    char palabraJugador[];
    String stringJugador;
    String respuesta;
    int caracteres;
    char letra;
    int vidas;
    
    int contLetras;
    
    void llenarPalabra(){
        this.vidas = 6;
        this.palabra = stringPalabra.toCharArray();
        caracteres = this.palabra.length;
        palabraJugador = new char[caracteres];
        for(int i=0; i<caracteres; i++){
            palabraJugador[i]= '*';
        }
        this.respuesta = "";
        this.contLetras = 0;
    }
    
    String mostrarJuego(){
        stringJugador = String.valueOf(palabraJugador);
        
        return stringJugador;
    }
    
    int analizarLetra(){
        int cont = 0;
        
        for(int i=0; i<caracteres; i++){
            if (palabra[i]== letra){
                palabraJugador[i] = letra;
                contLetras += 1;
                cont -= 1;
            }
        }
        
        if (cont==0){
            vidas -= 1;
        }
        
        if(vidas==0){
            return 0;
        }
        
        if(vidas > 0 && contLetras==caracteres){
            return 1;
        }
        
        return 2;
    }
    
    int analizarPalabra(){
        if (stringPalabra.equals(respuesta)){
            return 1;
        }
        
        if(stringPalabra.equals(respuesta)==false){
            respuesta = "";
            vidas -= 1;
        }
        
        if (vidas==0){
            return 0;
        }
        
        return 2;
    }
    
    void iniciar(){
        llenarPalabra();
        
    }
    
    
}
