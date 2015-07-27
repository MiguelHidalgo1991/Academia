package controller;

import model.Student;
import view.DeleteStudentUI;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

public class DeleteStudentController extends DeleteStudentUI {
	StudentManager gestStudent;
	Student student;

	/**
	 * Create the panel.
	 */
	public DeleteStudentController(StudentManager s) {
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JFrame f = new JFrame();
				txtDateOfBirth.setText(new DatePicker(f).setPickedDate());
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestStudent.deleteStudent(student);

				txtName.setText("");
				txtSurnames.setText("");
				txtDniDelete.setText("");
				txtDateOfBirth.setText("");
				txtObservations.setText("");
				JOptionPane.showMessageDialog(DeleteStudentController.this, "Estudiante Borrado con Éxito");
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
					txtDniDelete.setText(student.getDni());

					SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
					Date d = student.getDateOfBirth();
					String fecha = dateN.format(d);
					txtDateOfBirth.setText(fecha);

					txtObservations.setText(student.getObservation());

					txtName.setEnabled(true);
					txtSurnames.setEnabled(true);
					txtDateOfBirth.setEnabled(true);
					txtObservations.setEnabled(true);
					System.out.println(student.getIdentificador());

					btnDelete.setEnabled(true);
				} else {
					JOptionPane.showMessageDialog(DeleteStudentController.this, "El estudiante que busca no existe",
							"Error", JOptionPane.WARNING_MESSAGE);
					txtDni.setText("");

					txtName.setText("");
					txtSurnames.setText("");
					txtDniDelete.setText("");
					txtDateOfBirth.setText("");
					txtObservations.setText("");

					txtName.setEnabled(false);
					txtSurnames.setEnabled(false);
					txtDateOfBirth.setEnabled(false);
					txtObservations.setEnabled(false);

					btnDelete.setEnabled(false);

				}
			}
		});

	}

}
