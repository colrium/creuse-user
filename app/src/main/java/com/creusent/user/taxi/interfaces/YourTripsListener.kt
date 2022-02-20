package com.creusent.user.taxi.interfaces

/**
 * @package com.creusent.cabmeusereatsdriver
 * @subpackage interfaces
 * @category YourTripsListener
 * @author SMR IT Solutions
 * 
 */

import android.content.res.Resources

import com.creusent.user.taxi.sidebar.trips.YourTrips


/*****************************************************************
 * YourTripsListener
 */

interface YourTripsListener {

    val res: Resources

    val instance: YourTrips
}
