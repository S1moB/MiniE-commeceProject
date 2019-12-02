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