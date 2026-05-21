void main() {
  Map<String, dynamic> sinhVien = {
    "name": "Lê Minh C",
    "age": 21,
    "gpa": 8.2,
  };

  print("===== THÔNG TIN SINH VIÊN BẰNG MAP =====");
  print("Toàn bộ Map: $sinhVien");
  print("Tên sinh viên: ${sinhVien["name"]}");
  print("Tuổi: ${sinhVien["age"]}");
  print("Điểm trung bình: ${sinhVien["gpa"]}");
}
