package com.sproutinc.shimmer.controller;

import com.sproutinc.shimmer.Preference;
import com.sproutinc.shimmer.PreferenceResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Random;
import java.util.prefs.Preferences;

@Controller
public class PreferenceController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExitController.class);
    @RequestMapping(value = "/preference")
    @ResponseBody
    public PreferenceResponse getPreference(Model model,
                                  HttpServletResponse response) {
        LOGGER.info("getPreference /preference");
        Preference[] preferences = Preference.values();
        Random rand = new Random();
        Preference preference = preferences[rand.nextInt(preferences.length)];
        return new PreferenceResponse(preference);
    }
}
