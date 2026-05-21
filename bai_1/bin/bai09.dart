int tinhTongList(List<int> list) {
  int tong = 0;

  for (int number in list) {
    tong += number;
  }

  return tong;
}

void main() {
  List<int> numbers = [2, 4, 6, 8, 10];

  int ketQua = tinhTongList(numbers);

  print("===== TÍNH TỔNG DANH SÁCH =====");
  print("Danh sách: $numbers");
  print("Tổng các phần tử: $ketQua");
}
