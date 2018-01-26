#import "RNCustomText.h"
#import <React/UIView+React.h>

@implementation RNCustomText
 
RCT_EXPORT_MODULE();
 
- (UIView *)view
{
    return [UILabel new];
}
 
RCT_EXPORT_VIEW_PROPERTY(text, NSString *);
 
@end
