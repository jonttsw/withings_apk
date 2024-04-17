package com.withings.wiscale2.profile;

import com.withings.reminder.profile.RemindersSectionView;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59300a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(q qVar) {
        super(1);
        this.f59300a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        RemindersSectionView remindersSectionView;
        int i11;
        boolean booleanValue = bool.booleanValue();
        remindersSectionView = this.f59300a.f59440x;
        if (remindersSectionView != null) {
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            remindersSectionView.setVisibility(i11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("reminderSectionView");
        throw null;
    }
}
