package jp.techacademy.erika.takenoue.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("竹ノ上衿佳", 21, "音楽");

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "年は" + human.age + "歳です。");

        human.think();
    }
}
