package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutErica() throws Exception {
        assertThat(queryProcessor.process("erica"), containsString("developer"));
    }

    @Test
    public void teamName() throws Exception {
        assertThat(queryProcessor.process("name"), containsString("TeamNameNotDefined"));
    }

    @Test
    public void plus() throws Exception {
        assertThat(queryProcessor.process("plus"), containsString("addDe"));
    }

}
