package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import model.HangHoa;
import model.Tinh;
import view.QLHHView;

public class QLHHController implements ActionListener {
	private QLHHView view;

	public QLHHController(QLHHView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
//		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: " + cm);
		if (cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (cm.equals("Lưu")) {
			try {
				this.view.thucHienThemHang();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		} else if (cm.equals("Cập nhật")) {
			this.view.hienThiThongTinHangDaChon();
		} else if (cm.equals("Xóa")) {
			this.view.thucHienXoa();
		} else if (cm.equals("Hủy Bỏ")) {
			this.view.xoaForm();
		} else if (cm.equals("Tìm")) {
			this.view.thucHienTim();
		} else if (cm.equals("Hủy tìm")) {
			this.view.thucHienHuyTim();
		}
	}
}
