/*==============================================================*/
/* Database name:  openeshop                                    */
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/1/7 22:27:34                            */
/*==============================================================*/


drop database if exists openeshop;

/*==============================================================*/
/* Database: openeshop                                          */
/*==============================================================*/
create database openeshop;

use openeshop;

/*==============================================================*/
/* Table: t_distribution_info                                   */
/*==============================================================*/
create table t_distribution_info
(
   id                   bigint not null auto_increment comment 'id编号',
   name                 varchar(128) not null comment '配送方式名称',
   code                 varchar(32) not null comment '配送方式唯一code',
   icon                 varchar(64) comment '图标',
   config               longtext comment '配置信息',
   enabled              varchar(8) comment '是否启用',
   primary key (id)
);

alter table t_distribution_info comment '系统配送方式表';

/*==============================================================*/
/* Table: t_payment_info                                        */
/*==============================================================*/
create table t_payment_info
(
   id                   bigint not null auto_increment comment 'id编号',
   name                 varchar(128) not null comment '支付方式名称',
   code                 varchar(32) not null comment '支付方式唯一code',
   icon                 varchar(64) comment '支付方式图标',
   config               longtext comment '配置信息',
   enabled              varchar(8) comment '是否启用',
   primary key (id)
);

alter table t_payment_info comment '系统支付信息配置表';

/*==============================================================*/
/* Table: t_product_appraise_file_rec                           */
/*==============================================================*/
create table t_product_appraise_file_rec
(
   id                   bigint not null comment 'id',
   appraise_id          bigint not null comment '评价',
   file                 varchar(128) comment '文件',
   primary key (id)
);

alter table t_product_appraise_file_rec comment '评价文件记录表';

/*==============================================================*/
/* Table: t_product_appraise_rec                                */
/*==============================================================*/
create table t_product_appraise_rec
(
   id                   bigint not null auto_increment comment 'id编号',
   appraiser            varchar(32) not null comment '评价人',
   product_id           bigint not null comment '商品',
   order_id             varchar(32) comment '订单',
   grade                varchar(8) comment '评分',
   comment              varchar(256) comment '评论',
   appraise_time        timestamp comment '评价时间',
   appraise_id          varchar(32) comment '评价的评价',
   primary key (id)
);

alter table t_product_appraise_rec comment '商品评价记录表';

/*==============================================================*/
/* Table: t_product_category_associ_rec                         */
/*==============================================================*/
create table t_product_category_associ_rec
(
   id                   bigint not null comment 'id编号',
   category_id          bigint not null comment '分类id',
   product_id           bigint not null comment '商品id',
   primary key (id)
);

alter table t_product_category_associ_rec comment '商品和分类关联关系表';

/*==============================================================*/
/* Table: t_product_order_operate_rec                           */
/*==============================================================*/
create table t_product_order_operate_rec
(
   id                   bigint not null auto_increment comment 'id',
   order_id             bigint not null comment '商品订单',
   operator             varchar(32) not null comment '操作人',
   user_type            varchar(8) comment '操作人类型',
   operate_type         varchar(8) comment '操作类型',
   description          varchar(128) comment '操作描述',
   operate_time         datetime comment '时间',
   primary key (id)
);

alter table t_product_order_operate_rec comment '订单操作记录表';

/*==============================================================*/
/* Table: t_product_order_product_rec                           */
/*==============================================================*/
create table t_product_order_product_rec
(
   id                   bigint not null auto_increment comment 'id',
   order_id             bigint not null comment '订单',
   product_id           varchar(32) not null comment '商品',
   unit_price           double comment '单价',
   purchase_num         int comment '购买数量',
   subtotal_amount      double comment '小计金额',
   promotion            varchar(32) comment '促销',
   primary key (id)
);

alter table t_product_order_product_rec comment '订单商品表';

