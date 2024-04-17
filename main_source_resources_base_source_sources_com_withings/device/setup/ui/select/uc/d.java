package com.withings.device.setup.ui.select.uc;

import com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import nm0.k;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadOnDemandModuleUseCase.kt */
/* loaded from: classes3.dex */
public final class d implements id.d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0<Integer> f37634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Integer, y> f37635b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoadOnDemandModuleUseCase f37636c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CancellableContinuation<LoadOnDemandModuleUseCase.Status> f37637d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(p0 p0Var, l lVar, LoadOnDemandModuleUseCase loadOnDemandModuleUseCase, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f37634a = p0Var;
        this.f37635b = lVar;
        this.f37636c = loadOnDemandModuleUseCase;
        this.f37637d = cancellableContinuationImpl;
    }

    @Override // gd.a
    public final void p(id.c cVar) {
        Object a11;
        id.c state = cVar;
        u.j(state, "state");
        int g11 = state.g();
        Integer num = this.f37634a.f76257a;
        if (num != null && g11 == num.intValue()) {
            int h11 = state.h();
            if (h11 != 2) {
                CancellableContinuation<LoadOnDemandModuleUseCase.Status> cancellableContinuation = this.f37637d;
                if (h11 != 5) {
                    if (h11 == 6 || h11 == 7) {
                        cancellableContinuation.resumeWith(LoadOnDemandModuleUseCase.Status.f37616c);
                        return;
                    }
                    return;
                }
                cancellableContinuation.resumeWith(LoadOnDemandModuleUseCase.Status.f37615b);
                return;
            }
            this.f37636c.getClass();
            try {
                a11 = Integer.valueOf((int) ((state.a() / state.i()) * 100));
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (a11 instanceof k.a) {
                a11 = 0;
            }
            this.f37635b.invoke(Integer.valueOf(((Number) a11).intValue()));
        }
    }
}
