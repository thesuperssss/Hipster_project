package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * controller for the hipster project
 * 
 * @author jwil1446
 * @version 1.0 added start and constructor
 */
public class HipsterController
{
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster[] classHipsters;
	private int hipsterCount;
	/**
	 * Controller for the HipsterController class
	 */
	public Hipster[] getClassHipsters()
	{
		return classHipsters;
	}
	
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[4];
		hipsterCount = 0;
	}
	/**
	 * Getter for selfHipster
	 * @return SelfHipster
	 */
	public Hipster getSelfHipster()
	{

		return selfHipster;
	}
	/**
	 * Start method for HipsterController
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);

	}
	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * @param position The location in the array. It must be between 0 and classHipster.length.
	 * @return The Hipster at the position in the array
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		if(position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}
		return currentHipster;
	}
	/**
	 * Finds a random Hipster.
	 * @return currentHipster.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
		return currentHipster;
	}
	
	
	/**
	 * Creates and adds a Hipster to the array of class Hipsters from the specified values.
	 * @param name The name of the created Hipster.
	 * @param hipsterType The type of the created Hipster.
	 * @param hipsterPhrase The catch-phrase of this created Hipster.
	 * @param hipsterbooks An array of books for the Hipster.
	 */
	public void addHipster(String[] books, String name, String type, String phrase)
	{
		if (hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class is full you are too mainstrem to be added");
		}
	}
}
