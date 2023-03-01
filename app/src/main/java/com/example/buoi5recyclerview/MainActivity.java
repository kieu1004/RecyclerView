package com.example.buoi5recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private WordViewHolder mViewHolder;
    private LinkedList<Blog> mBlogList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBlogList.add(new Blog(R.drawable.cuchimatdiem,
                "5 lỗi cơ bản trong giao tiếp",
                "Nhiệt tình mà chẳng được lòng người? 5 Lỗi giao tiếp gây mất điểm",
                "Tiên trách kỷ, hậu trách nhân. Nếu đồng nghiệp có vẻ “lấn cấn” khi bạn tò te bắt chuyện thì đây là 5 nguyên nhân bạn có thể tự hỏi mình trước khi hỏi người."));
        mBlogList.add(new Blog(R.drawable.intellectualchic,
                "Intellectual Chic",
                "Những bộ cánh giúp bạn trông “tri thức” hơn ",
                "Khi ai đó nói gu của họ là sapiosexual, rất có thể họ đang nghĩ đến những người diện trang phục theo phong cách Intellectual chic. "));
        mBlogList.add(new Blog(R.drawable.memehocmydieu,
                "Meme Học - Mỹ Diệu",
                "Mỹ Diệu điệu cả thế gian một tiếng cười",
                "Cô mèo ta đang khiến cộng đồng mạng trầm trồ. Mỹ Diệu được biết đến qua trang facebook Vitamin Mèo"));
        mBlogList.add(new Blog(R.drawable.meta,
                "Meta thu phí tích xanh",
                "Dịch vụ tích xanh thu phí mới của Meta nói gì về danh tính trên mạng?",
                "Mới đây, Meta thông báo rằng người dùng Facebook và Instagram sẽ có thể trả phí để nhận tích xanh nhằm xác minh tài khoản chính chủ. Dịch vụ này tên là Meta Verified, có giá 11.99 USD cho người dùng trên nền tảng web, và 14.99 USD trên nền tảng iOS và Android. Những cá nhân đã có tích xanh từ trước sẽ không bị ảnh hưởng bởi dịch vụ này."));
        mBlogList.add(new Blog(R.drawable.cudecon,
                "Series Cứ để con",
                "Những chủ đề bạn nên trò chuyện với bố mẹ trước 30 tuổi",
                "Dù sớm hay muộn, ngày mà chúng ta đổi vai trở thành người chăm sóc bố mẹ là điều không thể tránh khỏi. Bạn đã chuẩn bị gì cho hành trình này? \nNhưng dù sớm hay muộn, nhanh hay chậm, đây là một sự chuyển giao trong cuộc sống mà ta không thể nào tránh khỏi. Và sau đây là những chủ đề mà bạn nên trò chuyện cùng bố mẹ để chuẩn bị cho quá trình này."));
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mBlogList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}