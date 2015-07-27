package controller;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.ObjectReaderImplements;
import model.ObjectWriterImpl;
import model.Student;

public class StudentManagerImpl implements StudentManager {

	private static final String ARCHIVO_STUDENT = "student.dat";
	private List<Student> listStudent = new ArrayList<Student>();
	private static int lastID = 1;

	public StudentManagerImpl() {

		try (ObjectReaderImplements reader = new ObjectReaderImplements(new File(ARCHIVO_STUDENT));) {
			while (true) {
				Student s = (Student) reader.nextObject();
				listStudent.add(s);
			}
		} catch (EOFException e) {
			// e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		for (Student student : listStudent) {
			if (lastID <= student.getIdentificador())
				lastID = student.getIdentificador() + 1;
		}
	}

	@Override
	public List<Student> getAllStudents() {
		return listStudent;
	}

	@Override
	public Student getStudent(int id) {
		for (Student student : listStudent) {
			if (student.getIdentificador() == id)
				return student;
		}
		return null;
	}

	@Override
	public Student getStudent(String dni) {
		for (Student student : listStudent) {
			if (student.getDni().equalsIgnoreCase(dni))
				return student;
		}
		return null;
	}

	@Override
	public Student createStudent(String dni, String name, String surnames) {
		Student s = new Student(lastID++, name, surnames, dni, null, null);
		try (ObjectWriterImpl writer = new ObjectWriterImpl(new File(ARCHIVO_STUDENT));) {
			writer.writeObject(s);
			listStudent.add(s);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

		return s;
	}

	@Override
	public void updateStudent(Student student) {

		deleteStudent(student);
		listStudent.add(student);
		try (ObjectWriterImpl writer = new ObjectWriterImpl(new File(ARCHIVO_STUDENT));) {
			writer.writeObject(student);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(Student student) {
		listStudent.remove(student);
		File f = new File(ARCHIVO_STUDENT);
		f.delete();
		try (ObjectWriterImpl writer = new ObjectWriterImpl(new File(ARCHIVO_STUDENT));) {
			for (Student s : listStudent) {
				writer.writeObject(s);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}