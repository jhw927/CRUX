package com.project.crux.controller;

import com.project.crux.domain.request.MypageRequestDto;
import com.project.crux.domain.response.ResponseDto;
import com.project.crux.security.jwt.UserDetailsImpl;
import com.project.crux.service.MypageService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class MypageController {
    private final MypageService mypageService;
    //마이 페이지 조회
    @GetMapping("/members/{memberId}")
    public ResponseDto<?> viewMypage(@PathVariable Long memberId){
        return mypageService.viewMypage(memberId);
    }
    //마이 페이지 수정
    @PutMapping("/members")
    public ResponseDto<?> editMypage(@AuthenticationPrincipal UserDetailsImpl userDetails,@RequestBody MypageRequestDto mypageRequestDto){
        return mypageService.editMypage(userDetails,mypageRequestDto);
    }
}
