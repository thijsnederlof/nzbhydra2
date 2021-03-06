package org.nzbhydra.mapping.newznab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NewznabParametersTest {


    @Test
    public void testHashCode() throws Exception {
        NewznabParameters testee1 = new NewznabParameters();
        testee1.setQ("q");

        NewznabParameters testee2 = new NewznabParameters();
        testee2.setQ("q");

        assertEquals(testee1.cacheKey(), testee2.cacheKey());

        testee2.setQ("anotherQ");
        assertNotEquals(testee1.cacheKey(), testee2.cacheKey());
    }


}