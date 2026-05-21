package com.example.danhsachjava;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductRecyclerActivity extends Activity {

    private RecyclerView recyclerProduct;
    private ArrayList<Product> productList;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_recycler);

        recyclerProduct = findViewById(R.id.recyclerProduct);

        productList = new ArrayList<>();
        productList.add(new Product("Điện thoại Samsung Galaxy A15", 4990000, "Màn hình lớn, pin khỏe, phù hợp học tập và giải trí."));
        productList.add(new Product("Laptop Dell Inspiron", 14500000, "Laptop văn phòng, hiệu năng ổn định, thiết kế bền bỉ."));
        productList.add(new Product("Tai nghe Bluetooth Sony", 1290000, "Âm thanh rõ, kết nối nhanh, thời lượng pin tốt."));
        productList.add(new Product("Chuột Logitech M331", 350000, "Chuột không dây yên tĩnh, nhỏ gọn, dễ sử dụng."));
        productList.add(new Product("Bàn phím cơ AKKO", 1590000, "Gõ êm, đèn nền đẹp, phù hợp lập trình và chơi game."));
        productList.add(new Product("Màn hình LG 24 inch", 2890000, "Màn hình Full HD, màu sắc tốt, phù hợp học online."));
        productList.add(new Product("Ổ cứng SSD Kingston 500GB", 1250000, "Tốc độ cao, nâng cấp máy tính hiệu quả."));
        productList.add(new Product("Loa Bluetooth JBL", 1790000, "Âm bass mạnh, thiết kế nhỏ gọn, dễ mang theo."));

        productAdapter = new ProductAdapter(productList);
        recyclerProduct.setLayoutManager(new LinearLayoutManager(this));
        recyclerProduct.setAdapter(productAdapter);
    }
}
