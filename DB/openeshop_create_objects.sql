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
   id                   bigint not null auto_increment comment 'id���',
   name                 varchar(128) not null comment '���ͷ�ʽ����',
   code                 varchar(32) not null comment '���ͷ�ʽΨһcode',
   icon                 varchar(64) comment 'ͼ��',
   config               longtext comment '������Ϣ',
   enabled              varchar(8) comment '�Ƿ�����',
   primary key (id)
);

alter table t_distribution_info comment 'ϵͳ���ͷ�ʽ��';

/*==============================================================*/
/* Table: t_payment_info                                        */
/*==============================================================*/
create table t_payment_info
(
   id                   bigint not null auto_increment comment 'id���',
   name                 varchar(128) not null comment '֧����ʽ����',
   code                 varchar(32) not null comment '֧����ʽΨһcode',
   icon                 varchar(64) comment '֧����ʽͼ��',
   config               longtext comment '������Ϣ',
   enabled              varchar(8) comment '�Ƿ�����',
   primary key (id)
);

alter table t_payment_info comment 'ϵͳ֧����Ϣ���ñ�';

/*==============================================================*/
/* Table: t_product_appraise_file_rec                           */
/*==============================================================*/
create table t_product_appraise_file_rec
(
   id                   bigint not null comment 'id',
   appraise_id          bigint not null comment '����',
   file                 varchar(128) comment '�ļ�',
   primary key (id)
);

alter table t_product_appraise_file_rec comment '�����ļ���¼��';

/*==============================================================*/
/* Table: t_product_appraise_rec                                */
/*==============================================================*/
create table t_product_appraise_rec
(
   id                   bigint not null auto_increment comment 'id���',
   appraiser            varchar(32) not null comment '������',
   product_id           bigint not null comment '��Ʒ',
   order_id             varchar(32) comment '����',
   grade                varchar(8) comment '����',
   comment              varchar(256) comment '����',
   appraise_time        timestamp comment '����ʱ��',
   appraise_id          varchar(32) comment '���۵�����',
   primary key (id)
);

alter table t_product_appraise_rec comment '��Ʒ���ۼ�¼��';

/*==============================================================*/
/* Table: t_product_category_associ_rec                         */
/*==============================================================*/
create table t_product_category_associ_rec
(
   id                   bigint not null comment 'id���',
   category_id          bigint not null comment '����id',
   product_id           bigint not null comment '��Ʒid',
   primary key (id)
);

alter table t_product_category_associ_rec comment '��Ʒ�ͷ��������ϵ��';

/*==============================================================*/
/* Table: t_product_order_operate_rec                           */
/*==============================================================*/
create table t_product_order_operate_rec
(
   id                   bigint not null auto_increment comment 'id',
   order_id             bigint not null comment '��Ʒ����',
   operator             varchar(32) not null comment '������',
   user_type            varchar(8) comment '����������',
   operate_type         varchar(8) comment '��������',
   description          varchar(128) comment '��������',
   operate_time         datetime comment 'ʱ��',
   primary key (id)
);

alter table t_product_order_operate_rec comment '����������¼��';

/*==============================================================*/
/* Table: t_product_order_product_rec                           */
/*==============================================================*/
create table t_product_order_product_rec
(
   id                   bigint not null auto_increment comment 'id',
   order_id             bigint not null comment '����',
   product_id           varchar(32) not null comment '��Ʒ',
   unit_price           double comment '����',
   purchase_num         int comment '��������',
   subtotal_amount      double comment 'С�ƽ��',
   promotion            varchar(32) comment '����',
   primary key (id)
);

alter table t_product_order_product_rec comment '������Ʒ��';

/*==============================================================*/
/* Table: t_product_order_rec                                   */
/*==============================================================*/
create table t_product_order_rec
(
   id                   bigint not null auto_increment comment 'id',
   order_no             varchar(32) not null comment '������',
   user_id              varchar(32) not null comment '�µ��û�',
   consignee_name       varchar(128) comment '�ջ���',
   consignee_phone      varchar(16) comment '�ջ�����ϵ�绰',
   delivery_address     varchar(256) comment '�ջ���ַ',
   delivery_postal_code varchar(8) comment '�ջ����ʱ�',
   leave_words          varchar(128) comment '�������',
   assign_delivery_time3 varchar(32) comment 'ָ���ջ�ʱ��',
   status               varchar(16) comment '����״̬',
   pay_status           varchar(16) comment '��������״̬',
   delivery_status      varchar(16) comment '�����䷢��״̬',
   amount               double comment '�����ܽ��',
   freight              double comment '�����˷�',
   pay_amount           double comment '����ʵ����',
   used_integral        double comment '����ʹ�û���',
   coupon               varchar(32) comment '�Ż�ȯ',
   payment_type         varchar(32) comment '֧����ʽ',
   distribution_type    varchar(32) comment '���ͷ�ʽ',
   express_no           varchar(32) comment '��������',
   ordering_time        datetime comment '��������ʱ��',
   delivery_time        datetime comment '��������ʱ��',
   paying_time          datetime comment '��������ʱ��',
   overing_time         datetime comment '�������׳ɹ�ʱ��',
   shop_id              bigint not null comment '��������',
   primary key (id)
);

