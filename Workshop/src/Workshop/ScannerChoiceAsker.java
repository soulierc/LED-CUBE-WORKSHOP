package Workshop;
import java.util.Scanner;


/**
 * @author clement
 *
 */
public class ScannerChoiceAsker implements ChoiceAsker {

	/**
	 * TODO : make an interface for this
	 */
	private Scanner sc;
	
	public ScannerChoiceAsker()
	{
		sc = new Scanner(System.in);
	}
	
	@Override
	public int askInteger() {
		return this.sc.nextInt();
	}

}
