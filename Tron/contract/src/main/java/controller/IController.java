package controller;

import java.sql.SQLException;

import ModelBase.IModel;
import view.IView;

/**
 * <h1>The Interface IController.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {

	public void play() throws SQLException, InterruptedException;

	/**
	 * Gets the order performer.
	 *
	 * @return the order performer
	 */
	public IOrderPerformer getOrderPerformer();

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel();

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IView getView();
}
