CREATE TABLE product(
 productName varchar(100) NOT NULL,
  productId varchar(11) NOT NULL ,
 productDescription varchar(100) DEFAULT NULL,
 productPrice varchar(100) DEFAULT NULL,
 PRIMARY KEY (productId)
);

CREATE TABLE order(
    productId varchar(11) REFERENCES  product(productId),
    orderId varchar(11) NOT NULL ,
    orderQuantity bigint,
    PRIMARY KEY (orderId)
);