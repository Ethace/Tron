package ModelBase;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import MotionElement.Dimension;

public class Arena implements IArea {
	private static String	IMAGE	= "arena.png";
	private final Dimension	dimension;
	private Image			image;

	public Arena(final Dimension dimension) {
		this.dimension = dimension;
		try {
			this.image = ImageIO.read(new File("images/" + IMAGE));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Dimension getDimension() {
		return this.dimension;
	}

	@Override
	public int getWidth() {
		return this.getDimension().getWidth();
	}

	@Override
	public int getHeight() {
		return this.getDimension().getHeight();
	}

	@Override
	public Image getImage() {
		return this.image;
	}
}