/*==============================================================*/
/* Table: t_product_order_rec                                   */
/*==============================================================*/
create table t_product_order_rec
(
   id                   bigint not null auto_increment comment 'id',
   order_no             varchar(32) not null comment '订单号',
   user_id              varchar(32) not null comment '下单用户',
   consignee_name       varchar(128) comment '收货人',
   consignee_phone      varchar(16) comment '收货人联系电话',
   delivery_address     varchar(256) comment '收货地址',
   delivery_postal_code varchar(8) comment '收货人邮编',
   leave_words          varchar(128) comment '买家留言',
   assign_delivery_time3 varchar(32) comment '指定收货时间',
   status               varchar(16) comment '订单状态',
   pay_status           varchar(16) comment '订单付款状态',
   delivery_status      varchar(16) comment '订单配发货状态',
   amount               double comment '订单总金额',
   freight              double comment '订单运费',
   pay_amount           double comment '订单实付款',
   used_integral        double comment '订单使用积分',
   coupon               varchar(32) comment '优惠券',
   payment_type         varchar(32) comment '支付方式',
   distribution_type    varchar(32) comment '配送方式',
   express_no           varchar(32) comment '物流单号',
   ordering_time        datetime comment '订单创建时间',
   delivery_time        datetime comment '订单发货时间',
   paying_time          datetime comment '订单付款时间',
   overing_time         datetime comment '订单交易成功时间',
   shop_id              bigint not null comment '所属店铺',
   primary key (id)
);

alter table t_product_order_rec comment '商品订单记录表';

/*==============================================================*/
/* Table: t_product_picture_info                                */
/*==============================================================*/
create table t_product_picture_info
(
   id                   bigint not null auto_increment comment 'id',
   product_id           varchar(32) not null comment '商品spu或sku',
   picture              varchar(128) comment '图片文件id',
   ordinal              varchar(8) comment '排序',
   type                 varchar(16) comment '图片类型, PRODUCTSPU或PRODUCTSKU',
   primary key (id)
);

alter table t_product_picture_info comment '商品图片信息表';

