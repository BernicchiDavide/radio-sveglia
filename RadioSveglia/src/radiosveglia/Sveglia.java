/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiosveglia;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.sound.sampled.*;

/**
 *
 * @author bernicchi.davide
 */
public class Sveglia {
    Orario ora;
    Orario oraS;
    int volume;
    Date data;
    
    void set_ora(int ore, int min){
        ora= new Orario(ore, min);
    }
    void set_oraSveglia(int ore, int min){
        oraS= new Orario(ore, min);
    }
    String get_orario(){
        return ora.get_time();
    }
    
    String get_orarioS(){
        return oraS.get_time();
    }
    int get_min(){
        return ora.get_min();
    }
    int get_ora(){
        return ora.get_ora();
    }
    int get_minS(){
        return oraS.get_min();
    }
    int get_oraS(){
        return oraS.get_ora();
    }
    int get_timerMS(){
        return 1000 * ((oraS.get_ora() - ora.get_ora()) * 60 + (oraS.get_min() - ora.get_min()));
    }
    void aumentoMin(){
        if (ora.get_min() <59){
            ora.aumentoMinuti();
        }
        else {
            ora.set_min(0);
            aumentoOra();
        }
    }
    void aumentoOra(){
        if (ora.get_ora() < 24){
            ora.set_ora(0);
            data.add_day();
            
        }
        else {
            ora.aumentoOre();
        }
    }
    void set_volume(int v){
        volume = v;
    }

    String get_volume() {
        return ""+volume;
    }
    void set_data(Date d){
        data = new Date("01","01","01");
    }
    /// ipotetico codice pe il suoo della sveglia
   /*  public void play() {
        new Thread(() -> {
            try {
                File soundFile = new File("MF_Doom_-_Crosshairs_Prod._By_Danger_Mouse");

                // Load the sound file
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                // Get a Clip object
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);

                // Start playback
                clip.start();

                // Wait for the clip to finish playing
                while (clip.isRunning()) {
                    Thread.sleep(10);
                }

                // Clean up resources
                clip.close();
                audioIn.close();

            } catch (UnsupportedAudioFileException e) {
                System.err.println("Unsupported audio file: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error loading sound file: " + e.getMessage());
            } catch (LineUnavailableException e) {
                System.err.println("Audio line unavailable: " + e.getMessage());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }*/

}
