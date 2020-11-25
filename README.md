# react-native-mask-image

MaskImageView with custome shape


![alt text](https://i.imgur.com/nNlWrkf.png "Logo Title Text 1")

## Installation

```sh
yarn install react-native-mask-image
```

## Usage

```js
import * as React from 'react';
import { View } from 'react-native';
import { MaskImageView } from 'react-native-mask-image';

export default function App() {

  return (
    <View style={{
      flex: 1,
      alignItems: 'center',
      justifyContent: 'center',
      backgroundColor: 'green',
    }}>

      <MaskImageView
        urlImage={'https://i.imgur.com/7rgorlG.png'}
        urlMask={'https://i.imgur.com/zFJmEop.png'}
        style={{
          width: 200,
          height: 200,
        }}
      />
    </View>
  );
}

```
