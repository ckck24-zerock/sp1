package org.example.sp1.mapper;

//반환타입 - insert,update,delete는 int로 반환 (몇 개, count)

import org.example.sp1.dto.BoardDTO;

public interface BoardMapper {

    int insert(BoardDTO board);

    BoardDTO selectOne(Integer bno);

    java.util.List<BoardDTO> selectAll();

    int update(BoardDTO board);

    int delete(Integer bno);

}
