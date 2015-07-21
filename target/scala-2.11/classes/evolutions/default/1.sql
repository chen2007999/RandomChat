# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table client (
  email                     varchar(255) not null,
  password                  varchar(255),
  password2                 varchar(255),
  name                      varchar(255),
  image                     varchar(255),
  pairedEmail               varchar(255),
  constraint pk_client primary key (email))
;

create table friend (
  email                     varchar(255),
  firendId                  varchar(255))
;

create table pair_history (
  email                     varchar(255),
  pairedId                  varchar(255))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists client;

drop table if exists friend;

drop table if exists pair_history;

SET REFERENTIAL_INTEGRITY TRUE;

