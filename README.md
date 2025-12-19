Kulcsok generálása:

```shell
openssl req -x509 -subj "/CN=courses" -keyout courses.key -out courses.crt -sha256 -days 365 -nodes -newkey rsa
```
