# JPA-Hibernate mappings

> In this project we created 4 tables or entities that are Course, Passport, Review, Student. Going further we will be
> establishing the mappings between them.

## One-to-One mapping

# One-to-one bi-directional

> Let's consider Student and Passport for now. Each student must have only one passport and since passport number is
> unique
> the relation here is oneToOne.

> In 2 ways we can establish OneTwoOne mapping between these two tables
> 1) Using student_id in the Passport table [ In this case Passport table is owning the relationship with student].
> 2) Using passport_id in the Student table [ In this case Student table is owning the relationship with passport].

``` java

@Test
  public void oneToOneMappingBetweenPassportAndStudent(){
    Passport p1 = Passport.builder().passportNumber("ASD135").build();
    Passport p2 = Passport.builder().passportNumber("HJU869").build();
    Passport p3 = Passport.builder().passportNumber("IYT037").build();
    Passport p4 = Passport.builder().passportNumber("TYU238").build();
    Passport p5 = Passport.builder().passportNumber("PEU539").build();

    Student s1 = Student.builder().name("Sai").passport(p1).build();
    Student s2 = Student.builder().name("Manda").passport(p2).build();
    Student s3 = Student.builder().name("sastri").passport(p3).build();
    Student s4 = Student.builder().name("Pb").passport(p4).build();
    Student s5 = Student.builder().name("Katravalli").passport(p5).build();

    studentRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
  }

```
> In the above unitTest we saved Passport as part of student so the Student is on the owning side of the relationship and passport is on the non-owning side of the relationship. Now let see how to create ont 

``` java
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  private Passport passport;
}
```
```java
public class Passport {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String passportNumber;
  @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
  private Student student;
}
```

> *mappedBy* should always be in non owning side of the relationship. As we discussed earlier Address is being saved as part of Student. So, the student is on the owning side of the relationship that right away indicates **mappedBy** should be in the passport entity and on the student property.


