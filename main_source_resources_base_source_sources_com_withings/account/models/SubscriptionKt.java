package com.withings.account.models;

import com.withings.account.network.ws.WsAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Subscription.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toSubscription", "Lcom/withings/account/models/Subscription;", "Lcom/withings/account/network/ws/WsAccount$Subscription;", "toWsSubscription", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionKt {
    public static final Subscription toSubscription(WsAccount.Subscription subscription) {
        boolean z5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        u.j(subscription, "<this>");
        if (subscription.getDiscount() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (subscription.getNewsletter() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (subscription.getStudy() == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (subscription.getReport() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (subscription.getNotification() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (subscription.getSurvey() == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        return new Subscription(z5, z11, z12, z13, z14, z15);
    }

    public static final WsAccount.Subscription toWsSubscription(Subscription subscription) {
        u.j(subscription, "<this>");
        return new WsAccount.Subscription(subscription.getDiscount() ? 1 : 0, subscription.getNewsletter() ? 1 : 0, subscription.getStudy() ? 1 : 0, subscription.getReport() ? 1 : 0, subscription.getNotification() ? 1 : 0, subscription.getSurvey() ? 1 : 0);
    }
}