/*==============================================================*/
/* Table: t_product_sku_info                                    */
/*==============================================================*/
create table t_product_sku_info
(
   id                   bigint not null auto_increment comment 'id',
   product_spu          bigint not null comment '商品spu',
   model                varchar(64) comment '型号',
   price                double comment '价格',
   stock                bigint comment '库存',
   sales_num            bigint comment '销售量',
   product_code         varchar(32) comment '商品编码',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table t_product_sku_info comment '商品Sku信息表';

/*==============================================================*/
/* Table: t_product_spu_info                                    */
/*==============================================================*/
create table t_product_spu_info
(
   id                   bigint not null auto_increment comment 'id',
   name                 varchar(128) not null comment '商品名称',
   description          longtext comment '商品描述',
   desc_html_file       varchar(128) comment '描述文件',
   price                double comment '价格',
   stock                bigint comment '库存',
   product_code         varchar(32) comment '商品编码',
   status               varchar(16) comment '商品状态',
   shop_id              bigint not null comment '所属店铺',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table t_product_spu_info comment '店铺商品Spu信息';

/*==============================================================*/
/* Table: t_shop_category_info                                  */
/*==============================================================*/
create table t_shop_category_info
(
   id                   bigint not null auto_increment comment '编号id',
   name                 varchar(64) not null comment '分类名称',
   picture              varchar(128) comment '分类图标',
   parent_id            bigint comment '父分类',
   sort_no              varchar(8) comment '序号',
   tree_code            varchar(64) comment '树节点编号',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table t_shop_category_info comment '商品分类信息表';

/*==============================================================*/
/* Table: t_shop_distribution_info                              */
/*==============================================================*/
create table t_shop_distribution_info
(
   id                   bigint not null comment 'id编号',
   distribution_id      bigint not null comment '配送方式',
   config               longtext comment '配置信息',
   enabled              varchar(8) comment '是否启用',
   shop_id              bigint not null comment '所属店铺',
   primary key (id)
);

alter table t_shop_distribution_info comment '店铺配送方式表';

/*==============================================================*/
/* Table: t_shop_info                                           */
/*==============================================================*/
create table t_shop_info
(
   id                   bigint not null auto_increment comment 'id',
   name                 varchar(128) not null comment '店铺名称',
   avatar               varchar(128) comment '店铺头像',
   phone                varchar(16) comment '联系电话',
   grade                varchar(8) comment '店铺等级',
   notice               varchar(256) comment '店铺公告',
   category             bigint comment '主营类目',
   address              varchar(256) comment '店铺地址',
   latitude             varchar(16) comment '位置纬度',
   longitude            varchar(16) comment '位置经度',
   location             varchar(64) comment '位置其他信息',
   merchant             varchar(32) not null comment '店铺拥有者',
   status               varchar(16) comment '店铺状态',
   type                 varchar(32) comment '店铺类型',
   start_business_time  varchar(32) comment '开始营业时间',
   end_business_time    varchar(32) comment '结束营业时间',
   create_time          datetime comment '创建时间',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table t_shop_info comment '店铺信息表';

/*==============================================================*/
/* Table: t_shop_payment_info                                   */
/*==============================================================*/
create table t_shop_payment_info
(
   id                   bigint not null comment 'id',
   payment_id           bigint not null comment '支付方式',
   config               longtext comment '配置信息',
   enabled              varchar(8) comment '是否启用',
   shop_id              bigint not null comment '所属店铺',
   primary key (id)
);

alter table t_shop_payment_info comment '店铺支付方式';

/*==============================================================*/
/* Table: t_shop_product_category_info                          */
/*==============================================================*/
create table t_shop_product_category_info
(
   id                   bigint not null auto_increment comment 'id',
   name                 varchar(128) not null comment '分类名称',
   ordinal              varchar(8) comment '排序',
   update_time          timestamp comment '更新时间',
   primary key (id)
);

alter table t_shop_product_category_info comment '店铺商品分类信息';

alter table t_product_appraise_file_rec add constraint FK_Reference_8 foreign key (appraise_id)
      references t_product_appraise_rec (id) on delete restrict on update restrict;

alter table t_product_appraise_rec add constraint FK_Reference_9 foreign key (product_id)
      references t_product_spu_info (id) on delete restrict on update restrict;

alter table t_product_category_associ_rec add constraint FK_Reference_12 foreign key (category_id)
      references t_shop_product_category_info (id) on delete restrict on update restrict;

alter table t_product_category_associ_rec add constraint FK_Reference_13 foreign key (product_id)
      references t_product_spu_info (id) on delete restrict on update restrict;

alter table t_product_order_operate_rec add constraint FK_Reference_11 foreign key (order_id)
      references t_product_order_rec (id) on delete restrict on update restrict;

alter table t_product_order_product_rec add constraint FK_Reference_10 foreign key (order_id)
      references t_product_order_rec (id) on delete restrict on update restrict;

alter table t_product_sku_info add constraint FK_PRODUCT_SKU_SPU foreign key (product_spu)
      references t_product_spu_info (id) on delete restrict on update restrict;

alter table t_product_spu_info add constraint FK_PRODUCT_SPU foreign key (shop_id)
      references t_shop_info (id) on delete restrict on update restrict;

alter table t_shop_distribution_info add constraint FK_Reference_15 foreign key (shop_id)
      references t_shop_info (id) on delete restrict on update restrict;

alter table t_shop_distribution_info add constraint FK_Reference_6 foreign key (distribution_id)
      references t_distribution_info (id) on delete restrict on update restrict;

alter table t_shop_payment_info add constraint FK_Reference_14 foreign key (shop_id)
      references t_shop_info (id) on delete restrict on update restrict;

alter table t_shop_payment_info add constraint FK_Reference_4 foreign key (payment_id)
      references t_payment_info (id) on delete restrict on update restrict;

