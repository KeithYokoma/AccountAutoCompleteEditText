# AccountAutoCompleteEditText

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

## Download

Via Gradle

```groovy
repositories {
    mavenCentral()
    maven { url 'https://raw.github.com/KeithYokoma/AccountAutoCompleteEditText/master/repository/' }
}
android {
    dependencies {
    compile 'jp.yokomark.widget:AccountAutoCompleteEditText:1.0.0'                        }
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

