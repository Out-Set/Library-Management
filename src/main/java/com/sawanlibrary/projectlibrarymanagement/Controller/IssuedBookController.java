package com.sawanlibrary.projectlibrarymanagement.Controller;

import com.sawanlibrary.projectlibrarymanagement.Service.IssuedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssuedBookController {

    @Autowired
    private IssuedBookService issuedBookService;


}

