package at.jku.ce;

public class DomainObject {

	private String uuid=UUID.randomUUID().toString();
	private String name;
        private String comment;

	/**
 	 * Default constructor
 	 */	
	protected DomainObject() {
		super();
	}

	protected DomainObject(String uuid, String comment) {
  		super();
  		this.uuid = uuid;
		this.comment=comment;
	}

	public String getUuId() {
		return id;
	}

        public String getComment() {
          	return comment;
        }

        public void setComment(final String comment) {
          	this.comment = comment;
        }

        public String getName() {
	   	return name;
	}	

	public void setName(final String name) {
	   	this.name = name;
       
	}

}

