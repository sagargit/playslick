# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `login_user` (`login_email` VARCHAR(254) NOT NULL,`login_password` VARCHAR(254) NOT NULL);
create table `nts_notes` (`id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,`nt_user_id` BIGINT NOT NULL,`nt_title` VARCHAR(254) NOT NULL,`nt_note` TEXT NOT NULL);
create table `nts_users` (`id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,`us_first_name` VARCHAR(254) NOT NULL,`us_last_name` VARCHAR(254) NOT NULL,`us_email` VARCHAR(254) NOT NULL,`us_password` VARCHAR(254) NOT NULL);

# --- !Downs

drop table `nts_users`;
drop table `nts_notes`;
drop table `login_user`;

