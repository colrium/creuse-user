package com.creusent.user.common.network

/**
 * @package com.creusent.cabmeuserdriver.common.network
 * @subpackage network
 * @category PermissionCamer
 * @author SMR IT Solutions
 *
 */

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat


/* ************************************************************
Whole application to get the permission
*************************************************************** */

object PermissionCamer {

    /*
    *  Check permission
    */
    fun checkPermission(context: Context): Boolean {
        return ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }


}
