## Git 사용법

Git 사용및 명령어 정리

## I. Git 명령어 순서

프로젝트를 처음 생성할 때

```
git init
<<<<<<< HEAD
git add [파일명]
git status
git commit -m "넣을 메시지"
git push -u origin master

```

## II. 이미 만들어진 프로젝트에 Git을 올리는 순서

```
git add [파일명]
git add .
git commit -m "메시지"
=======
git add
git status
git commit -m
>>>>>>> a06cecf976465ff4cabdd10191c4634df8af369f
git push -u origin master
```





