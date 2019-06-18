package com.liy;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@RestController
public class UploadController {

  //测试全局数据预处理
    @PostMapping("/book")
    public void bookAuther(@ModelAttribute("b") Book b,@ModelAttribute("a") Auther a){
        System.out.println(b);
        System.out.println(a);
    }


    //测试全局属性绑定
    @GetMapping("/hello")
    public void hello(Map map){
        Set<String> set = map.keySet();
        for (String s:set) {
            System.out.println(s+":"+map.get(s));
        }
    }


    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @RequestMapping("/upload")
    public String upload(MultipartFile file,HttpServletRequest req){
        String format = sdf.format(new Date());

        String realpath = req.getServletContext().getRealPath("/img")+ format;

        File path = new File(realpath);
        if (!path.exists()){
            path.mkdirs();
        }

        System.out.println(path);

        String oldname = file.getOriginalFilename();
        String newname = UUID.randomUUID().toString()+oldname.substring(oldname.lastIndexOf("."));

        try {
            file.transferTo(new File(path,newname));
            return req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+"/img"+format+newname;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "上传失败";
    }
}
