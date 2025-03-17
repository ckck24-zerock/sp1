package org.example.sp1.dao;

import org.springframework.stereotype.Repository;

// @Service와 마찬가지로 해당 클래스의 객체를 생성해서 빈으로관리
@Repository
public class ItarianChef implements Chef {
    @Override
    public String cook() {
        return "Pasta";
    }
}
