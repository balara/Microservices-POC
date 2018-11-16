package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Audit;

import java.util.Map;


@RestController
public class AuditController {


    /**
     * Controller class for Customer data Service
     * @param requestParams
     */
    @RequestMapping("/audit")
    public void updateAudit(@RequestParam Map<String,String> requestParams) {
        Audit audit = new Audit(requestParams.get("userId"), requestParams.get("userAction"));
        System.out.println(audit);
    }

}
