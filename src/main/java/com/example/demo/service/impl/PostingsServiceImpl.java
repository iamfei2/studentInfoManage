package com.example.demo.service.impl;

import com.example.demo.entity.Postings;
import com.example.demo.mapper.PostingsMapper;
import com.example.demo.service.IPostingsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lt
 * @since 2024-11-08
 */
@Service
public class PostingsServiceImpl extends ServiceImpl<PostingsMapper, Postings> implements IPostingsService {

}
