FROM openjdk:8
WORKDIR /user/src/myapp
COPY Test.java .

RUN javac Test.java
CMD [ "java","Test" ]