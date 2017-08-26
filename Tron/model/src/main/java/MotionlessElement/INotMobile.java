package MotionlessElement;

import java.awt.Image;

import ModelBase.IArea;
import MotionElement.Dimension;
import MotionElement.Position;

public interface INotMobile {
	public void placeInArea(final IArea area);

	public Dimension getDimension();

	public Position getPosition();

	public Image[] getImages();
}
