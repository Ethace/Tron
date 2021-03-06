package ModelBase;

import java.util.ArrayList;
import java.util.Observable;

import MotionElement.IMobile;
import MotionElement.Joueur;

public class TronModel extends Observable implements ITronModel {
	private Arena						arena;
	private final ArrayList<IMobile>	mobiles;

	public TronModel() {
		this.mobiles = new ArrayList<IMobile>();
	}

	@Override
	public IArea getArea() {
		return this.arena;
	}

	@Override
	public void buildArea(final Dimension dimension) {
		this.arena = new Arena(dimension);
	}

	@Override
	public void addMobile(final IMobile mobile) {
		this.mobiles.add(mobile);
		mobile.setTronModel(this);
	}

	@Override
	public void removeMobile(final Joueur joueur) {
		this.mobiles.remove(joueur);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(final int player) {
		for (final IMobile mobile : this.mobiles) {
			if (mobile.isPlayer(player)) {
				return mobile;
			}
		}
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		this.setChanged();
		this.notifyObservers();
	}

}
