package com.withings.wiscale2.settings;

import com.withings.notifications.preferences.core.model.NotificationPreferenceType;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class s3 extends kotlin.jvm.internal.w implements ym0.l<NotificationPreferenceType, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f60293a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(r8.n nVar) {
        super(1);
        this.f60293a = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(NotificationPreferenceType notificationPreferenceType) {
        NotificationPreferenceType selectedNotificationType = notificationPreferenceType;
        kotlin.jvm.internal.u.j(selectedNotificationType, "selectedNotificationType");
        androidx.navigation.e.L(this.f60293a, androidx.activity.a0.b("notification-preferences/", selectedNotificationType.name()), null, 6);
        return nm0.y.f85009a;
    }
}
