package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteStudentUI extends JPanel {

	protected JTextField txtDni;
	protected JTextField txtName;
	protected JTextField txtSurnames;
	protected JTextField txtDniDelete;
	protected JTextField txtDateOfBirth;
	protected JTextField txtObservations;
	protected JLabel lblObservations;
	protected JLabel lblDateOfBirth;
	protected JLabel lblDniDelete;
	protected JLabel lblSurnames;
	protected JLabel lblName;
	protected JLabel lblDni;
	protected JButton btnFind;
	protected JButton btnDelete;
	private JLabel lblDeleteStudent;
	protected JButton btnDate;
	/**
	 * Create the panel.
	 */
	public DeleteStudentUI() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 50, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblDeleteStudent = new JLabel("BORRAR ALUMNO");
		lblDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblDeleteStudent = new GridBagConstraints();
		gbc_lblDeleteStudent.gridwidth = 3;
		gbc_lblDeleteStudent.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeleteStudent.gridx = 1;
		gbc_lblDeleteStudent.gridy = 1;
		add(lblDeleteStudent, gbc_lblDeleteStudent);

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

		lblDniDelete = new JLabel("DNI");
		GridBagConstraints gbc_lblDniDelete = new GridBagConstraints();
		gbc_lblDniDelete.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniDelete.gridx = 1;
		gbc_lblDniDelete.gridy = 8;
		add(lblDniDelete, gbc_lblDniDelete);

		txtDniDelete = new JTextField();
		GridBagConstraints gbc_txtDniDelete = new GridBagConstraints();
		gbc_txtDniDelete.gridwidth = 2;
		gbc_txtDniDelete.insets = new Insets(0, 0, 5, 5);
		gbc_txtDniDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDniDelete.gridx = 2;
		gbc_txtDniDelete.gridy = 8;
		add(txtDniDelete, gbc_txtDniDelete);
		txtDniDelete.setColumns(10);
		txtDniDelete.setEnabled(false);

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

		btnDelete = new JButton("BORRAR");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.gridwidth = 2;
		gbc_btnDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelete.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelete.gridx = 2;
		gbc_btnDelete.gridy = 12;
		add(btnDelete, gbc_btnDelete);
		btnDelete.setEnabled(false);
		
	}

}
