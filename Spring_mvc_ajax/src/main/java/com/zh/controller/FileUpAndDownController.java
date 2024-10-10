package com.zh.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class FileUpAndDownController {

    @RequestMapping("/test/down")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException{
        ServletContext servletContext=session.getServletContext();

        String realPath=servletContext.getRealPath("img");


        realPath=realPath+ File.separator+"1.jpg";

        InputStream is=new FileInputStream(realPath);

        byte[] bytes=new byte[is.available()];

        is.read(bytes);

        MultiValueMap<String,String> headers=new HttpHeaders();

        headers.add("Content-Disposition","attachment;filename=1.jpg");

        HttpStatus statusCode=HttpStatus.OK;

        ResponseEntity<byte[]> responseEntity=new ResponseEntity<>(bytes,headers,statusCode);

        is.close();

        return responseEntity;
    }
}
