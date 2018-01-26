
import {
    StyleSheet,
    View,
    Text,
    NativeModules,
    requireNativeComponent,
  } from 'react-native';
  import React, { Component } from 'react';
  import PropTypes from 'prop-types';


const customText = {
          name: 'CustomText',
          propTypes: {
               text: PropTypes.string, 
                ...View.propTypes
          }
}                         
 
const CustomText = requireNativeComponent('RNCustomText', customText);
export default CustomText