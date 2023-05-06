# 화면설계 관통 프로젝트

  

# Member

  

| No. ClassName | participant1 | participant2 |
| ------------------------ | :----------------------------------------------------------- | :----------------------------------------------------------- |
| 09 | 김수환 | 김서기 |

  
  

# 결과화면

### 메인 페이지(index.html)

![image](https://user-images.githubusercontent.com/60723373/225914555-1a629105-0442-45e4-807b-9d24515cd2ad.png)
![image](https://user-images.githubusercontent.com/60723373/225914741-b25e60e4-4998-49d9-a44f-c8ce25b1a1fd.png)

<br><br>

### 메인 페이지(index.html)
- 로그인 시, 상단 Nav에 로그아웃과 내 프로필 버튼이 추가됩니다.

![image](https://user-images.githubusercontent.com/60723373/225918367-cb56ec8c-a20f-4cc0-96ca-aaa704ce5902.png)

<br></br>
  

### 지역별관광지 조회 페이지(maptrip.html)

![image](https://user-images.githubusercontent.com/60723373/225915056-0a5475ed-eaf8-4fd3-82f3-f1ab2a4c7b31.png)

<img alt="image" src="https://user-images.githubusercontent.com/44061558/226085229-9410cfc4-4faa-42d0-a7f9-97c690fcdf42.png">




<br><br>

  

### 회원가입 페이지(signup.html)

![image](https://user-images.githubusercontent.com/60723373/225915325-b4991e2d-e730-4262-844d-60c63f88601f.png)

<br><br>

  

### 로그인 페이지(signin.html)

![image](https://user-images.githubusercontent.com/60723373/225915674-ab3adbb6-a4fe-44e6-ac34-3c031d0d0029.png)

<br><br>

### 아이디 찾기 페이지(findid.html)

![image](https://user-images.githubusercontent.com/60723373/225916504-13de3e0e-b960-4e5a-b5ee-b85d7dd24692.png)
  
 <br><br>

### 비밀번호 찾기 페이지(findpw.html)
![image](https://user-images.githubusercontent.com/60723373/225917071-719bd36c-1b69-478f-b820-2eb0cbb03faa.png)

<br></br>

### 개인 정보 확인/수정/삭제 페이지(myprofile.html)
![image](https://user-images.githubusercontent.com/60723373/225918737-59e24be1-9179-4ae7-b6d8-507dd2303395.png)
  
<br></br>

# 중요 제출 소스

- 전반적인 html 화면 구성의 경우, 오픈소스 부트스트랩 템플릿을 기반으로 설계했으며, 해당 템플릿 내에서 저희 프로젝트에 필요한 부분들을 추가하여 프로젝트를 구성했습니다.
- 주소 : https://themewagon.com/themes/free-bootstrap-5-travel-agency-website-template-tour/

| No. FileName | code |
| ------------------------ | :----------------------------------------------------------- |
| 1. 각 html - script 태그에 존재하는 로그인 여부에 따른  navbar 로직 | ![image](https://user-images.githubusercontent.com/60723373/225919924-2dad60a4-668e-4df2-8614-9a888e876577.png) |
| 2. 각 html - script태그에 존재하는 로그아웃 로직 | ![02](https://user-images.githubusercontent.com/60723373/225920422-1ea93e7b-4842-488b-893f-f24a437bcfcb.png) |
| 3. signin.html - 로그인 로직 | ![03](https://user-images.githubusercontent.com/60723373/225920779-8cbabd44-4745-4a4d-84b1-3b110b21742c.png) |
| 4. maptrip.html - function getData | ![04](https://user-images.githubusercontent.com/60723373/225924313-94908207-8905-4654-b579-47971f02fcfa.png) |
| 5. maptrip.html- function makeDooOption, makeSeeGunOption | ![05](https://user-images.githubusercontent.com/60723373/225924688-dc663215-4c28-412b-9ff2-f19ec8af26fa.png) |
| 6. maptrip.html - btn-search click event | ![06](https://user-images.githubusercontent.com/60723373/225925132-66e27a2f-8975-4eac-ad86-87ce57b3cb20.png) |
| 7. maptrip.html - function makeList | ![07](https://user-images.githubusercontent.com/60723373/225925763-f29f7795-09f0-4587-81eb-a91a3e81794c.png) |
| 8. maptrip.html - 카카오 지도 렌더링 로직 | ![08](https://user-images.githubusercontent.com/60723373/225926169-20188a43-5440-4695-bb74-bce26f821a8e.png) |

<br></br>

# 소감

  

## 김수환

### 구현 이야기

부트스트랩을 화면 설계에 활용해보는 것이 이번이 처음이였는데, 막상 사용해보니 정말 디자이너가 팀에 존재하지 않다면 이렇게 유용한 것이 또 있을까 싶을 정도로 프로젝트에 긍정적으로 적용시킬 수 있어 좋은 경험이였습니다. 또한, 페어와 함께 관광정보와 카카오 맵 API의 오류를 수정하여 해결하면서 추후 관통 프로젝트에 해당 API를 능숙하게 사용할 수 있을 것 같다는 자신감도 들었습니다. 로그인에 따른 기본적인 렌더링 처리가 필요하여 로그인의 경우 간단하게 localstorage에 isLogin이라는 key:value가 존재하는지로 판단하였는데 추후에 관통 프로젝트까지 달려가기 위해 로그인 처리를 위해 어떠한 처리를 해야될 지 좀 더 고민하게 되는 계기가 되었습니다.
  
  

## 김서기

### 구현 이야기

공공 데이터 포털에 있는 한국 관광 공사 국문 관광정보 서비스 데이터를 카카오 맵 API를 가져와서 화면에 띄우는 기능을 담당 해서 개발하였었는데, 개발 도중에 동기, 비동기 관련 문제로 고생을 하였습니다. 도를 선택하면 -> 도 내부에 있는 시,군들이 검색될 수 있어야하는데, 시,군을 검색하려면 다시 API에 요청을 해서 해당 areaCode에 있는 시,군들에 대한 정보를 받아와야하는데, 데이터를 받아오기 전에 렌더링을 진행해서, 출력이 안되었습니다. 이를 해결하기 위해서 팀원의 도움을 받았었는데, async, await를 사용해서 데이터가 받아 진 후, 랜더링을 진행해주는 방식으로 해결할 수 있었습니다. 이 프로젝트를 진행하면서, JS 동기 비동기 동작방식에 대해서 배울 수 있었습니다.
