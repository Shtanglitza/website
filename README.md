# website
test github pages website in clojurescript

dev build main.js
```
clj -m cljs.main -d "website/out" -c website.core -r
```

prod build main.js
```
clj -m cljs.main -d "out" -c website.core -r
```

build index.html
```
clj -X:build-html
```