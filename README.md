## JISEL Annotation Client project

JISEL was mainly designed to handle the Hierarchical Inheritance type, while Multi Level Inheritance and Multiple Inheritance types can also be achieved through the use of the annotations.

### Hierarchical Inheritance
Easy to achieve with JISEL as long as at least one of the annotated methods has the maximum amount of profiles provided.

#### Large Interface and Sub-Classes folder: https://github.com/mohamed-ashraf-bayor/jisel-annotation-client/tree/master/src/main/java/com/bayor/jisel/annotation/client/hierarchicalinheritance

#### Generated Sealed Interfaces folder: https://github.com/mohamed-ashraf-bayor/jisel-annotation-client/tree/master/target/generated-sources/annotations/com/bayor/jisel/annotation/client/hierarchicalinheritance

### Multi Level Inheritance
Not achieved by default with the algorithm used for the Hierarchical Inheritance type. As a workaround, a "dummy" profile can be added to the method(s) to the profiles provided through @SealForProfile(s).

#### Large Interface and Sub-Classes folder: https://github.com/mohamed-ashraf-bayor/jisel-annotation-client/tree/master/src/main/java/com/bayor/jisel/annotation/client/multilevelinheritance

#### Generated Sealed Interfaces folder: https://github.com/mohamed-ashraf-bayor/jisel-annotation-client/tree/master/target/generated-sources/annotations/com/bayor/jisel/annotation/client/multilevelinheritance

### Multiple Inheritance
Achieved by default with the algorithm used for the Hierarchical Inheritance type. When multiple top-level parent interfaces are detected their names are formed as a concatenation of the names of the profiles sharing the common methods. 

#### Large Interface and Sub-Classes folder: https://github.com/mohamed-ashraf-bayor/jisel-annotation-client/tree/master/src/main/java/com/bayor/jisel/annotation/client/multipleinheritance

#### Generated Sealed Interfaces folder: https://github.com/mohamed-ashraf-bayor/jisel-annotation-client/tree/master/target/generated-sources/annotations/com/bayor/jisel/annotation/client/multipleinheritance