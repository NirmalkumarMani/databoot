package com.example.data;
import org.springframework.web.bind.annotation.*;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class SpringBootController {  
 @Autowired  
    JdbcTemplate jdbc;    
    @RequestMapping(value="/insert", method=RequestMethod.POST)  
    public String index()
    {  
        jdbc.execute("insert into user(name,email)values('vb','vb@gmail.com')");  
        return "data inserted Successfully";  
    }  
}  