package com.example.demo.mapper;

import com.example.demo.entity.Note;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lt
 * @since 2024-11-08
 */
@Mapper
public interface NoteMapper extends BaseMapper<Note> {

}