
package openapi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import openapi.AcdntDTO.Item;

// 데이터 insert용 클래스
public class AcdntDAO {

	// 커넥션 풀 변수
	private Connection con;
	private PreparedStatement ps;
	private DataSource dataFactory;

	// 생성자
	public AcdntDAO() {

		try {

			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();

		}

	}

	// 테이블에 저장
	public int insertData(AcdntDTO data) {

		int result = 0;

		try {

			con = dataFactory.getConnection();

			String sql = "insert into t_cross(cnsld_index, " +
											  "acdnt_pnt_x, " +
											  "acdnt_pnt_y, " +
											  "crtr_yr, " +
											  "mtrpl_lcgv_nm, " +
											  "dth_nocs, " +
											  "plc_nm, " +
											  "basic_lcgv_nm, " +
											  "ocrn_nocs, " +
											  "row_num " +
											  "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			List<Item> itemList = data.getItemList();
			int count = 0;

			for (Item item : itemList) {

				ps = con.prepareStatement(sql);
				System.out.println("sql = " + sql);
				System.out.println(
							item.getCnsldIndex() + ":" +
							item.getAcdntPntX() + ":" +
							item.getAcdntPntY() + ":" +
							item.getCrtrYr() + ":" +
							item.getMtrplLcgvNm() + ":" +
							item.getDthNocs() + ":" +
							item.getPlcNm() + ":" +
							item.getBasicLcgvNm() + ":" +
							item.getOcrnNocs() + ":" +
							item.getRowNum() + ":" );

							
				

				ps.setString(1, item.getCnsldIndex());
				ps.setString(2, item.getAcdntPntX());
				ps.setString(3, item.getAcdntPntY());
				ps.setString(4, item.getCrtrYr());
				ps.setString(5, item.getMtrplLcgvNm());
				ps.setString(6, item.getDthNocs());
				ps.setString(7, item.getPlcNm());
				ps.setString(8, item.getBasicLcgvNm());
				ps.setString(9, item.getOcrnNocs());
				ps.setString(10, item.getRowNum());


				result = ps.executeUpdate();
				
				if (result < 1) {
					
					throw new Exception("입력 중 오류 발생");
					
				}
				
				if (10 < count++) {
					
					break;
					
				}

			}

		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println("SQL 구문 실행 중 예외 발생 : " + e.toString());
		
		}  finally {
			
			try {
				
				ps.close();
				con.close();
				
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
		
		return result;

	} // 메서드 종료
	
	// data 조회용 메서드
	public List<Item> getList() {
		
		// 데이터를 저장할 변수
		List<Item> itemList = new ArrayList<>();
		
		try {
			
			String sql = "select * from t_cross";
			con = dataFactory.getConnection();
			
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			// 읽어올 데이터가 있다면
			while(rs.next()) {
				
				Item item = new Item();
				item.setCnsldIndex(rs.getString("cnsld_index"));
				item.setAcdntPntX(rs.getString("acdnt_pnt_x"));
				item.setAcdntPntY((rs.getString("acdnt_pnt_y")));
				item.setCrtrYr(rs.getString("crtr_yr"));
				item.setMtrplLcgvNm(rs.getString("mtrpl_lcgv_nm"));
				item.setDthNocs(rs.getString("dth_nocs"));
				item.setPlcNm(rs.getString("plc_nm"));
				item.setBasicLcgvNm(rs.getString("basic_lcgv_nm"));
				item.setOcrnNocs(rs.getString("ocrn_nocs"));
				item.setRowNum(rs.getString("row_num"));


				
				itemList.add(item);
				
			}
			
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("조회 중 에러 발생");
			
		} finally {
			
			try {
				
				ps.close();
				con.close();
				
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
		
		return itemList;
		
		
	} // 메서드 종료
	

} // class 끝
