package controller;

import java.util.ArrayList;

import ModelBase.ITronModel;
import tron.model.Direction;
import tron.model.IMobile;
import tron.view.IViewSystem;

public class TronController implements IOrderPerformer {
	private static int			TIME_SLEEP	= 30;
	private final ITronModel	tronModel;
	private final boolean		isGameOver	= false;
	private IViewSystem			viewSystem;

	public TronController(final ITronModel dogfightModel) {
		this.tronModel = dogfightModel;
	}

	@Override
	public void orderPerform(final IUserOrder userOrder) {
		if (userOrder != null) {
			final IMobile moto = this.tronModel.getMobileByPlayer(userOrder.getPlayer());
			if (moto != null) {
				Direction direction;
				switch (userOrder.getOrder()) {

				case RIGHT:
					direction = Direction.RIGHT;
					break;

				case LEFT:
					direction = Direction.LEFT;
					break;

				case NOP:
				default:
					direction = this.tronModel.getMobileByPlayer(userOrder.getPlayer()).getDirection();
					break;
				}
				moto.setDirection(direction);
			}
		}
	}

	public void play() {
		this.gameLoop();
		this.viewSystem.displayMessage("Game Over !");
		this.viewSystem.closeAll();
	}

	private void gameLoop() {
		while (!this.isGameOver) {
			try {
				Thread.sleep(TIME_SLEEP);
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			final ArrayList<IMobile> initialMobiles = new ArrayList<IMobile>();
			for (final IMobile mobile : this.tronModel.getMobiles()) {
				initialMobiles.add(mobile);
			}
			for (final IMobile mobile : initialMobiles) {
				mobile.move();

			}
			this.tronModel.setMobilesHavesMoved();
		}
	}

	public void setViewSystem(final IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
}
