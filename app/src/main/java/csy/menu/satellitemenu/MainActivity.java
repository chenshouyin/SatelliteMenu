package csy.menu.satellitemenu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import csy.menu.satellitemenulib.view.SatelliteMenu;

/**
 * Created by csy on 2017/10/10.
 * 最多显示5个子菜单,如果需要显示更多,可自己做拓展
 * 微信公众号:陈守印同学
 * https://github.com/chenshouyin/SatelliteMenu
 */
public class MainActivity extends AppCompatActivity {

    private SatelliteMenu mSatelliteMenuLeftTop, mSatelliteMenuRightTop, mSatelliteMenuRightBottom, mSatelliteMenuLeftBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSatelliteMenuLeftTop = (SatelliteMenu) findViewById(R.id.mSatelliteMenuLeftTop);
        mSatelliteMenuRightTop = (SatelliteMenu) findViewById(R.id.mSatelliteMenuRightTop);
        mSatelliteMenuRightBottom = (SatelliteMenu) findViewById(R.id.mSatelliteMenuRightBottom);
        mSatelliteMenuLeftBottom = (SatelliteMenu) findViewById(R.id.mSatelliteMenuLeftBottom);

        List<Integer> imageResourceLeftTop = new ArrayList<>();//菜单图片,可根据需要设置子菜单个数
        imageResourceLeftTop.add(R.drawable.imag_msg);
        imageResourceLeftTop.add(R.drawable.imag_music);
        imageResourceLeftTop.add(R.drawable.imag_pic);
        imageResourceLeftTop.add(R.drawable.imag_take_photo);
        imageResourceLeftTop.add(R.drawable.imag_tel);
        List<String> nameMenuItem = new ArrayList<>();//菜单图片,可根据需要设置子菜单个数
        nameMenuItem.add("短信");
        nameMenuItem.add("音乐");
        nameMenuItem.add("图库");
        nameMenuItem.add("相机");
        nameMenuItem.add("电话");
        mSatelliteMenuLeftTop.getmBuilder()
                .setMenuItemNameTexts(nameMenuItem)
                .setMenuImage(R.drawable.menu)
                .setMenuItemImageResource(imageResourceLeftTop)
                .setOnMenuItemClickListener(new SatelliteMenu.OnMenuItemClickListener() {
                    @Override
                    public void onClick(View view, int postion) {
                        Toast.makeText(MainActivity.this, "点击了菜单:" + postion, Toast.LENGTH_LONG).show();
                    }
                })
                .creat();

        List<Integer> imageResourceRightTop = new ArrayList<>();//菜单图片,可根据需要设置子菜单个数
        imageResourceRightTop.add(R.drawable.imag_msg);
        imageResourceRightTop.add(R.drawable.imag_music);
        imageResourceRightTop.add(R.drawable.imag_pic);
        imageResourceRightTop.add(R.drawable.imag_take_photo);
        imageResourceRightTop.add(R.drawable.imag_tel);
        imageResourceRightTop.add(R.drawable.iv_move);
        mSatelliteMenuRightTop.getmBuilder()
                .setMenuImage(R.drawable.menu)
                .setMenuItemImageResource(imageResourceRightTop)
                .setOnMenuItemClickListener(new SatelliteMenu.OnMenuItemClickListener() {
                    @Override
                    public void onClick(View view, int postion) {
                        Toast.makeText(MainActivity.this, "点击了菜单:" + postion, Toast.LENGTH_LONG).show();
                    }
                })
                .creat();

        List<Integer> imageResourceLeftBottom = new ArrayList<>();//菜单图片,可根据需要设置子菜单个数
        imageResourceLeftBottom.add(R.drawable.imag_msg);
        imageResourceLeftBottom.add(R.drawable.imag_music);
        imageResourceLeftBottom.add(R.drawable.imag_pic);
        imageResourceLeftBottom.add(R.drawable.imag_take_photo);
        imageResourceLeftBottom.add(R.drawable.imag_tel);
        imageResourceLeftBottom.add(R.drawable.iv_move);
        imageResourceLeftBottom.add(R.drawable.iv_time);

        mSatelliteMenuLeftBottom.getmBuilder()
                .setMenuImage(R.drawable.menu)
                .setMenuItemImageResource(imageResourceLeftBottom)
                .setOnMenuItemClickListener(new SatelliteMenu.OnMenuItemClickListener() {
                    @Override
                    public void onClick(View view, int postion) {
                        Toast.makeText(MainActivity.this, "点击了菜单:" + postion, Toast.LENGTH_LONG).show();
                    }
                })
                .creat();

        List<Integer> imageResourceRightBottom = new ArrayList<>();//菜单图片,可根据需要设置子菜单个数
        imageResourceRightBottom.add(R.drawable.imag_msg);
        imageResourceRightBottom.add(R.drawable.imag_music);
        imageResourceRightBottom.add(R.drawable.imag_pic);
        imageResourceRightBottom.add(R.drawable.imag_take_photo);
        imageResourceRightBottom.add(R.drawable.imag_tel);
        imageResourceRightBottom.add(R.drawable.iv_move);
        imageResourceRightBottom.add(R.drawable.iv_time);
        imageResourceRightBottom.add(R.drawable.iv_mobile);

        mSatelliteMenuRightBottom.getmBuilder()
                .setMenuImage(R.drawable.menu)
                .setMenuItemImageResource(imageResourceRightBottom)
                .setOnMenuItemClickListener(new SatelliteMenu.OnMenuItemClickListener() {
                    @Override
                    public void onClick(View view, int postion) {
                        Toast.makeText(MainActivity.this, "点击了菜单:" + postion, Toast.LENGTH_LONG).show();
                    }
                })
                .creat();
    }

    public void myOnclick(View view) {
        if (view.getId() == R.id.btText) {
            Toast.makeText(MainActivity.this, "项目Github地址,喜欢就给个Star吧", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Uri content_url = Uri.parse("https://github.com/chenshouyin");
            intent.setData(content_url);
            startActivity(intent);
        }
    }
}