package com.spring.index;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 2014-10-31.
 */

@Controller
@RequestMapping("/")
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping
    public String index(ModelMap modelMap, HttpServletRequest request) {
        try {



        } catch (Exception e) {
            LOGGER.debug("error occured => {}", e);
        }

        return "index";
    }


}
