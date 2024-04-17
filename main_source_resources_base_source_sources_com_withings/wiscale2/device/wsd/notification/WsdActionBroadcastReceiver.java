package com.withings.wiscale2.device.wsd.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.withings.device.Device;
import com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation;
import ej.w;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import lf0.d;
/* compiled from: WsdActionBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wsd/notification/WsdActionBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WsdActionBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        u.j(context, "context");
        u.j(intent, "intent");
        String action = intent.getAction();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent.getSerializableExtra("com.withings.library.device.Device", Device.class);
        } else {
            Object serializableExtra = intent.getSerializableExtra("com.withings.library.device.Device");
            if (!(serializableExtra instanceof Device)) {
                serializableExtra = null;
            }
            obj = (Device) serializableExtra;
        }
        Device device = (Device) obj;
        if (device == null) {
            return;
        }
        if (d.f79467b != null) {
            d dVar = d.f79467b;
            if (dVar != null) {
                dVar.c(context, device.getId());
                WsdWakeUpConversation wsdWakeUpConversation = (WsdWakeUpConversation) w.w().y(device.getMacAddress(), WsdWakeUpConversation.class);
                if (wsdWakeUpConversation != null) {
                    if (u.e(action, "com.withings.wiscale2.device.wsd.ACTION_SNOOZE")) {
                        wsdWakeUpConversation.P();
                        return;
                    } else if (u.e(action, "com.withings.wiscale2.device.wsd.ACTION_STOP")) {
                        wsdWakeUpConversation.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            u.s("instance");
            throw null;
        }
        u.s("instance");
        throw null;
    }
}
