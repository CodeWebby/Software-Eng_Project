package CellwavejaUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddnewTransactiontofile extends JPanel {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AddnewTransactiontofile() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEnterNewProducts = new JLabel("Add New Transaction ");
		lblEnterNewProducts.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEnterNewProducts.setBounds(319, 13, 677, 66);
		panel.add(lblEnterNewProducts);
		
		JLabel lblCustomerID = new JLabel("(Optional)Customer ID:");
		lblCustomerID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerID.setBounds(235, 92, 220, 21);
		panel.add(lblCustomerID);
		
		JLabel lblCustomerName = new JLabel("(Optional) Customer Name:\r\n");
		lblCustomerName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerName.setBounds(224, 137, 231, 21);
		panel.add(lblCustomerName);
		
		JLabel lblProductName = new JLabel("Product Name:\r\n");
		lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProductName.setBounds(319, 230, 130, 21);
		panel.add(lblProductName); 
		
		JLabel lblProductType = new JLabel("Product Type:");
		lblProductType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProductType.setBounds(319, 275, 136, 27);
		panel.add(lblProductType);
		
		JLabel lblColour= new JLabel("Colour:");
		lblColour.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblColour.setBounds(319, 320, 107, 27);
		panel.add(lblColour);
		
		JLabel lblQuantity = new JLabel("Paid with:");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantity.setBounds(319, 364, 130, 25);
		panel.add(lblQuantity);
		
		JTextField textFieldCustomerID = new JTextField();
		textFieldCustomerID.setBounds(467, 91, 366, 22);
		panel.add(textFieldCustomerID);
		textFieldCustomerID.setColumns(10);
		
		JTextField textField_1CustomerName = new JTextField();
		textField_1CustomerName.setColumns(10);
		textField_1CustomerName.setBounds(467, 136, 366, 22);
		panel.add(textField_1CustomerName);
		
		JTextField textField_2ProductName = new JTextField();
		textField_2ProductName.setColumns(10);
		textField_2ProductName.setBounds(467, 230, 366, 22);
		panel.add(textField_2ProductName);
		
		JTextField txtCashOrCard = new JTextField();
		txtCashOrCard.setToolTipText("Enter a number e.g 14 or 20\r\n");
		txtCashOrCard.setColumns(10);
		txtCashOrCard.setBounds(467, 367, 366, 22);
		panel.add(txtCashOrCard);
		
		JTextField textField_4ProductType = new JTextField();
		textField_4ProductType.setColumns(10);
		textField_4ProductType.setBounds(467, 275, 366, 22);
		panel.add(textField_4ProductType);
		
		JTextField textField_6Colour = new JTextField();
		textField_6Colour.setToolTipText("Enter value as a Number e.g 14.00 or 600.00");
		textField_6Colour.setColumns(10);
		textField_6Colour.setBounds(468, 320, 366, 22);
		panel.add(textField_6Colour);
		
		JLabel lblProductModelnumber = new JLabel("Product Model#");
		lblProductModelnumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProductModelnumber.setBounds(319, 182, 130, 16);
		panel.add(lblProductModelnumber);

		JTextField textField_7ProductModelNumber = new JTextField();
		textField_7ProductModelNumber.setBounds(467, 181, 366, 22);
		panel.add(textField_7ProductModelNumber);
		textField_7ProductModelNumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Save Transaction",new ImageIcon(addproductinformationGUI.class.getResource("/images/saveicon.PNG")));
		btnNewButton.setBackground(Color.decode("#BEE5F9"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean success=true;		
				if(textField_2ProductName.getText().isEmpty()||txtCashOrCard.getText().isEmpty()||textField_4ProductType.getText().isEmpty()||textField_6Colour.getText().isEmpty()) {
					success=false;
					JOptionPane.showMessageDialog(null, "INPUT DATA IN ALL FIELDS", "Input Error", JOptionPane.INFORMATION_MESSAGE);
				}
				if (success) {
					removeAll();
					add(new TransactionInformationUI(),BorderLayout.CENTER);
					revalidate();
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(617, 439, 258, 101);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel\r\n",new ImageIcon(addproductinformationGUI.class.getResource("/images/cancelicon.PNG")));
		btnNewButton_1.setBackground(Color.decode("#BEE5F9"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new TransactionInformationUI(),BorderLayout.CENTER);
				revalidate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(319, 439, 185, 100);
		panel.add(btnNewButton_1);
		
		
		
		
		

	
	}
}
