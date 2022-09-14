# 다중 멀티 모듈 생성
setting.gradle 에 포함하고 싶은 서브 모듈들을 등록한다.
```groovy
rootProject.name = 'multi-parent'
include 'clients:test-clients'
include 'api:client-api'
include 'api'
```

사용할 서브 모듈에서 등록한 모듈을 불러온다
```groovy
dependencies {
    implementation project(':clients:test-clients')
}
```