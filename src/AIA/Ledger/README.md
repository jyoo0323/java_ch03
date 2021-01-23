# 콘솔 가계부
  01/22 FRI 과제   
  OOP 지식과  Collections 자료구조에 대한 지식을 있는대로 활용하여 CRUD 기능을 다 보유하고 파일 입출력을 통해 이전의 기록을 가지는 가상 가계부이다
  
## What it does:
  1. 텍스트 파일 Records.txt를 읽어와서 그 안에 있는 내용들을 ArrayList에 담는다
  2. 그 ArrayList에 추가, 삭제, 변경, 검색, 출력을 골라서 선택하면 콘솔에서 상황을 보여준다.
  3. 종료시 Records.txt 파일에 변경된 내용들을 다시 저장해준다.
  
  
  # Improvements:  
  
  
  ## 출력시 항목이 불명확 했던 점 개선. 각 항목의 의미 출력.  
  ![image](https://user-images.githubusercontent.com/68590241/105565982-eed94680-5d6c-11eb-9a07-3a72e6603e26.png)  
  
  
  <br/>  
  
  ## 출력을 printf를 이용한 formatting으로 변경:
  ### 좀 더 깔끔한 느낌을 준다. 그러나 위의 개선점에서 연결되는 문제인 한글 입력시 줄맞춤은 여전히 안된다  
  
  ![image](https://user-images.githubusercontent.com/68590241/105571292-476f0a80-5d92-11eb-8e8d-453bfae5b6b3.png)  
  
  
  <br/>  
  
  
  # 실행예시:
  ## 처음 시작시 비어있는 Records.txt:  
  >>  
  
  ![image](https://user-images.githubusercontent.com/68590241/105503511-059a8180-5d0a-11eb-9ebf-ef5711b52d8e.png)
  
    
  <br/>  
  
  
  ## 처음 시작시 콘솔창:  
  >> 
  
  ![image](https://user-images.githubusercontent.com/68590241/105504579-46df6100-5d0b-11eb-9016-82964f3873c7.png)  
  
  
    
  <br/>  
  
  
  # CRUD:
  
  ## C:새로운 수입과 지출을 추가:   
  ![image](https://user-images.githubusercontent.com/68590241/105504775-84dc8500-5d0b-11eb-8321-fec9b34d5760.png)  
  
    
  <br/>  
  

  ## R: 모든 수입/지출을 출력(PrintAll) & 3000원을 썼던적을 검색후 발견(Search):
  :  
  ![image](https://user-images.githubusercontent.com/68590241/105504930-ad647f00-5d0b-11eb-9055-399c217aed3a.png)  


  
  <br/>  
  


  ## 3000원 지출내역 검색
  ![image](https://user-images.githubusercontent.com/68590241/105505166-f9afbf00-5d0b-11eb-82f1-af4ee23079a2.png)  


  
  <br/>  
  

  
    
  ## U: 커피를 아아 2잔에서 베트남 연유커피 1잔으로 변경(Edit)
    
  ![image](https://user-images.githubusercontent.com/68590241/105505758-b0ac3a80-5d0c-11eb-9802-54275111f6b2.png)  
  
  
  
    
  <br/>  
  
  
  
  
  ## D: 아직 지원금을 받지 못했으므로 지원금을 삭제: 
   
  ![image](https://user-images.githubusercontent.com/68590241/105505913-d76a7100-5d0c-11eb-80d1-7ac5344f0936.png)  
  
    
  <br/>  
  
  
    
  # 프로그램을 종료하고 난 이후의 Records.txt:  
  ![image](https://user-images.githubusercontent.com/68590241/105506247-3203cd00-5d0d-11eb-9705-b840f18e7d01.png)  
    
  <br/>  
  
  
  ![image](https://user-images.githubusercontent.com/68590241/105506385-58296d00-5d0d-11eb-9ad1-229adbcc9bed.png)  
  
    
  <br/>  
  
  
  # 이후 프로그램을 재시작하고 출력시:  
  ![image](https://user-images.githubusercontent.com/68590241/105506517-7db67680-5d0d-11eb-954d-5532db45553b.png)  
  
