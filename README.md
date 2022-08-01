# authlib-patched
Библиотека authlib с вырезанной проверкой домена и цифровой подписи.
Подгружать скины можно с любого домена.


jars - содержит скомпилированные пропатчиные версии authlib.

__Все ссылки хранятся__ 
```
- com
  - mojang
    - authlib
      - yggdrasil
        - YggdrasilMinecraftSessionService.java
        
              private final String _profileUrl = "...";
              private final String _checkUrl = "...";
              private final String _joinUrl = "...";
```
Их заменяем на свои скрипты.
Так же ссылки можно заменить через InClassTranslator или InJarTranslator непосредственно в самом jar файле.
