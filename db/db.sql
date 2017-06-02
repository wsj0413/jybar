drop table if exists tblBarUser;

/*==============================================================*/
/* Table: tblBarUser         用户信息表                                   */
/*==============================================================*/
create table tblBarUser
(
   user_tid             bigint not null auto_increment,
   user_type            int(1) not null,
   user_account         varchar(30) not null,
   user_nickname        varchar(150) not null,
   user_password        varchar(50) not null,
   user_randomkey       varchar(20) not null,
   user_phone           varchar(20),
   user_email           varchar(50),
   user_status          int(1) not null default 1,
   user_createDate      timestamp,
   user_updateDate      timestamp,
   user_lastLoginDate   timestamp,
   primary key (user_tid)
);



insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin','admin','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin','admin','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin1','admin1','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin1','admin1','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin2','admin2','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin2','admin2','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin3','admin3','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin3','admin3','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin4','admin4','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin4','admin4','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin5','admin5','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin5','admin5','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin6','admin6','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin6','admin6','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin7','admin7','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin7','admin7','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(0,'admin8','admin8','436249d31d44f6a8bbb271022ac3f3f2','52love',0);
insert into tblBarUser (user_type,user_account,user_nickname,user_password,user_randomkey,user_status) values(1,'admin8','admin8','436249d31d44f6a8bbb271022ac3f3f2','52love',0);


drop table if exists tblUrlResource;

/*==============================================================*/
/* Table: tblUrlResource    导航资源表                                    */
/*==============================================================*/
create table tblUrlResource
(
   tid                  bigint not null auto_increment,
   urlType              int(2) not null,
   urlName              varchar(30) not null,
   url                  varchar(200) not null,
   urlStatus            int(1) not null default 0,
   urlOrder             int,
   sortWeight           int default 0,
   isShowIndex          int(1) default 1,
   createDate           timestamp,
   updateDate           timestamp,
   clickCount           bigint default 0,
   clickCountTrue       bigint default 0,
   clickOrder           int(2),
   isRed                int(1) not null default 1,
   primary key (tid)
);

/*==============================================================*/
/* Table: tblConfig  参数配置表                                           */
/*==============================================================*/
create table tblConfig
(
   tid                  bigint not null auto_increment,
   paraName             varchar(20) not null,
   parakey              varchar(30),
   paravalue            varchar(200),
   content              varchar(200),
   primary key (tid)
);

alter table tblConfig comment '参数配置表';


insert into tblconfig (paraName, parakey, paravalue, content) values ('ARTICLE_TYPE', '1', '本站热点', '文章类型');
insert into tblconfig (paraName, parakey, paravalue, content) values ('ARTICLE_TYPE', '2', '交友娱乐', '文章类型');
insert into tblconfig (paraName, parakey, paravalue, content) values ('ARTICLE_TYPE', '3', '交友送礼', '文章类型');
insert into tblconfig (paraName, parakey, paravalue, content) values ('ARTICLE_TYPE', '4', '交友秘籍', '文章类型');


/*==============================================================*/
/* Table: tblArticle  文章表                                           */
/*==============================================================*/
create table tblArticle
(
   tid                  bigint not null auto_increment,
   aTitle               varchar(30) not null,
   aContent             text,
   aTag                 varchar(250),
   aType                varchar(20),
   aStructure           int(1) default 1,
   aSource              varchar(30),
   aShowCount           bigint default 0,
   aTrueShowCount       bigint default 0,
   aStatus              int(1) not null,
   aAuthorName          varchar(150),
   aAuthor              varchar(30),
   aImage               bigint,
   isIndex              int(1),
   aOrder               bigint default 0,
   createDate           timestamp,
   updateDate           timestamp,
   primary key (tid)
);

alter table tblArticle comment '文章表';

/*==============================================================*/
/* Table: tblImage    图片资源表                                          */
/*==============================================================*/
create table tblImage
(
    tid                  bigint not null auto_increment,
   tType                int(1) not null,
   tUrl                 varchar(100),
   tByte                longblob,
   tContent             varchar(200),
   tOrder               bigint default 0,
   createDate           timestamp,
   updateDate           timestamp,
   primary key (tid)
);

alter table tblImage comment '图片表';



create table tblFriendLink
(
   tid                  bigint not null,
   tType                int(1) not null,
   tUrl                 varchar(100),
   fImage               bigint default 0,
   tContent             varchar(50),
   tOrder               bigint default 0,
   createDate           timestamp,
   updateDate           timestamp,
   primary key (tid)
);

alter table tblFriendLink comment '友情链接表';

