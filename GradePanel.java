// Imported Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

public class GradePanel extends JPanel {
    private Student student;
    private DefaultListModel<String> subjectListModel;
    private JList<String> subjectList;
    private JTextField gradeField;

    public GradePanel(Student student) {
        this.student = student;
        setLayout(new BorderLayout());

        subjectListModel = new DefaultListModel<>();
        subjectList = new JList<>(subjectListModel);
        add(new JScrollPane(subjectList), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        gradeField = new JTextField(5);
        JButton addGradeBtn = new JButton("Add Grade");

        addGradeBtn.addActionListener(e -> {
            int index = subjectList.getSelectedIndex();
            if (index != -1 && !gradeField.getText().isEmpty()) {
                double grade = Double.parseDouble(gradeField.getText());
                student.getSubjects().get(index).addGrade(grade);
                updateSubjects();
            }
        });

        bottomPanel.add(new JLabel("Grade:"));
        bottomPanel.add(gradeField);
        bottomPanel.add(addGradeBtn);
        add(bottomPanel, BorderLayout.SOUTH);

        updateSubjects();
    }

    private void updateSubjects() {
        subjectListModel.clear();
        for (Subject s : student.getSubjects()) {
            subjectListModel.addElement(s.getName() + ": Avg " + s.getAverage());
        }
    }
}
