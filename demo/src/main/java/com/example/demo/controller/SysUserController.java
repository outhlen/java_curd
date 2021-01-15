package com.example.demo.controller;
import com.example.demo.model.SysUser;
import com.example.demo.service.SysUserService;
import com.example.demo.util.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping(value="/findByUserId")
    public Object findByUserId(@RequestParam Long userId) {
        return sysUserService.findByUserId(userId);
    }
    
    @PostMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
    
    @PostMapping(value="/findPage")
    public Object findPage(@RequestBody PageRequest pageQuery) {
        return sysUserService.findPage(pageQuery);
    }

    @PostMapping(value="/deleteUser")
    public Object deleteById(@RequestParam Long userId) {
        return sysUserService.deleteUserById(userId);
    }

    @PostMapping(value="/addUser")
    public Object addUser(@RequestParam SysUser user) {
        return sysUserService.addUser(user);
    }

    @PostMapping(value="/updateInfo")
    public Object updateUser(@RequestParam SysUser user) {
        return sysUserService.updateUser(user);
    }

}