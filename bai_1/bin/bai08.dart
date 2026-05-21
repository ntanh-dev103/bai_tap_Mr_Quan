int tinhTong(int a, int b) => a + b;

void main() {
  int ketQua = tinhTong(15, 25);

  print("===== ARROW FUNCTION =====");
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
