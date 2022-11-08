/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */

import components.ComponentsITSuite;
import controller.ControllerITSuite;
import model.ModelITSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import util.UtilITSuite;
import view.ViewITSuite;

/**
 *
 * @author alexk
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({ControllerITSuite.class, ComponentsITSuite.class, ModelITSuite.class, UtilITSuite.class, ViewITSuite.class})
@RunWith(Suite.class)
@Suite.SuiteClasses({controller.ControllerITSuite.class, components.ComponentsITSuite.class, model.ModelITSuite.class, util.UtilITSuite.class, view.ViewITSuite.class})
public class RootSuite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
