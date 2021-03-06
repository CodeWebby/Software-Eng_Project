import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import javax.swing.Popup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryUI extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public InventoryUI() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		
		DefaultTableModel tmodel=new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Model#","Product Name","Product Type","Quantity","Colour","Cost Price","Selling Price", "Description"
			}
		);
		table.setModel(tmodel);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));
		
		JLabel lblProductInventory = new JLabel("Product Inventory");
		lblProductInventory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblProductInventory);
		
		JButton btnNewButton = new JButton("",new ImageIcon(InventoryUI.class.getResource("/images/add product.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new addproductinformationGUI());
				revalidate();
			}
		});
		btnNewButton.setToolTipText("Add new product to inventory");	
		btnNewButton.setPreferredSize(new Dimension (30,30));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("",new ImageIcon(InventoryUI.class.getResource("/images/trashcanicon.PNG")));
		btnNewButton_1.setToolTipText("Remove Product from inventory");
		btnNewButton_1.setPreferredSize(new Dimension(30,30));
		panel.add(btnNewButton_1);
		
		
		

	}

}
