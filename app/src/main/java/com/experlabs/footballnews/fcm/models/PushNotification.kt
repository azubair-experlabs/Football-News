package com.experlabs.footballnews.fcm.models

data class PushNotification(
    var data: NotificationData,
    var to : String
)
