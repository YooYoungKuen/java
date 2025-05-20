package openapi;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiReisureDTO {
    
    private Response response;

    @Data
    @NoArgsConstructor
    public static class Response {
        private Header header;
        private Body body;
    }

    @Data
    @NoArgsConstructor
    public static class Header {
        private String resultCode;
        private String resultMsg;
    }

    @Data
    @NoArgsConstructor
    public static class Body {
        private Items items;
        private int pageNo;
        private int totalCount;
        private int numOfRows;
    }

    @Data
    @NoArgsConstructor
    public static class Items {
        private List<Item> item;
    }

    @Data
    @NoArgsConstructor
    public static class Item {
        private String sgg_nm;
        private String code_nm;
        private String homepage_url;
        private String faci_nm;
        private String faci_road_addr;
        private String faci_tel_no;
        private String row_num;
        private String ctpv_nm;
        private String faci_post_addr;
    }
}