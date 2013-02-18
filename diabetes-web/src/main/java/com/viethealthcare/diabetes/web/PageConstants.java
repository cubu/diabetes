/**
 * This file just contains some constants for the diabetes website, eg menu buttons and header and 
 * footer templates.
 */
package com.viethealthcare.diabetes.web;


/**
 * $Date: 2011-10-24 14:55:09 -0500 (Mon, 24 Oct 2011) $
 * $Revision: 174 $
 * $Author: robjackAdmin $
 * $Id: PageConstants.java 174 2011-10-24 19:55:09Z robjackAdmin $
 * 
 * @author Robert Jackson
 *
 */
public final class PageConstants {
	
	public static final double VERSION_NUMBER = 1.07;
	
	
	public static final String diabetes_ROOT = "/diabetes-web";
	public static final String HOME_URL = diabetes_ROOT + "/index.jsp";
	public static final String FEEDBACK_URL = diabetes_ROOT + "/index.jsp?pageId=feedback";
	public static final String PRIVACY_STATEMENT_URL = diabetes_ROOT + "/index.jsp?pageId=privacyStatement";
	
	
	public static final String MENU_ITEMS = 
		"<div id=\"menu\">" +
			"<ul>" +
				"<li><a href=\"" + HOME_URL + "\">Home</a></li>" +
			"</ul>" +
			"<ul>" +
				"<li><a href=\"/diabetes-web/questionnaire.jsp?knowledgebase=diabetes\">Start diabetes!</a></li>" +
			"</ul>" +
			"<ul>" +
				"<li><a href=\"" + FEEDBACK_URL + "\">Send Feedback!</a></li>" +
			"</ul>" +
		
		"</div>";

	public static final String HEADER_HTML = 
		"<div class=\"header\">" +
			"<a href=\"/diabetes-web/index.jsp\"><img style=\"width: 350px;\" alt=\"diabetesHeaderImage -- Things to Think About\"" +
			"src=\"/diabetes-web/images/diabetesHeader.other.jpg\"></a>" +
		"</div>";
		
	public static final String FOOTER_HTML = 
		"<div class=\"footer\">" +

		"<a href=\"" + HOME_URL + "\">Home</a>  |  " +
		"<a href=\"/diabetes-web/questionnaire.jsp?knowledgebase=diabetes\">Start diabetes!</a>  |  " +
		"<a href=\"" + FEEDBACK_URL + "\">Send Feedback</a>  |  " +
		"<a href=\"" + PRIVACY_STATEMENT_URL + "\">Privacy Statement</a>  |  " + 
		"© 2011 Robert Jackson" +
		"</div>";
	

}

	

