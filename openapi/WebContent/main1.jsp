<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="openapi.*,openapi.AcdntDTO.*, java.util.List"%>

<%
	List<Item> itemList = null;
	
	String serviceKey = "jCt%2Bqd1yV98OZbkarV54EfR9wjYpTOYdxF3P4I5xdwxS2VcquYbYYWUPzScSCktjydrrYorljDeqAlQdTZw%2BSg%3D%3D";

	String srcUrl = "https://apis.data.go.kr/1613000/ACDNT_CMPNT/T_OD_ACDNT_CMPNT_BRN_INFO";
	
	try {
		
		Class<AcdntDTO> dto = AcdntDTO.class;
		AcdntDTO data = (AcdntDTO) ApiExplorer3.getApiJsonData(serviceKey, srcUrl, AcdntDTO.class);
	
		if (data.getItemList() != null && data.getItemList().size() > 0) {
			
			itemList = data.getItemList();
			
		}
		
		/* insert 용 */
		if (itemList != null && !itemList.isEmpty()) {
			
			AcdntDAO insertDao = new AcdntDAO();
			insertDao.insertData(data);
			
		}
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>공공 데이터</title>
		<link href="index.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
		<!-- 데이터 조회용 -->
		<%
		AcdntDAO selectDao = new AcdntDAO();
			List<Item> selectList = selectDao.getList();
		
		%>

<%-- 		<%
			if (itemList != null && !itemList.isEmpty()) {
		%> --%>
		<table>
		
			<thead>
				<tr>
					<th>지역 코드</th>
					<th>계획 번호</th>
					<th>계획 일</th>
					<th>교차로 번호</th>
					<th>계획 월</th>
					<th>교차로 이름</th>
					<th>수집 일시</th>
					<th>계획 일련번호</th>
				</tr>
			</thead>
			
			<tbody>
				<%
				for (Item item : selectList) {
				%>
				<tr>
					<td><%=item.getCnsldIndex()%></td>
					<td><%=item.getAcdntPntX()%></td>
					<td><%=item.getAcdntPntY()%></td>
					<td><%=item.getCrtrYr()%></td>
					<td><%=item.getMtrplLcgvNm()%></td>
					<td><%=item.getDthNocs()%></td>
					<td><%=item.getPlcNm()%></td>
					<td><%=item.getBasicLcgvNm()%></td>
					<td><%=item.getOcrnNocs()%></td>
					<td><%=item.getRowNum()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
			
		</table>
		
<%--  		<%
		}
		%> --%>
		
	</body>
	
</html>