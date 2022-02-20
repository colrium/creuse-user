package com.creusent.user.common.helper

/**
 * @package com.creusent.user
 * @subpackage helper
 * @category ReturnValues
 * @author SMR IT Solutions
 * 
 */

import com.google.android.gms.maps.model.LatLng

/* ************************************************************
 Return latitude and longitude Values for animate route in Main Activity
*************************************************************** */
class ReturnValues(
        /**
         * return latitude and longitude
         */
        val latLng: LatLng,
        /**
         * return country
         */
        val country: String)