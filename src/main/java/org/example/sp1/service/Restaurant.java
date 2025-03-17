package org.example.sp1.service;

import lombok.RequiredArgsConstructor;
import org.example.sp1.dao.Chef;
import org.springframework.stereotype.Service;

//이 클래스의 객체를 생성해서 스프링 마을의 주민(Bean)으로 삼는다.
@Service
@RequiredArgsConstructor
public class Restaurant {

    private final Chef chef;

}
