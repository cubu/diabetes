package com.viethealthcare.diabetes.web.test;


import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(ConcurrentJunitRunner.class)
@Concurrent(threads = 5)
public class SpecialIllnessTests extends TestBasicSetup  {


	@Test
	public void testOverweightAndGoutRecommendations() throws Exception {
		selenium.open("/diabetes-web/index.jsp");
		selenium.click("link=Start diabetes!");
		selenium.waitForPageToLoad("30000");
		selenium.select("height_input", "label=5'11'' / 180cm");
		selenium.select("weight_input", "label=200lbs / 90.7kg");
		selenium.select("age_input", "label=20s");
		selenium.click("gender_input_male");
		selenium.click("myQuestionnaire_action_1"); // physical questions
		selenium.click("myQuestionnaire_action_1"); // intro questions
		selenium.click("myQuestionnaire_action_1"); // basic eating habits
		selenium.click("myQuestionnaire_action_1"); // extended eating habits
		
		selenium.click("id=gout_input"); // click gout
		
		selenium.click("myQuestionnaire_action_1"); // click done
		selenium.waitForPageToLoad("30000");

		assertTrue(selenium.isTextPresent("You have Gout, because of this you should restrict you intake of purines."));
	}



}
