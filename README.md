# Expandable Text View
Expandable Text View Android Library

![screenshot gif](https://github.com/prongbang/ExpandableTextView/blob/master/screenshots/screenshots.gif?raw=true)

## Download
> build.gradle
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

...

dependencies {
    implementation 'com.github.prongbang:expandabletextview:1.0.1'
}
```

## How to use
> MainActivity.kt
```kotlin

  btnExpand.setOnClickListener {
      tvDescription.expandTextView()
  }

  btnCollapse.setOnClickListener {
      tvDescription.collapseTextView()
  }

  btnCycle.setOnClickListener {
      tvDescription.cycleTextViewExpansion()
  }
```

> activity_main.xml
```xml
    <com.prongbang.widget.ExpandableTextView
        android:id="@+id/tvDescription"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:maxLines="5"
        app:collapsedMaxLines="5"
        app:autoDuration="true"
        android:text="@string/label_description" />
```
> Property
```
app:duration="200"
app:collapsedMaxLines="5"
app:autoDuration="true"
```

### Thank
