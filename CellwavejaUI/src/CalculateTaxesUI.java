import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class CalculateTaxesUI extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CalculateTaxesUI() {
		setLayout(null);
		
		JLabel lblCalculateTaxes = new JLabel("Calculate Taxes");
		lblCalculateTaxes.setBounds(0, 0, 511, 22);
		lblCalculateTaxes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCalculateTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCalculateTaxes);
		
		JLabel lblEnterCurrentPercentage = new JLabel("Enter current percentage of G.C.T:");
		lblEnterCurrentPercentage.setBounds(0, 188, 272, 30);
		lblEnterCurrentPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterCurrentPercentage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblEnterCurrentPercentage);
		
		textField = new JTextField();
		textField.setBounds(300, 190, 72, 30);
		add(textField);
		textField.setColumns(10);

	}
}
