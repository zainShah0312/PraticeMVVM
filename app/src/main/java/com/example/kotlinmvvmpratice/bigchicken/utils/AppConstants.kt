package com.example.kotlinmvvmpratice.bigchicken.utils

import com.example.kotlinmvvmpratice.BuildConfig

class AppConstants {
    companion object {
        val SHOW_CONSOLE_LOGS = BuildConfig.DEBUG
        const val APP_NAME = "Kitchen Manager"
        const val PREFS_NAME = "GroceryLoginPrefs"
        const val PREFS_NAME2 = "GroceryLoginPrefs2"
        const val IS_LOGIN = "isLogin"
        const val KEY_NAME = "user_fullname"
        const val KEY_ID = "user_id"
        const val KEY_IDENTITY = "user_identity"
        const val KEY_TOKEN = "489654c34bb56726bfd2dfd29f2609a8"


        const val BASE_URL = "http://mybigchicken.co.uk/"
        const val GET_ORDER_URL = "kitchen_manager/orders_app"
        const val GET_PENDING_ORDER_URL = "index.php/api/delivery_boy_pending_orders"
        const val GET_DELIVERD_ORDER_URL = "index.php/api/delivery_boy_delivered_orders"
        const val GET_ACCEPTED_ORDER = "index.php/api/delivery_boy_accepted_orders"
        //  public static String GET_ACCEPT_ORDER = BASE_URL + "index.php/api/accept_order";
        const val GET_NOTIFICATION = "index.php/api/delivery_boy_notifications_list"
        const val CHNAGE_PASSWORD = "index.php/api/delivery_boy_change_password"
        const val UPLOAD_IMAGE = "index.php/api/delivery_boy_update_profile_pic"
        const val LOGIN = "auth/login_app"
        const val DRIVER_LIST = "kitchen_manager/drivers_list"
        const val DASHBORD = "kitchen_manager/index_dashboard"
        const val GET_ALL_ORDER_URL = "kitchen_manager/orders_app"
        const val OrderDetail = "kitchen_manager/view_order_app"
        const val GET_ACCEPT_ORDER = "kitchen_manager/update_order_app"
        const val IMG_PRODUCT_URL = "uploads/products/"
        const val IMG_USER_URL = "uploads/profile/"
        const val urlUpload = "index.php/api/mark_delivered2"
        const val startOrder = "index.php/api/start_order"
        const val updateLocatio = "index.php/api/update_delivery_boy_location"
        const val REQCODE = 100
        const val image = "signature"
        const val imageName = "id"
        const val JSON_RIGISTER_FCM = "index.php/api/register_delivery_fcm"
        const val EDIT_PROFILE_URL = ""
    }
}