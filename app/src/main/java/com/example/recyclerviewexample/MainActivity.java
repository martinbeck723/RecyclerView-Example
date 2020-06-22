package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsRecView=findViewById(R.id.contactRecView);
        //create our own adapter

        ArrayList<Contact> contacts =new ArrayList<>();
        //normally this come from a database
        contacts.add(new Contact("Jay Chow", "jaychow@qq.com", "https://www.channelnewsasia.com/image/11905830/1x1/600/600/8e5dea038bcf0f64c311c5ee3c72082b/YE/jay-chou-love-in-the-sky-hero.jpg"));
        contacts.add(new Contact("JJ Lin", "jjlin@qq.com", "https://archive.shine.cn/newsimage/2018/02/09/020180209201044.png"));
        contacts.add(new Contact("Jolin Tsai", "jolin@qq.com", "https://img.ltn.com.tw/Upload/liveNews/BigPic/600_phpaVpGPO.jpg"));
        contacts.add(new Contact("Ronghao Li", "ronghao@qq.com", "https://youngbean214.files.wordpress.com/2015/03/1.jpg?w=640"));
        contacts.add(new Contact("Rainie Yang", "rainie@qq.com", "https://www.8days.sg/image/12655004/16x9/1920/1080/a56d46b41123c96792efcacebed1b3f6/gn/ry1.jpg"));
    }
}
