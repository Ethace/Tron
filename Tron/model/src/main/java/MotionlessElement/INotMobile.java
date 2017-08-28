package MotionlessElement;

import java.awt.Image;

import ModelBase.Dimension;
import ModelBase.IArea;
import ModelBase.Position;

public interface INotMobile {
	public void placeInArea(final IArea area);

	public Dimension getDimension();

	public Position getPosition();

	public Image[] getImages();
}
