/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package view;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author alexk
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({MainScreenTest.class, ProjectDialogScreenTest.class, TaskDialogScreenTest.class})
@RunWith(Suite.class)
@Suite.SuiteClasses({view.MainScreenTest.class, view.ProjectDialogScreenTest.class, view.TaskDialogScreenTest.class})
public class ViewSuite {

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
