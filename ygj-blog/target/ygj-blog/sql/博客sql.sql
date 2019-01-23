
/**用户表**/
create table blog_user(
	id int(11) not null auto_increment primary key,
	phone varchar(255)	not null 	COMMENT '手机号',
	user_name varchar(255) not null comment '用户名',
  password varchar(255) not null comment '密码',
	gender   char(1)	not null comment '性别',
	true_name varchar(255) null comment '姓名',
	birthday datetime null comment '生日',
	email 	 varchar(255) null comment '邮箱',
	personal_brief text null comment '个人简介',
	avatar_img_url	varchar(255) not null comment '头像url',
	create_time datetime not null comment '创建时间',
	last_login_time datetime null comment '最后登录时间'
)

/**文章类型表**/
create table blog_article_type(
	id int(11) not null auto_increment PRIMARY key,
	parent_type_id int(11) not null comment '父类型id(为0时表示根节点)',
	type_name varchar(255) not null comment '类型名称',
	type_description text null comment '类型描述',
	create_time datetime not null comment '创建时间',
	update_time datetime null comment '更新时间'
)

/**文章表**/
create table blog_article(
	id int(11) not null auto_increment PRIMARY key,
	article_id  bigint(20) not null COMMENT '文章id（获取时间戳）',
	type_id int(11) not null comment '类型id',
	user_id 	int(11) not null comment '用户id',
	original_author varchar(255) not null comment '文章原作者',
	article_title varchar(255) not null comment '文章标题',
	article_description text not null comment '文章摘要',
	article_content text not null comment '文章内容',
	article_url varchar(255) not null comment '文章地址',
	is_original char(1) not null comment '是否原创',
	article_views int(11) not null comment '浏览量',
	article_comment_count int(11) not null comment '评论总数',
	article_like_count int(11) not null comment '点赞数',
	create_time datetime not null comment '发表时间',
	update_time datetime null comment '更新时间'
)

/**评论表**/
create table blog_comment(
	id  int(11) not null auto_increment PRIMARY key,
	parent_comment_id int(11) not null comment '父级评论id',
	article_id int(11) not null comment '文章id',
	answerer_id int(11) not null comment '评论者id',
	respondent_id int(11) not null comment '被评论者id',
	comment_content text not null comment '评论内容',
	likes int(11) not null comment '评论点赞数',
	comment_date datetime not null comment '评论时间'
)

/**标签表**/
create table blog_label(
	id int(11) not null auto_increment primary key,
	label_name varchar(255) not null comment '标签名称',
	label_alias varchar(255) null comment '标签别名',
	label_description text null comment '描述'
)

/**文章设置标签表**/
create table blog_set_article_label(
	article_id int(10) not null comment '文章id',
	label_id int(10) not null comment '标签id'
)

/**角色表**/
create table blog_role(
	id int(11) not null auto_increment PRIMARY key,
	authority varchar(255) not null comment '权限',
	role_name varchar(255) not null comment '角色名称',
	role_code varchar(255) null comment '角色代码'
)	

/**用户设置角色表**/
create table blog_set_user_role(
	user_id int(11) not null comment '用户id',
	role_id int(11) not null comment '角色id'
)

/**模块表**/
create table blog_menu_item(
	menu_id int(11) not null auto_increment PRIMARY key,
	menu_name varchar(255) not null comment '模块名称',
	menu_code_url varchar(255) not null comment '模块代码地址',
	menu_icon varchar(255) not null comment '模块图标',
	parent_menu_id int(11) not null comment '父级模块id（-1表示父级）'
)