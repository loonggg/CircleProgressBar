# CircleProgressBar
圆环进度动态显示

## CircleProgressBar使用手册

### 效果图
![](http://7xsgef.com1.z0.glb.clouddn.com/sss2.gif)

### 第一步：引用方式，包的依赖
在build.gradle中添加如下引用：
```
compile 'com.loonggg.godcoder.view:circleprogressbarlibrary:1.0.1'
```

### 第二步：xml文件中使用
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:loonggg="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.loonggg.godcoder.MainActivity">

    <com.loonggg.circleprogressbarlibrary.view.CircleProgressBar
        android:id="@+id/pb"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:layout_centerInParent="true"
        loonggg:bgProgressBarColor="#efefef"
        loonggg:circleStrokeWidth="10dp" />
</RelativeLayout>
```
* bgProgressBarColor是圆环底部的背景
* circleStrokeWidth 是圆环的宽度

### 第三步：Acitivity中的调用
```
CircleProgressBar bar = (CircleProgressBar) findViewById(R.id.pb);
bar.setProgress(0.5f, 4000);
```
####setProgress(0.5f,4000);
* 0.5f是圆环完成率，在0-1f之间
* 4000是圆环动画时间，毫秒值

### 微信公众号
欢迎大家关注我的微信公众号：非著名程序员（smart_android），更多好的原创文章均首发于微信订阅号：非著名程序员
![](https://raw.githubusercontent.com/loonggg/BlogImages/master/%E5%85%AC%E4%BC%97%E5%8F%B7%E4%BA%8C%E7%BB%B4%E7%A0%81/erweima.jpg)



