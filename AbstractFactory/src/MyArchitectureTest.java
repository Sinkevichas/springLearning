import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;


import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.junit.Test;

public class MyArchitectureTest {

	@Test
	    public void some_architecture_rule() {
	        JavaClasses importedClasses = new ClassFileImporter().importPackages("factory.impl");
	    
	        ArchRule rule = classes().that().haveSimpleNameEndingWith("Factory").should()
	        		.haveSimpleNameNotStartingWith("Russ");
	        rule.check(importedClasses);
	    }

}
