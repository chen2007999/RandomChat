# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table client (
  email                     varchar(255) not null,
  password                  varchar(255),
  password2                 varchar(255),
  name                      varchar(255),
  online                    boolean,
  image                     varchar(255),
  constraint pk_client primary key (email))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists client;

SET REFERENTIAL_INTEGRITY TRUE;

