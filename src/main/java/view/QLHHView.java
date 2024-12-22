package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.HangHoa;
import model.QLHHModel;
import model.Tinh;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLHHController;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QLHHView extends JFrame {

	public QLHHModel model;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField_MaHangHoa_TimKiem;
	public JTextField textField_ID;
	public JTextField textField_tenSanPham;
	public JTable table;
	public JTextField textField_Gia;
	public JTextField textField_NgaySanXuat;
	public ButtonGroup btn_gioiTinh;
	public JComboBox comboBox_nguonGoc;
	public JComboBox comboBox_nguonGoc_timKiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLHHView frame = new QLHHView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLHHView() {
		this.model = new QLHHModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 750);

		ActionListener action = new QLHHController(this);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_NguonGoc_TimKiem = new JLabel("Nguồn Gốc");
		label_NguonGoc_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_NguonGoc_TimKiem.setBounds(46, 33, 123, 54);
		contentPane.add(label_NguonGoc_TimKiem);

		JLabel label_MaHangHoa_TimKiem = new JLabel("Mã Hàng Hóa");
		label_MaHangHoa_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_MaHangHoa_TimKiem.setBounds(359, 33, 117, 54);
		contentPane.add(label_MaHangHoa_TimKiem);

		textField_MaHangHoa_TimKiem = new JTextField();
		textField_MaHangHoa_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_MaHangHoa_TimKiem.setColumns(10);
		textField_MaHangHoa_TimKiem.setBounds(489, 34, 123, 54);
		contentPane.add(textField_MaHangHoa_TimKiem);

		JButton btnTim = new JButton("Tìm");
		btnTim.addActionListener(action);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTim.setBounds(622, 34, 89, 54);
		contentPane.add(btnTim);

		JLabel labelDsHangHoa = new JLabel("Danh sách Hàng Hóa");
		labelDsHangHoa.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelDsHangHoa.setBounds(32, 133, 251, 54);
		contentPane.add(labelDsHangHoa);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 137, 811, 2);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 414, 811, 3);
		contentPane.add(separator_1_1);

		JLabel labelThongTinHangHoa = new JLabel("Thông tin Hàng Hóa");
		labelThongTinHangHoa.setFont(new Font("Tahoma", Font.PLAIN, 19));
		labelThongTinHangHoa.setBounds(37, 414, 233, 54);
		contentPane.add(labelThongTinHangHoa);

		JLabel label_MaHangHoa = new JLabel("Mã Hàng Hóa");
		label_MaHangHoa.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_MaHangHoa.setBounds(37, 457, 118, 54);
		contentPane.add(label_MaHangHoa);

		JLabel label_tenSanPham = new JLabel("Tên Sản Phẩm");
		label_tenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_tenSanPham.setBounds(37, 502, 143, 54);
		contentPane.add(label_tenSanPham);

		JLabel label_NguonGoc = new JLabel("Nguồn Gốc");
		label_NguonGoc.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_NguonGoc.setBounds(37, 543, 155, 54);
		contentPane.add(label_NguonGoc);

		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_ID.setColumns(10);
		textField_ID.setBounds(190, 470, 166, 29);
		contentPane.add(textField_ID);

		textField_tenSanPham = new JTextField();
		textField_tenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_tenSanPham.setColumns(10);
		textField_tenSanPham.setBounds(190, 515, 166, 29);
		contentPane.add(textField_tenSanPham);

		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCapNhat.setBounds(359, 650, 135, 42);
		contentPane.add(btnCapNhat);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBounds(191, 650, 135, 42);
		contentPane.add(btnXoa);

		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(action);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.setBounds(20, 650, 135, 42);
		contentPane.add(btnThem);

		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(action);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLuu.setBounds(518, 650, 135, 42);
		contentPane.add(btnLuu);

		JButton btnHuyBo = new JButton("Hủy Bỏ");
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyBo.setBounds(697, 650, 135, 42);
		contentPane.add(btnHuyBo);

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(20, 638, 811, 2);
		contentPane.add(separator_1_1_1);

		// add thông tin vào combo box
		comboBox_nguonGoc_timKiem = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_nguonGoc_timKiem.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_nguonGoc_timKiem.addItem(tinh.getTenTinh());
		}
		comboBox_nguonGoc_timKiem.setBounds(161, 37, 166, 54);
		contentPane.add(comboBox_nguonGoc_timKiem);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "M\u00E3 H\u00E0ng",
				"T\u00EAn S\u1EA3n Ph\u1EA9m", "Ngu\u1ED3n G\u1ED1c", "Ng\u00E0y S\u1EA3n Xu\u1EA5t", "Gi\u00E1" }));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 183, 811, 203);
		contentPane.add(scrollPane);

		JLabel label_Gia = new JLabel("Giá");
		label_Gia.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_Gia.setBounds(444, 457, 92, 54);
		contentPane.add(label_Gia);

		textField_Gia = new JTextField();
		textField_Gia.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_Gia.setColumns(10);
		textField_Gia.setBounds(530, 470, 166, 29);
		contentPane.add(textField_Gia);

		JLabel label_NgaySanXuat = new JLabel("Ngày Sản Xuất");
		label_NgaySanXuat.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_NgaySanXuat.setBounds(37, 586, 155, 54);
		contentPane.add(label_NgaySanXuat);

		textField_NgaySanXuat = new JTextField();
		textField_NgaySanXuat.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_NgaySanXuat.setColumns(10);
		textField_NgaySanXuat.setBounds(191, 599, 166, 29);
		contentPane.add(textField_NgaySanXuat);

		// add thông tin vào combobox
		comboBox_nguonGoc = new JComboBox();
		comboBox_nguonGoc.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_nguonGoc.addItem(tinh.getTenTinh());
		}
		comboBox_nguonGoc.setBounds(190, 560, 166, 29);
		contentPane.add(comboBox_nguonGoc);

		JButton btnHuyTim = new JButton("Hủy tìm");
		btnHuyTim.addActionListener(action);
		btnHuyTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyTim.setBounds(721, 34, 113, 54);
		contentPane.add(btnHuyTim);

		this.setVisible(true);

	}

	public void xoaForm() {
		textField_ID.setText("");
		textField_tenSanPham.setText("");
		textField_MaHangHoa_TimKiem.setText("");
		textField_NgaySanXuat.setText("");
		textField_Gia.setText("");
		comboBox_nguonGoc.setSelectedIndex(-1);

	}

	public void themHangVaoTable(HangHoa hh) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {
				hh.getMaHangHoa() + "", hh.getTenhangHoa(), hh.getNguonGoc().getTenTinh(), hh.getNgaySanXuat().getDate()
						+ "/" + (hh.getNgaySanXuat().getMonth() + 1) + "/" + (hh.getNgaySanXuat().getYear() + 1900),
				hh.getGia() });
	}

	public void themHoacCapNhatHang(HangHoa hh) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.kiemTraTonTai(hh)) {
			this.model.insert(hh);
			this.themHangVaoTable(hh);
		} else {
			this.model.update(hh);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(hh.getMaHangHoa() + "")) {
					model_table.setValueAt(hh.getMaHangHoa() + "", i, 0);
					model_table.setValueAt(hh.getTenhangHoa() + "", i, 1);
					model_table.setValueAt(hh.getNguonGoc().getTenTinh() + "", i, 2);
					model_table.setValueAt(hh.getNgaySanXuat().getDate() + "/" + (hh.getNgaySanXuat().getMonth() + 1)
							+ "/" + (hh.getNgaySanXuat().getYear() + 1900) + "", i, 3);
					model_table.setValueAt(hh.getGia() + "", i, 4);

				}
			}
		}
	}

	public HangHoa getHangDangCHon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int maHangHoa = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String tenhangHoa = model_table.getValueAt(i_row, 1) + "";
		Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2) + "");
		String s_ngaySanXuat = model_table.getValueAt(i_row, 3) + "";
		Date ngaySanXuat = new Date(s_ngaySanXuat);
		float gia = Float.valueOf(model_table.getValueAt(i_row, 4) + "");
		HangHoa hh = new HangHoa(maHangHoa, tenhangHoa, tinh, ngaySanXuat, gia);
		return hh;
	}

	public void hienThiThongTinHangDaChon() {
		HangHoa hh = getHangDangCHon();

		this.textField_ID.setText(hh.getMaHangHoa() + "");
		this.textField_tenSanPham.setText(hh.getTenhangHoa());
		this.comboBox_nguonGoc.setSelectedItem(hh.getNguonGoc().getTenTinh());
		String s_ngaySinh = hh.getNgaySanXuat().getDate() + "/" + (hh.getNgaySanXuat().getMonth() + 1) + "/"
				+ (hh.getNgaySanXuat().getYear() + 1900);
		this.textField_NgaySanXuat.setText(s_ngaySinh + "");
		this.textField_Gia.setText(hh.getGia() + "");

	}

	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn?");
		if (luaChon == JOptionPane.YES_OPTION) {
			HangHoa hh = getHangDangCHon();
			this.model.delete(hh);
			model_table.removeRow(i_row);
		}
	}

	public void thucHienThemHang() {
		// get dữ liệu
		int maHangHoa = Integer.valueOf(this.textField_ID.getText());
		String tenhangHoa = this.textField_tenSanPham.getText();

		int nguonGoc = this.comboBox_nguonGoc.getSelectedIndex() - 1;
		Tinh tinh = Tinh.getTinhById(nguonGoc);
		Date ngaySanXuat = new Date(this.textField_NgaySanXuat.getText());
		float gia = Float.valueOf(this.textField_Gia.getText());
		HangHoa hh = new HangHoa(maHangHoa, tenhangHoa, tinh, ngaySanXuat, gia);
		this.themHoacCapNhatHang(hh);

	}

	public void thucHienTim() {
		// Gọi hàm hủy tìm kiếm
		this.thucHienHuyTim();

		// thực hiện tìm kiếm
		int nguonGoc = this.comboBox_nguonGoc_timKiem.getSelectedIndex() - 1;
		String maHangTimKiem = this.textField_MaHangHoa_TimKiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();

		Set<Integer> idCuaHangHoaCanXoa = new TreeSet<Integer>();
		if (nguonGoc >= 0) {
			Tinh tinhDaChon = Tinh.getTinhById(nguonGoc);
			for (int i = 0; i < soLuongDong; i++) {
				String tenTinh = model_table.getValueAt(i, 2) + "";
				String id = model_table.getValueAt(i, 0) + "";
				if (!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idCuaHangHoaCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		if (maHangTimKiem.length() > 0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (!id.equals(maHangTimKiem)) {
					idCuaHangHoaCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		for (Integer idCanXoa : idCuaHangHoaCanXoa) {
			System.out.println(idCanXoa);
			soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i, 0) + "";
				if (idTrongTable.equals(idCanXoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}

	}

	public void thucHienHuyTim() {
		while (true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}

		}
		for (HangHoa hh : this.model.getDsHangHoa()) {
			this.themHangVaoTable(hh);

		}
	}
}
