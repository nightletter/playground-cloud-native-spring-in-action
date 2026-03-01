```bash
http POST :9001/books author="Lyra Silverstar" \
title="Northern Lights" isbn="1234567891" price=9.90
```

```bash
http :9001/books/1234567891
```

```bash
http POST :9001/books author="Jon Snow" title="" isbn="123ABC456Z" price="9.90"
```