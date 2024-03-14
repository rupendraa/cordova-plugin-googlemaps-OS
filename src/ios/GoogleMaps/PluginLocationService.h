//
//  PluginLocationService.h
//  cordova-googlemaps-plugin v2
//
//  Created by Masashi Katsumata.
//
//

#import <Cordova/CDV.h>
#import <GoogleMaps/GoogleMaps.h>
#import <GooglePlaces/GooglePlaces.h>
#import "PluginUtil.h"

@interface PluginLocationService : CDVPlugin<CLLocationManagerDelegate>

@property (nonatomic, strong) NSMutableDictionary *lastResult;
@property (nonatomic, strong) CLLocation *lastLocation;
@property (nonatomic, strong) CLLocationManager *locationManager;
@property (nonatomic, strong) NSMutableArray *locationCommandQueue;
@property (nonatomic, strong) NSString* latestCallbackId;

- (void)getMyLocation:(CDVInvokedUrlCommand*)command;
- (void)hasPermission:(CDVInvokedUrlCommand*)command;
//- (void)getSuggestionsFromLocations:(NSString *)textLocation country:(NSString *)country callbackContext:(CDVInvokedUrlCommand *)command;
//- (void)getSuggestionsFromLocations:(NSString *)textLocation country:(NSString *)country:(CDVInvokedUrlCommand *)command;
- (void)getSuggestionsFromLocations:(CDVInvokedUrlCommand *)command;

@end
