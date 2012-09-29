package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

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

	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date dueDate = new Date();

	public static Finder<Long, TestCase> find = new Finder<Long, TestCase>(Long.class, TestCase.class); 
}