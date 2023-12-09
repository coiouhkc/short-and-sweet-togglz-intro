---
marp: true
title: Short and sweet Intro to Togglz
description: Short and sweet Intro to Togglz
theme: uncover
paginate: true
_paginate: false


---

# Short and sweet

## Intro to Feature Toggles

---

# Intro, reason & background

Runtime modification of application behaviour

<!--
Some intro.
Then some reason and background.
-->

---

# Intro, reason & background

* Release toggles

<!-- e.g. disable new features that are not yet production-ready or may not be activated yet (format change) -->

* Ops toggles

<!-- Additional tracing, logging level, performance tracing, etc. -->

* Experiment toggles

<!-- A/B testing -->

* Permission toggles ?

<!-- License-based premium features -->

(c) Martin Fowler

---

# Offtopic: current project

* Ops toggle for initialization of new microservice (Togglz)
* Ops toggle for performance profiling (MBeans)

---

# Custom implementation 1

See demo1-custom-inmemory

---

# Custom implementation 2

## MBeans

See demo2-custom-mbeans

---

# Spring Boot + Togglz

See demo3-springboot-togglz

---

# Quarkus + Unleash

See demo4-quarkus-unleash

---

# Q&A

---

# Links

* https://en.wikipedia.org/wiki/Feature_toggle
* https://martinfowler.com/articles/feature-toggles.html
* https://docs.oracle.com/javase/tutorial/jmx/mbeans/standard.html
* https://www.togglz.org/
* https://www.togglz.org/documentation/spring-boot-starter
* https://www.baeldung.com/spring-togglz
* https://github.com/Unleash
* https://quarkus.io/extensions/io.quarkiverse.unleash/quarkus-unleash/
* https://www.getunleash.io/
* https://docs.getunleash.io/topics/feature-flags/feature-flag-best-practices