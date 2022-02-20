package com.creusent.user.common.dependencies.module

/**
 * @package com.creusent.user
 * @subpackage dependencies.module
 * @category ApplicationModule
 * @author SMR IT Solutions
 *
 */

import android.app.Application

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/*****************************************************************
 * Application Module
 */
@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun application(): Application {
        return application
    }
}
