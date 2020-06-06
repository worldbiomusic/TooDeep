#Plugin
FenceMine

# Minecraft version
1.12.2

# Author
worldbiomusic

# Version
1.0
-fence설치 후, 블럭 무한생성
1.1
-fence 주인owner가 생김 (다른 사람이 파괴 불가능)
-fenceLoc.yml 데이터 폼이 바뀜
-일반 nether fence 파괴 가능
-일반 nether fence 에서 생성 안되게 막음


# Description
-fence위에 특정 블록 랜덤 무한 생성 플러그인

-OP 필요

# Warning
-oreList.yml을 먼저 설정하고난 후에 정상작동함
-1.1버전부터 fenceLoc.yml 형식이 바뀌었음 -> 1.0버전을 사용하다가 바꾸려면 모든 fence를 부수고 재설치해야 함
(필수는 아니지만, 재설치 하지 않은 

# Commands
<>: 필수, 
[]: 선택,
(OP): OP필요

```
(OP)/fm
: fence 울타리 아이템 지급
(OP)/fm <reload>
: oreList.yml 파일 리로드 (광물 확률 서버에 리로드)
```

# YML
fenceLoc.yml
```
loc:
  #playerName:
    -#loc:
```

oreList.yml
```
#BLOCK_NAME: #(1~100)
```
- #BLOCK_NAME은 마인크래프트의 블럭 이름을 대문자로 작성
- #(1~100)의 전체 합은 100이여야 함
