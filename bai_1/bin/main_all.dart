void main() {
  bai1();
  bai2();
  bai3();
  bai4();
  bai5();
  bai6();
  bai7();
  bai8();
  bai9();
  bai10();
}

void bai1() {
  String tenSinhVien = "Nguyễn Văn A";
  int tuoi = 20;
  double diemTrungBinh = 8.5;
  bool daTotNghiep = false;

  var lop = "CNTT K15";
  final String truong = "Trường Đại học ABC";
  const String quocGia = "Việt Nam";

  print("\n===== BÀI 1: THÔNG TIN SINH VIÊN =====");
  print("Tên sinh viên: $tenSinhVien");
  print("Tuổi: $tuoi");
  print("Lớp: $lop");
  print("Điểm trung bình: $diemTrungBinh");
  print("Trạng thái tốt nghiệp: $daTotNghiep");
  print("Trường: $truong");
  print("Quốc gia: $quocGia");
}

void bai2() {
  int a = 10;
  double b = 3.5;

  print("\n===== BÀI 2: PHÉP TOÁN VỚI SỐ =====");
  print("Cộng: $a + $b = ${a + b}");
  print("Trừ: $a - $b = ${a - b}");
  print("Nhân: $a * $b = ${a * b}");
  print("Chia: $a / $b = ${a / b}");
}

void bai3() {
  String hoTen = "Trần Thị B";
  double diem = 7.0;
  bool isPassed = diem >= 5;

  print("\n===== BÀI 3: KIỂM TRA ĐẬU/RỚT =====");
  print("Họ tên: $hoTen");
  print("Điểm: $diem");
  print(isPassed ? "Sinh viên đậu" : "Sinh viên rớt");
}

void bai4() {
  List<int> numbers = [5, 10, 15, 20, 25];
  int tong = 0;

  for (int number in numbers) {
    tong += number;
  }

  print("\n===== BÀI 4: LÀM VIỆC VỚI LIST =====");
  print("Danh sách: $numbers");
  print("Phần tử đầu tiên: ${numbers.first}");
  print("Phần tử cuối cùng: ${numbers.last}");
  print("Tổng các phần tử: $tong");
}

void bai5() {
  Map<String, dynamic> sinhVien = {
    "name": "Lê Minh C",
    "age": 21,
    "gpa": 8.2,
  };

  print("\n===== BÀI 5: LÀM VIỆC VỚI MAP =====");
  print("Toàn bộ Map: $sinhVien");
  print("Tên sinh viên: ${sinhVien["name"]}");
  print("Tuổi: ${sinhVien["age"]}");
  print("Điểm trung bình: ${sinhVien["gpa"]}");
}

void hello() {
  print("Hello Dart");
}

void bai6() {
  print("\n===== BÀI 6: HÀM KHÔNG CÓ THAM SỐ =====");
  hello();
}

int tinhTongBai7(int a, int b) {
  return a + b;
}

void bai7() {
  int ketQua = tinhTongBai7(10, 20);

  print("\n===== BÀI 7: HÀM CÓ THAM SỐ VÀ TRẢ VỀ =====");
  print("Tổng là: $ketQua");
}

int tinhTongBai8(int a, int b) => a + b;

void bai8() {
  int ketQua = tinhTongBai8(15, 25);

  print("\n===== BÀI 8: ARROW FUNCTION =====");
  print("Tổng là: $ketQua");

  // Hàm thường nên dùng khi:
  // - Hàm có nhiều dòng xử lý.
  // - Có nhiều điều kiện if/else.
  // - Cần xử lý logic phức tạp.

  // Arrow function nên dùng khi:
  // - Hàm chỉ có một dòng lệnh.
  // - Logic đơn giản.
  // - Muốn code ngắn gọn, dễ đọc.
}

int tinhTongList(List<int> list) {
  int tong = 0;

  for (int number in list) {
    tong += number;
  }

  return tong;
}

void bai9() {
  List<int> numbers = [2, 4, 6, 8, 10];
  int ketQua = tinhTongList(numbers);

  print("\n===== BÀI 9: HÀM XỬ LÝ DANH SÁCH =====");
  print("Danh sách: $numbers");
  print("Tổng các phần tử: $ketQua");
}

void bai10() {
  SinhVien sv1 = SinhVien("Nguyễn Văn A", 20, 8.5);
  SinhVien sv2 = SinhVien("Trần Thị B", 21, 7.8);

  print("\n===== BÀI 10: CLASS SINH VIÊN =====");
  sv1.hienThiThongTin();
  sv2.hienThiThongTin();
}

class SinhVien {
  String name;
  int age;
  double gpa;

  SinhVien(this.name, this.age, this.gpa);

  void hienThiThongTin() {
    print("Tên sinh viên: $name");
    print("Tuổi: $age");
    print("Điểm trung bình: $gpa");
    print("------------------------------");
  }
}
