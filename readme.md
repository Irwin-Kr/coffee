23.12.05
  * Brand Entity와 Menu Entity간의 연관관계
  * 문제점 : ManyToOne <-> OneToMany 간 null 및 Menu Entity에서 Brand 입력시 무한 루프

23.12.06
  * 12.05 해결 : Menu Entity의 cascade, joincolumn / Brand Entity의 jsonCreator, JsonProperty, JsonIgnoreProperties 추가
  * Menu Entity의 Builder를 이용하여 Brand Entity의 name Column 등록
  * 문제점 : Menu Entity에서 Brnad Build시 Brand에서 새로운 id와 Brand 중복 생성

23.12.12
  * 12.12 해결 : Jpa 연관관계 설정시 외래키(FK)에 대한 매핑 정보 변경(Brand.name -> brand.id)
  * 알게된 정보 : 연관관계 설정시 Menu Entity의 Brand(ManyToOne)에서 Brand의 CRUD 가능. FK는 Brand의 PK로 설정해야 한다.(Brand에서 중복된 name이 생성될 수 있다.)
