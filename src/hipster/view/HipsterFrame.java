package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	/**
	 * Method to setup what your frame will look like
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000,450);
		this.setVisible(true);
	}
}
