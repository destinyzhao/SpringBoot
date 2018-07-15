package com.destiny.Service;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
public class FileService {

    /**
     * 获取文件内容
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    public String getContent() throws IOException {
        Resource resource = new ClassPathResource("test.txt");
        File file = resource.getFile();

        StringBuilder result = new StringBuilder();
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(file));

            String s = null;
            while((s = bufReader.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            bufReader.close();
            return result.toString();

        }catch (Exception e){
            return e.toString();
        }
    }
}

