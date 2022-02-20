package com.creusent.user.common.interfaces

/**
 * @package com.creusent.user
 * @subpackage interfaces
 * @category ImageListener
 * @author SMR IT Solutions
 * 
 */

import okhttp3.RequestBody

/*****************************************************************
 * ImageListener
 */

interface ImageListener {
    fun onImageCompress(filePath: String, requestBody: RequestBody?)
}
