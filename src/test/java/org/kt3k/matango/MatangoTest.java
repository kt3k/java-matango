package org.kt3k.matango;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class MatangoTest {
    @Test public void testSomeLibraryMethod() {
        Map<String, String> res = Matango.parse("foo,bar=baz");
        assertTrue(res.containsKey("foo"));
        assertTrue(res.containsKey("bar"));
        assertTrue(!res.containsKey("baz"));

        assertEquals(null, res.get("foo"));
        assertEquals("baz", res.get("bar"));
    }

    // TODO: test error cases
}
