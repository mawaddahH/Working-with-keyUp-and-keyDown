# Working-with-keyUp-and-keyDown
Assignment 1 W9D4 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Perform keyUp and keyDown on CodingDojo
- STEP 1: Go to the Coding Dojo website.
- STEP 2: Right-click, Inspect. Pick any web element you like.
- STEP 3: Perform keyUp and keyDown on chosen element.


## Answer
Keyboard and mouse events in Selenium are handled by Acton Class.
- "Key Up" and "key Down" both perform the following modifier key (Keys.ALT, Keys.SHIFT, or Keys. CONTROL).

And you can assume that the "Key Down" for any key is kept pressed until it is released by the "Key Up" command.

so, I used a ["Coding Dojo"](https://www.codingdojo.com/) for this asshignment



And Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code using "Key Up" and "key Down":
`keyDown(Keys.SHIFT)`and `keyUp(Keys.SHIFT)`

and the code becomes like this:

```md
Actions action = new Actions(driver);
Action seriesOfActions = action
                        .moveToElement(FirstName)
                        .click()
                        .keyDown(FirstName, Keys.SHIFT)
                        .sendKeys(FirstName, "Mawaddah")
                        .keyUp(FirstName, Keys.SHIFT)
                        .doubleClick(FirstName)
                        .contextClick()
                        .build();
seriesOfActions.perform();
```

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182676201-5b95f403-9597-412d-9012-c95a67a76260.png" width=60% height=60%>
</p>

---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182676717-d13bf509-bfa6-4b30-b779-2f4c655d69bb.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/182676986-64984fd0-ec8f-4636-8756-c442fba537ed.mp4

</p>
