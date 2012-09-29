# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table run (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_run primary key (id))
;

create table test_case (
  id                        bigint not null,
  title                     varchar(255),
  purpose                   varchar(255),
  nature                    integer,
  mode                      integer,
  pre_conditions            varchar(255),
  test_descriptions         varchar(255),
  pass_criteria             varchar(255),
  post_conditions           varchar(255),
  due_date                  timestamp,
  constraint ck_test_case_nature check (nature in (0,1)),
  constraint ck_test_case_mode check (mode in (0,1)),
  constraint pk_test_case primary key (id))
;

create table test_category (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_test_category primary key (id))
;

create table test_run (
  id                        bigint not null,
  name                      varchar(255),
  run_number                bigint,
  date                      timestamp,
  passed                    boolean,
  constraint pk_test_run primary key (id))
;

create table tester (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_tester primary key (id))
;

create sequence run_seq;

create sequence test_case_seq;

create sequence test_category_seq;

create sequence test_run_seq;

create sequence tester_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists run;

drop table if exists test_case;

drop table if exists test_category;

drop table if exists test_run;

drop table if exists tester;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists run_seq;

drop sequence if exists test_case_seq;

drop sequence if exists test_category_seq;

drop sequence if exists test_run_seq;

drop sequence if exists tester_seq;

