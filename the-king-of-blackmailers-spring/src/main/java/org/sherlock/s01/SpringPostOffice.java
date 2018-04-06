package org.sherlock.s01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("letter-box")
public class SpringPostOffice {

    @RequestMapping(method = RequestMethod.PUT,
            consumes = {"multipart/form-data"})
    @ResponseBody
    public String put(@RequestParam("letter")String letter) {
        return letter;
    }

}
