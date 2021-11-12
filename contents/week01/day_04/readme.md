# Type

자바의 타입은 크게 원시 타입(Primitive Type)과 참조 타입(Reference Type)이 있다. 원시 타입은 정수, 실수, 문자, 논리 리터럴등의 실제 데이터 값을 저장하는 타입이고, 참조 타입은 객체의 메모리 주소를 참조하는 타입이다. 원시 타입의 경우 각 변수 간에 원시 타입 데이터를 복사하며, 참조 값의 경우 해당 객체의 값을 바꾼다.


```java
public class Type {
    public static void main(String[] args) {
        // Primitive 타입
        int a = 1;
        int b = 2;
        
        // Ref 타입
        Monster monster = new Monster(1L, "Monster", 30);
    };
}
```

<br/><br/>

## 불변객체 

불변 객체의 경우 변수에 매 번 재할당 되는 것이 아니라 매 번 새로 생성되기 때문에 생성비용이 든다. 아래의 코드를 실행했을 경우 시간이 굉장히 많이 걸리는데, 이는 재할당이 아닌 재생성 과정을 100000번 거치기 때문이다.  
```java
private static void slowStringTest() {
        String a = "A";
        for (int i = 0; i < 100000; i++) {
            a += "a";
        }
        a += "h!";
        System.out.println(a);
    }
```

<br/>

이를 아래와 같이 고치게 되면 조금 더 빨라지는데 이는 StringBuilder 객체를 통해 하나의 객체를 만들기 때문이다.  
```java
 private static void stringBufferTest() {
        StringBuffer sb = new StringBuffer("A");
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println(sb.toString());
    }
```

<br/><br/>

`** 이와 같은 불변객체에는 BigDecimal, 값 객체 등과 같은 것들이 추가로 있으며 이는 추후 반드시 학습한다.`

<br/><br/>



# Call by value
원시타입의 경우 단순히 값이 복사되어 할당되기 때문에 값 자체가 바뀌지 않는다. 아래와 같은 경우 여전히 a와 b의 값은 3과 4가 나오게 된다. 하지만 객체의 경우 해당 힙의 주소를 가리키기 때문에 힙의 값 자체가 변하게 된다. 이 경우도 엄밀히 말하면 Call by value다. 
````java
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        swap(a, b);
        System.out.println("a= "+a+", b= "+b);
    };


    static void swap(int x, int y){
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
    }
}
````