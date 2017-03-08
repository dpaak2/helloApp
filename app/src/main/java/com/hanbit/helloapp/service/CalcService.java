package com.hanbit.helloapp.service;

import com.hanbit.helloapp.domain.CalcBean;

public interface CalcService {
    public int plus(CalcBean param);
    public int minus(CalcBean param);
    public  int multi(CalcBean param);
    public int divide(CalcBean param);
    public  int mod(CalcBean param);
}
