# git协同使用帮助

由于此次课设采用`github`协同提交，对于不熟悉的同学来说，可能会比较难受：），但是考虑到日后工作的需要【如果以后要和团队一起开发项目的时候，`git`的使用和`github`的`pullrequest`恐怕是逃不掉了。】从长远来看，现在练习`git`参与协同工作，也为日后的工作和发展打下基础。所以我们来学习操作吧~~ 这个过程很简单，跟着一步步走就好了。

------------

## 一、克隆仓库

#### **如果不知道如何使用命令的同学**，**狂[@廖雪峰 至少看到从远程库克隆这一节](https://www.liaoxuefeng.com/wiki/896043488029600/896067074338496)**

* 如何安装，将**工作区**的文件添加到**缓存区**，再从缓存区添加到**分支**，**如何回退版本**。【如果不知道我在说啥的？**点击上面的廖雪峰**，学习学习】

### ⭐[安装Git](https://www.jianshu.com/p/414ccd423efc)

### ⭐[连接github](https://www.liaoxuefeng.com/wiki/896043488029600/896954117292416)【已连接GitHub的请忽略】

### ⭐在连接自己的GitHub账户后点击[主项目的链接](https://github.com/Koneho/kiya_cp)

我们共同使用一个远程仓库作为项目提交，即`kiya_cp`,我会将你们的账号添加到项目的开发者中，然后我们就可以愉快地写代码啦~

### ⭐Clone项目到本地

1. ##### 进入主项目连接后你会看到这个项目，然后点击绿色的clone，复制这个SSH地址

   图片显示不出来的话也没关系，直接输入下面的命令就好了。

![1568117393712](C:\Users\Eos\AppData\Roaming\Typora\typora-user-images\1568117393712.png)

2. ##### clone到本地

   在本地创建一个文件夹【注意！路径名不要带有中文】

   在bash界面进入文件夹，输入

   `git remote add kiya_origin git@github.com:Koneho/kiya_cp.git`

   此时你输入

   `git remote -v`

   可以看到有一个**`kiya-origin`**，即**主项目**的远程仓库。



## 二、写代码和提交？

### ⭐关于分支

克隆的项目已经有一个分支，**master**，使用`git branch`查看，**master**是用来整合我们的代码的，实际写代码的时候，我们在自己创建的分支上操作，比如我创建了一个分支`kone`,然后在这个分支上写代码。

#### ⭐分支的提交

GitHub上是只有一个**master**分支的，我们各自创建的分支是在本地上的。

##### 每当完成一个模块时，怎么提交代码咧？

先切换到主分支

`git checkout master`

将你的分支和主分支合并【在合并分支前，切换到master分支下，pull一下远程的master分支，再切换到融合你的分支】

`git merge --no-ff -m"写合并分支的commit" kone`【`--no-ff` 参数是保留你自己的分支，将`kone`替换成你的分支名】

在自己完成了一个完整的小功能的基础上【测试后没问题了】，



#### ⭐提交的注意事项

在完成一个模块时，需要告诉一下小伙伴，让小伙伴们及时同步master分支。

如果更改了同一个文件，发现提交冲突了怎么办呢？还是【@廖雪峰】

多人协作：https://www.liaoxuefeng.com/wiki/896043488029600/900375748016320
解决冲突：https://www.liaoxuefeng.com/wiki/896043488029600/900004111093344#0



### Reference

git常用命令：https://www.ruanyifeng.com/blog/2015/12/git-cheat-sheet.html

github协同开发：https://segmentfault.com/a/1190000015798490