package com.dimas.gradletut;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperServiceTest {

    SuperService service = new SuperService();

    @Test
    public void sum() {
        assertEquals(3, service.sum(1, 2));
    }
}