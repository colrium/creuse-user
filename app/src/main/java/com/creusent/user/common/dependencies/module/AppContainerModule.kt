package com.creusent.user.common.dependencies.module

/**
 * @package com.creusent.user
 * @subpackage dependencies.module
 * @category AppContainerModule
 * @author SMR IT Solutions
 *
 */

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.creusent.user.R
import com.creusent.user.common.configs.RunTimePermission
import com.creusent.user.common.configs.SessionManager
import com.creusent.user.common.database.SqLiteDb
import com.creusent.user.common.datamodels.JsonResponse
import com.creusent.user.common.network.AppController
import com.creusent.user.common.utils.CommonMethods
import com.creusent.user.common.utils.userchoice.UserChoice
import com.creusent.user.taxi.views.customize.CustomDialog
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

/*****************************************************************
 * App Container Module
 */
@Module(includes = [com.creusent.user.common.dependencies.module.ApplicationModule::class])
class AppContainerModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(application: Application): SharedPreferences {
        return application.getSharedPreferences(application.resources.getString(R.string.app_name), Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun providesCommonMethods(): CommonMethods {
        return CommonMethods()
    }

    @Provides
    @Singleton
    fun providesSessionManager(): SessionManager {
        return SessionManager()
    }


    @Provides
    @Singleton
    fun providesRunTimePermission(): RunTimePermission {
        return RunTimePermission()
    }

    @Provides
    @Singleton
    fun providesContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun providesStringArrayList(): ArrayList<String> {
        return ArrayList()
    }

    @Provides
    @Singleton
    fun providesJsonResponse(): JsonResponse {
        return JsonResponse()
    }


    @Provides
    @Singleton
    fun providesCustomDialog(): CustomDialog {
        return CustomDialog()
    }

    @Provides
    @Singleton
    internal fun providesSqlite(): SqLiteDb {
        return SqLiteDb(AppController.getContext())
    }

    @Provides
    @Singleton
    fun providesUserChoice(): UserChoice {
        return UserChoice()
    }


}
