package com.withings.notifications.preferences.core.model;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationPreferenceType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/notifications/preferences/core/model/NotificationPreferenceType;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotificationPreferenceType {

    /* renamed from: b  reason: collision with root package name */
    public static final NotificationPreferenceType f42830b;

    /* renamed from: c  reason: collision with root package name */
    public static final NotificationPreferenceType f42831c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ NotificationPreferenceType[] f42832d;

    /* renamed from: a  reason: collision with root package name */
    private final int f42833a;

    static {
        NotificationPreferenceType notificationPreferenceType = new NotificationPreferenceType("PUSH", 0, 4);
        f42830b = notificationPreferenceType;
        NotificationPreferenceType notificationPreferenceType2 = new NotificationPreferenceType(CommonConstant.RETKEY.EMAIL, 1, 2);
        f42831c = notificationPreferenceType2;
        NotificationPreferenceType[] notificationPreferenceTypeArr = {notificationPreferenceType, notificationPreferenceType2, new NotificationPreferenceType("ALL", 2, 1), new NotificationPreferenceType("NONE", 3, 0)};
        f42832d = notificationPreferenceTypeArr;
        b.a(notificationPreferenceTypeArr);
    }

    private NotificationPreferenceType(String str, int i11, int i12) {
        this.f42833a = i12;
    }

    public static NotificationPreferenceType valueOf(String str) {
        return (NotificationPreferenceType) Enum.valueOf(NotificationPreferenceType.class, str);
    }

    public static NotificationPreferenceType[] values() {
        return (NotificationPreferenceType[]) f42832d.clone();
    }

    public final int a() {
        return this.f42833a;
    }
}
