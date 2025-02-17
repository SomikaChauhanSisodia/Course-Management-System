
<h1 align="center">COURSE API🔥</h1>
##Here I have made different course api a/c to my learning process

- [x] [1] course api w/o database
- [x] [2] course api with database integration(MySql)
- [x] [3]course api with little modification like showing http status too
- [x] [4]course api advance (cloned from java brains).


# Development Process

With the development process of the Course Management System detailed below, I attempt to condense and provide some insight into what I have learnt throughout this course.

## Initial Setup

- [x] Create a Maven project.
- [x] Add `spring-boot-starter-web` dependency.
- [x] Add `CourseApiApp` class and run the application.

## Getting a List of Topics

- [x] Add `Topic` class with `id`, `name`, and `description`.
- [x] Add Topic RestController.
- [x] Add `getAllTopics` and its `/topics` RequestMapping.
- [x] Return a hardcoded list of `Topic` objects which Spring MVC converts to JSON.
      

## Using a Business Service

- [x] Add TopicService class.
- [x] Inject or Autowire TopicService dependency into TopicController.
- [x] Refactor and move hardcoded list to TopicService.
- [x] Add `getAllTopics` service function.

## Getting a Single Topic
- [x] Add `getTopic` service function.
- [x] Add `/topics/{id}` RequestMapping which calls service function with the PathVariable and returns the output.

## Adding a Topic

- [x] Add POST RequestMethod mapping for `/topics`.
- [x] Pass the`Topic` instance from the RequestBody to the TopicService.
- [x] Add `addTopic` service function.

## Updating and Deleting

- [x] Add PUT RequestMethod mapping for `/topics/{id}`.
- [x] Pass the RequestBody `Topic` instance and `id` PathVariable to TopicService.
- [x] Add `updateTopic` service function.
- [x] Add DELETE RequestMethod mapping for `/topics/{id}`.
- [x] Pass the `id` PathVariable to TopicService.
- [x] Add `deleteTopic` service function.

This is a good time to create an `application.properties` file and make any necessary configurations, such as changing the application port. It is good practice to frequently verify the state of the application and test endpoint changes using [Postman](https://www.postman.com/).

## Connecting to a Database

- [x] Add `spring-boot-starter-data-jpa` and `derby` embedded database dependencies to `pom.xml`.
- [x] Add Entity annotation to `Topic` class.
- [x] Add `Id` primary key annotation.
- [x] Add TopicRepository interface extending CrudRepository.
- [x] Autowire TopicRepository to TopicService.
- [x] Refactor TopicService to use built-in TopicRepository CRUD operation methods.

## Adding Course API

- [x] Set up a Course package in the same way as the Topic package.
- [x] Establish a ManyToOne relationship from `Course` to `Topic`.
- [x] Add `findByTopicId` function declaration to CourseRepository interface.
- [x] Refactor CourseService to use functions provided by CourseRepository.
- [x] Refactor CourseController.

```
Course API
--------------
GET       /topics/{topicId}/courses          Get all courses
GET       /topics/{topicId}/courses/{id}     Get one course
POST      /topics/{topicId}/courses          Add new course
PUT       /topics/{topicId}/courses/{id}     Update a course
DELETE    /topics/{topicId}/courses/{id}     Delete a course
```

Add the `spring-boot-starter-actuator` and package the project as a jar or a traditional war. All good to go!

# Thank you very much!

Open to any suggestions on how to make this better! Much appreciated!

