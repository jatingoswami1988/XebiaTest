package com.xebia.MelonBlaster;

import com.xebia.MelonBlaster.service.MelonBlasterFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MelonBlasterJunitTestCases 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MelonBlasterJunitTestCases( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MelonBlasterJunitTestCases.class );
    }

    
    public void testApp()
    {
    	MelonBlaster melonBlaster = new  MelonBlaster();
    	melonBlaster.setFirstArrow(0);
    	melonBlaster.setSecondArrow(10);
    	melonBlaster.setTurn(10);
    	Boolean result = MelonBlasterFactory.getMelonBlasterService().checkIfPerfectTenAfterAddingBothShot(melonBlaster.getFirstArrow(),melonBlaster.getSecondArrow());
    	System.out.println(result);
    	assertEquals(result,Boolean.TRUE);
    	
    	Boolean result2 = MelonBlasterFactory.getMelonBlasterService().checkIfAnyShotIsPerfectTen(melonBlaster);
    	assertEquals(result2,Boolean.TRUE);
    	System.out.println(result2);
    	
    	Boolean result3 = MelonBlasterFactory.getMelonBlasterService().checkIfFirstArrowScoreLessThanPerfectTen(melonBlaster);
    	assertEquals(result3,Boolean.TRUE);
    	System.out.println(result3);

    	
    	Boolean result4 = MelonBlasterFactory.getMelonBlasterService().checkIfItsTenthTurn(melonBlaster);
    	assertEquals(result4,Boolean.TRUE);
    	System.out.println(result4);

    	
    	Boolean result5 = MelonBlasterFactory.getMelonBlasterService().checkIfPerfectTenInFirstArrowShot(melonBlaster);
    	assertEquals(result5,Boolean.FALSE);
    	System.out.println(result5);
        
    }
}
