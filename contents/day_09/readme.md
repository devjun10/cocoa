# static

static 메서드와 변수는 메모리에 올라가기 때문에 객체를 생성하지 않고도 사용할 수 있다. 우리가 자주 사용하는 System.out.println()의 경우 System 클래스의 PrintStream의 메서드를
사용해 어디서도 이를 사용할 수 있는 것 등이 있다. 아래와 같이 Animal 클래스가 존재한다고 가정해보자.   
<br/>

```java
public class Animal {
    // static 변수. 이는 클래스가 생성되고 전에 초기화 된다.
    private static int numLegs;
    private double weight;
    private String name;

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }
```

<br/><br/>
이때 numLeg는 객체 없이 호출할 수 있으며, 클래스 변수도 사용할 수 있다. 이때 인스턴스 변수는 사용할 수 없다.

```java
public static void main(String[]args){
        Animal.numLegs=4;
        System.out.println("동물의 다리는 세상이 생기기 전에도 "+Animal.numLegs);

        System.out.println("태초에 태초마을 호눅스가 오박사를 만났다");
        Animal to=new Animal(100,"토끼");
        Animal.sayHi();
        Animal doy=new Animal(3000,"돼지");
        System.out.println(doy.numLegs);
        }
```

<br/><br/>

지역변수는 자동으로 초기화가 되지 않기 때문에, 초기화하지 않고 사용하면 에러가 발생한다.

```java
public static void main(String[]args){

        int x;
        System.out.println(x);    // 에러
        }
```

<br/><br/>
`Dan 생각` 실무에서는 생각보다 static 메서드를 사용할 일이 많지 않다. 이를 사용해야 할 경우 차라리 유틸성 메서드나 인터페이스를 만든다.  
<br/>

```java
  -정적 팩토리 메서드는 괜찮지만 범용 로직이라면 static 메서드로만 이루어진 util 클래스를 만든다.
        -특화 로직이라면 static 메서드로만 구성된 helper 클래스를 만들며,혼용은 추천하지 않는다.
        -실무에서는 인터페이스를 많이 쓰는데,static 메서드는 만들 수가 없다.
        -현재의 편의와 성능을 위해서 인스턴스와 스태틱 메서드를 혼용해서 썻는데,기능이 추가되어

interface 를 만들어야 되는 시점이 오면 이를 분리해야만 된다.
``` 

<br/><br/><br/>

# 변수와 할당

변수에 값을 대입하는 것을 `바인딩` 혹은 `할당`이라고 한다. 참조타입을 생성하는 경우 new 연산자가 객체를 생성하고 그 주소를 알려주면 그 주소를 통해 객체를 구분한다.

- new가 객체를 생성하고 그 주소를 알려주면 그 주소를 통해 구분한다. 힙에 만들기 위해서는 new 연산자가 필요하다.
- 원시 타입의 경우 값이 복사되어 할당된다.
  <br/><br/>

```java
public static void main(String[]args){
        System.out.println("Hello, cocoa!");
        //지역변수, 기본타입
        int a=4;
        //참조타입 지역변수 honux <- 휴면 클래스의 인스턴스를 만들어서 그 객체의 주소를 저장
        Human honux=new Human("Honux",20,65);
        //int 배열, 참조타입 <- 힙에 인트 배열 4개가 생기고 그 주소를 넣어준다.
        int[]b=new int[4];
        b[3]=5;
        System.out.println(b[3]);

        //휴면배열, 참조타입
        Human[]cocoas=new Human[5];
        for(int i=0;i< 5;i++){
        cocoas[i]=new Human();
        }
        cocoas[3].setName("땃고양이");

        for(Human h:cocoas){
        System.out.println(h);
        }

        ......
``` 
