package MotionlessElement;

import ModelBase.Dimension;
import ModelBase.Position;

public class BlocBleu extends NotMobile {
	private static int		WIDTH	= 50;
	private static int		HEIGHT	= 50;
	private static String	IMAGE	= "bloc_Bleu";

	public BlocBleu(final Position position) {
		super(position, new Dimension(WIDTH, HEIGHT), IMAGE);
	}

}
