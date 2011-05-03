package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();

		objectSet.add(new DomainObject("Helga","Kommentar"));
		objectSet.add(new DomainObject("Walter","Kommentar"));
		objectSet.add(new DomainObject("Hannah","Kommentar"));
		objectSet.add(new DomainObject("Paul","Kommentar"));
		objectSet.add(new DomainObject("Claudia","Kommentar"));

		for (DomainObject domainObject : objectSet) {
  			LOGGER.debug(domainObject.id);
		}
	}

}
