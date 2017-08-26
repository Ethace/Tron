package MotionlessElement;

import ModelBase.Dimension;
import ModelBase.Position;

public class BlocMur extends NotMobile {
	private static int		WIDTH	= 50;
	private static int		HEIGHT	= 50;
	private static String	IMAGE	= "BlocMur";

	public BlocMur(final Position position) {
		super(position, new Dimension(WIDTH, HEIGHT), IMAGE);
	}

}
