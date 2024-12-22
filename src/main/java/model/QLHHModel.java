package model;

import java.util.ArrayList;

public class QLHHModel {
	private ArrayList<HangHoa> dsHangHoa;
	private String luaChon;

	public QLHHModel() {
		this.dsHangHoa = new ArrayList<HangHoa>();
		this.luaChon = "";
	}

	public QLHHModel(ArrayList<HangHoa> dsHangHoa) {
		this.dsHangHoa = dsHangHoa;
	}

	public ArrayList<HangHoa> getDsHangHoa() {
		return dsHangHoa;
	}

	public void setDsHangHoa(ArrayList<HangHoa> dsHangHoa) {
		this.dsHangHoa = dsHangHoa;
	}

	public void insert(HangHoa hangHoa) {
		this.dsHangHoa.add(hangHoa);
	}

	public void delete(HangHoa hangHoa) {
		this.dsHangHoa.remove(hangHoa);
	}

	public void update(HangHoa hangHoa) {
		this.dsHangHoa.remove(hangHoa);
		this.dsHangHoa.add(hangHoa);
	}

	public String getLuaChon() {
		return luaChon;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public boolean kiemTraTonTai(HangHoa hh) {
		for (HangHoa hangHoa : dsHangHoa) {
			if (hangHoa.getMaHangHoa() == hh.getMaHangHoa())
				return true;
		}
		return false;
	}

}
