# authlib-patched
Библиотека authlib с вырезанной проверкой домена и цифровой подписи.
Подгружать скины можно с любого домена.


jars - содержит скомпилированные пропатчиные версии authlib.

Все ссылки хранятся в /com/mojang/authlib/yggdrasil/YggdrasilMinecraftSessionService.java. 
```
_profileUrl, _checkUrl, _joinUrl. 
```
Из заменяем на свои скрипты.
Так же ссылки можно заменить через InClassTranslator или InJarTranslator непосредственно в самом jar файле.
