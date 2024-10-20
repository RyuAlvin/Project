package org.yeahicode.rbac.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yeahicode.rbac.convert.ConvertDo2Model;
import org.yeahicode.rbac.domain.Tester1;
import org.yeahicode.rbac.model.HrModel;
import org.yeahicode.rbac.mapper.HrMapper;
import org.yeahicode.rbac.domain.Hr;

@Repository
public class HrRepository extends ServiceImpl<HrMapper, Hr> {

    @Autowired
    HrMapper hrMapper;

//    @Autowired
//    ConvertDo2Model convert;

    public HrModel getHrById(Long id){
        Hr hr = this.getById(id);
        Tester1 tester1 = new Tester1();
//        return convert.convert1(tester1, hr);
        // 接口的单例获取
        return ConvertDo2Model.INSTANCES.convert1(tester1, hr);
    }

    public HrModel getHrByPhone(String phone) {
        Hr hr = hrMapper.getHrByPhone(phone);
//        return convert.convert2(hr);
        return ConvertDo2Model.INSTANCES.convert2(hr);
    }
}