alter table t_product_order_rec comment '��Ʒ������¼��';

/*==============================================================*/
/* Table: t_product_picture_info                                */
/*==============================================================*/
create table t_product_picture_info
(
   id                   bigint not null auto_increment comment 'id',
   product_id           varchar(32) not null comment '��Ʒspu��sku',
   picture              varchar(128) comment 'ͼƬ�ļ�id',
   ordinal              varchar(8) comment '����',
   type                 varchar(16) comment 'ͼƬ����, PRODUCTSPU��PRODUCTSKU',
   primary key (id)
);

alter table t_product_picture_info comment '��ƷͼƬ��Ϣ��';

/*==============================================================*/
/* Table: t_product_sku_info                                    */
/*==============================================================*/
create table t_product_sku_info
(
   id                   bigint not null auto_increment comment 'id',
   product_spu          bigint not null comment '��Ʒspu',
   model                varchar(64) comment '�ͺ�',
   price                double comment '�۸�',
   stock                bigint comment '���',
   sales_num            bigint comment '������',
   product_code         varchar(32) comment '��Ʒ����',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table t_product_sku_info comment '��ƷSku��Ϣ��';

/*==============================================================*/
/* Table: t_product_spu_info                                    */
/*==============================================================*/
create table t_product_spu_info
(
   id                   bigint not null auto_increment comment 'id',
   name                 varchar(128) not null comment '��Ʒ����',
   description          longtext comment '��Ʒ����',
   desc_html_file       varchar(128) comment '�����ļ�',
   price                double comment '�۸�',
   stock                bigint comment '���',
   product_code         varchar(32) comment '��Ʒ����',
   status               varchar(16) comment '��Ʒ״̬',
   shop_id              bigint not null comment '��������',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table t_product_spu_info comment '������ƷSpu��Ϣ';

/*==============================================================*/
/* Table: t_shop_category_info                                  */
/*==============================================================*/
create table t_shop_category_info
(
   id                   bigint not null auto_increment comment '���id',
   name                 varchar(64) not null comment '��������',
   picture              varchar(128) comment '����ͼ��',
   parent_id            bigint comment '������',
   sort_no              varchar(8) comment '���',
   tree_code            varchar(64) comment '���ڵ���',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table t_shop_category_info comment '��Ʒ������Ϣ��';

/*==============================================================*/
/* Table: t_shop_distribution_info                              */
/*==============================================================*/
create table t_shop_distribution_info
(
   id                   bigint not null comment 'id���',
   distribution_id      bigint not null comment '���ͷ�ʽ',
   config               longtext comment '������Ϣ',
   enabled              varchar(8) comment '�Ƿ�����',
   shop_id              bigint not null comment '��������',
   primary key (id)
);

alter table t_shop_distribution_info comment '�������ͷ�ʽ��';

/*==============================================================*/
/* Table: t_shop_info                                           */
/*==============================================================*/
create table t_shop_info
(
   id                   bigint not null auto_increment comment 'id',
   name                 varchar(128) not null comment '��������',
   avatar               varchar(128) comment '����ͷ��',
   phone                varchar(16) comment '��ϵ�绰',
   grade                varchar(8) comment '���̵ȼ�',
   notice               varchar(256) comment '���̹���',
   category             bigint comment '��Ӫ��Ŀ',
   address              varchar(256) comment '���̵�ַ',
   latitude             varchar(16) comment 'λ��γ��',
   longitude            varchar(16) comment 'λ�þ���',
   location             varchar(64) comment 'λ��������Ϣ',
   merchant             varchar(32) not null comment '����ӵ����',
   status               varchar(16) comment '����״̬',
   type                 varchar(32) comment '��������',
   start_business_time  varchar(32) comment '��ʼӪҵʱ��',
   end_business_time    varchar(32) comment '����Ӫҵʱ��',
   create_time          datetime comment '����ʱ��',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table t_shop_info comment '������Ϣ��';

/*==============================================================*/
/* Table: t_shop_payment_info                                   */
/*==============================================================*/
create table t_shop_payment_info
(
   id                   bigint not null comment 'id',
   payment_id           bigint not null comment '֧����ʽ',
   config               longtext comment '������Ϣ',
   enabled              varchar(8) comment '�Ƿ�����',
   shop_id              bigint not null comment '��������',
   primary key (id)
);

alter table t_shop_payment_info comment '����֧����ʽ';

/*==============================================================*/
/* Table: t_shop_product_category_info                          */
/*==============================================================*/
create table t_shop_product_category_info
(
   id                   bigint not null auto_increment comment 'id',
   name                 varchar(128) not null comment '��������',
   ordinal              varchar(8) comment '����',
   update_time          timestamp comment '����ʱ��',
   primary key (id)
);

alter table t_shop_product_category_info comment '������Ʒ������Ϣ';

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

