package openapi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import openapi.ApiReisureDTO.Item;

public class ApiReisureDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private DataSource dataFactory;
    
    public ApiReisureDAO() {
        try {
            Context ctx = new InitialContext();
            Context envContext = (Context)ctx.lookup("java:/comp/env");
            dataFactory = (DataSource)envContext.lookup("jdbc/oracle");            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * tb_api 테이블에 저장
     */
    public int insertData(List<ApiReisureDTO.Item> itemList ) {
        int result = 0;
        
        try {
            con = dataFactory.getConnection();
            
            String sql = "insert into tb_api("
                    + "sgg_nm, "
                    + "code_nm, "
                    + "homepage_url, "
                    + "faci_nm, "
                    + "faci_road_addr, "
                    + "faci_tel_no, "
                    + "row_num, "
                    + "ctpv_nm, "
                    + "faci_post_addr) "
                    +" values (?,?,?,?,?,?,?,?,?)";
            
            int count =0;
            for (ApiReisureDTO.Item item : itemList) {
                pstmt = con.prepareStatement(sql);
                
                pstmt.setString(1, item.getSgg_nm());
                pstmt.setString(2, item.getCode_nm());
                pstmt.setString(3, item.getHomepage_url());
                pstmt.setString(4, item.getFaci_nm());
                pstmt.setString(5, item.getFaci_road_addr());
                pstmt.setString(6, item.getFaci_tel_no());
                pstmt.setString(7, item.getRow_num());
                pstmt.setString(8, item.getCtpv_nm());
                pstmt.setString(9, item.getFaci_post_addr());      
                
                result = pstmt.executeUpdate();
                
                if (result < 1) throw new Exception("입력 중 오류 발생");
                if (++count >= 15) break;
            }
            
            pstmt.close();
            con.close();            
        } catch(Exception e) {
        	e.printStackTrace();
            System.out.println("SQL 구문 실행 중 예외 발생:"+ e.toString());
        }
        return result;
    }
    
    public List<Item> getList() {
        List<Item> items = new ArrayList<>();
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM tb_api";
            con = dataFactory.getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Item item = new Item();
                item.setSgg_nm(rs.getString("sgg_nm"));
                item.setCode_nm(rs.getString("code_nm"));
                item.setHomepage_url(rs.getString("homepage_url"));
                item.setFaci_nm(rs.getString("faci_nm"));
                item.setFaci_road_addr(rs.getString("faci_road_addr"));
                item.setFaci_tel_no(rs.getString("faci_tel_no"));
                item.setRow_num(rs.getString("row_num"));
                item.setCtpv_nm(rs.getString("ctpv_nm"));
                item.setFaci_post_addr(rs.getString("faci_post_addr"));

                items.add(item);
            }

        } catch (Exception e) {
            System.out.println("조회 중 에러 발생: " + e.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return items;
    }
}