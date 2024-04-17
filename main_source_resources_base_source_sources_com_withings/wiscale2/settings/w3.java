package com.withings.wiscale2.settings;

import com.withings.notifications.preferences.core.model.NotificationPreferenceType;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class w3 extends kotlin.jvm.internal.w implements ym0.l<i6.a, i10.m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60365a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationPreferenceType f60366b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(SettingsActivity settingsActivity, NotificationPreferenceType notificationPreferenceType) {
        super(1);
        this.f60365a = settingsActivity;
        this.f60366b = notificationPreferenceType;
    }

    @Override // ym0.l
    public final i10.m invoke(i6.a aVar) {
        i6.a viewModel = aVar;
        kotlin.jvm.internal.u.j(viewModel, "$this$viewModel");
        i10.o oVar = this.f60365a.f59744e;
        if (oVar != null) {
            return oVar.a(this.f60366b);
        }
        kotlin.jvm.internal.u.s("notificationsPreferencesViewModelFactory");
        throw null;
    }
}
