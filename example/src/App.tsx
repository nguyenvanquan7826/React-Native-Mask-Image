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
