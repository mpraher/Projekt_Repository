package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
				
		objectSet.add(DomainFactory.createDomainObject("Helga","Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Walter","Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Hannah","Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Paul","Kommentar"));
		objectSet.add(DomainFactory.createDomainObject("Claudia","Kommentar"));

		for (DomainObject domainObject : objectSet) {
  			LOGGER.debug(domainObject.toString());
		}
	}

}
