CREATE TABLE `learning_system_dev` (
  `id`        INT           NOT NULL AUTO_INCREMENT,
  `version`   INT           NOT NULL DEFAULT 0,
  `name`      VARCHAR(255)  NOT NULL,
  `created`   TIMESTAMP               NOT NULL  DEFAULT NOW(),
  `modified`  TIMESTAMP               NOT NULL  DEFAULT NOW(),
  `gender`    ENUM('MALE', 'FEMALE')  NOT NULL,
  `age`       INT           NOT NULL,
  PRIMARY KEY (`id`));