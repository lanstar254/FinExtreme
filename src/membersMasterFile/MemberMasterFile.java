package membersMasterFile;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JDesktopPane;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import com.toedter.calendar.JDateChooser;

public class MemberMasterFile extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MemberMasterFile dialog = new MemberMasterFile();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MemberMasterFile() {
		setBounds(100, 100, 1318, 636);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		setModal(true);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		scrollPane.setViewportView(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		desktopPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[1259.00,grow]", "[89.00,top][111.00][75.00][278.00,baseline]"));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "cell 0 0,grow");
		panel_1.setLayout(new MigLayout("", "[152.00px][152.00px,fill][152,fill][152][152][152px][152][152]", "[37.00,fill][37.00px,fill]"));
		
		JButton btnNewButton_1 = new JButton("New (Ctrl + N)");
		panel_1.add(btnNewButton_1, "cell 0 0,grow");
		
		JButton btnEditctrl = new JButton("Edit (Ctrl + E)");
		panel_1.add(btnEditctrl, "cell 1 0");
		
		JButton btnDeletectrl = new JButton("Delete (Ctrl + D)");
		panel_1.add(btnDeletectrl, "cell 2 0,growx");
		
		JButton btnNewButton_2 = new JButton("Save (Ctrl + S)");
		panel_1.add(btnNewButton_2, "cell 3 0,growx");
		
		JButton btnCancelctrl = new JButton("Cancel (Ctrl + L)");
		panel_1.add(btnCancelctrl, "cell 4 0,growx");
		
		JButton btnKins = new JButton("Kins (F6)");
		panel_1.add(btnKins, "cell 5 0,growx");
		
		JButton btnNewButton_3 = new JButton("Profiles (F7)");
		panel_1.add(btnNewButton_3, "cell 6 0,grow");
		
		JButton btnSearch = new JButton("Search (F12)");
		panel_1.add(btnSearch, "cell 7 0,growx");
		
		JButton btnRegister = new JButton("Register (F8)");
		panel_1.add(btnRegister, "cell 0 1,growx");
		
		JButton btnClose = new JButton("Close (Esc)");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_1.add(btnClose, "cell 1 1,growx");
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "cell 0 1,grow");
		panel_2.setLayout(new MigLayout("", "[125.00,left][84.00][299.00][244.00][101.00][93.00][367.00,grow,left]", "[22.00][21.00][23.00][21.00][grow]"));
		
		JLabel lblTitle = new JLabel("Title:");
		panel_2.add(lblTitle, "flowx,cell 0 0");
		
		JButton btnf = new JButton("? (F6)");
		panel_2.add(btnf, "cell 1 0,growx");
		
		textField = new JTextField();
		panel_2.add(textField, "cell 2 0,growx");
		textField.setColumns(10);
		
