package CellwavejaUI;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class profitLostUI extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public profitLostUI() {
		setLayout(null);
		
		JLabel lblCalculateProfitloss = new JLabel("Calculate Profit/Loss");
		lblCalculateProfitloss.setBounds(0, 0, 450, 22);
		lblCalculateProfitloss.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculateProfitloss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblCalculateProfitloss);
		
		JLabel lblEnterSerialNumber = new JLabel("Enter Serial number:");
		lblEnterSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterSerialNumber.setBounds(12, 69, 168, 30);
		add(lblEnterSerialNumber);
		
		textField = new JTextField();
		textField.setBounds(183, 71, 116, 30);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblProfitloss = new JLabel("Profit/Loss =");
		lblProfitloss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProfitloss.setBounds(12, 122, 133, 30);
		add(lblProfitloss);
		
		JLabel lblresult = new JLabel("\"Result\"");
		lblresult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblresult.setBounds(145, 122, 133, 30);
		add(lblresult);

	}
}
