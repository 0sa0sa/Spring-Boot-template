package com.example.view.controller;

import com.example.view.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @GetMapping("show")
    public String showView(Model model) {
        Member member = new Member(1, "会員01");
        model.addAttribute("name", "太郎");
        model.addAttribute("mb", member);

        Member member1 = new Member(10, "田中");
        Member member2 = new Member(20, "鈴木");
        List<String> directionList = new ArrayList<>();
        directionList.add("east");
        directionList.add("west");
        directionList.add("south");
        directionList.add("north");

        Map<String, Member> memberMap = new HashMap<>();
        memberMap.put("tanaka", member1);
        memberMap.put("suzuki", member2);

        List<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);

        model.addAttribute("list", directionList);
        model.addAttribute("map", memberMap);
        model.addAttribute("members", memberList);

        // 戻り値は「ビュー名」を返す
        return "useThymeleaf";
    }
}
