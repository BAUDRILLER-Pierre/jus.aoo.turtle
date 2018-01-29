/**
 * J<i>ava</i> U<i>tilities</i> for S<i>tudents</i>
 */
package jus.aoo.geometrie;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * @author morat 
 */
public class TurtleImage extends Image{
	protected boolean show;
	/**
	 * @param arg0
	 * @param arg1
	 * @throws IOException 
	 */
	public TurtleImage(Point arg0, String arg1) throws IOException{this(arg0, ImageIO.read(Image.class.getResource(arg1)));}
	/**
	 * @param arg0
	 * @param arg1
	 * @throws IOException 
	 */
	public TurtleImage(Point arg0, URL arg1) throws IOException{this(arg0, ImageIO.read(arg1));}
	/**
	 * @param arg0
	 * @param arg1
	 */
	public TurtleImage(Point arg0, BufferedImage arg1){
		super(arg0,arg1,arg1.getWidth(),arg1.getHeight());
	}
	/**
	 * fixe la visibilit� de l'image de la tortue.
	 * @param show vrai si visible, faux sinon
	 */
	public void show(boolean show) {this.show=show;}
	/**
	 * affichage de l'image sur le support d'affichage.
	 * @param g le contexte graphique du support d'affichage.
	 */
  public void draw(Graphics g) {if(!show) return;super.draw(g);}
}
