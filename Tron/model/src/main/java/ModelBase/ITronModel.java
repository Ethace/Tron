package ModelBase;

import java.awt.Dimension;
import java.util.ArrayList;

public interface ITronModel {

	public void buildArea(final Dimension dimension);

	public void addMobile(final IMobile mobile);

	public void removeMobile(final IMobile mobile);

	public ArrayList<IMobile> getMobiles();

	public IMobile getMobileByPlayer(int player);

	public void setMobilesHavesMoved();

	IArea getArea();
}