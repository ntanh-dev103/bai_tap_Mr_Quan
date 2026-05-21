void main() {
  List<int> numbers = [5, 10, 15, 20, 25];

  int tong = 0;

  for (int number in numbers) {
    tong += number;
  }

  print("===== DANH SÁCH SỐ NGUYÊN =====");
  print("Danh sách: $numbers");
  print("Phần tử đầu tiên: ${numbers.first}");
  print("Phần tử cuối cùng: ${numbers.last}");
  print("Tổng các phần tử: $tong");
}
