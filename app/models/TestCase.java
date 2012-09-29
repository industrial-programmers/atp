package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity 
public class TestCase extends Model {
	private static final long serialVersionUID = -9066204349841369486L;

	@Id
	@Constraints.Min(10)
	public Long id;

	@Constraints.Required
	public String title;

	@Constraints.Required
	public TestCategory category;

	@Constraints.Required
	public String purpose;

	@Constraints.Required
	public TestNature nature;

	@Constraints.Required
	public TestMode mode;

	@Constraints.Required
	public String preConditions;

	@Constraints.Required
	public String testDescriptions;

	@Constraints.Required
	public String passCriteria;

	public String postConditions;

	public static Finder<Long, TestCase> find = new Finder<Long, TestCase>(Long.class, TestCase.class); 
}