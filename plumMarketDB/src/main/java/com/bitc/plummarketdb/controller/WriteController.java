package com.bitc.plummarketdb.controller;


import com.bitc.plummarketdb.DTO.ListDTO;
import com.bitc.plummarketdb.service.UserService;
import com.bitc.plummarketdb.service.WriteService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class WriteController {
    @Autowired
    private WriteService writeService;

    @RequestMapping(value = "/insertList", method = {RequestMethod.POST})
    @ResponseBody
    public void androidInsertList(HttpServletRequest request, Model model) throws Exception {
//        String title = request.getParameter("title");
//        String content = request.getParameter("content");
//        String money1 = request.getParameter("money");
//        int money = Integer.parseInt(money1);
//        String nick = request.getParameter("nick");
//        String loc = request.getParameter("loc");

        ListDTO list = new ListDTO();

        list.setListTitle("테스트내용");
        list.setListContent("테스트내용");
        list.setListMoney(0);
        list.setListUserNick("테스터");
        list.setListLoc("진구");


        writeService.InsertList(list);
    }

        @RequestMapping(value = "/selectList", method = {RequestMethod.GET})
        @ResponseBody
        public String androidSelectList(HttpServletRequest request)throws Exception{


            JSONObject data1 = new JSONObject();

            List<ListDTO> list1 = writeService.SelectList();

            JSONArray jsonArray = new JSONArray();
            for(ListDTO list : list1){
                JSONObject data = new JSONObject();
                data.put("list_title", list.getListTitle());
                data.put("list_content", list.getListContent());
                data.put("list_user_nick", list.getListUserNick());


                jsonArray.put(data);
            }





            return jsonArray.toString();
        }





    }
