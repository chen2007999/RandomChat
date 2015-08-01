# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table chat_history (
  fromClient                varchar(255),
  toClient                  varchar(255),
  sentTime                  timestamp,
  content                   varchar(255))
;

create table client (
  email                     varchar(255) not null,
  description               varchar(255),
  password                  varchar(255),
  password2                 varchar(255),
  name                      varchar(255),
  image                     varchar(255),
  pairedEmail               varchar(255),
  constraint pk_client primary key (email))
;

create table client_interest (
  interest                  varchar(255),
  clientEmail               varchar(255))
;

create table friend (
  email                     varchar(255),
  friendEmail               varchar(255))
;

create table interest (
  interest                  varchar(255) not null,
  description               varchar(255),
  constraint pk_interest primary key (interest))
;

create table pair_history (
  email                     varchar(255),
  pairedId                  varchar(255))
;

create table unread (
  id                        bigint auto_increment not null,
  clientEmail               varchar(255),
  friendRequestClientEmail  varchar(255),
  friendConfirmationClientEmail varchar(255),
  constraint pk_unread primary key (id))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists chat_history;

drop table if exists client;

drop table if exists client_interest;

drop table if exists friend;

drop table if exists interest;

drop table if exists pair_history;

drop table if exists unread;

SET REFERENTIAL_INTEGRITY TRUE;

