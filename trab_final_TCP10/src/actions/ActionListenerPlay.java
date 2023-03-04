package actions;

import java.awt.event.ActionEvent;
import gui.Gui;
import java.awt.event.ActionListener;

//import org.jfugue.player.Player;
import org.jfugue.pattern.*;
import org.jfugue.player.*;
import gui.components.EditorText;
import gui.components.ProgressBar;
import gui.components.Screen;

public class ActionListenerPlay implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerPlay(/*Argumentos do PLAY*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		EditorText.setTextEditorPane("Oi, meu chapa!\nTudo bem?\n");
		Screen.setTextScreen("PLAY!");
		ProgressBar.updateProgressbar();
		//depois de acabar
		//Bottons.notPlaying(); //colocar qnd Play estiver pronta
		
		//Aqui esta a logica do play, nao consegui fazer rodar ele na classe play
        //deve chamar Play.java aqui, la faz a magia do play acontecer
		Player player = new Player();
		Gui.protectPlay();
        String music = "a a a a5  a5 a5  e e e e5 e5 e5 ";
        String Telphone ="I[SOUNDTRACK] ";
        player.play(music);
  //   music = Telphone.concat(music);
      System.out.print(music);
     // player.play(music);  
      //player.play("T320 A A A A T160  D E F G A B T240  D E F G A B");
	        
        
      
        
        
        } 
	
}	
