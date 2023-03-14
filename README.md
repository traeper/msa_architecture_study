# MSA 아키텍처 공부

## layered 아키텍처
api는 domain-jpa가 변경될 때마다 직접적인 영향을 받는다. domain 모듈에서 인터페이스를 제공해서 DIP를 만족시키더라도 결국 고수준이 되는 api 모듈 입장에선 저수준의 인터페이스에 종속되는 것이므로 OCP에 위배된다.

[CarMarketService.kt](./layered-api/src/main/kotlin/com/traeper/msa/layered/api/application/CarMarketService.kt)의 import 부분을 보면 domain.jpa 즉 jpa와 같은 기술에 결합도가 바로 생기는 것을 볼 수 있다. 

### 포함 모듈
  * layered-api
  * layered-domain

## ocp-layered 아키텍처
OCP를 충족시키는 아키텍처이다. 기존 layered 아키텍처와 다르게 api-domain-port의 인터페이스 모듈을 추가하였다.
api는 인터페이스 모듈에 대해 의존하도록 개발하고 domain-jpa는 인터페이스를 구현하여 실행시간에 빈을 제공한다.     

[CarMarketService.kt](./ocp-layered-api/src/main/kotlin/com/traeper/msa/layered/api/application/CarMarketService.kt)의 import 부분을 보면 domain에 의존하며 jpa와 같은 구현체는 노출되지 않는 것을 볼 수 있다.

### 포함 모듈
* ocp-layered-api
* ocp-layered-api-domain-port
* ocp-layered-domain