		JLabel lblMemberType = new JLabel("Member Type:");
		lblMemberType.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblMemberType, "cell 3 0,alignx center");
		
		JButton btnf_1 = new JButton("? (F6)");
		panel_2.add(btnf_1, "cell 4 0,growx");
		
		JComboBox comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1, "cell 5 0,growx");
		
		textField_4 = new JTextField();
		panel_2.add(textField_4, "cell 6 0,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel, "flowx,cell 0 1,alignx trailing");
		
		JLabel lblGender = new JLabel("Gender:");
		panel_2.add(lblGender, "cell 0 1,growx");
		
		JComboBox comboBox = new JComboBox();
		panel_2.add(comboBox, "cell 2 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("Payroll Number:");
		panel_2.add(lblNewLabel_1, "cell 3 1,alignx center");
		
		textField_3 = new JTextField();
		panel_2.add(textField_3, "cell 6 1,growx");
		textField_3.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname:");
		panel_2.add(lblSurname, "cell 0 2");
		
		textField_1 = new JTextField();
		panel_2.add(textField_1, "cell 2 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblMemberNumber = new JLabel("Member Number:");
		panel_2.add(lblMemberNumber, "cell 3 2,alignx center");
		
		textField_5 = new JTextField();
		panel_2.add(textField_5, "cell 6 2,growx");
		textField_5.setColumns(10);
		
		JLabel lblOtherNames = new JLabel("Other Names:");
		panel_2.add(lblOtherNames, "cell 0 3");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2.add(textField_2, "cell 2 3,growx");
		
		JLabel lblIdentityNumber = new JLabel("Identity Number:");
		panel_2.add(lblIdentityNumber, "cell 3 3,alignx center");
		
		textField_6 = new JTextField();
		panel_2.add(textField_6, "cell 6 3,growx");
		textField_6.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Membership:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3, "cell 0 2,grow");
		panel_3.setLayout(new MigLayout("", "[144.00][196.00][162.00][206.00][206.00][grow]", "[][]"));
		
		JLabel lblNewLabel_2 = new JLabel("Back Office Member:");
		panel_3.add(lblNewLabel_2, "cell 0 0");
		
		JLabel lblFrontOfficeMember = new JLabel("Front Office Member:");
		panel_3.add(lblFrontOfficeMember, "cell 2 0");
		
		JLabel lblEquityMembers = new JLabel("Equity Members:");
		panel_3.add(lblEquityMembers, "cell 4 0,alignx trailing");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		panel.add(tabbedPane, "cell 0 3,grow");
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Personal (Ctrl + O)", null, panel_5, null);
		panel_5.setLayout(new MigLayout("", "[109.00][][254.00][242.00][198.00][359.00]", "[][][][][][]"));
		
		JLabel lblNewLabel_3 = new JLabel("Employer Code:");
		panel_5.add(lblNewLabel_3, "cell 0 0");
		
		JButton btnf_2 = new JButton("? (F6)");
		panel_5.add(btnf_2, "cell 1 0");
		
		JComboBox comboBox_3 = new JComboBox();
		panel_5.add(comboBox_3, "cell 2 0,growx");
		
		JLabel lblEmployerName = new JLabel("Employer Name:");
		panel_5.add(lblEmployerName, "cell 3 0,alignx center");
		
		textField_11 = new JTextField();
		panel_5.add(textField_11, "cell 5 0,growx");
		textField_11.setColumns(10);
		
		JLabel lblCategoryCode = new JLabel("Category Code:");
		panel_5.add(lblCategoryCode, "cell 0 1");
		
		JButton button = new JButton("? (F6)");
		panel_5.add(button, "cell 1 1");
		
		JComboBox comboBox_2 = new JComboBox();
		panel_5.add(comboBox_2, "cell 2 1,growx");
		
		JLabel lblCategoryName = new JLabel("Category Name:");
		panel_5.add(lblCategoryName, "cell 3 1,alignx center");
		
		textField_10 = new JTextField();
		panel_5.add(textField_10, "cell 5 1,growx");
		textField_10.setColumns(10);
		
		JLabel lblRetirementAge = new JLabel("Retirement Age:");
		panel_5.add(lblRetirementAge, "cell 0 2");
		
		textField_7 = new JTextField();
		panel_5.add(textField_7, "cell 2 2,growx");
		textField_7.setColumns(10);
		
		JLabel lblBranch = new JLabel("Branch:");
		panel_5.add(lblBranch, "cell 3 2,alignx trailing");
		
		JComboBox comboBox_4 = new JComboBox();
		panel_5.add(comboBox_4, "cell 4 2,growx");
		
		textField_12 = new JTextField();
		panel_5.add(textField_12, "cell 5 2,growx");
		textField_12.setColumns(10);
		
		JLabel lblJoinDate = new JLabel("Join Date:");
		panel_5.add(lblJoinDate, "cell 0 3");
		
		JDateChooser dateChooser = new JDateChooser();
		panel_5.add(dateChooser, "cell 2 3,grow");
		
		JLabel lblMembershipDuration = new JLabel("Membership Duration:");
		panel_5.add(lblMembershipDuration, "cell 3 3,alignx center");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_5.add(textField_9, "cell 4 3,growx");
		
		JLabel lblShareContribution = new JLabel("Share Contribution:");
		panel_5.add(lblShareContribution, "cell 5 3,alignx center");
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		panel_5.add(lblDateOfBirth, "cell 0 4");
		
		JDateChooser dateChooser_1 = new JDateChooser();
		panel_5.add(dateChooser_1, "cell 2 4,grow");
		
		JLabel lblAge = new JLabel("Age:");
		panel_5.add(lblAge, "cell 3 4,alignx center");
		
		textField_8 = new JTextField();
		panel_5.add(textField_8, "cell 4 4,growx");
		textField_8.setColumns(10);
		
		textField_13 = new JTextField();
		panel_5.add(textField_13, "cell 5 4,growx");
		textField_13.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Other Details (Ctrl + W)", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Contact (Ctrl + T)", null, panel_7, null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Bank (Ctrl + B)", null, panel_8, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("FOSA Accounts (Ctrl + F)", null, panel_4, null);
	}
}
