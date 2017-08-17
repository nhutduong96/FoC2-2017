package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import da.SQLiteDB;
import data.Category;

public class GUIcreate extends JFrame {

	private JPanel contentPane;
	private JTextField txtCode;
	private JTextField txtName;
    private SQLiteDB salesDb;
    private JTextField txtUnitPrice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIcreate frame = new GUIcreate();
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
	public GUIcreate() {
		salesDb = new SQLiteDB();
		salesDb.getAllCategories();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbName = new JLabel("Product Code");
		lbName.setBounds(23, 31, 74, 14);
		contentPane.add(lbName);
		
		JLabel lbUnitPrice = new JLabel("Name");
		lbUnitPrice.setBounds(23, 59, 106, 14);
		contentPane.add(lbUnitPrice);
		
		JLabel lblUniStock = new JLabel("Category");
		lblUniStock.setBounds(23, 84, 121, 14);
		contentPane.add(lblUniStock);
		
		JLabel lblCategory = new JLabel("Unit Of Measure");
		lblCategory.setBounds(23, 117, 89, 14);
		contentPane.add(lblCategory);
		
		txtCode = new JTextField();
		txtCode.setBounds(155, 28, 210, 20);
		contentPane.add(txtCode);
		txtCode.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(155, 56, 210, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JComboBox cmbCategory = new JComboBox();
		cmbCategory.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				//System.out.println(cmbCategory.getSelectedItem());
				Category cat = (Category)cmbCategory.getSelectedItem();
				System.out.println(cat.getCategoryId()+"-"+cat.getCategoryName());
			}
		});
		Vector<Category> catList =salesDb.getAllCategories();
		cmbCategory.setModel(new DefaultComboBoxModel(catList));
		cmbCategory.setBounds(155, 83, 210, 20);
		contentPane.add(cmbCategory);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String productcode = txtCode.getText();
				String  productName = txtName.getText();
				double Category    =Double.parseDouble(txtName.getText());
				Category selectedCat =(Category)cmbCategory.getSelectedItem();
				double unitofmeasure    =Double.parseDouble(txtUnitOfMeasure.getText());
				Category selectedUnit =(Category)cmbCategory.getSelectedItem();
				double unitbrand     =Double.parseDouble(txtUBrand.getText());
				Category selectedBrand =(Category)cmbCategory.getSelectedItem();
				int catId = selectedCat.getCategoryId();
				salesDb.insert(productName, catId, unitprice);
				salesDb.getAllProducts();
			}
		});
		btnNewButton.setBounds(70, 230, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(233, 230, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblAddProduct = new JLabel("Add Product");
		lblAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAddProduct.setBounds(155, 3, 126, 14);
		contentPane.add(lblAddProduct);
		
		JComboBox cmbUnitOfMeasure = new JComboBox();
		cmbUnitOfMeasure.setBounds(155, 114, 210, 20);
		contentPane.add(cmbUnitOfMeasure);
		
		JLabel lblNewLabel = new JLabel("Brand");
		lblNewLabel.setBounds(23, 149, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Unit Price");
		lblNewLabel_1.setBounds(23, 174, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cmbBrand = new JComboBox();
		cmbBrand.setBounds(155, 145, 210, 20);
		contentPane.add(cmbBrand);
		
		txtUnitPrice = new JTextField();
		txtUnitPrice.setBounds(155, 171, 210, 20);
		contentPane.add(txtUnitPrice);
		txtUnitPrice.setColumns(10);
	}
}
