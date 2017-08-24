package view;

import java.awt.event.KeyEvent;

import Tron_controller.controller.IOrderPerformer;
import jpu2016.gameframe.IEventPerformer;
import tron.controller.IUserOrder;
import tron.controller.Order;
import tron.controller.UserOrder;

public class EventPerformer {

	class EventPerformer implements IEventPerformer {
		private final IOrderPerformer orderPerformer;

		public EventPerformer(final IOrderPerformer orderPerformer) {
			this.orderPerformer = orderPerformer;
		}

		@Override
		public void eventPerform(final KeyEvent keyCode) {
			final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
			if (userOrder != null) {
				this.orderPerformer.orderPerform(userOrder);
			}
		}

		private IUserOrder keyCodeToUserOrder(final int keyCode) {
			IUserOrder userOrder;
			switch (keyCode) {

			case KeyEvent.VK_RIGHT:
				userOrder = new UserOrder(0, Order.RIGHT);
				break;
			case KeyEvent.VK_LEFT:
				userOrder = new UserOrder(0, Order.LEFT);
				break;

			case KeyEvent.VK_D:
				userOrder = new UserOrder(1, Order.RIGHT);
				break;
			case KeyEvent.VK_Q:
				userOrder = new UserOrder(1, Order.LEFT);
				break;
			default:
				userOrder = null;
			}
			return userOrder;
		}
	}

}
