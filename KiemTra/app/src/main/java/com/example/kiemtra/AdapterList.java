package com.example.kiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterList extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CongAn> ListDS;

    public AdapterList(Context context, int layout, List<CongAn> listDS) {
        this.context = context;
        this.layout = layout;
        this.ListDS = listDS;
    }

    @Override
    public int getCount() {
        return ListDS.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imgHinh = (ImageView) view.findViewById(R.id.Hinh);
        TextView textTen = (TextView) view.findViewById(R.id.Ten);
        TextView textCapBat = (TextView) view.findViewById(R.id.CapBat);
        TextView textDiaChi = (TextView) view.findViewById(R.id.DiaChi);
        TextView textSoSao = (TextView) view.findViewById(R.id.SoSao);
        CongAn congan = ListDS.get(i);
        imgHinh.setImageResource(congan.getHinh());
        textTen.setText(textTen.getText()+congan.getTen());
        textCapBat.setText(textCapBat.getText()+congan.getCapbat());
        textDiaChi.setText(textDiaChi.getText()+congan.getDiachi());
        textSoSao.setText(textSoSao.getText()+congan.getSosao());
        return view;
    }

}
