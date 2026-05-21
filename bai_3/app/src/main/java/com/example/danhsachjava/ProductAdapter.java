package com.example.danhsachjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private ArrayList<Product> productList;

    public ProductAdapter(ArrayList<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("vi", "VN"));
        String priceText = numberFormat.format(product.getPrice()) + " VNĐ";

        holder.txtProductName.setText(product.getName());
        holder.txtProductPrice.setText("Giá: " + priceText);
        holder.txtProductDescription.setText("Mô tả: " + product.getDescription());

        holder.itemView.setOnClickListener(v -> Toast.makeText(
                v.getContext(),
                "Bạn đã chọn: " + product.getName(),
                Toast.LENGTH_SHORT
        ).show());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView txtProductName;
        TextView txtProductPrice;
        TextView txtProductDescription;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProductName = itemView.findViewById(R.id.txtProductName);
            txtProductPrice = itemView.findViewById(R.id.txtProductPrice);
            txtProductDescription = itemView.findViewById(R.id.txtProductDescription);
        }
    }
}
