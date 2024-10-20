package org.yeahicode.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yeahicode.application.dto.HrDto;
import org.yeahicode.application.service.HrService;

@Controller // 即使继承父类controller，子类controller也必须要标明
//@RequestMapping("/admin/v2") // 如果在继承父类路由的情况下，子类重新定义路由，则会覆盖父类路由（同继承思想一样，子类有的话就用子类的）
public class HrController extends BaseController {

    @Autowired
    HrService hrService;

    @GetMapping("/hr/id/{id}")
    public HrDto getHrById(@PathVariable("id") Long id) {
        HrDto hrDto = hrService.getHrById(id);
        return hrDto;
    }

    @GetMapping("/hr/phone/{phone}")
    public HrDto getHrByPhone(@PathVariable("phone") String phone) {
        HrDto hrDto = hrService.getHrByPhone(phone);
        return hrDto;
    }
}
