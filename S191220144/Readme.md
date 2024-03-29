# Readme

## Task1

### 类图和时序图

![a](http://www.plantuml.com/plantuml/png/bLFTQlCm3BtFK_Zo-oXvXwwGTONHblvqWx4B9LKpCyS9jiBMbRxxdChEd0uAousEZ-DZwLWQMm93RQKIgGdD0GeKwzeuA4w9SDz8rR3_zv-nTJi1bqXB1TejpqcXm5hnA3NoeNHPMqcorY-lel7GyaxAfvis5WgGwZKPgSkVzPqnS8pk2CB-7dSbv0g5ukYpHF9yTp0gpBEd_hUW5jVqczg1QbaATLk9QTsQlP1Lex12JNOekvXdbxXvMd1yM6NCt2-sAmQp7JFhsJF7R9VDOtlIWvDKGceIvfeehubyQ7bl-C3laoKWMPn5YNGfO79SWNuFLHgFXu_m5v_i1pGtlUFtco9-eM6h-fnIPWMz8QFXTgUp2LjUEnskVClQI-ZJPZPaewJ6RHDED60iSWCpWPzOj1JdEcdpN26BnE_DZEz0gSarELpF2XiIjDbGqIZGjmUf6o4nIjE-pnFkjdf0iLkEywd4Z3TmZ7hVJVKt)

![b](http://www.plantuml.com/plantuml/png/JTBVIi9G0CVn-_CKUm6X_OTW8i4g8HIqhDjfOmpMb6rUr6rbLgOaYXTUIHP2P8GNaJdsCfvjNVaA7RTpu5pj_Bxd0zl5SgwdELxpmW8Dz3HhPaEpFUP0rwzqXz5SnW1QpQixJB6W9fF5-_Yqc6oExCEIcWeUb_tYIIa90WdvIYf47ChvisHBPAiLjP0K6UYsPtgNp95fwzjYaR3Nh5OjlLntlFJxN02iJDRQXUqn_5q2Wyra3POiAncHFrylknBiVQ_z9s1mA7AquB3WYU1Hv6d1Oy4I8Q0eq4B0GYH2H56aXOW5HuI4eaGB2Gk121b5cHOo5Zj4e4RktKpM9MTZUuvVRcFVJyzhFuW6CzZgXuj9sEt3PI-QZyB547x-nC_lySCRd5t7mJYUTD9Re2WqZeExQFQuMRMZmHTwVJfXQ_Gt33QhJlWnXTERQFYA-cPrhoW0v7Jx7FrJ_m00)

### 评价

示例代码写的很面向对象。每个部分的分工明确，即每个对象的功能都是最贴近场景下人物

应该干的事，相比于面向过程，这更贴近人的思维模式。

在具体实现上，

Line类是一个封装过的position数组，相比直接用数组，封装起到了保护数据的作用

Geezer使用了单例设计模式，构造函数私有，只提供唯一接口，保证了老头只能有一个

Gourd是枚举类，控制葫芦娃的数量

Sorter/Linable：接口类，继承；单从示例代码上讲是冗余的部分，因为只有一个子类，但如果考虑到后续实现，这样的结构使得代码更容易复用，也更能体现类之间的关系。



改进的地方：代码毕竟也是给人看的，变量定义在类中间，甚至有些变量先出现被调用的语句再出现声明，这样会让人看的很不舒服，应该统一放到前面，让人一目了然。

## Task2

### 类图

![](http://www.plantuml.com/plantuml/png/jLEnKkim4Epz5LU-DndzGqYJXY8Ge64ePESID95b8Pq6WYV_ZfoJZEo1cJIaqMgLsrkjJqjFqb5eTQKCeTlB1c7RkGYXho3-5hgJkt__6Vjual41QQEbYTjprMZfFTmgWrmaDfrNf3hp_08sGSydWgjjA8Kof6vBJfd3z_x6ENagUcJXr2UsbBL6qBmcbqY97mgBYoMs7_-MrKOhFr9FKWSiF6n33Qgr6biqvAUgOXzt6c9FCA6TKsvE7EP4FSrlJ6yINkz9achE4Csjk-1sgzEzDCTisMKyJ_JgI_jtQQy8OetuYOulFdeIp0Az8gFfyQ3pa8-IjfZkqlpvopBQPZQxqShWeyqLLZgFF8rCu0SsWKglgr3N6bca_7hCz5oc3CM9bVF1vq2oDWSADhQxvbNS1TKSXov_rrMy_MPXU9Am469yDzLbNg0hAKx_mh6lac5OBT7iGgk_0000)

本次作业我用的两种排序方法为冒泡排序和快速排序，由于文件大小限制，只拍了64个小妖的排序，链接如下：

快速排序：

https://asciinema.org/a/BKY6gMUAMgf5AHQoF5RetOzfx

冒泡排序：

https://asciinema.org/a/DTBBODLm2KpVEj7cjqpkZF4vm

## Task3

### 类图

![](http://www.plantuml.com/plantuml/png/jLF1Jkim4BpdA_RudYh_G-cb5v0A1Iw8moRT5gkE4-orQ8dwxxZTE3WHIBtGYyVZxknuifvxHiUXDeMsJ6wB5S6wSH52Lq3ypKo3ct__1Vjual2EU6NGnksfg0nw3tV8JX-aJAqQhratzkKLsXvwEL5ItuPSAa5krb74xhxtDyxXCUkIXFi-jzfYQGYChBrFufu_5sPNwzbk-5jI6wpyI3sZ2PHvM8SITDqQgico7wkgRTmPY3t1XdfAkIcncnBbEByXlL5udMTaNPqWcbismMqMnmUq-sJP9Jn9zFfB-mzihmXYIVH9JYu-U5B20h-HeF7nMUSn7VNQQhph9z1Vbi6siCcDqPQUsbJHelCayoW47QWAd7jTXB8q92BvrnEcap9jEKuiJaTV0adQ4YYqiTqrx-8-w6f_xl9tNTNxRnRaKS9CgU7b59U9WIQd9FyB9yvoHc0n9xi9jVa2)

快速排序：

https://asciinema.org/a/q5XQlG1vboRTolvbqFTr4Qijb

冒泡排序：

https://asciinema.org/a/pvXXcjRsVrAdEk7R9rdH6pGdt





## PS

本次作业中所有文件的地址均使用了绝对地址，直接运行会导致错误