import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An algorithm is an abstraction of techniques like the
 * calculation of the Persons coefficient or Li'S ICQ. It
 * allows to separate initialization and execution of
 * such an algorithm.
 */
public abstract class Algorithm {

	/* a list of warnings that can be filled by the
	 *  execute method
	 */
	List<Warning> warnings = new ArrayList<Warning>();

	/**
	 * Executes the previously initialized {@link Algorithm}.
	 */
	public abstract void execute(DataContainer container) throws MissingPreconditionException;

	/**
	 * Gets a reference to the warnings.
	 *
	 * @return A reference to the warnings list
	 */
	public List<Warning> getWarningns() {
		return warnings;
	}

	/**
	 * Adds a warning to the list of warnings.
	 *
	 * @param shortMsg A short descriptive message
	 * @param longMsg A long message
	 */
	protected void addWarning(String shortMsg, String longMsg) {
		warnings.add( new Warning(shortMsg, longMsg) );
	}
}
