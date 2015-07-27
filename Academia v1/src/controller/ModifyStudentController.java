package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Student;
import view.ModifyStudentUI;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class ModifyStudentController extends ModifyStudentUI {
	StudentManager gestStudent;
	Student student;

	/**
	 * Create the panel.
	 */
	public ModifyStudentController(StudentManager s) {
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JFrame f = new JFrame();
				txtDateOfBirth.setText(new DatePicker(f).setPickedDate());
			}
		});
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student.setName(txtName.getText());
				student.setSurname(txtSurnames.getText());
				student.setObservation(txtObservations.getText());
				student.setDni(txtDniModify.getText());

				SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
				Date com;
				try {
					com = dateN.parse(txtDateOfBirth.getText());
					student.setDateOfBirth(com);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				gestStudent.updateStudent(student);

				JOptionPane.showMessageDialog(ModifyStudentController.this, "Modificado con éxito");
				txtName.setText("");
				txtSurnames.setText("");
				txtDniModify.setText("");
				txtDateOfBirth.setText("");
				txtObservations.setText("");

				txtName.setEnabled(false);
				txtSurnames.setEnabled(false);
				btnDate.setEnabled(false);
				txtObservations.setEnabled(false);

				btnModify.setEnabled(false);

			}
		});
		gestStudent = s;
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				student = gestStudent.getStudent(txtDni.getText());

				if (student != null) {
					txtDni.setText("");
					txtName.setText(student.getName());
					txtSurnames.setText(student.getSurname());
					txtDniModify.setText(student.getDni());

					SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
					Date d = student.getDateOfBirth();
					String fecha = dateN.format(d);
					txtDateOfBirth.setText(fecha);

					txtObservations.setText(student.getObservation());

					txtName.setEnabled(true);
					txtSurnames.setEnabled(true);
					btnDate.setEnabled(true);
					txtObservations.setEnabled(true);
					System.out.println(student.getIdentificador());

					btnModify.setEnabled(true);
				} else {
					JOptionPane.showMessageDialog(ModifyStudentController.this, "El estudiante que busca no existe",
							"Error", JOptionPane.WARNING_MESSAGE);
					txtDni.setText("");

					txtName.setText("");
					txtSurnames.setText("");
					txtDniModify.setText("");
					txtDateOfBirth.setText("");
					txtObservations.setText("");

					txtName.setEnabled(false);
					txtSurnames.setEnabled(false);
					btnDate.setEnabled(false);
					txtObservations.setEnabled(false);

					btnModify.setEnabled(false);

				}
			}
		});

	}

}
