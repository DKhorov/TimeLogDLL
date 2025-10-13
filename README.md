

# ⏱️ TimeLogDLL — Java Time Visualization Component

![TimeLogDLL Banner](https://github.com/yourusername/timelogdll/blob/main/demo.png)


> **A dedicated timelog component for your Java projects.**  
> The **AtomGlide Fitness Pro + AtomGlide Develop Care** package provides the `timelogdll` component for your projects.

---

##  Описание

**TimeLogDLL** — это современный компонент для визуализации времени в ваших Java-проектах.  
Он сочетает простоту интеграции с элегантной графикой на Swing и может использоваться для таймеров, фитнес-панелей, UI-дашбордов и любых приложений, где нужно красиво отображать время.

 Разработан в рамках пакета **AtomGlide Fitness Pro + AtomGlide Develop Care**.  
Компонент реализует визуальное кольцо из 25 активных индикаторов, которые плавно отображают течение времени.
Продукт соответсвуь стандартам BSI UI/UX и AtomGlide Policy 

---

## ✨ Возможности

- 🔹 Элегантная визуализация времени в виде кругового индикатора  
- 🔹 Поддержка часов, минут и секунд  
- 🔹 Полностью автономный `JPanel`-компонент  
- 🔹 Простое добавление в любое Java Swing приложение  
- 🔹 Настраиваемые цвета и размеры  
- 🔹 Чистый и современный дизайн BSI Gen 2

---

## 🧩 Пример использования

```java
import com.timelogdll.timelogdll;
import javax.swing.*;

public class DemoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("TimeLog Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new timelogdll(0, 2, 5)); // часы, минуты, секунды
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
````

---

## ⚙️ Установка и подключение

### 🔸 1. Сборка JAR

```bash
javac -d out src/com/timelogdll/timelogdll.java
jar cfm timelogdll.jar manifest.txt -C out .
```

### 🔸 2. Подключение к проекту

Скопируйте `timelogdll.jar` в папку вашего проекта, например:

```
/myproject/libs/timelogdll.jar
```

и добавьте его в classpath при компиляции и запуске:

```bash
javac -cp libs/timelogdll.jar src/Main.java
java -cp libs/timelogdll.jar:src Main
```

(На Windows вместо `:` используйте `;`)

---

## 💡 Рекомендации по интеграции

* Компонент отлично подходит для UI-панелей, фитнес-приложений и визуальных таймеров.
* Цветовую схему можно менять через метод `setBackground()` и `setForeground()` для `label`.
* Чтобы расширить функционал (например, добавить паузу, сброс или события), создайте класс-наследник от `timelogdll`.

---

## 👨‍💻 Автор проекта

**Dmitry Horov**
Java UI Developer & Designer
owner AtomGlide Media Social 

---

## 📸 Галерея

| Вариант      | Пример                                                                            |
| ------------ | --------------------------------------------------------------------------------- |
| Демонстрация | ![Demo](https://github.com/yourusername/timelogdll/blob/main/demo.png)     |


---

## 🧱 Лицензия

Этот компонент распространяется по лицензии **MIT**.
Свободно используйте его в своих проектах с упоминанием автора.



Хочешь, я сгенерирую **реалистичный баннер (banner.png)** в стиле tech-UI / minimal orange (под твой стиль `Color(237,89,26)`)?
```
