package com.project.dasi.question.model.service;



import com.project.dasi.question.model.dao.FaqMapper;
import com.project.dasi.question.model.dto.FaqDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  FaqService {
    private final FaqMapper faqMapper;

    public FaqService(FaqMapper faqmapper) {this.faqMapper = faqmapper;}/*서비스 내 오토와이어드(콩이굴러들어오는) 없으면
    단 하나인 이게 오토와이어드임. 내가 안써도 여기에 오토와이어드 어노테이션 있는거다*/

    /*FaQ 전체 목록 조회용 메서드*/
    public List<FaqDTO> selectAllFaqList() {

        List<FaqDTO> faqList = faqMapper.selectAllFaqList();

        return faqList;
    }
}
