// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package tbncommon.actions;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * MimeType Ex. application/pdf;application/msword;text/plain;application/zip;image/jpeg;image/png
 */
public class IsMatchFileType extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __File;
	private system.proxies.FileDocument File;
	private java.lang.String MimeType;

	public IsMatchFileType(IContext context, IMendixObject File, java.lang.String MimeType)
	{
		super(context);
		this.__File = File;
		this.MimeType = MimeType;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.File = __File == null ? null : system.proxies.FileDocument.initialize(getContext(), __File);

		// BEGIN USER CODE
		try {
			InputStream is = Core.getFileDocumentContent(getContext(), __File);
			String hex = this.convertToHex(is);	
            String fileType = this.convertToType(hex);
            
            //System.out.println(hex+" : "+fileType);
			return StringUtils.containsIgnoreCase(MimeType, fileType);
		} catch (Exception e) {
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
		return "IsMatchFileType";
	}

	// BEGIN EXTRA CODE
	 private String convertToHex(InputStream is) throws IOException {
			
	        int bytesCounter = 0;
	        int value = 0;
	        StringBuilder sbHex = new StringBuilder();
	        //StringBuilder sbText = new StringBuilder();
	        StringBuilder sbResult = new StringBuilder();
	        
	        int i = 0;
	        int max = 10000;

	        while ((value = is.read()) != -1 && i++ < max) {
	            //convert to hex value with "X" formatter
	            sbHex.append(String.format("%02X ", value));

	            //if 16 bytes are read, reset the counter, 
	            //clear the StringBuilder for formatting purpose only.
	            if (bytesCounter == 15) {
	                sbResult.append(sbHex).append("\n");
	                sbHex.setLength(0);
	                bytesCounter = 0;
	                break;
	            } else {
	                bytesCounter++;
	            }
	        }

	        //if still got content
	        if (bytesCounter != 0) {
	            sbResult.append(sbHex).append("\n");
	        }

	        //System.out.println(sbResult);
	        is.close();
	        
	        return sbResult.toString();
	}
	
    private String convertToType(String hex){
		String result = "";
		
		if(StringUtils.containsIgnoreCase(hex,"25 50 44 46")){ 
		    result = "PDF;AI";
		}else if (StringUtils.containsIgnoreCase(hex,"D0 CF 11 E0 A1 B1 1A E1")){ 
			result = "DOC;XLS;PPT;VSD;MSI;MSG";
		}else if ((StringUtils.containsIgnoreCase(hex,"50 4B 03 04")) && (!StringUtils.equalsIgnoreCase(hex, "50 4B 03 04 14 00 08 00 08 00"))){ 
			result = "DOCX;XLSX;PPTX";
		}else if (StringUtils.containsIgnoreCase(hex,"23 20 66 6F 72")){ 
			result = "TXT";
		}
		return result;
	}
	// END EXTRA CODE
}
