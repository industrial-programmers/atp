package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity 
public class TestRun extends Model {
	private static final long serialVersionUID = -9066204549812169486L;

	@Id
	@Constraints.Min(10)
	public Long id;

	@Constraints.Required
	public String name;

	@Constraints.Required
	public Run run;

	@Constraints.Required
	public Long runNumber;

	@Constraints.Required
	public TestCase testCase;

	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date date = new Date();

	@Constraints.Required
	public Tester tester;

	@Constraints.Required
	public boolean passed;
	
	public static Finder<Long, TestRun> find = new Finder<Long, TestRun>(Long.class, TestRun.class); 
}