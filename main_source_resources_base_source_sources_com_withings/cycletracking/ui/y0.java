package com.withings.cycletracking.ui;

import com.withings.cycletracking.ui.e2;
import dn.b;
import java.util.Iterator;
/* compiled from: CycleTrackingDatavizScreen.kt */
/* loaded from: classes3.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.a<b.InterfaceC0847b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e2.c f36089a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ at.a f36090b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e2.c cVar, at.a aVar) {
        super(0);
        this.f36089a = cVar;
        this.f36090b = aVar;
    }

    @Override // ym0.a
    public final b.InterfaceC0847b invoke() {
        Object obj;
        Iterator<T> it = this.f36089a.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.u.e(((b.InterfaceC0847b) obj).a(), this.f36090b.c().toLocalDate())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b.InterfaceC0847b) obj;
    }
}
