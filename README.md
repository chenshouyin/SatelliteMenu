####特性:
* 支持上下左右四个方向展开弧形菜单 
* 支持扩展菜单,理论上多少个子菜单都可以
* 支持自定义菜单图标和子菜单图标
* 支持自定义菜单弹出的圆弧半径 
* 支持设置菜单按钮和子菜单按钮大小
* 支持是否显示子菜单文字

####效果图:
![效果图](http://upload-images.jianshu.io/upload_images/2704327-b0bb086efec5176d.gif?imageMogr2/auto-orient/strip)

####使用
```java
compile 'csy.menu.satellitemenulib:SatelliteMenu:1.0.2'
```

####使用介绍:

| xml属性        | 描述           | 值  |
| :-------------: |:-------------:| :-----:|
| radius      | 圆弧直径 | dimension |
| menu_image_width     | 菜单大小      |   dimension |
| menu_item_image_width | 子菜单大小      |    dimension |
| menu_item_text_size      | 子菜单文字大小 | dimension |
| menu_item_text_color     | 子菜单文字颜色      |   color |
| menu_postion | 菜单展开方向      |    left_top，right_top，left_bottom，right_bottom |

####布局中使用
![左上(子菜单显示文字)](http://upload-images.jianshu.io/upload_images/2704327-0d76b2f61adc2365.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



![右上(子菜单不显示文字)](http://upload-images.jianshu.io/upload_images/2704327-60b1223ae0509182.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

####代码中使用


![左上](http://upload-images.jianshu.io/upload_images/2704327-bad7f47aa1678d70.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



![右上](http://upload-images.jianshu.io/upload_images/2704327-592824320d9433ad.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

####传送门
[Github地址](https://github.com/chenshouyin/SatelliteMenu) https://github.com/chenshouyin/SatelliteMenu

####知识点总结
* 自定义View相关知识
* 代码中动态添加布局
* 设计模式:建造者模式(Builder)的应用
* 属性动画的应用