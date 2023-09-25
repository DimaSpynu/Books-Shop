
create table bucket_products
(
    bucket_id  int8 not null,
    product_id int8 not null
);
alter table bucket_products
    add constraint FKd3uv4vwg7eybaqclvc2sn4i5k foreign key (product_id) references products;
alter table bucket_products
    add constraint FKt11v7b7hocd7iprbkn3v0cui5 foreign key (bucket_id) references buckets;


create sequence buckets_sequence start 1 increment 1
create table buckets
(
    id      int8 not null,
    user_id int8,
    primary key (id)
);
alter table buckets
    add constraint FKnl0ltaj67xhydcrfbq8401nvj foreign key (user_id) references users;


create sequence categories_sequence start 1 increment 1
create table categories
(
    id    int8 not null,
    title varchar(255),
    primary key (id)
);
create sequence order_details_sequence start 1 increment 1
create table order_details
(
    id         int8 not null,
    amount     numeric(19, 2),
    price      numeric(19, 2),
    order_id   int8,
    product_id int8,
    primary key (id)
);
alter table order_details
    add constraint FKjyu2qbqt8gnvno9oe9j2s2ldk foreign key (order_id) references orders;
alter table order_details
    add constraint FK4q98utpd73imf4yhttm3w0eax foreign key (product_id) references products;


create sequence order_sequence start 1 increment 1
create table orders
(
    id      int8 not null,
    address varchar(255),
    changed timestamp,
    created timestamp,
    status  varchar(255),
    sum     numeric(19, 2),
    user_id int8,
    primary key (id)
);
alter table orders
    add constraint FK32ql8ubntj5uh44ph9659tiih foreign key (user_id) references users;


create sequence product_sequence start 1 increment 1
create table products
(
    id          int8 not null,
    description varchar(255),
    price       float8,
    title       varchar(255),
    category_id int8,
    primary key (id)
);
alter table products
    add constraint FKog2rp4qthbtt2lfyhfo32lsw9 foreign key (category_id) references categories;


create sequence user_sequence start 1 increment 1
create table users
(
    id       int8 not null,
    age      int4 not null,
    email    varchar(255),
    gender   varchar(255),
    name     varchar(255),
    password varchar(255),
    role     varchar(255),
    primary key (id)
);





