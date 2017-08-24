package MotionlessElement;

import java.util.ArrayList;

import MotionElement.Dimension;
import MotionElement.IMobile;

public interface ITronModel {
	public void buildArea(final Dimension dimension);

	public IArea getArea();

	public void addMobile(final IMobile mobile);

	public void removeMobile(final IMobile mobile);

	public ArrayList<IMobile> getMobiles();

	public IMobile getMobileByPlayer(int player);

	public void setMobilesHavesMoved();
}