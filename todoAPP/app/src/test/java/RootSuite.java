/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */

import components.ComponentsSuite;
import controller.ControllerSuite;
import model.ModelSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import util.UtilSuite;
import view.ViewSuite;

/**
 *
 * @author alexk
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({ComponentsSuite.class, ModelSuite.class, ControllerSuite.class, UtilSuite.class, ViewSuite.class})
@RunWith(Suite.class)
@Suite.SuiteClasses({components.ComponentsSuite.class, model.ModelSuite.class, controller.ControllerSuite.class, util.UtilSuite.class, view.ViewSuite.class})
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
