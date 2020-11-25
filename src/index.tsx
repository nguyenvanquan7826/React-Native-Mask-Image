import { NativeModules, requireNativeComponent, ViewProps } from 'react-native';
import React from 'react';

interface NativeComponentProps {
  urlImage: string;
  urlMask: string;
}

export const MaskImageViewRaw = requireNativeComponent<NativeComponentProps>(
  'MaskImageView',
);

type TestTextViewProps = ViewProps & NativeComponentProps;

export const MaskImageView: React.FC<TestTextViewProps> =
  (props,
  ) => {
    return <MaskImageViewRaw {...props} />;
  };


type MaskImageViewType = {
  multiply(a: number, b: number): Promise<number>;
};

const { MaskImage } = NativeModules;

export default MaskImage as MaskImageViewType;
