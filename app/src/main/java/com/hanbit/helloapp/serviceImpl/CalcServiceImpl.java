package com.hanbit.helloapp.serviceImpl;

import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;

public class CalcServiceImpl implements CalcService {
    CalcServiceImpl service = new CalcServiceImpl();
    CalcBean bean =new CalcBean();

    @Override
    public int plus(CalcBean param) {
        int rs=0;
        rs=bean.getFirstNum()+bean.getSecondNum();
        return rs;
    }

    @Override
    public int minus(CalcBean param) {
       int rs=0;
        rs=bean.getFirstNum()-bean.getSecondNum();
        return rs;
    }

    @Override
    public int multi(CalcBean param) {
        int rs=0;
        rs=bean.getFirstNum()*bean.getSecondNum();
        return rs;
    }

    @Override
    public int divide(CalcBean param) {
      int rs=0;
        rs=bean.getFirstNum()/bean.getSecondNum();
        return rs;
    }

    @Override
    public int mod(CalcBean param) {
        int rs=0;
        rs=bean.getFirstNum()%bean.getSecondNum();
        return rs;
    }

}
