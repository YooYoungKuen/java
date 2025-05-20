<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openapi.*, openapi.ApiReisureDTO.*, java.util.List" %>
<%
// 로직 구현
    List<ApiReisureDTO.Item> items = null;
    
	String serviceKey = "jCt%2Bqd1yV98OZbkarV54EfR9wjYpTOYdxF3P4I5xdwxS2VcquYbYYWUPzScSCktjydrrYorljDeqAlQdTZw%2BSg%3D%3D";
	String baseUrl = "https://apis.data.go.kr/B551014/SRVC_TODZ_VW_LEISURE_FACI_I/TODZ_API_LEISURE_FACI_I";
	   
	try {
        
        Class<ApiReisureDTO> dto = ApiReisureDTO.class;
        ApiReisureDTO data = ApiExplorer.getApiJsonData(serviceKey, baseUrl, ApiReisureDTO.class);
                
        if (data.getResponse().getBody().getItems().getItem().size() > 0) {
            items = data.getResponse().getBody().getItems().getItem();
        }
        
        if (items != null && !items.isEmpty()) {
        	ApiReisureDAO insertDao = new ApiReisureDAO();
        	insertDao.insertData(items);
        }
                
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레저 스포츠 시설 조회</title>
</head>
<body>
<%
ApiReisureDAO selectDao = new ApiReisureDAO();
List<Item> selectList = selectDao.getList();
%>
    <table border='1'>
        <thead>
            <tr>    
                <th>시군구명</th>
                <th>시설종목명</th>
                <th>홈페이지주소</th>
                <th>시설명</th>
                <th>도로명주소</th>
                <th>전화번호</th>
                <th>행번호</th>
                <th>시도</th>
                <th>지번주소</th>

            </tr>
        </thead>
        <tbody>
        <% for(ApiReisureDTO.Item item: selectList) { %>
            <tr>
                <td><%= item.getSgg_nm() %></td>
                <td><%= item.getCode_nm() %></td>
                <td><%= item.getHomepage_url() %></td>
                <td><%= item.getFaci_nm() %></td>
                <td><%= item.getFaci_road_addr() %></td>
                <td><%= item.getFaci_tel_no() %></td>
                <td><%= item.getRow_num() %></td>
                <td><%= item.getCtpv_nm() %></td>
                <td><%= item.getFaci_post_addr() %></td>
            </tr>
        <% } %>
        </tbody>
    </table>
</body>
</html>