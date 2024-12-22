package model;

import java.util.Date;
import java.util.Objects;

public class HangHoa {
	private int maHangHoa;
	private String tenhangHoa;
	private Tinh nguonGoc;
	private Date ngaySanXuat;
	private float gia;

	public HangHoa(int maHangHoa, String tenhangHoa, Tinh nguonGoc, Date ngaySanXuat, float gia) {
		super();
		this.maHangHoa = maHangHoa;
		this.tenhangHoa = tenhangHoa;
		this.nguonGoc = nguonGoc;
		this.ngaySanXuat = ngaySanXuat;
		this.gia = gia;
	}

	public HangHoa() {

	}

	public int getMaHangHoa() {
		return maHangHoa;
	}

	public void setMaHangHoa(int maHangHoa) {
		this.maHangHoa = maHangHoa;
	}

	public String getTenhangHoa() {
		return tenhangHoa;
	}

	public void setTenhangHoa(String tenhangHoa) {
		this.tenhangHoa = tenhangHoa;
	}

	public Tinh getNguonGoc() {
		return nguonGoc;
	}

	public void setNguonGoc(Tinh nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "HangHoa [maHangHoa=" + maHangHoa + ", tenhangHoa=" + tenhangHoa + ", nguonGoc=" + nguonGoc
				+ ", ngaySanXuat=" + ngaySanXuat + ", gia=" + gia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gia, maHangHoa, ngaySanXuat, nguonGoc, tenhangHoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return Float.floatToIntBits(gia) == Float.floatToIntBits(other.gia) && maHangHoa == other.maHangHoa
				&& Objects.equals(ngaySanXuat, other.ngaySanXuat) && Objects.equals(nguonGoc, other.nguonGoc)
				&& Objects.equals(tenhangHoa, other.tenhangHoa);
	}

}
