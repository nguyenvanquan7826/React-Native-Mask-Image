import Foundation
@objc(MaskImageView)
class MaskImageView: RCTViewManager {

  override func view() -> UIView! {
    return MaskShapeImageView()
  }

  override static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
