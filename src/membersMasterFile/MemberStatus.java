package membersMasterFile;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemberStatus extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MemberStatus dialog = new MemberStatus();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MemberStatus() {
		setTitle("Members Status");
		setBounds(100, 100, 1004, 670);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				JDesktopPane desktopPane = new JDesktopPane();
				scrollPane.setViewportView(desktopPane);
				desktopPane.setLayout(new BorderLayout(0, 0));
				{
					JPanel panel = new JPanel();
					desktopPane.add(panel, BorderLayout.CENTER);
					panel.setLayout(new MigLayout("", "[957.00,grow]", "[64.00][235.00][296.00,grow]"));
					{
						JPanel panel_1 = new JPanel();
						panel.add(panel_1, "cell 0 0,grow");
						panel_1.setLayout(new MigLayout("", "[115.00,fill][115.00,fill][115.00,fill][115.00,fill][115.00,fill][115.00,fill][115.00,fill][115.00,fill]", "[53.00,fill]"));
						{
							JButton btnNewButton = new JButton("Edit (Ctrl + E)");
							panel_1.add(btnNewButton, "cell 0 0");
						}
						{
							JButton btnSavectrl = new JButton("Save (Ctrl + S)");
							panel_1.add(btnSavectrl, "cell 1 0");
						}
						{
							JButton btnCancelctrl = new JButton("Cancel (Ctrl + L)");
							panel_1.add(btnCancelctrl, "cell 2 0");
						}
						{
							JButton btnSearchctrl = new JButton("Search (F12 )");
							panel_1.add(btnSearchctrl, "cell 3 0");
						}
						{
							JButton btnRegister = new JButton("Register (F8)");
							btnRegister.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
								}
							});
							panel_1.add(btnRegister, "cell 4 0");
						}
						{
							JButton btnFilterHist = new JButton("Filter Hist (F6)");
							panel_1.add(btnFilterHist, "cell 5 0");
						}
						{
							JButton btnPrint = new JButton("Print (Ctrl + P)");
							panel_1.add(btnPrint, "cell 6 0");
						}
						{
							JButton btnClose = new JButton("Close");
							panel_1.add(btnClose, "cell 7 0");
						}
					}
					{
						JPanel panel_1 = new JPanel();
						panel.add(panel_1, "cell 0 1,grow");
						panel_1.setLayout(new MigLayout("", "[][89.00][254.00,grow][369.00,grow]", "[][][][][][][][][]"));
						{
							JLabel lblNewLabel = new JLabel("Employer:");
							panel_1.add(lblNewLabel, "cell 0 0");
						}
						{
							textField = new JTextField();
							panel_1.add(textField, "cell 2 0,growx");
							textField.setColumns(10);
						}
						{
							textField_1 = new JTextField();
							textField_1.setColumns(10);
							panel_1.add(textField_1, "cell 3 0,growx");
						}
						{
							JLabel lblPayrollNumber = new JLabel("Payroll Number:");
							panel_1.add(lblPayrollNumber, "cell 0 1");
						}
						{
							textField_2 = new JTextField();
							textField_2.setColumns(10);
							panel_1.add(textField_2, "cell 2 1,growx");
						}
						{
							JLabel lblMemberNumber = new JLabel("Member Number:");
							panel_1.add(lblMemberNumber, "cell 0 2");
						}
						{
							textField_3 = new JTextField();
							textField_3.setColumns(10);
							panel_1.add(textField_3, "cell 2 2,growx");
						}
						{
							JLabel lblNewLabel_1 = new JLabel("Account Number:");
							panel_1.add(lblNewLabel_1, "cell 0 3");
						}
						{
							textField_4 = new JTextField();
							textField_4.setColumns(10);
							panel_1.add(textField_4, "cell 2 3,growx");
						}
						{
							JLabel lblNewLabel_2 = new JLabel("Full Names:");
							panel_1.add(lblNewLabel_2, "cell 0 4");
						}
						{
							textField_5 = new JTextField();
							textField_5.setColumns(10);
							panel_1.add(textField_5, "cell 2 4,growx");
						}
						{
							JLabel lblStatus = new JLabel("Status:");
							panel_1.add(lblStatus, "cell 0 5");
						}
						{
							JButton btnf = new JButton("? (F6)");
							panel_1.add(btnf, "cell 1 5,growx");
						}
						{
							JComboBox comboBox = new JComboBox();
							panel_1.add(comboBox, "cell 2 5,growx");
						}
						{
							textField_8 = new JTextField();
							textField_8.setColumns(10);
							panel_1.add(textField_8, "cell 3 5,growx");
						}
						{
							JLabel lblStatusDate = new JLabel("Status Date:");
							panel_1.add(lblStatusDate, "cell 0 6");
						}
						{
							textField_10 = new JTextField();
							textField_10.setColumns(10);
							panel_1.add(textField_10, "cell 2 6,growx");
						}
						{
							JLabel lblComment = new JLabel("Comment:");
							panel_1.add(lblComment, "cell 0 7");
						}
						{
							textField_6 = new JTextField();
							textField_6.setColumns(10);
							panel_1.add(textField_6, "cell 2 7,growx");
						}
						{
							JLabel lblUser = new JLabel("User:");
							panel_1.add(lblUser, "cell 0 8");
						}
						{
							textField_7 = new JTextField();
							textField_7.setColumns(10);
							panel_1.add(textField_7, "cell 2 8,growx");
						}
					}
					{
						JScrollPane scrollPane_1 = new JScrollPane();
						panel.add(scrollPane_1, "cell 0 2,grow");
						{
							JScrollPane scrollPane_2 = new JScrollPane();
							scrollPane_1.setViewportView(scrollPane_2);
							{
								table = new JTable();
								table.setModel(new DefaultTableModel(
									new Object[][] {
										{null, null, null, null, null, null, null},
									},
									new String[] {
										"Status:", "Status First Date:", "Status Last Date:", "User", "Comments", "Employer Code:", "Payroll Number:"
									}
								));
								scrollPane_2.setViewportView(table);
							}
						}
					}
				}
			}
		}
	}

}
