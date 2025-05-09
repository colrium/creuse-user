package com.creusent.user.common.interfaces

/**
 * @package com.creusent.user
 * @subpackage interfaces
 * @category ServiceListener
 * @author SMR IT Solutions
 * 
 */

import com.creusent.user.common.datamodels.JsonResponse

/*****************************************************************
 * ServiceListener
 */
interface ServiceListener {

    fun onSuccess(jsonResp: JsonResponse, data: String)

    fun onFailure(jsonResp: JsonResponse, data: String)
}
