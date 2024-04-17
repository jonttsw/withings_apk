package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.views.view.ExpandableLineCellView;
import com.withings.views.view.HorizontalSausageWithLegendsView;
/* compiled from: SleepScoreRecoveryActivity.kt */
/* loaded from: classes5.dex */
public final class e3 implements HorizontalSausageWithLegendsView.a {

    /* renamed from: a  reason: collision with root package name */
    private ExpandableLineCellView f60926a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepScoreRecoveryActivity f60927b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity) {
        this.f60927b = sleepScoreRecoveryActivity;
    }

    @Override // com.withings.views.view.HorizontalSausageWithLegendsView.a
    public final void a(ExpandableLineCellView view, HorizontalSausageWithLegendsView.b legend) {
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(legend, "legend");
        androidx.transition.w.a(SleepScoreRecoveryActivity.E3(this.f60927b), null);
        ExpandableLineCellView expandableLineCellView = this.f60926a;
        if (expandableLineCellView == null) {
            view.w();
            this.f60926a = view;
        } else if (kotlin.jvm.internal.u.e(expandableLineCellView, view)) {
            view.x();
        } else {
            ExpandableLineCellView expandableLineCellView2 = this.f60926a;
            if (expandableLineCellView2 != null) {
                expandableLineCellView2.v();
            }
            view.w();
            this.f60926a = view;
        }
    }
}
