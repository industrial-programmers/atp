package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity 
public class Tester extends Model {
	private static final long serialVersionUID = -906620454984469486L;

	@Id
	@Constraints.Min(10)
	public Long id;

	@Constraints.Required
	public String name;

	public static Finder<Long, Tester> find = new Finder<Long, Tester>(Long.class, Tester.class); 
}