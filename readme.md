# JPA-Hibernate mappings

> In this project we created 4 tables or entities that are Course, Passport, Review, Student. Going further we will be
> establishing the mappings between them.

## One-to-One mapping

> Let's consider Student and Passport for now. Each student must have only one passport and since passport number is
> unique
> the relation here is oneToOne.

> In 2 ways we can establish OneTwoOne mapping between these two tables
> 1) Using student_id in the Passport table [ In this case Passport table is owning the relationship with student].
> 2) Using passport_id in the Student table [ In this case Student table is owning the relationship with passport].