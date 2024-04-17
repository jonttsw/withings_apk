package com.withings.notifications.preferences.core.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationPreference.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/notifications/preferences/core/model/NotificationChannel;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotificationChannel {

    /* renamed from: b  reason: collision with root package name */
    public static final NotificationChannel f42822b;

    /* renamed from: c  reason: collision with root package name */
    public static final NotificationChannel f42823c;

    /* renamed from: d  reason: collision with root package name */
    public static final NotificationChannel f42824d;

    /* renamed from: e  reason: collision with root package name */
    public static final NotificationChannel f42825e;

    /* renamed from: f  reason: collision with root package name */
    public static final NotificationChannel f42826f;

    /* renamed from: g  reason: collision with root package name */
    public static final NotificationChannel f42827g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ NotificationChannel[] f42828h;

    /* renamed from: a  reason: collision with root package name */
    private final String f42829a;

    static {
        NotificationChannel notificationChannel = new NotificationChannel("DISCOUNT", 0, "discount");
        f42822b = notificationChannel;
        NotificationChannel notificationChannel2 = new NotificationChannel("NEWSLETTER", 1, "newsletter");
        f42823c = notificationChannel2;
        NotificationChannel notificationChannel3 = new NotificationChannel("STUDY", 2, "study");
        f42824d = notificationChannel3;
        NotificationChannel notificationChannel4 = new NotificationChannel("REPORT", 3, "report");
        f42825e = notificationChannel4;
        NotificationChannel notificationChannel5 = new NotificationChannel("NOTIFICATION", 4, RemoteMessageConst.NOTIFICATION);
        f42826f = notificationChannel5;
        NotificationChannel notificationChannel6 = new NotificationChannel("SURVEY", 5, ConstantsWs.WELLNESS_TASK_TYPE_SURVEY);
        f42827g = notificationChannel6;
        NotificationChannel[] notificationChannelArr = {notificationChannel, notificationChannel2, notificationChannel3, notificationChannel4, notificationChannel5, notificationChannel6};
        f42828h = notificationChannelArr;
        b.a(notificationChannelArr);
    }

    private NotificationChannel(String str, int i11, String str2) {
        this.f42829a = str2;
    }

    public static NotificationChannel valueOf(String str) {
        return (NotificationChannel) Enum.valueOf(NotificationChannel.class, str);
    }

    public static NotificationChannel[] values() {
        return (NotificationChannel[]) f42828h.clone();
    }

    public final String a() {
        return this.f42829a;
    }
}
