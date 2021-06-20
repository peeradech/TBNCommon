// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package tbncommon.actions;

import org.apache.commons.lang3.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import tbncommon.actions.MaskUtils;

public class MaskEmail extends CustomJavaAction<java.lang.String>
{
	private java.lang.String email;
	private java.lang.String mask;

	public MaskEmail(IContext context, java.lang.String email, java.lang.String mask)
	{
		super(context);
		this.email = email;
		this.mask = mask;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
	    try
        {
	        if (StringUtils.isBlank(email))
	            throw new Exception("Email shout not be null");

	        if (StringUtils.isBlank(mask))
	            throw new Exception("Mask shout not be null");
	        
            return MaskUtils.maskEmailAddress(email, mask.charAt(0));
        }
        catch (Exception e)
        {
            throw new com.mendix.systemwideinterfaces.MendixRuntimeException(e);
        }
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "MaskEmail";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
