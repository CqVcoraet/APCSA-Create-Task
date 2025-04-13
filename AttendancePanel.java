// Imported Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class AttendancePanel extends JPanel {
    private Student student;
    private DefaultListModel<String> attendanceListModel;

    public AttendancePanel(Student student) {
        this.student = student;
        setLayout(new BorderLayout());

        attendanceListModel = new DefaultListModel<>();
        JList<String> attendanceList = new JList<>(attendanceListModel);
        add(new JScrollPane(attendanceList), BorderLayout.CENTER);

        JPanel controls = new JPanel();
        JButton markPresent = new JButton("Mark Present");
        JButton markAbsent = new JButton("Mark Absent");

        markPresent.addActionListener(e -> mark("Present"));
        markAbsent.addActionListener(e -> mark("Absent"));

        controls.add(markPresent);
        controls.add(markAbsent);
        add(controls, BorderLayout.SOUTH);

        updateAttendanceList();
    }

    private void mark(String status) {
        LocalDate today = LocalDate.now();
        student.getAttendance().markAttendance(today, status);
        updateAttendanceList();
    }

    private void updateAttendanceList() {
        attendanceListModel.clear();
        for (LocalDate date : student.getAttendance().getDates()) {
            attendanceListModel.addElement(date + ": " + student.getAttendance().getStatus().get(date));
        }
    }
}
