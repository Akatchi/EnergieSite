# --- !Ups

create table CAT (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(255) NOT NULL,
  COLOR VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID)
);

create table DOG (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(255) NOT NULL,
  COLOR VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID)
);

# --- !Downs

drop table CAT;
drop table DOG;
