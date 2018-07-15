package com.destiny.Controller;


import com.destiny.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
@RequestMapping(value="/file",produces = "application/json")

/**
 * 文件读取
 * @author Destiny
 * @date 2018/7/15
 * @param
 * @return
 */
public class FileController {

    @Autowired
    private FileService fileService;
    // http://localhost:8080/file/getContnet
    @RequestMapping(value = "/getContnet",method = RequestMethod.GET)
    public String getContnet() throws IOException {

        return fileService.getContent();

    }


}

