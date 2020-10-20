# Seller-Partner API
Enable access to Amazon's MWS Service
## How to use
Add to your `settings.gradle`
```groovy
include ':sp-api'
project(':sp-api').projectDir = file('./SP-API/generated')
```
Add to your `build.gradle`
```groovy
dependencies {
    implementation project('sp-api')
}
```
Sync
## Codegen Tasks - sp-api-codegen
**Run `initModel` task before generate code**
1. `cleanOutput` - Cleanup `src/main/java` and `src/test/java` and `docs`
2. `gen-All` - Generate all models apis docs
3. `gen-${model name}` - Generate correspond model
4. `updateModel` - Pull the latest amazon model