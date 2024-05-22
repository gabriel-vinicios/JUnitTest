package src.test.java;
import junit.framework.JUnit4TestAdapter;
import src.test.java.calculadora.testCalculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testCalculadora.class})
public class TestSuite {
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(TestSuite.class);
    }
}
