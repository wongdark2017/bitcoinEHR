### 转换含义：

在输入元模型中，不同ModelicaModel的parameter连接到各自的port上，然后不同的port再通过connect连接。

转换后，link可以直接引用不同Class（对应原ModelicaModel）的vari（对应原parameter）。

输入端元模型

![image-20211216021322591](Readme.assets/image-20211216021322591.png)

输出端元模型

![image-20211216021105378](Readme.assets/image-20211216021105378.png)

输入模型

![image-20211216021539548](Readme.assets/image-20211216021539548.png)

输出模型

![image-20211216021220722](Readme.assets/image-20211216021220722.png)