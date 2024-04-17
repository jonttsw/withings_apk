package com.withings.wiscale2.profile;

import com.withings.reminder.model.Reminder;
import com.withings.reminder.model.ReminderRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$removeReminder$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ReminderRepository f59545a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Reminder f59546b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ReminderRepository reminderRepository, Reminder reminder, qm0.d<? super z0> dVar) {
        super(2, dVar);
        this.f59545a = reminderRepository;
        this.f59546b = reminder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z0(this.f59545a, this.f59546b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((z0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        this.f59545a.deleteReminder(this.f59546b);
        return nm0.y.f85009a;
    }
}
