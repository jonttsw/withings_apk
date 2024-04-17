package com.withings.notifications.ui.viewmodels;

import com.withings.favorite.model.FavoriteCategoryKt;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/notifications/ui/viewmodels/NotificationGroup;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotificationGroup {

    /* renamed from: a  reason: collision with root package name */
    public static final NotificationGroup f43124a;

    /* renamed from: b  reason: collision with root package name */
    public static final NotificationGroup f43125b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ NotificationGroup[] f43126c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.notifications.ui.viewmodels.NotificationGroup, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.notifications.ui.viewmodels.NotificationGroup, java.lang.Enum] */
    static {
        ?? r02 = new Enum(FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, 0);
        f43124a = r02;
        ?? r12 = new Enum("OlderUnread", 1);
        f43125b = r12;
        NotificationGroup[] notificationGroupArr = {r02, r12};
        f43126c = notificationGroupArr;
        sm0.b.a(notificationGroupArr);
    }

    private NotificationGroup() {
        throw null;
    }

    public static NotificationGroup valueOf(String str) {
        return (NotificationGroup) Enum.valueOf(NotificationGroup.class, str);
    }

    public static NotificationGroup[] values() {
        return (NotificationGroup[]) f43126c.clone();
    }
}
