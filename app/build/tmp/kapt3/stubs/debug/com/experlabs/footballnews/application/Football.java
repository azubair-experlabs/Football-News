package com.experlabs.footballnews.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/experlabs/footballnews/application/Football;", "Landroid/app/Application;", "()V", "messagingService", "Lcom/experlabs/footballnews/fcm/services/FirebaseMessagingService;", "getMessagingService", "()Lcom/experlabs/footballnews/fcm/services/FirebaseMessagingService;", "messagingService$delegate", "Lkotlin/Lazy;", "createToken", "", "onCreate", "app_debug"})
public final class Football extends android.app.Application {
    private final kotlin.Lazy messagingService$delegate = null;
    
    public Football() {
        super();
    }
    
    private final com.experlabs.footballnews.fcm.services.FirebaseMessagingService getMessagingService() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void createToken() {
    }
}