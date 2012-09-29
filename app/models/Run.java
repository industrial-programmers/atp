package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity 
public class Run extends Model {
	private static final long serialVersionUID = -906620454984469486L;

	@Id
	@Constraints.Min(10)
	public Long id;

	@Constraints.Required
	public String name;

	public static Finder<Long, Run> find = new Finder<Long, Run>(Long.class, Run.class); 
}