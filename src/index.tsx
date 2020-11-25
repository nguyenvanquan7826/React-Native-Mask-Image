import { NativeModules } from 'react-native';

type MaskImageType = {
  multiply(a: number, b: number): Promise<number>;
};

const { MaskImage } = NativeModules;

export default MaskImage as MaskImageType;
