package MotionlessElement;

import java.awt.Image;

import ModelBase.IArea;
import MotionElement.Dimension;
import MotionElement.Position;

public class NotMobile implements INotMobile {
	private final Position	position;
	private final Dimension	dimension;
	private Image			images[];

	public Image[] getImages() {
		return this.images;
	}

	public Position getPosition() {
		return this.position;
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public NotMobile(final Position position, final Dimension dimension, final String image) {
		this.position = position;
		this.dimension = dimension;
	}

	public void placeInArea(final IArea area) {
		this.position.setMaxX(area.getDimension().getWidth());
		this.position.setMaxY(area.getDimension().getHeight());
	}
}