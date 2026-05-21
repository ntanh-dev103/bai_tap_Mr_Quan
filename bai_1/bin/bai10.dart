class SinhVien {
  String name;
  int age;
  double gpa;

  SinhVien(this.name, this.age, this.gpa);

  void hienThiThongTin() {
    print("===== THÔNG TIN SINH VIÊN =====");
    print("Tên sinh viên: $name");
    print("Tuổi: $age");
    print("Điểm trung bình: $gpa");
    print("------------------------------");
  }
}

void main() {
  SinhVien sv1 = SinhVien("Nguyễn Văn A", 20, 8.5);
  SinhVien sv2 = SinhVien("Trần Thị B", 21, 7.8);

  sv1.hienThiThongTin();
  sv2.hienThiThongTin();
}
