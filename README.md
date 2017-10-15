#特性:
* 支持上下左右四个方向展开弧形菜单
* 支持扩展菜单,理论上多少个子菜单都可以
* 支持自定义菜单图标和子菜单图标
* 支持自定义菜单弹出的圆弧半径
* 支持设置菜单按钮和子菜单按钮大小
* 支持是否显示子菜单文字

#效果图:<br>
![效果图](http://upload-images.jianshu.io/upload_images/2704327-b0bb086efec5176d.gif?imageMogr2/auto-orient/strip)

#使用
```java
compile 'csy.menu.satellitemenulib:SatelliteMenu:1.0.3'
```

#使用介绍:

| xml属性        | 描述           | 值  |
| :-------------: |:-------------:| :------:|
| radius      | 圆弧直径 | dimension |
| menu_image_width     | 菜单大小      |   dimension |
| menu_item_image_width | 子菜单大小      |    dimension |
| menu_item_text_size      | 子菜单文字大小 | dimension |
| menu_item_text_color     | 子菜单文字颜色      |   color |
| menu_postion | 菜单展开方向      |    left_top，right_top，left_bottom，right_bottom |

#布局中使用
* 左上<br>
![左上（带文字）](http://upload-images.jianshu.io/upload_images/2704327-e9555b8adeb1eab3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 右上<br>
![右上](http://upload-images.jianshu.io/upload_images/2704327-d9aee4468060bc6e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 左下<br>
![左下](http://upload-images.jianshu.io/upload_images/2704327-3978fffea4e9c52e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 右下<br>
![右下](http://upload-images.jianshu.io/upload_images/2704327-6d7e9f2dd2eea526.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#代码中使用
* 左上（带文字）<br>
![左上（带文字）](http://upload-images.jianshu.io/upload_images/2704327-9e42a6294228587a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 右上<br>
![右上](http://upload-images.jianshu.io/upload_images/2704327-a1396daa21e94dfb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 左下<br>
![左下](http://upload-images.jianshu.io/upload_images/2704327-f5b9c499c337b60f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 右下<br>
![右下](http://upload-images.jianshu.io/upload_images/2704327-e010711a23511c60.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


#传送门
[Github地址](https://github.com/chenshouyin/SatelliteMenu) https://github.com/chenshouyin/SatelliteMenu
喜欢的话给个**Star**哦

#知识点总结
* 属性动画的应用
* 代码中动态添加布局
* 自定义View相关知识
* 设计模式:建造者模式(Builder)的应用


![](http://upload-images.jianshu.io/upload_images/2704327-b5b62bcf43f76f74.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)<br>
[我的博客](http://blog.csdn.net/e_inch_photo)<br>
[微信公众号](https://mp.weixin.qq.com/s?__biz=MjM5NjU2OTE0OQ==&mid=2247483755&idx=1&sn=1f1612fdb0e5ce1edcd4e13a800e2aef&chksm=a6e608399191812fcde0e2be56d9c78425f908c9f6d2fe99e10e6dd2a8523c79bf821ba90ff7#rd)	<br>
[我的简书](http://www.jianshu.com/u/303ec9abdc08)<br>
[我的GitHub,喜欢的话给个star吧](https://github.com/chenshouyin)