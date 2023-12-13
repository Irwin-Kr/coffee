### 23.12.12
  * 12.12 해결 : Jpa 연관관계 설정시 외래키(FK)에 대한 매핑 정보 변경(Brand.name -> brand.id)
  * 알게된 정보 : 연관관계 설정시 Menu Entity의 Brand(ManyToOne)에서 Brand의 CRUD 가능. FK는 Brand의 PK로 설정해야 한다.(Brand에서 중복된 name이 생성될 수 있다.)
