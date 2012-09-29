package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity 
public class TestCategory extends Model {
	private static final long serialVersionUID = -9066204549812169486L;

	@Id
	@Constraints.Min(10)
	public Long id;

	@Constraints.Required
	public String name;
	
	public static Finder<Long, TestCategory> find = new Finder<Long, TestCategory>(Long.class, TestCategory.class); 
}