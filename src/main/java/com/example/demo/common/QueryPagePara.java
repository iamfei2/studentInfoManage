package com.example.demo.common;

import lombok.Data;

import java.util.HashMap;

@Data
public class QueryPagePara {
    private static int PAGE_SIZE = 20;
    private static int PAGE_NUM = 1;

    private int pageSize=PAGE_SIZE ;
    private int pageNum =PAGE_NUM;

    private HashMap para;
}
