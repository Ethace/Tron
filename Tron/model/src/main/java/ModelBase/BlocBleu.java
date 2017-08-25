package ModelBase;

import MotionElement.Dimension;
import MotionElement.Position;
import MotionlessElement.NotMobile;

public class BlocBleu extends NotMobile {
	private static int		WIDTH	= 50;
	private static int		HEIGHT	= 50;
	private static String	IMAGE	= "BlocBleu";

	public BlocBleu(final Position position) {
		super(position, new Dimension(WIDTH, HEIGHT), IMAGE);
	}

}
