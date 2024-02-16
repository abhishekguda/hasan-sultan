package com.dominos.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringCompressorTest {


    private StringCompressor compressor = new StringCompressor();

    @Test
    @DisplayName("Validate is not null")
    void shouldNotBeNull() {
        String value = null;
        assertNotNull(compressor.compress(value), "should not be null");
    }

    @Test
    @DisplayName("Compress simple string")
    void shouldCompressSimpleString() {
        String value = "aaa";
        assertEquals("a3", compressor.compress(value), "should be a3");
    }

    @Test
    @DisplayName("Validate simple string")
    void shouldCompressCombinationString() {
        String value = "aaabbbbcc";
        assertEquals("a3b4c2", compressor.compress(value), "should be a3b4c2");
    }


}
