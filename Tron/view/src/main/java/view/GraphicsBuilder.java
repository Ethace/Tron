package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.gameframe.IGraphicsBuilder;

class GraphicsBuilder implements IGraphicsBuilder {
	private final ITronModel	tronModel;

	private BufferedImage		emptyArena;

	public GraphicsBuilder(final ITronModel tronModel) {
		this.tronModel = tronModel;
		this.buildEmptyArena();
	}

	@Override
	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
		graphics.drawImage(this.emptyArena, 0, 0, observer);

		for (final IMobile mobile : this.tronModel.getMobiles()) {
			this.drawMobile(mobile, graphics, observer);
		}
	}

	@Override
	public int getGlobalWidth() {
		return this.tronModel.getArea().getWidth();
	}

	@Override
	public int getGlobalHeight() {
		return this.tronModel.getArea().getHeight();
	}

	private void buildEmptyArena() {
		this.emptyArena = new BufferedImage(this.tronModel.getArea().getWidth(), this.tronModel.getArea().getHeight(),
		        BufferedImage.TYPE_INT_RGB);
		final Graphics2D graphics = (Graphics2D) this.emptyArena.getGraphics();
		graphics.drawImage(this.tronModel.getArea().getImage(), 0, 0, this.tronModel.getArea().getWidth(),
		        this.tronModel.getArea().getHeight(), null);
	}

}
