package com.withings.wiscale2.heart;

import com.withings.graph.GraphView;
import nm0.y;
/* compiled from: HeartHistoryActivity.kt */
/* loaded from: classes5.dex */
public final class l implements GraphView.g {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartHistoryActivity f57781a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(HeartHistoryActivity heartHistoryActivity) {
        this.f57781a = heartHistoryActivity;
    }

    @Override // com.withings.graph.GraphView.g
    public final void a() {
        HeartHistoryActivity heartHistoryActivity = this.f57781a;
        if (heartHistoryActivity.R3().f99491g.q()) {
            heartHistoryActivity.R3().f99491g.k();
        }
    }

    @Override // com.withings.graph.GraphView.g
    public final void b(float f11) {
        Object a11;
        HeartHistoryActivity heartHistoryActivity = this.f57781a;
        try {
            if (heartHistoryActivity.R3().f99491g.q()) {
                heartHistoryActivity.R3().f99491g.l(f11);
            }
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            x70.b.n(b10);
        }
    }

    @Override // com.withings.graph.GraphView.g
    public final void c() {
        this.f57781a.R3().f99491g.e();
    }
}
