void main() {
  String hoTen = "Trần Thị B";
  double diem = 7.0;

  bool isPassed = diem >= 5;

  print("===== KẾT QUẢ HỌC TẬP =====");
  print("Họ tên: $hoTen");
  print("Điểm: $diem");

  if (isPassed) {
    print("Sinh viên đậu");
  } else {
    print("Sinh viên rớt");
  }
}
