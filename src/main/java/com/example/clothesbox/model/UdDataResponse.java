package com.example.clothesbox.model;

import lombok.Data;

import java.util.List;

@Data
public class UdDataResponse {
    private int currentCount;
    private List<BoxInfo> data;
    private int matchCount;
    private int page;
    private int perPage;
    private int totalCount;

    @Data
    public static class BoxInfo {
        private String manageNumber;
        private String manageOrg;
        private String dong;
        private String address;
        private String longitude;
        private String latitude;
    }
}
