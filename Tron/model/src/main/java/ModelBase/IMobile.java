package ModelBase;

import java.awt.Image;

import MotionElement.Direction;

public interface IMobile {

	public Direction getDirection();

	public void setDirection(final Direction direction);

	public Position getPosition();

	public Dimension getDimension();

	public int getWidth();

	public int getHeight();

	public int getSpeed();

	public Image getImage();

	public void move();

	public void placeInArea(IArea area);

	public boolean isPlayer(int player);

	public void setTronModel(ITronModel dogfightModel);

	public boolean hit();
}
