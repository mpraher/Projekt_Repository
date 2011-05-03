package at.jku.ce;

public class DomainObject {

	private String uuid=UUID.randomUUID().toString();
	private String name;
	
	/**
 	 * Default constructor
 	 */	
	public DomainObject() {
		super();
	}

	public DomainObject(String uuid, String comment) {
  		super();
  		this.uuid = uuid;
		this.comment=comment;
	}

	public String getUuId() {
		return id;
	}
}

