CREATE TABLE product(
 productName varchar(100) NOT NULL,
  productId varchar(11) NOT NULL ,
 productDescription varchar(100) DEFAULT NULL,
 productPrice varchar(100) DEFAULT NULL,
 PRIMARY KEY (productId)
);

CREATE TABLE ordertbl(
    productId varchar(11),
    orderId varchar(11) NOT NULL ,
    orderQuantity integer ,
    PRIMARY KEY (orderId),
     FOREIGN KEY (productId) REFERENCES product(productId)
);

create table user(
	username varchar(50) not null primary key,
	password varchar(100) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

# use new BCryptPasswordEncoder().encode("password")
#to crypt password before adding it
#to database