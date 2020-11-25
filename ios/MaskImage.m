#import "React/RCTViewManager.h"
@interface RCT_EXTERN_MODULE(MaskImageView, RCTViewManager)
RCT_EXPORT_VIEW_PROPERTY(urlImage  , NSString)
RCT_EXPORT_VIEW_PROPERTY(urlMask  , NSString)
RCT_EXPORT_VIEW_PROPERTY(width, int)
RCT_EXPORT_VIEW_PROPERTY(height, int)
@end
