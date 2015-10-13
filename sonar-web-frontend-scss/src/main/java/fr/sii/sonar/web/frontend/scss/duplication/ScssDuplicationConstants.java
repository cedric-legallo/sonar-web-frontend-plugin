package fr.sii.sonar.web.frontend.scss.duplication;

import fr.sii.sonar.web.frontend.scss.ScssLanguageConstants;

public class ScssDuplicationConstants extends ScssLanguageConstants {
	public static final String REPORT_PATH_KEY = "sonar.sii.duplication.scss.report.path";
	public static final String FAIL_MISSING_FILE_KEY = "sonar.sii.duplication.scss.file.missing.fail";
	public static final String REPORT_PATH_DEFVALUE = "/report/scss-duplication.xml";
	public static final String FAIL_MISSING_FILE_DEFVALUE = "true";
	public static final String SUB_CATEGORY = "Duplication";
	
	public String getReportPathKey() {
		return REPORT_PATH_KEY;
	}
	
	public String getMissingFileFailKey() {
		return FAIL_MISSING_FILE_KEY;
	}

}