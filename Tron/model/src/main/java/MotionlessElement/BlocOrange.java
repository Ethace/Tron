package MotionlessElement;

import ModelBase.Dimension;
import ModelBase.Position;

public class BlocOrange extends NotMobile {
	private static int		WIDTH	= 50;
	private static int		HEIGHT	= 50;
	private static String	IMAGE	= "bloc_Orange";

	public BlocOrange(final Position position) {
		super(position, new Dimension(WIDTH, HEIGHT), IMAGE);
	}

}
