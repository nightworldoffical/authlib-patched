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

              <span style="color: #de8624">private final String _profileUrl = "...";<span style="color: green">
              `#de8624`private final String _checkUrl = "...";
              `#de8624`private final String _joinUrl = "...";
```
Их заменяем на свои скрипты.
Так же ссылки можно заменить через InClassTranslator или InJarTranslator непосредственно в самом jar файле.
