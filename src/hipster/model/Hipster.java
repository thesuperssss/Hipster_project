package hipster.model;

/**
 * Creates the Hipster object.
 * 
 * @author jwil1446
 * @version 1.1 added overloaded constructor and documentation
 */
public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String[] hipsterBooks;

	/**
	 * Creates a default Hipster object with value based on me.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Jacob";
		hipsterType = "not a hipster";
		hipsterPhrase = "hello";
		
		fillTheBooks();
	}

	/**
	 * creates a Hipster Object with the specified parameters to fill in the
	 * component data member.
	 * 
	 * @param name
	 *            The name of the created Hipster.
	 * @param hipsterType
	 *            The type of the created Hipster.
	 * @param hipsterPhrase
	 *            The catch-phrase of this created Hipster.
	 * 
	 * @param hipsterBooks
	 *            An array of books for the Hipster.
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * List of Books in hipsterBooks
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Enders Game";
		hipsterBooks[1] = "The Dictionary";
		hipsterBooks[2] = "Holes";
		hipsterBooks[3] = "Golden compass";
		hipsterBooks[4] = "Alcatraz Versus the Evil Librarians";
	}

	/**
	 * Getter for getName
	 * @return name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Getter for hipsterTpe
	 * 
	 * @return hipsterType
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * getter for HipsterPhrase
	 * 
	 * @return hipsterPhrase
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * Getter for hipsterBooks
	 * 
	 * @return hipsterBooks
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	/**
	 * Setter for name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Setter for hipsterType
	 * 
	 * @param hipsterType
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * Setter for hipsterPhrase
	 * 
	 * @param hipsterPhrase
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * Setter for hipsterBooks
	 * 
	 * @param hipsterBooks
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
}
