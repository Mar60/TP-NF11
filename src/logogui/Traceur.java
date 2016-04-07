/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.awt.*;

public class Traceur {
	private static Traceur instance;
	private Group g;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean isCrayonLeve = false;
	private Color lineColor = Color.BLACK;
	
	public Traceur() {
		setTeta();
	}

	public void setGraphics(Group g) {
		this.g = g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(!isCrayonLeve){
			Line tmpLine = new Line(x1,y1,x2,y2);
			tmpLine.setStroke(lineColor);
			g.getChildren().add(tmpLine);
		}
		posx = a;
		posy = b;
	}
	public void recule(double r) {
		double a = posx - r * Math.cos(teta) ;
		double b = posy + r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(!isCrayonLeve){
			Line tmpLine = new Line(x1,y1,x2,y2);
			tmpLine.setStroke(lineColor);
			g.getChildren().add(tmpLine);
		}
		posx = a;
		posy = b;
	}
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}
	
	public void changePos(double r1, double r2){
		posx = initx + toInt(r1);
		posy = inity - toInt(r2);
	}
	
	public void leveCrayon(){
		isCrayonLeve = true;
	}
	
	public void baisseCrayon(){
		isCrayonLeve = false;
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}

	public void videEcran() {
		g.getChildren().clear();
		//TODO see if we put the cursor at the middle of the screen
	}

	public void changeCouleur(double r) {
		int colorIndex = toInt(r) % 8;
		switch (colorIndex){
			case 0 ://noir
				lineColor =Color.BLACK;
				break;
			case 1 ://rouge
				lineColor =Color.RED;
				break;
			case 2 ://vert
				lineColor =Color.GREEN;
				break;
			case 3 ://jaune
				lineColor =Color.YELLOW;
				break;
			case 4 ://bleu
				lineColor =Color.BLUE;
				break;
			case 5 ://violet
				lineColor =Color.PURPLE;
				break;
			case 6 ://bleu clair
				lineColor =Color.LIGHTBLUE;
				break;
			case 7 ://blanc
				lineColor =Color.WHITE;
				break;
			default:
				System.out.println("Error color not valid");
		}
		
	}
	
}
