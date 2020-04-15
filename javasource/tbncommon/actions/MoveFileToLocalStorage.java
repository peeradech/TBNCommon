// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package tbncommon.actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Move file from source path to 'data/files/' of Mendix structure.
 */
public class MoveFileToLocalStorage extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String sourcePath;

	public MoveFileToLocalStorage(IContext context, java.lang.String sourcePath)
	{
		super(context);
		this.sourcePath = sourcePath;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
	    try
        {
	    	if (StringUtils.isEmpty(sourcePath))
	    		throw new Exception();
	    	//Core.getConfiguration().getBasePath().getAbsolutePath() + "/data/files/" <-- old version
	        File fs = new File(sourcePath);
	        File[] m = fs.listFiles();
	        
	        for (int i = 0; i < m.length; i++)
	        {
	            if (m[i].isFile())
	            {
	                File f = m[i];
	                String stPath = StringUtils.substring(f.getName(), 0, 2);
	                String ndPath = StringUtils.substring(f.getName(), 2, 4);
	                FileUtils.moveFileToDirectory(m[i], new File(fs.getAbsolutePath() + "/" + stPath + "/" + ndPath), true);
	            }
	        }
	        
	        return true;
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
		return "MoveFileToLocalStorage";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}