package com.withings.wiscale2.settings;

import com.withings.account.models.AccountPrefEntity;
import com.withings.user.User;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$canEditEmail$1", f = "SettingsViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59985a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f59986b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59987c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(SettingsViewModel settingsViewModel, qm0.d<? super e5> dVar) {
        super(2, dVar);
        this.f59987c = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        e5 e5Var = new e5(this.f59987c, dVar);
        e5Var.f59986b = obj;
        return e5Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((e5) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        m70.i iVar;
        Object obj2;
        m70.i iVar2;
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59985a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f59986b;
            SettingsViewModel settingsViewModel = this.f59987c;
            iVar = settingsViewModel.f59758a;
            List<User> c11 = iVar.c();
            kotlin.jvm.internal.u.i(c11, "getAccountUsers(...)");
            Iterator<T> it = c11.iterator();
            if (!it.hasNext()) {
                obj2 = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj2 = next;
                } else {
                    long q11 = ((User) next).q();
                    do {
                        Object next2 = it.next();
                        long q12 = ((User) next2).q();
                        if (q11 > q12) {
                            next = next2;
                            q11 = q12;
                        }
                    } while (it.hasNext());
                    obj2 = next;
                }
            }
            kotlin.jvm.internal.u.g(obj2);
            boolean e11 = kotlin.jvm.internal.u.e(settingsViewModel.f59759b.h().i().d().a(), AccountPrefEntity.PROVIDER_GOOGLE);
            iVar2 = settingsViewModel.f59758a;
            if (iVar2.e().q() == ((User) obj2).q() && !e11) {
                z5 = true;
            } else {
                z5 = false;
            }
            Boolean valueOf = Boolean.valueOf(z5);
            this.f59985a = 1;
            if (flowCollector.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
