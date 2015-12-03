package com.example.iem.testunitaire;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

/**
 * Created by iem on 03/12/15.
 */
public class MainActivityTest {
    @Mock
    EditText valeur1;
    @Mock
    EditText valeur2;
    @Mock
    Button boutonPlus;
    @Mock
    TextView tvResult;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        doReturn(tvResult.getText()).when(boutonPlus).isActivated();
    }

    @Test
    public void testAdition() throws Exception {
        

    }
}