23. 12. 05
  * Brand Entity와 Menu Entity간의 연관관계
  * 문제점 : ManyToOne <-> OneToMany 간 null 및 Menu Entity에서 Brand 입력시 무한 루프

23. 12. 06
  * 12. 05 해결 : Menu Entity의 cascade, joincolumn / Brand Entity의 jsonCreator, JsonProperty, JsonIgnoreProperties 추가
  * Menu Entity의 Builder를 이용하여 Brand Entity의 name Column 등록
  * 문제점 : Menu Entity에서 Brnad Build시 Brand에서 새로운 id와 Brand 중복 생성
