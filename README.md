# Servlet 관통 프로젝트

# Member

| No. ClassName | participant1 | participant2 | participant3 |
| ------------- | :----------- | :----------- | :----------- |
| 09            | 이유한       | 박승수       | 김서기       |

# 기능 구현 화면

### 메인 페이지(index.html)

![image](https://user-images.githubusercontent.com/60723373/225914555-1a629105-0442-45e4-807b-9d24515cd2ad.png)

![image](https://user-images.githubusercontent.com/60723373/225914741-b25e60e4-4998-49d9-a44f-c8ce25b1a1fd.png)

<br><br>

### 메인 페이지(index.html)

- 로그인 시, 상단 Nav에 로그아웃과 내 프로필 버튼이 추가됩니다.

![image](https://user-images.githubusercontent.com/60723373/225918367-cb56ec8c-a20f-4cc0-96ca-aaa704ce5902.png)

<br></br>

### 지역별관광지 조회 페이지(maptrip.html)

구현사항

- 기존 구현사항에서 검색어 삭제
- 시/도, 구/군, 관광지 유형 선택에 따라 지도에 해당 지역 마커 표시
- 마커 클릭 시, 해당 관광지의 정보를 화면 하단에 표시

![Image Pasted at 2023-3-28 01-48](https://user-images.githubusercontent.com/60723373/228011213-1d911600-7bcc-4723-9269-6a1f66090b7f.png)
![Image Pasted at 2023-3-28 01-47](https://user-images.githubusercontent.com/60723373/228024267-03f22a6e-1ec5-4953-a1fd-4519c9651983.png)

<br><br>

### 회원가입 페이지(signup.html)

구현 사항

- form input tag들에 들어간 값을 기반으로 회원 가입 진행.

![image](https://user-images.githubusercontent.com/60723373/225915325-b4991e2d-e730-4262-844d-60c63f88601f.png)

<br><br>

### 로그인 페이지(signin.html)

구현 사항

- 아이디와 비밀번호 값을 기반으로 로그인 진행
- 로그인, 성공과 실패에 따른 에러 처리 구현

![image](https://user-images.githubusercontent.com/60723373/225915674-ab3adbb6-a4fe-44e6-ac34-3c031d0d0029.png)

<br></br>

### 개인 정보 확인/수정/삭제 페이지(myprofile.html)

구현 사항

- form input 태그들에 있는 정보를 기반으로 회원 정보 확인/수정 기능 구현
- 회원 탈퇴하기 버튼 클릭 시, 회원 정보 삭제 기능 구현

![image](https://user-images.githubusercontent.com/60723373/225918737-59e24be1-9179-4ae7-b6d8-507dd2303395.png)

<br></br>

# 중요 제출 소스

# 수정 필요

- 전반적인 화면 구성의 경우, 기존 화면 구성 관통 프로젝트를 따라가되 servlet을 통한 백엔드 개발을 진행했습니다.

| No. FileName                                                              | code                                                                                                                                                                |
| ------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 1. 프로젝트 구성도                                                        | ![Image Pasted at 2023-3-28 02-00](https://user-images.githubusercontent.com/60723373/228013102-662b6769-a05a-43c9-a3cf-342006a83ba2.png)                           |
| 2. 관광지 정보 가져오는 Controller 코드 (AttractionController.java)       | ![관광지정보_얻기](/uploads/763004c7c8fea3cf5eb7c11f133005b2/관광지정보_얻기.png)                                                                                   |
| 3. 지역 도,시 정보를 가져오는 Controller 코드 (AttractionController.java) | ![도시정보_얻기](/uploads/3b03fadeb731c7a91bfab46e2fc7b522/도시정보_얻기.png)                                                                                       |
| 4. 유저 회원가입, 유저 회원탈퇴, 유저 정보수정 (MemberController.java)    | ![회원가입__회원탈퇴](/uploads/9f18a1cdb3d09ae9490d9f9a3af436cc/회원가입__회원탈퇴.png) ![회원정보수정](/uploads/e0c4f756f02e2cf4188756212356dc09/회원정보수정.png) |
| 5. 유저 로그인, 유저정보 받기, 유저 로그아웃 (MemberController.java)      | ![로그인](/uploads/f128a2a0b7b98449ce0a4d6522e985fa/로그인.png) ![유저정보얻기_로그아웃](/uploads/6903df11a382597c00fd0d366b615608/유저정보얻기_로그아웃.png)       |
| 6. 관광지 MyBatis Mapper 코드 (mappers/attraction.xml)                    | ![어트랙션매퍼1](/uploads/047b3505837f185fb6d7337ee872260d/어트랙션매퍼1.png) ![어트랙션매퍼2](/uploads/3140d9393bd025ef3807b37d174b7527/어트랙션매퍼2.png)         |
| 7. 지도 MyBatis Mapper 코드 (mappers/loaction.xml)                        | ![로케이션매퍼](/uploads/ef15a4937551d4c3af6be09297c2127c/로케이션매퍼.png)                                                                                         |
| 8. 멤버 MyBatis Mapper 코드 (mappers/member.xml)                          | ![멤버매퍼](/uploads/87885640f0e839cae60c02f8a1e5fdd3/멤버매퍼.png)                                                                                                 |

<br></br>

# 소감

## 이유한

### 구현 이야기

처음엔 기존 프로젝트에서 스프링 부트로 프로젝트를 바꾸는 데에 그리 오래 걸리지 않을 줄 알았던 시작이었습니다. 하지만 진행하다보니 생각보다 시간이 오래 걸리고 바꿔줘야할 부분이 많고 코드들에서 오류가 많이 발생해 어려움을 겪었습니다.
그래도 기존 프로젝트의 코드와 스프링 부트로 바꿔가며 바뀐 코드를 옆에 두고 보다보니 확실히 스프링 프레임워크를 사용했을 때 코드가 훨씬 간결해지고 적은 양이 되었다는 것을 알 수 있었습니다.  
 처음에 세팅해야할 부분이 기존 서블릿 프로젝트보다 많아서 처음에 제대로 세팅하지 않아 오류가 발생했을 때 어떤 오류인지 감을 잘못잡았던 것 같지만 찾아내는 재미가 있었습니다.  
 현재 페어가 자리를 비워 다른 두 명과 머리를 맞대어 오류들을 함께 고민하는 시간이 뜻깊고 배운 것이 많은 시간이라 좋았습니다.

## 박승수

### 구현 이야기

Servlet에서 Spring Boot로 프로젝트를 변경하였습니다.
처음 Spring을 학습할때는 굳이 왜 더 학습해서 저성능의 서버를 만들어야할까 의문이 많았습니다.
Spring이 어느정도 학습된후, Spring이 왜 편하고, 개발자의 편의성에 빠져들수밖에 없다던 교수님의 말씀이 이해가 되었습니다.

하지만 장점만있었던건 아니였습니다.

1. 추가적인 학습이 필요하다.
2. 코드를 작성해서 오류가 나는것이 아닌, 작성하지 않아서 오류가 난다는것 자체가 당황스러웠습니다.
3. 에러를 찾는것이 어려웠습니다. 2번에서 이어지는것이지만, 작성해서 오류가 날경우 원인인 코드를 알려주기때문에 역추적하면서 에러를 해결할수 있지만, 작성하지 않았다면, 에러위치를 정확히 알수없고, 코드의 정확한 구조를 아는것도 어려웠습니다.

이번 프로젝트를 진행하면서 프레임워크의 편안함과, 개발자가 편의성에만 집중하지 않고, 경계해야하는 이유의 대해 이해하는 시간을 갖게된거 같아 좋은 시간이였던것 같습니다.

또한 이전 코드를 가져와 Spring으로 바꾸는 과정에서 이전 코드가 많았고, 에러해결하는데 너무 많은 시간을 보내 CSRF Token과 같은 기능들을 추가하지 못해 아쉬웠습니다.

## 김서기

### 구현 이야기

서블릿으로 작성된 코드를 스프링으로 변경하고, DAO를 myBatis로 전환하는 작업을 진행했습니다. 이 과정에서 클라이언트 코드를 최대한 건드리지 않고 백엔드 코드만 수정하기 위해 노력했지만, URL이 변경되면서 일부 클라이언트 코드를 수정해야 했습니다. 또한 myBatis로 코드를 변경하는 과정에서 오류가 발생하여 많은 시간을 소요하게 되었는데, 이때 test 코드나 AOP를 적용하면서 작업을 진행했으면 더 좋았을 것입니다. 다음에는 이러한 부분을 보완하여 최종적으로 관통할 때 효율적인 작업을 하면 좋을것 같습니다.




