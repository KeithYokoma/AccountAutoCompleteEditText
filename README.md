# AccountAutoCompleteEditText

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/KeithYokoma/AccountAutoCompleteEditText?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Gitter](http://img.shields.io/badge/Gitter-Join%20Chat-brightgreen.svg?style=flat)](https://gitter.im/KeithYokoma/AccountAutoCompleteEditText?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-AccountAutoCompleteEditText-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1232)
[![License](http://img.shields.io/badge/License-Apache%202-brightgreen.svg?style=flat)](https://github.com/KeithYokoma/Fit/blob/master/LICENSE.md)

Just a simple implementation for use of auto complete text view with device account suggestion

## Usage

Just simply put an custom view as below.

```xml
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <jp.yokomark.widget.account.autocomp.AccountAutoCompleteEditText
        android:id="@+id/any"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/label_account_type_any"
        app:accountType="any"/>
</RelativeLayout>
```

`AccountAutoCompleteEditText` has a custom attribute of `accountType`.
This attribute accepts any of the  following value.

| Value | Meaning |
|-------|---------|
| `any` | Show the candidate account of all type. |
| `email` | Show the candidate account using email address. |
| `phoneNumber` | Show the candidate account using phone number. |

## Sample Application

Sample app can be downloaded from [here](https://deploygate.com/distributions/7ac40a3232ff1fb7afceb7c527d6667d11f840ff).

## Download

Via Gradle

```groovy
repositories {
    mavenCentral()
}
android {
    dependencies {
        compile 'com.github.keithyokoma:AccountAutoCompleteEditText:1.0.0'
    }
}
```

## TODO

- Customize adapter view layout

## License

```
Copyright (C) 2014 KeithYokoma. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

