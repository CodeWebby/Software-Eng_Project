import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionInformationUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public TransactionInformationUI() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		JTable table = new JTable();
		
		DefaultTableModel tmodel=new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Transaction #","Customer ID","Customer Name","Product Name","Product Type","Colour","Date","Time","Selling Price","Paid with"
			}
		);
		table.setModel(tmodel);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));
		
		JLabel lblProductInventory = new JLabel("Transactions");
		lblProductInventory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblProductInventory);
		
		JButton btnNewButton = new JButton("",new ImageIcon(InventoryUI.class.getResource("/images/add product.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new AddnewTransactiontofile(),BorderLayout.CENTER);
				revalidate();
			}
		});
		btnNewButton.setToolTipText("Add new transaction");	
		btnNewButton.setPreferredSize(new Dimension (30,30));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("",new ImageIcon(InventoryUI.class.getResource("/images/trashcanicon.PNG")));
		btnNewButton_1.setToolTipText("Remove Transaction");
		btnNewButton_1.setPreferredSize(new Dimension(30,30));
		panel.add(btnNewButton_1);
	}

}
