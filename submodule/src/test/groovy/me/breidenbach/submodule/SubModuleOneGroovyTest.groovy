package me.breidenbach.submodule

import static org.hamcrest.MatcherAssert.*
import static org.hamcrest.Matchers.*

/**
 * @author Kevin Breidenbach
 *         Date: 1/20/17
 */
class SubModuleOneGroovyTest extends GroovyTestCase {

    void testSubModuleOne() {
        def subModuleOne = new SubModuleOne()
        assertThat(subModuleOne, is(notNullValue()))
    }
}
