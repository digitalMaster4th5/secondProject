package com.kdigital.SecondProject.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kdigital.SecondProject.dto.LoginUserDetails;
import com.kdigital.SecondProject.service.AISService;
import com.kdigital.SecondProject.service.VoyageService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 항해 정보 세부 페이지로 연결
 * */

@Controller
@RequiredArgsConstructor
@Slf4j
public class VoyageController {
	final VoyageService voyageService;
	final AISService aisService;
	

	/**
	 * 콜사인을 포함하여 항해 정보 세부페이지로
	 * @callSign
	 * @return  shipInfo.html
	 * */
	@GetMapping({"voyage/voyagedetail"})
	public String voyageDetail(
			@AuthenticationPrincipal  LoginUserDetails loginUser, //인증받은 사용자가 있다면 그 정보를 담아옴
			@RequestParam(name="callSign", defaultValue="-1") String callSign, //검색버튼 클릭 시
			Model model
			) {
		return "/pages/shipInfo";
	}
	
	
}
