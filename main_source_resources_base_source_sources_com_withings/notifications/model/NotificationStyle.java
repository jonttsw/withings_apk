package com.withings.notifications.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/notifications/model/NotificationStyle;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotificationStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final NotificationStyle f42819a;

    /* renamed from: b  reason: collision with root package name */
    public static final NotificationStyle f42820b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ NotificationStyle[] f42821c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.notifications.model.NotificationStyle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.notifications.model.NotificationStyle] */
    static {
        ?? r02 = new Enum("Highlight", 0);
        f42819a = r02;
        ?? r12 = new Enum("Simple", 1);
        f42820b = r12;
        NotificationStyle[] notificationStyleArr = {r02, r12};
        f42821c = notificationStyleArr;
        b.a(notificationStyleArr);
    }

    private NotificationStyle() {
        throw null;
    }

    public static NotificationStyle valueOf(String str) {
        return (NotificationStyle) Enum.valueOf(NotificationStyle.class, str);
    }

    public static NotificationStyle[] values() {
        return (NotificationStyle[]) f42821c.clone();
    }
}
