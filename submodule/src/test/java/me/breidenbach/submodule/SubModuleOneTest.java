package me.breidenbach.submodule;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

/**
 * @author Kevin Breidenbach
 *         Date: 1/20/17
 */
public class SubModuleOneTest
{
    @Test
    public void subModuleOne() {
        final SubModuleOne subModuleOne = new SubModuleOne();
        assertThat(subModuleOne, is(notNullValue()));
    }
}