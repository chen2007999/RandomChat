# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table chat_history (
  id                        bigint not null,
  fromClient                varchar(255),
  toClient                  varchar(255),
  sentTime                  timestamp,
  content                   varchar(255),
  constraint pk_chat_history primary key (id))
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
  id                        bigint not null,
  interest                  varchar(255),
  clientEmail               varchar(255),
  constraint pk_client_interest primary key (id))
;

create table friend (
  id                        bigint not null,
  email                     varchar(255),
  friendEmail               varchar(255),
  constraint pk_friend primary key (id))
;

create table interest (
  interest                  varchar(255) not null,
  description               varchar(255),
  constraint pk_interest primary key (interest))
;

create table pair_history (
  id                        bigint not null,
  email                     varchar(255),
  pairedId                  varchar(255),
  constraint pk_pair_history primary key (id))
;

create table unread (
  id                        bigint not null,
  clientEmail               varchar(255),
  friendRequestClientEmail  varchar(255),
  friendConfirmationClientEmail varchar(255),
  messageFrom               varchar(255),
  unreadMessageNumber       integer,
  constraint pk_unread primary key (id))
;

create sequence chat_history_seq;

create sequence client_seq;

create sequence client_interest_seq;

create sequence friend_seq;

create sequence interest_seq;

create sequence pair_history_seq;

create sequence unread_seq;




# --- !Downs

drop table if exists chat_history cascade;

drop table if exists client cascade;

drop table if exists client_interest cascade;

drop table if exists friend cascade;

drop table if exists interest cascade;

drop table if exists pair_history cascade;

drop table if exists unread cascade;

drop sequence if exists chat_history_seq;

drop sequence if exists client_seq;

drop sequence if exists client_interest_seq;

drop sequence if exists friend_seq;

drop sequence if exists interest_seq;

drop sequence if exists pair_history_seq;

drop sequence if exists unread_seq;

