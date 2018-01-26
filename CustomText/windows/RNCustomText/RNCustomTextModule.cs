using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Custom.Text.RNCustomText
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNCustomTextModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNCustomTextModule"/>.
        /// </summary>
        internal RNCustomTextModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNCustomText";
            }
        }
    }
}
