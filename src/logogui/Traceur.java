/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.shape.Line;

public class Traceur {
	private static Traceur instance;
	private Group g;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean isCrayonLeve = false;
	
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
			g.getChildren().add(new Line(x1,y1,x2,y2));
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
			g.getChildren().add(new Line(x1,y1,x2,y2));
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
		posx = initx + r1;
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
		// Recuperation du controlleur
		FXMLLoader loader = new FXMLLoader(
				  getClass().getResource(
				    "customerDialog.fxml"
				  )
				);
		LogoController controller = loader.<LogoController>getController();
		// Il y a une methode pour vider l'ecran dans le controlleur
		controller.clearView();
	}

	public void changeCouleur() {
		// TODO Auto-generated method stub
		
	}
	
}
