package fr.sii.sonar.web.frontend.typescript.test;

import fr.sii.sonar.report.core.test.TestConstants;
import fr.sii.sonar.report.core.test.domain.Type;
import fr.sii.sonar.web.frontend.typescript.TypeScriptLanguageConstants;

public class JUnitIntegrationConstants extends TypeScriptLanguageConstants implements TestConstants {
	public static final String REPORT_PATH_KEY = "sonar.sii.test.it.ts.report.path";
	public static final String FAIL_MISSING_FILE_KEY = "sonar.sii.test.it.ts.file.missing.fail";
	public static final String REPORT_PATH_DEFVALUE = "/reports/sonar/ts-it.xml";
	public static final String FAIL_MISSING_FILE_DEFVALUE = "true";
	public static final String SUB_CATEGORY = "Integration testing";
	
	public String getReportPathKey() {
		return REPORT_PATH_KEY;
	}
	
	public String getMissingFileFailKey() {
		return FAIL_MISSING_FILE_KEY;
	}

	public Type getType() {
		return Type.INTEGRATION;
	}

}
