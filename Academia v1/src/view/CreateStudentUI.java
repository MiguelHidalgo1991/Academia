package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class CreateStudentUI extends JPanel {
	protected JTextField txtName;
	protected JTextField txtSurnames;
	protected JTextField txtDni;
	protected JTextField txtDateOfBirth;
	protected JTextField txtObservations;
	protected JLabel lblObservations;
	protected JLabel lblDateOfBirth;
	protected JLabel lblDni;
	protected JLabel lblSurnames;
	protected JLabel lblName;
	protected JLabel lblTitle;
	protected JButton btnCrear;
	protected JButton btnDate;

	/**
	 * Create the panel.
	 */
	public CreateStudentUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 50, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblTitle = new JLabel("CREAR ALUMNO");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 21));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 2;
		gbc_lblTitle.gridy = 1;
		add(lblTitle, gbc_lblTitle);

		lblName = new JLabel("NOMBRE");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 3;
		add(lblName, gbc_lblName);

		txtName = new JTextField();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		gbc_txtName.gridwidth = 2;
		gbc_txtName.insets = new Insets(0, 0, 5, 5);
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridx = 2;
		gbc_txtName.gridy = 3;
		add(txtName, gbc_txtName);
		txtName.setColumns(10);

		lblSurnames = new JLabel("APELLIDOS");
		GridBagConstraints gbc_lblSurnames = new GridBagConstraints();
		gbc_lblSurnames.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurnames.gridx = 1;
		gbc_lblSurnames.gridy = 4;
		add(lblSurnames, gbc_lblSurnames);

		txtSurnames = new JTextField();
		GridBagConstraints gbc_txtSurnames = new GridBagConstraints();
		gbc_txtSurnames.gridwidth = 2;
		gbc_txtSurnames.insets = new Insets(0, 0, 5, 5);
		gbc_txtSurnames.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSurnames.gridx = 2;
		gbc_txtSurnames.gridy = 4;
		add(txtSurnames, gbc_txtSurnames);
		txtSurnames.setColumns(10);

		lblDni = new JLabel("DNI");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 5;
		add(lblDni, gbc_lblDni);

		txtDni = new JTextField();
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.gridwidth = 2;
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 5;
		add(txtDni, gbc_txtDni);
		txtDni.setColumns(10);

		lblDateOfBirth = new JLabel("FECHA NACIMIENTO");
		GridBagConstraints gbc_lblDateOfBirth = new GridBagConstraints();
		gbc_lblDateOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateOfBirth.gridx = 1;
		gbc_lblDateOfBirth.gridy = 6;
		add(lblDateOfBirth, gbc_lblDateOfBirth);

		txtDateOfBirth = new JTextField();
		GridBagConstraints gbc_txtDateOfBirth = new GridBagConstraints();
		gbc_txtDateOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_txtDateOfBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDateOfBirth.gridx = 2;
		gbc_txtDateOfBirth.gridy = 6;
		add(txtDateOfBirth, gbc_txtDateOfBirth);
		txtDateOfBirth.setColumns(10);
		txtDateOfBirth.setEnabled(false);

		btnDate = new JButton("...");
		GridBagConstraints gbc_btnDate = new GridBagConstraints();
		gbc_btnDate.anchor = GridBagConstraints.WEST;
		gbc_btnDate.insets = new Insets(0, 0, 5, 5);
		gbc_btnDate.gridx = 3;
		gbc_btnDate.gridy = 6;
		add(btnDate, gbc_btnDate);
		// btnDate.setEnabled(false);
		btnDate.setFocusable(false);

		lblObservations = new JLabel("OBSERVACIONES");
		GridBagConstraints gbc_lblObservations = new GridBagConstraints();
		gbc_lblObservations.insets = new Insets(0, 0, 5, 5);
		gbc_lblObservations.gridx = 1;
		gbc_lblObservations.gridy = 7;
		add(lblObservations, gbc_lblObservations);

		txtObservations = new JTextField();
		GridBagConstraints gbc_txtObservations = new GridBagConstraints();
		gbc_txtObservations.gridwidth = 2;
		gbc_txtObservations.gridheight = 2;
		gbc_txtObservations.insets = new Insets(0, 0, 5, 5);
		gbc_txtObservations.fill = GridBagConstraints.BOTH;
		gbc_txtObservations.gridx = 2;
		gbc_txtObservations.gridy = 7;
		add(txtObservations, gbc_txtObservations);
		txtObservations.setColumns(10);

		btnCrear = new JButton("CREAR");
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.gridwidth = 2;
		gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrear.gridx = 2;
		gbc_btnCrear.gridy = 9;
		add(btnCrear, gbc_btnCrear);

	}

}
