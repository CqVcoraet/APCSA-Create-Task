// Imported Packages
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Attendance {
    private ArrayList<LocalDate> dates;
    private HashMap<LocalDate, String> status; // "Present", "Absent", "Late"
    private HashMap<LocalDate, String> comments;
    private HashMap<LocalDate, String> reasons; // "Sick", "Vacation", "Other"
    private HashMap<LocalDate, String> notes; // Additional notes for each date
    private HashMap<LocalDate, String> attendanceType; // "Full Day", "Half Day", "Leave"
    private HashMap<LocalDate, String> attendanceStatus; // "Excused", "Unexcused"
    private HashMap<LocalDate, String> attendanceRate; // "Excellent", "Good", "Average", "Poor"

    // Methods: markAttendance(), getAttendanceRate()
    public void markAttendance(LocalDate date, String status, String comment, String reason, String note, String type, String attendanceStatus, String attendanceRate) {
        this.dates.add(date);
        this.status.put(date, status);
        this.comments.put(date, comment);
        this.reasons.put(date, reason);
        this.notes.put(date, note);
        this.attendanceType.put(date, type);
        this.attendanceStatus.put(date, attendanceStatus);
        this.attendanceRate.put(date, attendanceRate);
    }
    
    // Constructor
    public Attendance() {
        this.dates = new ArrayList<>();
        this.status = new HashMap<>();
        this.comments = new HashMap<>();
        this.reasons = new HashMap<>();
        this.notes = new HashMap<>();
        this.attendanceType = new HashMap<>();
        this.attendanceStatus = new HashMap<>();
        this.attendanceRate = new HashMap<>();
    }

    // Getters and Setters
    public String getAttendanceRate(LocalDate date) {
        return this.attendanceRate.get(date);
    }
    public String getAttendanceStatus(LocalDate date) {
        return this.attendanceStatus.get(date);
    }
    public String getAttendanceType(LocalDate date) {
        return this.attendanceType.get(date);
    }
    public String getStatus(LocalDate date) {
        return this.status.get(date);
    }
    public String getComment(LocalDate date) {
        return this.comments.get(date);
    }
    public String getReason(LocalDate date) {
        return this.reasons.get(date);
    }
    public String getNote(LocalDate date) {
        return this.notes.get(date);
    }
    public List<LocalDate> getDates() {
        return this.dates;
    }
    public Map<LocalDate, String> getStatusMap() {
        return this.status;
    }
    public Map<LocalDate, String> getCommentsMap() {
        return this.comments;
    }
    public Map<LocalDate, String> getReasonsMap() {
        return this.reasons;
    }
    public Map<LocalDate, String> getNotesMap() {
        return this.notes;
    }
    public Map<LocalDate, String> getAttendanceTypeMap() {
        return this.attendanceType;
    }
    public Map<LocalDate, String> getAttendanceStatusMap() {
        return this.attendanceStatus;
    }
    public Map<LocalDate, String> getAttendanceRateMap() {
        return this.attendanceRate;
    }
    public void setStatus(LocalDate date, String status) {
        this.status.put(date, status);
    }
    public void setComment(LocalDate date, String comment) {
        this.comments.put(date, comment);
    }
    public void setReason(LocalDate date, String reason) {
        this.reasons.put(date, reason);
    }
    public void setNote(LocalDate date, String note) {
        this.notes.put(date, note);
    }
    public void setAttendanceType(LocalDate date, String type) {
        this.attendanceType.put(date, type);
    }
    public void setAttendanceStatus(LocalDate date, String status) {
        this.attendanceStatus.put(date, status);
    }
    public void setAttendanceRate(LocalDate date, String rate) {
        this.attendanceRate.put(date, rate);
    }
    public void setDates(ArrayList<LocalDate> dates) {
        this.dates = dates;
    }
    public void setStatusMap(HashMap<LocalDate, String> status) {
        this.status = status;
    }
    public void setCommentsMap(HashMap<LocalDate, String> comments) {
        this.comments = comments;
    }
    public void setReasonsMap(HashMap<LocalDate, String> reasons) {
        this.reasons = reasons;
    }
    public void setNotesMap(HashMap<LocalDate, String> notes) {
        this.notes = notes;
    }
    public void setAttendanceTypeMap(HashMap<LocalDate, String> attendanceType) {
        this.attendanceType = attendanceType;
    }
    public void setAttendanceStatusMap(HashMap<LocalDate, String> attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
    public void setAttendanceRateMap(HashMap<LocalDate, String> attendanceRate) {
        this.attendanceRate = attendanceRate;
    }
    public void addDate(LocalDate date) {
        this.dates.add(date);
    }
    public void removeDate(LocalDate date) {
        this.dates.remove(date);
        this.status.remove(date);
        this.comments.remove(date);
        this.reasons.remove(date);
        this.notes.remove(date);
        this.attendanceType.remove(date);
        this.attendanceStatus.remove(date);
        this.attendanceRate.remove(date);
    }
}
