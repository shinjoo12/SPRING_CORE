# spring annotation DI

------

### @Autowired
>Bean 타입을 통해 주입할 Bean 객체를 찾는 어노테이션으로 spring Framework에서만 지원하는
> Dependency 용도의 annotation이다.
 1.field, method, constructor에서 사용이 가능하다.
>2. 강제로 Bean을 지정하는 경우에는 @Qualifier를 사용한다. 
>
> 
> 
>## @Inject
> 자바에서 스프링의 @autowired를 참고해서 만든 어노테이션으로 @autowired와 매우 비슷하다.
> @autowired와 동일하게 Bean타입을 기준으로 찾는다. 만약 없다면 이름으로 찾는 특징을 가진다.
> 1.field,constructor, Method에서 사용이 가능하다.
> 2.외부 라이브러리를 이용해야 한다. 
> implementation "javax.inject:javax.inject:1"
> 3.추후 프레임워크가 바뀔 경우를 대비하기 위해 프레임워크에 종속적이지 않은
> @Inject 방식을 권장한다고 하지만 Spring이 변경될 일은 거의 없으며 @autowired 사용이 매우 많음
> 
> ## @Resource
> 자바에서 만든 어노테이션으로 특정 프레임워크에 종속적이지 않으며 @inject, @Autowired와 다르게 타입이 아닌 이름을 기준으로 연결한다.
>1.field,setter,Method에서 사용이 가능하다. <br>
>2.Inject와 동일하게 lib을 추가해야 한다.
> 
> ---------
## 어노테이션의 Bean 탐색 순서
> @Autowired : 타입 => beanName => @Qualifier => 없으면 예외발생<br>
> @Inject : 타입 => @Qualifier => beanName => 없으면 예외 발생<br>
> @Resource : 이름 => 타입 => @Qualifier => 없으면 예외 발생
> 
> 
> 


> 