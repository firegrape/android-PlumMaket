package com.bitc.plummarketdb.service;


import com.bitc.plummarketdb.DTO.ListDTO;

public interface ListService {

    ListDTO selectListInfo()throws Exception;
}