package jus.aoo.turtle;

import jus.aoo.geometrie.*;

/**
 * @author Morat 
 */
public class NewObstacle extends NewFigure {
	/** les points caractérisant l'obstacle */
	protected Point  p1,p2;
	/** Ajout d'un point non définitif
	 * @param p le point
	 */
	public void changePoint(Point p) {
		if(etape()==1) {point2(p);}
	}
	/** Ajout d'un point définitif
	 * @param p le point
	 */
	public void newPoint(Point p) {
		if(etape()==0){point1(p);
		}else if(etape()==1){
			completed();
			try{
				setFigure(new Obstacle(p1,p2));
			}catch(Exception e){
				nextEtape();
				throw e;
			}
		}
		nextEtape();
	}
  /** acquistion du premier point
   * @param p le point
   */
  protected void point1(Point p) {
		p1=new Point(p);
		setFigure(new Segment(p1,p1));
	}
  /** acquistion du second point
   * @param p le point
   */
	protected void point2(Point p) {
		p2=new Point(p);
		setFigure(new Segment(p1,p2));
	}
}
