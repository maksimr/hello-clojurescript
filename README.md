# hello-clojurescript


Creating a new project
To get started, open a new terminal and create a new project using the lein command:

```
lein new hello-browser
```


From a new terminal, we can use the lein command, along with cljsbuild plugin,
to compile our ClojureScript into javascript:

```
lein cljsbuild once
```


While building the file once is useful(i.e pre-deploy) during development we will expect a lot
of changes to the ClojureScript source files. It would be a pain
to run a command after every change - enter lein cljsbuild auto :

```
lein cljsbuild auto
```

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
