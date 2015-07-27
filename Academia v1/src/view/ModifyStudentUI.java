package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModifyStudentUI extends JPanel {
	protected JTextField txtDni;
	protected JTextField txtName;
	protected JTextField txtSurnames;
	protected JTextField txtDniModify;
	protected JTextField txtDateOfBirth;
	protected JTextField txtObservations;
	protected JLabel lblObservations;
	protected JLabel lblDateOfBirth;
	protected JLabel lblDniModify;
	protected JLabel lblSurnames;
	protected JLabel lblName;
	protected JLabel lblDni;
	protected JButton btnFind;
	protected JButton btnModify;
	private JLabel lblModifyStudent;
	protected JButton btnDate;

	/**
	 * Create the panel.
	 */
	public ModifyStudentUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 50, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblModifyStudent = new JLabel("MODIFICAR ALUMNO");
		lblModifyStudent.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblModifyStudent = new GridBagConstraints();
		gbc_lblModifyStudent.gridwidth = 3;
		gbc_lblModifyStudent.insets = new Insets(0, 0, 5, 5);
		gbc_lblModifyStudent.gridx = 1;
		gbc_lblModifyStudent.gridy = 1;
		add(lblModifyStudent, gbc_lblModifyStudent);

		lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 3;
		add(lblDni, gbc_lblDni);

		txtDni = new JTextField();
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.gridwidth = 2;
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 3;
		add(txtDni, gbc_txtDni);
		txtDni.setColumns(10);

		btnFind = new JButton("BUSCAR");
		GridBagConstraints gbc_btnFind = new GridBagConstraints();
		gbc_btnFind.gridwidth = 2;
		gbc_btnFind.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFind.insets = new Insets(0, 0, 5, 5);
		gbc_btnFind.gridx = 2;
		gbc_btnFind.gridy = 4;
		add(btnFind, gbc_btnFind);

		lblName = new JLabel("NOMBRE");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 6;
		add(lblName, gbc_lblName);

		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.gridwidth = 2;
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 2;
		gbc_txtName.gridy = 6;
		add(txtName, gbc_txtName);
		txtName.setColumns(10);
		txtName.setEnabled(false);

		lblSurnames = new JLabel("APELLIDOS");
		GridBagConstraints gbc_lblSurnames = new GridBagConstraints();
		gbc_lblSurnames.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurnames.gridx = 1;
		gbc_lblSurnames.gridy = 7;
		add(lblSurnames, gbc_lblSurnames);

		txtSurnames = new JTextField();
		GridBagConstraints gbc_txtSurnames = new GridBagConstraints();
		gbc_txtSurnames.gridwidth = 2;
		gbc_txtSurnames.anchor = GridBagConstraints.NORTH;
		gbc_txtSurnames.insets = new Insets(0, 0, 5, 5);
		gbc_txtSurnames.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSurnames.gridx = 2;
		gbc_txtSurnames.gridy = 7;
		add(txtSurnames, gbc_txtSurnames);
		txtSurnames.setColumns(10);
		txtSurnames.setEnabled(false);

		lblDniModify = new JLabel("DNI");
		GridBagConstraints gbc_lblDniModify = new GridBagConstraints();
		gbc_lblDniModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniModify.gridx = 1;
		gbc_lblDniModify.gridy = 8;
		add(lblDniModify, gbc_lblDniModify);

		txtDniModify = new JTextField();
		GridBagConstraints gbc_txtDniModify = new GridBagConstraints();
		gbc_txtDniModify.gridwidth = 2;
		gbc_txtDniModify.insets = new Insets(0, 0, 5, 5);
		gbc_txtDniModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDniModify.gridx = 2;
		gbc_txtDniModify.gridy = 8;
		add(txtDniModify, gbc_txtDniModify);
		txtDniModify.setColumns(10);
		txtDniModify.setEnabled(false);

		lblDateOfBirth = new JLabel("FECHA NACIMIENTO");
		GridBagConstraints gbc_lblDateOfBirth = new GridBagConstraints();
		gbc_lblDateOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateOfBirth.gridx = 1;
		gbc_lblDateOfBirth.gridy = 9;
		add(lblDateOfBirth, gbc_lblDateOfBirth);

		txtDateOfBirth = new JTextField();
		GridBagConstraints gbc_txtDateOfBirth = new GridBagConstraints();
		gbc_txtDateOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_txtDateOfBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDateOfBirth.gridx = 2;
		gbc_txtDateOfBirth.gridy = 9;
		add(txtDateOfBirth, gbc_txtDateOfBirth);
		txtDateOfBirth.setColumns(10);
		txtDateOfBirth.setEnabled(false);

		btnDate = new JButton("...");
		GridBagConstraints gbc_btnDate = new GridBagConstraints();
		gbc_btnDate.insets = new Insets(0, 0, 5, 5);
		gbc_btnDate.gridx = 3;
		gbc_btnDate.gridy = 9;
		add(btnDate, gbc_btnDate);
		btnDate.setEnabled(false);

		lblObservations = new JLabel("OBSERVACIONES");
		GridBagConstraints gbc_lblObservations = new GridBagConstraints();
		gbc_lblObservations.insets = new Insets(0, 0, 5, 5);
		gbc_lblObservations.gridx = 1;
		gbc_lblObservations.gridy = 10;
		add(lblObservations, gbc_lblObservations);

		txtObservations = new JTextField();
		GridBagConstraints gbc_txtObservations = new GridBagConstraints();
		gbc_txtObservations.gridwidth = 2;
		gbc_txtObservations.gridheight = 2;
		gbc_txtObservations.insets = new Insets(0, 0, 5, 5);
		gbc_txtObservations.fill = GridBagConstraints.BOTH;
		gbc_txtObservations.gridx = 2;
		gbc_txtObservations.gridy = 10;
		add(txtObservations, gbc_txtObservations);
		txtObservations.setColumns(10);
		txtObservations.setEnabled(false);

		btnModify = new JButton("MODIFICAR");
		GridBagConstraints gbc_btnModify = new GridBagConstraints();
		gbc_btnModify.gridwidth = 2;
		gbc_btnModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnModify.insets = new Insets(0, 0, 5, 5);
		gbc_btnModify.gridx = 2;
		gbc_btnModify.gridy = 12;
		add(btnModify, gbc_btnModify);
		btnModify.setEnabled(false);

	}

}
