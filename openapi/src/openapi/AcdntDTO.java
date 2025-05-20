package openapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

// 공공 데이터 저장용 DTO클래스
@Data
@NoArgsConstructor
public class AcdntDTO {

	// 데이터를 list로 저장하기 위함
	private List<Item> itemList;
	
	public List<Item> getItemList(){
		return itemList;
	}
	
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	@Data
	@NoArgsConstructor
	// 저장할 데이터 지정
	public static class Item {

		@JsonProperty("cnsld_index")
		private String cnsldIndex;

		@JsonProperty("acdnt_pnt_x")
		private String acdntPntX;

		@JsonProperty("acdnt_pnt_y")
		private String acdntPntY;

		@JsonProperty("crtr_yr")
		private String crtrYr;

		@JsonProperty("mtrpl_lcgv_nm")
		private String mtrplLcgvNm;

		@JsonProperty("dth_nocs")
		private String dthNocs;

		@JsonProperty("plc_nm")
		private String plcNm;

		@JsonProperty("basic_lcgv_nm")
		private String basicLcgvNm;

		@JsonProperty("ocrn_nocs")
		private String ocrnNocs;

		@JsonProperty("row_num")
		private String rowNum;
		
		
        // 각 필드에 대해 Getter / Setter 정의
        public String getCnsldIndex() { return cnsldIndex; }
        public void setCnsldIndex(String cnsldIndex) { this.cnsldIndex = cnsldIndex; }

        public String getAcdntPntX() { return acdntPntX; }
        public void setAcdntPntX(String acdntPntX) { this.acdntPntX = acdntPntX; }

        public String getAcdntPntY() { return acdntPntY; }
        public void setAcdntPntY(String acdntPntY) { this.acdntPntY = acdntPntY; }

        public String getCrtrYr() { return crtrYr; }
        public void setCrtrYr(String crtrYr) { this.crtrYr = crtrYr; }

        public String getMtrplLcgvNm() { return mtrplLcgvNm; }
        public void setMtrplLcgvNm(String mtrplLcgvNm) { this.mtrplLcgvNm = mtrplLcgvNm; }

        public String getDthNocs() { return dthNocs; }
        public void setDthNocs(String dthNocs) { this.dthNocs = dthNocs; }

        public String getPlcNm() { return plcNm; }
        public void setPlcNm(String plcNm) { this.plcNm = plcNm; }

        public String getBasicLcgvNm() { return basicLcgvNm; }
        public void setBasicLcgvNm(String basicLcgvNm) { this.basicLcgvNm = basicLcgvNm; }

        public String getOcrnNocs() { return ocrnNocs; }
        public void setOcrnNocs(String ocrnNocs) { this.ocrnNocs = ocrnNocs; }

        public String getRowNum() { return rowNum; }
        public void setRowNum(String rowNum) { this.rowNum = rowNum; }
		
	}

} // class 끝