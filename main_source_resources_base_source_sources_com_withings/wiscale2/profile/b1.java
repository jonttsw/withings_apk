package com.withings.wiscale2.profile;

import com.withings.reminder.di.ReminderModule;
import com.withings.reminder.model.Reminder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.ProfileViewModel$toggleReminder$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Reminder f59287a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f59288b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Reminder reminder, boolean z5, qm0.d<? super b1> dVar) {
        super(2, dVar);
        this.f59287a = reminder;
        this.f59288b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b1(this.f59287a, this.f59288b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ReminderModule.INSTANCE.getReminderRepository().setReminderEnabled(this.f59287a, this.f59288b);
        return nm0.y.f85009a;
    }
}
