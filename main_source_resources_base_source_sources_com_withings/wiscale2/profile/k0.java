package com.withings.wiscale2.profile;

import com.withings.reminder.model.Reminder;
import java.util.List;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.l<List<? extends Reminder>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59383a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q qVar) {
        super(1);
        this.f59383a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends Reminder> list) {
        List<? extends Reminder> it = list;
        kotlin.jvm.internal.u.j(it, "it");
        q.I1(this.f59383a, it);
        return nm0.y.f85009a;
    }
}
