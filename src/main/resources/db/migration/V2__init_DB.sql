--USERS
create sequence user_sequence start 1 increment 1;

create table users(
                        id int8 not null,
                        age int4 not null,
                        email varchar(255),
                        gender varchar(255),
                        name varchar(255),
                        password varchar(255),
                        role varchar(255),
                        primary key (id)
                        );

--PRODUCTS
create sequence product_sequence start 1 increment 1;

create table products(
                        id int8 not null,
                        description varchar(255),
                        price float8,
                        title varchar(255),
                        category_id int8,
                        primary key (id)
                        );

alter table products add constraint products_fk_categories
foreign key (category_id) references categories;

--PRODUCT CATEGORIES
create table products_categories (
                        product_id int8 not null,
                        categories_id int8 not null
                        );

--LINK BETWEEN PRODUCT_CATEGORIES AND CATEGORIES/PRODUCTS
alter table products_categories add constraint products_categories_fk_categories
foreign key (categories_id) references categories;

alter table products_categories add constraint products_categories_fk_product
foreign key (product_id) references products;

--ORDERS
create sequence order_sequence start 1 increment 1;

create table orders(
                        id int8 not null,
                        address varchar(255),
                        changed timestamp,
                        created timestamp,
                        status varchar(255),
                        sum numeric(19, 2),
                        user_id int8,
                        primary key (id)
                        );

--LINK BETWEEN ORDER AND USER
alter table orders add constraint orders_fk_user
foreign key (user_id) references users;

--ORDER DETAILS
create sequence order_details_sequence start 1 increment 1;

create table order_details (
                        id int8 not null,
                        amount numeric(19, 2),
                        price numeric(19, 2),
                        order_id int8,
                        product_id int8,
                        primary key (id)
                        );

----LINK BETWEEN ORDER AND ORDER/PRODUCTS
alter table order_details add constraint order_details_fk_order
foreign key (order_id) references orders;

alter table order_details add constraint order_details_fk_products
foreign key (product_id) references products;

--BUCKETS
create sequence buckets_sequence start 1 increment 1;

create table buckets(
                        id int8 not null,
                        user_id int8,
                        primary key (id)
                        );

--LINK BETWEEN BUCKET AND USER
alter table buckets add constraint buckets_fk_user
foreign key (user_id) references users;

--BUCKET PRODUCTS
create table bucket_products (
                        bucket_id int8 not null,
                        product_id int8 not null
                        );

--LINK BETWEEN BUCKET AND PRODUCTS/BUCKET
alter table bucket_products add constraint bucket_products_fk_product
foreign key (product_id) references products;

alter table bucket_products add constraint bucket_products_fk_bucket
foreign key (bucket_id) references buckets;

--CATEGORIES
create sequence categories_sequence start 1 increment 1;

create table categories(
                        id int8 not null,
                        title varchar(255),
                        primary key (id)
                        );


