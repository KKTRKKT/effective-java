# Effective Java

이펙티브 자바는 효과적이고 안전한 프로그래밍을 위한 다양한 팁과 관례를 제공합니다.

## 개요

이 프로젝트는 Effective Java의 주요 원칙들을 학습하기 위한 예제 코드 모음입니다.

### 핵심 주제
1. 좋은 코딩 습관
2. 성능 최적화
3. 예외처리와 안전한 코드
4. 협업 강화

## 목차

### 객체 생성과 파괴
- [01. 정적 팩토리 메소드](#01-정적-팩토리-메소드)
- [02. 빌더 패턴](#02-빌더-패턴)
- [03. 싱글톤](#03-싱글톤)
- [04. private 생성자](#04-private-생성자)
- [05. 의존 객체 주입](#05-의존-객체-주입)
- [06. 불필요한 객체 생성 피하기](#06-불필요한-객체-생성-피하기)
- [07. 다 쓴 객체 참조 해제](#07-다-쓴-객체-참조-해제)
- [08. finalizer와 cleaner 사용 피하기](#08-finalizer와-cleaner-사용-피하기)
- [09. try-with-resources 사용](#09-try-with-resources-사용)

### 모든 객체의 공통 메소드
- [10. equals](#10-equals)
- [11. hashCode](#11-hashcode)
- [12. toString](#12-tostring)
- [13. clone](#13-clone)
- [14. Comparable](#14-comparable)

### 클래스와 인터페이스
- [15. 클래스와 멤버의 접근 권한 최소화](#15-클래스와-멤버의-접근-권한-최소화)
- [16. public 클래스의 접근자 메소드](#16-public-클래스의-접근자-메소드)
- [17. 불변 객체](#17-불변-객체)
- [18. 상속보다는 컴포지션](#18-상속보다는-컴포지션)
- [19. 상속을 고려한 설계와 문서화](#19-상속을-고려한-설계와-문서화)
- [20. 추상 클래스보다는 인터페이스](#20-추상-클래스보다는-인터페이스)
- [21. 구현을 고려한 인터페이스 설계](#21-구현을-고려한-인터페이스-설계)
- [22. 인터페이스는 타입 정의 용도로만 사용](#22-인터페이스는-타입-정의-용도로만-사용)
- [23. 태그 달린 클래스보다는 클래스 계층구조](#23-태그-달린-클래스보다는-클래스-계층구조)
- [24. 멤버 클래스는 되도록 static으로](#24-멤버-클래스는-되도록-static으로)
- [25. 톱레벨 클래스는 한 파일에 하나만](#25-톱레벨-클래스는-한-파일에-하나만)

### 제네릭
- [26. raw 타입 사용 금지](#26-raw-타입-사용-금지)
- [27. 비검사 경고 제거](#27-비검사-경고-제거)
- [28. 배열보다는 리스트](#28-배열보다는-리스트)
- [29. 제네릭 타입으로 만들기](#29-제네릭-타입으로-만들기)
- [30. 제네릭 메소드](#30-제네릭-메소드)
- [31. 한정적 와일드카드](#31-한정적-와일드카드)
- [32. 제네릭과 가변인수](#32-제네릭과-가변인수)
- [33. 타입 안전 이종 컨테이너](#33-타입-안전-이종-컨테이너)

### 기타 주요 개념
- [GC (가비지 컬렉션)](#gc-가비지-컬렉션)
- [동시성 프로그래밍](#동시성-프로그래밍)
- [모듈 시스템](#모듈-시스템)
- [참조 타입](#참조-타입)
- [기타 개념들](#기타-개념들)

---

## 상세 내용

### 01. 정적 팩토리 메소드
**위치**: `src/main/java/me/kktrkkt/effectivejava/_01_static_factory_method`

정적 팩토리 메소드란 static 키워드를 통해 객체를 생성하는 방법을 의미합니다.

**장점**:
- 생성자에 이름을 부여해 시그니처가 중복되지 않게 해준다
- 인스턴스 생성을 제한해 메모리를 절약할 수 있다 (플라이웨이트 패턴)
- 상위 타입은 하위 타입으로 반환할 수 있다
- 입력 매개변수에 따라 매번 다른 클래스 객체를 반환할 수 있다
- 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다

**단점**:
- 상속이 불가능해진다
- javadoc에서 생성자가 어떤 메소드인지 알 수가 없다

**관련 패턴**: 플라이웨이트 패턴, 열거 타입, 서비스 제공자 프레임워크

### 02. 빌더 패턴
**위치**: `src/main/java/me/kktrkkt/effectivejava/_02_builder`

정적 팩토리와 생성자에 선택적 매개변수가 많을 경우 빌더 패턴을 고려합니다.

**패턴 비교**:
1. **생성자 체이닝**: 매개변수가 많아지면 사용이 어려워진다
2. **자바빈즈 패턴**: 완전한 객체를 만들 때 메소드 호출이 많아지고, 불변객체를 만들 수 없다
3. **빌더 패턴 (권장)**: 플루언트 API/메서드 체이닝을 통해 변수를 설정
4. **계층형 빌더 패턴**: 빌더 패턴을 상속할 때 사용

### 03. 싱글톤
**위치**: `src/main/java/me/kktrkkt/effectivejava/_03_singleton`

생성자나 열거 타입으로 싱글톤임을 보장합니다.

**구현 방법**:
1. `private 생성자 + public static final 필드`
2. `private 생성자 + private static final 필드`
3. `열거형` (권장)

**열거형 장점**:
- 간단하게 싱글톤을 생성하며, 리플렉션, 직렬화 인스턴스 생성을 방지
- 인터페이스를 구현할 수 있어 추상화가 가능
- 멀티스레딩에 안전

### 04. private 생성자
**위치**: `src/main/java/me/kktrkkt/effectivejava/_04_private_constructor`

인스턴스화를 막기 위해서 private 생성자를 사용합니다. 유틸리티 클래스는 인스턴스가 필요없이 정적 메소드로만 구성되어 있으므로 생성자를 막아야 합니다.

### 05. 의존 객체 주입
**위치**: `src/main/java/me/kktrkkt/effectivejava/_05_di`

자원을 직접 명시하지 말고 의존 객체 주입을 사용합니다.

**장점**: 
- 클라이언트 코드의 재사용성이 높아진다
- 테스트 코드 작성이 용이하다

**주의점**: 의존 객체는 추상화해 인터페이스로 빼야 한다

### 06. 불필요한 객체 생성 피하기
**위치**: `src/main/java/me/kktrkkt/effectivejava/_06_avoid_creating_unnecessary_objects`

불필요한 객체 생성을 피하고, 재사용을 통해 성능을 향상시킵니다.

**주의사항**:
- 문자열 생성: `new String("문자열")` 대신 `"문자열"` 사용
- 정규식: Pattern을 캐싱하여 재사용
- 오토박싱: 불필요한 박싱/언박싱 피하기

### 07. 다 쓴 객체 참조 해제
**위치**: `src/main/java/me/kktrkkt/effectivejava/_07_dereferencing_used_objects`

메모리 누수를 방지하기 위해 다 쓴 객체 참조를 해제합니다.

**메모리 누수 발생 상황**:
- 자기 자신이 메모리를 관리하는 클래스
- 캐시
- 리스너와 콜백

### 08. finalizer와 cleaner 사용 피하기
**위치**: `src/main/java/me/kktrkkt/effectivejava/_08_avoid_finalizer_and_cleaner`

finalizer와 cleaner는 예측 불가능하고 위험하므로 사용을 피합니다.

**대안**: AutoCloseable 인터페이스 구현

### 09. try-with-resources 사용
**위치**: `src/main/java/me/kktrkkt/effectivejava/_09_use_try_with_resources`

자원 해제가 필요한 경우 try-with-resources를 사용합니다.

**장점**:
- 자동으로 자원을 해제
- 코드가 간결
- 예외 처리가 명확

### 10. equals
**위치**: `src/main/java/me/kktrkkt/effectivejava/_10_equals`

equals를 재정의할 때는 일반 규약을 따릅니다.

**규약**: 반사성, 대칭성, 추이성, 일관성, null-아님

### 11. hashCode
**위치**: `src/main/java/me/kktrkkt/effectivejava/_11_hashcode`

equals를 재정의하면 hashCode도 재정의해야 합니다.

### 12. toString
**위치**: `src/main/java/me/kktrkkt/effectivejava/_12_tostring`

toString을 재정의해 간결하고 읽기 쉬운 정보를 제공합니다.

### 13. clone
**위치**: `src/main/java/me/kktrkkt/effectivejava/_13_clone`

clone 재정의는 주의해서 진행하며, 복사 생성자나 복사 팩토리가 더 나은 대안입니다.

### 14. Comparable
**위치**: `src/main/java/me/kktrkkt/effectivejava/_14_comparable`

순서를 고려해야 한다면 Comparable을 구현합니다.

**규약**: 반사성, 대칭성, 추이성, 일관성

### 15. 클래스와 멤버의 접근 권한 최소화
**위치**: `src/main/java/me/kktrkkt/effectivejava/_15_minimize_access_classes_and_member`

클래스와 멤버의 접근성을 최소화하여 캡슐화를 강화합니다.

### 16. public 클래스의 접근자 메소드
**위치**: `src/main/java/me/kktrkkt/effectivejava/_16_public_class_use_access_method`

public 클래스에서는 public 필드 대신 접근자 메소드를 사용합니다.

### 17. 불변 객체
**위치**: `src/main/java/me/kktrkkt/effectivejava/_17_immutable_object`

가변성을 최소화하여 불변 객체를 만듭니다.

**장점**:
- 스레드 안전
- 자유롭게 공유 가능
- 실패 원자적

### 18. 상속보다는 컴포지션
**위치**: `src/main/java/me/kktrkkt/effectivejava/_18_use_composition_rather_than_inheritance`

상속보다는 컴포지션을 사용하여 유연성을 확보합니다.

### 19. 상속을 고려한 설계와 문서화
**위치**: `src/main/java/me/kktrkkt/effectivejava/_19_design_and_document_inheritance_otherwise_do_not_use_inheritance`

상속을 위한 설계와 문서화를 하거나, 그럴 수 없다면 상속을 금지합니다.

### 20. 추상 클래스보다는 인터페이스
**위치**: `src/main/java/me/kktrkkt/effectivejava/_20_use_interface_rather_than_abstract`

인터페이스를 우선적으로 사용합니다.

### 21. 구현을 고려한 인터페이스 설계
**위치**: `src/main/java/me/kktrkkt/effectivejava/_21_design_interfaces_with_implementation_in_mind`

인터페이스는 구현하는 쪽을 생각하며 설계합니다.

### 22. 인터페이스는 타입 정의 용도로만 사용
**위치**: `src/main/java/me/kktrkkt/effectivejava/_22_use_interfaces_only_to_define_types`

인터페이스는 타입을 정의하는 용도로만 사용합니다.

### 23. 태그 달린 클래스보다는 클래스 계층구조
**위치**: `src/main/java/me/kktrkkt/effectivejava/_23_use_class_hierarchies_rather_than_tagged_classes`

태그 달린 클래스 대신 클래스 계층 구조를 활용합니다.

### 24. 멤버 클래스는 되도록 static으로
**위치**: `src/main/java/me/kktrkkt/effectivejava/_24_make_member_classes_as_static_as_possible`

멤버 클래스는 되도록 static으로 만들어 메모리 효율을 높입니다.

**중첩 클래스 종류**:
1. 정적 멤버 클래스
2. 비정적 멤버 클래스
3. 익명 클래스
4. 로컬 클래스

### 25. 톱레벨 클래스는 한 파일에 하나만
**위치**: `src/main/java/me/kktrkkt/effectivejava/_25_one_top_level_class_per_file`

파일 하나당 톱레벨 클래스는 하나만 선언합니다.

### 26. raw 타입 사용 금지
**위치**: `src/main/java/me/kktrkkt/effectivejava/_26_dont_use_raw_type`

제네릭에서 raw 타입은 사용하지 않습니다.

**이유**: 타입 안정성과 사용 편의성이 떨어집니다.

### 27. 비검사 경고 제거
**위치**: `src/main/java/me/kktrkkt/effectivejava/_27_remove_unchecked_warnings`

가능한 모든 비검사 경고를 제거하고, 불가능하면 `@SuppressWarnings("unchecked")`를 사용합니다.

### 28. 배열보다는 리스트
**위치**: `src/main/java/me/kktrkkt/effectivejava/_28_use_lists_rather_than_arrays`

배열보다는 리스트를 사용하여 타입 안정성을 확보합니다.

**차이점**:
- 배열은 공변, 리스트는 불공변
- 배열은 실체화, 제네릭은 소거

### 29. 제네릭 타입으로 만들기
**위치**: `src/main/java/me/kktrkkt/effectivejava/_29_if_possible_make_it_a_generic_type`

이왕이면 제네릭 타입으로 만들어 타입 안정성을 높입니다.

### 30. 제네릭 메소드
**위치**: `src/main/java/me/kktrkkt/effectivejava/_30_if_possible_make_it_a_generic_method`

이왕이면 제네릭 메소드를 사용합니다.

**활용**:
- 제네릭 싱글톤 팩토리
- 재귀적 한정 타입

### 31. 한정적 와일드카드
**위치**: `src/main/java/me/kktrkkt/effectivejava/_31_increase_api_flexibility_using_qualified_wildcards`

한정적 와일드카드를 사용해 API 유연성을 높입니다.

- `? extends T`: 상위 타입
- `? super T`: 하위 타입

### 32. 제네릭과 가변인수
**위치**: `src/main/java/me/kktrkkt/effectivejava/_32_be_careful_when_using_generics_and_variable_arguments_together`

제네릭과 가변인수를 함께 쓸 때는 신중해야 합니다.

**주의**: 가변인수는 배열이 되므로 공변 상태를 가지며, 힙 오염이 발생할 수 있습니다.

### 33. 타입 안전 이종 컨테이너
**위치**: `src/main/java/me/kktrkkt/effectivejava/_33_consider_type_safe_heterogeneous_containers`

타입 안전 이종 컨테이너를 고려합니다.

**구현 방법**:
- 타입 토큰
- 수퍼 타입 토큰
- 한정적 타입 토큰

---

## 기타 주요 개념

### GC (가비지 컬렉션)
**위치**: `src/main/java/me/kktrkkt/effectivejava/etc/gc`

GC는 사용하지 않는 메모리를 정리해 메모리 공간을 확보합니다.

**GC 알고리즘**:
- Serial
- Parallel
- G1
- ZGC
- Shenandoah

### 동시성 프로그래밍
**위치**: `src/main/java/me/kktrkkt/effectivejava/etc/concurrency`

멀티스레드 환경에서의 안전한 프로그래밍 기법을 다룹니다.

**관련 개념**:
- Thread
- Executor
- CompletableFuture
- CountDownLatch
- ThreadLocal
- ThreadLocalRandom

### 모듈 시스템
**위치**: `src/main/java/me/kktrkkt/effectivejava/etc/module`

Java Platform Module System (JPMS) - Java 9에 추가된 모듈 시스템입니다.

**특징**:
- 안정성: 순환 참조 허용 x
- 캡슐화: public이어도 공개된 패키지만 사용 가능
- 확장성: 필요한 모듈만 사용해 최적화

### 참조 타입
**위치**: `src/main/java/me/kktrkkt/effectivejava/etc/reference`

**레퍼런스 종류**:
- Strong: 일반적인 참조
- Weak: 객체 참조가 사라지면 GC 대상
- Soft: 메모리 부족 시 GC 대상
- Phantom: 객체 참조가 사라지면 큐에 추가

### 기타 개념들

**Deprecation**
- `@Deprecated`: 컴파일 시 사용 자제 코드 알림
- `@deprecated`: javadoc에 사유 표기

**예외 처리**
- IllegalArgumentException: 잘못된 인자
- ConcurrentModificationException: 순회 중 데이터 변경

**자료 구조**
- HashMap LinkedList
- TreeSet
- Value-based Class

**성능 최적화**
- 정규 표현식 캐싱
- ThreadLocal 활용

**안전성**
- Thread Safety
- Final과 JMM (Java Memory Model)
- Callback과 Wrapper

---

## 실행 방법

이 프로젝트는 Spring Boot 기반으로 구성되어 있습니다.

```bash
# 프로젝트 빌드
./mvnw clean package

# 테스트 실행
./mvnw test
```

## 참고 자료

- Effective Java (Joshua Bloch)
- [저자 블로그](https://kktrkkt.github.io)

## 라이선스

이 프로젝트는 학습 목적으로 작성되었습니다.
