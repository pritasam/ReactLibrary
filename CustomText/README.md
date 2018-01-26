
# react-native-custom-text

## Getting started

`$ npm install react-native-custom-text --save`

### Mostly automatic installation

`$ react-native link react-native-custom-text`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-custom-text` and add `RNCustomText.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCustomText.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNCustomTextPackage;` to the imports at the top of the file
  - Add `new RNCustomTextPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-custom-text'
  	project(':react-native-custom-text').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-custom-text/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-custom-text')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNCustomText.sln` in `node_modules/react-native-custom-text/windows/RNCustomText.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Custom.Text.RNCustomText;` to the usings at the top of the file
  - Add `new RNCustomTextPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNCustomText from 'react-native-custom-text';

// TODO: What to do with the module?

<CustomText text="Custom Text" style={{backgroundColor:"transparent",width: 100, height: 30}}/>

```
  
