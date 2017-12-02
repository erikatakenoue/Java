package jp.techacademy.erika.takenoue.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

    static String to_jp = "人間";

    String hobby;

    public Human() {
        name = "";
        age = 0;
        hobby = "";
    }

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    public static void introduce() {
        Log.d("javatest", "これは人間クラスです。");
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)");
    }

        @Override
        public void think() {
            Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
