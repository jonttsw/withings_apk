package com.withings.wiscale2.settings;

import com.withings.account.core.model.Account;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsViewModel$account$1", f = "SettingsViewModel.kt", l = {52, 57}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Account>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59967a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f59968b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59969c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(SettingsViewModel settingsViewModel, qm0.d<? super d5> dVar) {
        super(2, dVar);
        this.f59969c = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        d5 d5Var = new d5(this.f59969c, dVar);
        d5Var.f59968b = obj;
        return d5Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Account> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((d5) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.flow.FlowCollector, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ?? r12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59967a;
        SettingsViewModel settingsViewModel = this.f59969c;
        try {
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
            r12 = i11;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r13 = (FlowCollector) this.f59968b;
            nm0.l.b(obj);
            i11 = r13;
        } else {
            nm0.l.b(obj);
            ?? r14 = (FlowCollector) this.f59968b;
            t00.d dVar = settingsViewModel.f59763f;
            ActionSyncJob a12 = settingsViewModel.f59762e.a(true);
            this.f59968b = r14;
            this.f59967a = 1;
            obj = t00.g.a(dVar, a12, "get_account_settings", this);
            i11 = r14;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        a11 = (Boolean) obj;
        a11.getClass();
        r12 = i11;
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            x70.b.n(b10);
        }
        Account h11 = settingsViewModel.f59759b.h();
        this.f59968b = null;
        this.f59967a = 2;
        if (r12.emit(h11, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
