package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/") //works with or without ("/")
    @ResponseBody
    public String possibleProgrammingLanguage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form") //do absolutley need ("/form") this time
    @ResponseBody //purpose to display values?
    public String formForUser() {
        return "<form action = 'form' method = 'post'>" +
                "<label>Name:</label>" +
                "<input type = 'text' name = 'name'>" +
                "<br />" +
                "<label>My Favorite Language:</label>" +
                "<select name='language'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<label>My Second Favorite Language:</label>" +
                "<select name='language2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<label>My Third Favorite Language:</label>" +
                "<select name='language3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<input type = 'submit' value = 'Submit'</input>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1><br>" +
                "<ol>" +
                "<li>" + language + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }
}
