package membersMasterFile;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.Color;

public class MemberProcess extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MemberProcess dialog = new MemberProcess();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MemberProcess() {
		setBounds(100, 100, 1011, 780);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setModal(true);
		setLocationRelativeTo(null);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				JPanel desktopPane = new JPanel();
				scrollPane.setViewportView(desktopPane);
				desktopPane.setLayout(new MigLayout("", "[947px]", "[717px]"));
				{
					JPanel panel = new JPanel();
					desktopPane.add(panel, "cell 0 0,grow");
					panel.setLayout(null);
					{
						JButton btnNewButton = new JButton("Statement (F11)");
						btnNewButton.setBounds(7, 7, 152, 44);
						panel.add(btnNewButton);
					}
					{
						JButton btnProcessMember = new JButton("Process Member");
						btnProcessMember.setBounds(163, 7, 152, 44);
						panel.add(btnProcessMember);
					}
					{
						JButton btnSaveEntry = new JButton("Save Entry");
						btnSaveEntry.setBounds(319, 7, 152, 44);
						panel.add(btnSaveEntry);
					}
					{
						JButton btnPrint = new JButton("Print");
						btnPrint.setBounds(475, 7, 152, 44);
						panel.add(btnPrint);
					}
					{
						JButton btnCancelEntry = new JButton("Cancel Entry");
						btnCancelEntry.setBounds(631, 7, 152, 44);
						panel.add(btnCancelEntry);
					}
					{
						JButton btnClose = new JButton("Close");
						btnClose.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								dispose();
							}
						});
						btnClose.setBounds(787, 7, 152, 44);
						panel.add(btnClose);
					}
					{
						JPanel panel_1 = new JPanel();
						panel_1.setBounds(7, 55, 932, 204);
						panel.add(panel_1);
						panel_1.setLayout(new BorderLayout(0, 0));
						{
							JPanel panel_2 = new JPanel();
							panel_2.setBorder(new TitledBorder(null, "Members Properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							panel_1.add(panel_2, BorderLayout.CENTER);
							panel_2.setLayout(new MigLayout("", "[][195.00][122.00,grow][153.00][288.00][247.00]", "[][][22.00][][][]"));
							{
								JLabel lblEmployeeCode = new JLabel("Employee Code:");
								panel_2.add(lblEmployeeCode, "cell 0 0 2 1,alignx center");
							}
							{
								JLabel lblPayrollNumber = new JLabel("Payroll Number:");
								panel_2.add(lblPayrollNumber, "cell 2 0,alignx center");
							}
							{
								JLabel lblMembersNumber = new JLabel("Members Number:");
								panel_2.add(lblMembersNumber, "cell 3 0,alignx center");
							}
							{
								JLabel lblMembersName = new JLabel("Members Name:");
								panel_2.add(lblMembersName, "cell 4 0,alignx center");
							}
							{
								JCheckBox chckbxReceiverLoan = new JCheckBox("Receiver loan from Guarantoer shares");
								panel_2.add(chckbxReceiverLoan, "cell 5 0");
							}
							{
								JButton btnNewButton_1 = new JButton("(F5)");
								panel_2.add(btnNewButton_1, "cell 0 1");
							}
							{
								textField = new JTextField();
								panel_2.add(textField, "cell 1 1,growx");
								textField.setColumns(10);
							}
							{
								textField_1 = new JTextField();
								panel_2.add(textField_1, "cell 2 1,growx");
								textField_1.setColumns(10);
							}
							{
								textField_2 = new JTextField();
								textField_2.setColumns(10);
								panel_2.add(textField_2, "cell 3 1,growx");
							}
							{
								textField_3 = new JTextField();
								panel_2.add(textField_3, "cell 4 1,growx");
								textField_3.setColumns(10);
							}
							{
								JLabel lblMemberToPay = new JLabel("Member to Pay this Amount:");
								panel_2.add(lblMemberToPay, "cell 0 2 2 1");
							}
							{
								textField_4 = new JTextField();
								panel_2.add(textField_4, "cell 2 2 2 1,growx");
								textField_4.setColumns(10);
							}
							{
								JLabel lblMemberStatus = new JLabel("Member Status:");
								panel_2.add(lblMemberStatus, "cell 4 3,alignx center");
							}
							{
								textField_5 = new JTextField();
								panel_2.add(textField_5, "cell 5 3,growx");
								textField_5.setColumns(10);
							}
							{
								JLabel lblOperationToCarry = new JLabel("Operation to Carry Out:");
								panel_2.add(lblOperationToCarry, "cell 0 4 2 1");
							}
							{
								JComboBox comboBox = new JComboBox();
								panel_2.add(comboBox, "cell 2 4 2 1,growx");
							}
							{
								JLabel lblNewLabel = new JLabel("Work Station:");
								panel_2.add(lblNewLabel, "cell 4 4,alignx center");
							}
							{
								textField_6 = new JTextField();
								textField_6.setColumns(10);
								panel_2.add(textField_6, "cell 5 4,growx");
							}
							{
								JLabel lblLoanSerialNumber = new JLabel("Loan Serial Number:");
								panel_2.add(lblLoanSerialNumber, "cell 0 5 2 1");
							}
							{
								JComboBox comboBox = new JComboBox();
								panel_2.add(comboBox, "cell 2 5 2 1,growx");
							}
							{
								JLabel lblAddress = new JLabel("Address:");
								panel_2.add(lblAddress, "cell 4 5,alignx center");
							}
							{
								textField_7 = new JTextField();
								panel_2.add(textField_7, "cell 5 5,growx");
								textField_7.setColumns(10);
							}
						}
					}
				}
			}
		}
	}

}
